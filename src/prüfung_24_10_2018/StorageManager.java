import java.util.*;
package prüfung_24_10_2018;

public class StorageManager<T extends StorageCompartment> {
	public Collection<T> storageCompartments = new Collection<T> ;
	
	public StorageManager(){
		
	}
	
	public void addCompartment(T compartment){
		
	}
	
	public Optional<T> findCompartmentByMetric(){
		
	}
	
	public void main(String[] args){
		run();
	}
	
	public void run(){
		StorageManager sm = new StorageManager<StorageCompartment>();
		DeafultCompartment compA;
		CooledCoampartment compB;
		CooledObject fish;
		sm.addCompartment(compA);
		sm.addCompartment(compB);
		sm.storeObject(fish);
		for(){
			compB.
		}
	}
	
	public boolean storeObject(Storable additionalObject) throws NotStorableException{
		Iterator<T> itr = storageCompartments.iterator();
		while(itr.hasNext()){
			Object sc = itr.next();
			try{
				sc.storeObject(additionalObject);
			}
			catch(NotStorableException E)
			{
				E.getMessage();
				continue;
			}
			return true;
		}
		return false;
	}
	
}
