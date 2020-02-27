package prüfung_24_10_2018;
import java.util.*;

public class StorageCompartment {
	private Collection<Storable> storedObjects = new ArrayList<Storable>();
	private float maxWeight;
	private float maxWidth;
	public StorageCompartment(float maxWeight, float maxWidth) {
		this.maxWeight =maxWeight;
		this.maxWidth = maxWidth;
	}
	public float getMaxWeight() {
		return maxWeight;
	}
	public float getMaxWidth() {
		return maxWidth;
	}
	protected boolean checkWeight(Storable storable){
		if( this.calculateSumOfWeights()+storable.getWeight() < this.getMaxWeight() ) return true;
		return false;
	}
	protected boolean checkWidth(Storable storable){
		if( this.calculateSumOfWidth()+storable.getWidth() < this.getMaxWidth() ) return true;
		return false;
	}
	public float calculateSumOfWeights(){
		float sum = 0;
		for(Storable s : storedObjects) sum+= s.getWeight();
		return sum;
	}
	public float calculateSumOfWidth(){
		float sum = 0;
		for(Storable s : storedObjects) sum+= s.getWidth();
		return sum;
	}
	public void storeObject(Storable storable) throws NotStorableException{
		this.storedObjects.add(storable);
	}
	public void storeObject(Collection<Storable> storables){
		this.storedObjects.addAll(storables);
	}
	public Collection<Storable> retreiveStoredObjects(){
		return this.storedObjects;
	}
}
