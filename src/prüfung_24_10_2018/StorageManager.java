package prüfung_24_10_2018;
import java.util.*;

public class StorageManager<T extends StorageCompartment> {
	public Collection<T> storageCompartments = new ArrayList<T>() ;
	
	public StorageManager(){
		
	}
	
	public void addCompartment(T compartment){
		this.storageCompartments.add(compartment);
	}
	
	public Optional<T> findCompartmentByMetric(){
		Optional<T> ret = Optional.empty();
		float worstMetric = 0;
		Iterator<T> itr = storageCompartments.iterator();
		while(itr.hasNext()){
			T sc = itr.next();
			if(this.storageCompartments.isEmpty()){
				continue;
			}else{
				float currentMetric = 2*( sc.getMaxWeight() - sc.calculateSumOfWeights() ) + ( sc.getMaxWidth() - sc.calculateSumOfWidth() );
				if(worstMetric < currentMetric){
					worstMetric = currentMetric;
					ret = Optional.of(sc);
				}
			}
		}
		return ret;
	}
	
	public static void main(String[] args){
		run();
	}
	
	public static void run(){
		StorageManager<StorageCompartment> sm = new StorageManager<StorageCompartment>();
		StorageCompartment compA = new DefaultCompartment( 26, 50); 
		StorageCompartment compB = new CooledCompartment( 100, 10, -3);
		Storable fish = new CooledObject(2,2,-3);
		Storable icecream = new CooledObject(2,2, -2);
		sm.addCompartment(compA);
		sm.addCompartment(compB);
		if(sm.storeObject(fish)) System.out.println("fish stored succesfully");
		else System.out.println("storing failed");
		if(sm.storeObject(icecream)) System.out.println("ice-cream stored succesfully");
		else System.out.println("storing failed");
	}
	
	public boolean storeObject(Storable additionalObject){
		Iterator<T> itr = storageCompartments.iterator();
		while(itr.hasNext()){
			T sc = itr.next();
		//for(T sc: storageCompartments){
			try{
				sc.storeObject(additionalObject);
				
			}
			catch(NotStorableException E)
			{
				E = new NotStorableException(sc, additionalObject);
				System.out.println(E.getMessage());
				continue;
			}
			
			return true;
		}
		return false;
	}
	
}
