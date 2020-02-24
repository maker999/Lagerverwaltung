import java.util.*;
package prüfung_24_10_2018;

public static class StorageManager<T> {
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
	
	public boolean storeObject(Storable additionalObject){
		Iterator<T> itr = storageCompartments.iterator();
		while(itr.hasNext()){
			Object sc = itr.next();
			if( sc.checkWidth(additionalObject) && 
					sc.checkWeight(additionalObject) ){
				sc.storeObject(additionalObject);
				return true;
			}
		}
		return false;
	}
	
}
