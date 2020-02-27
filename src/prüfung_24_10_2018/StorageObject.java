package prüfung_24_10_2018;

public abstract class StorageObject implements Storable{
	private float weight;
	private float width;
	public StorageObject(float weight, float width){
		this.weight = weight;
		this.width = width;
	}
	@Override
	public float getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}
	@Override
	public float getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}
	@Override
	public StorageType getType() {
		// TODO Auto-generated method stub
		return StorageType.DEFAULT;
	}
	
	
}
