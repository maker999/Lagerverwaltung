package prüfung_24_10_2018;

public class CooledCompartment extends StorageCompartment{
	private int targetTemperature;
	public CooledCompartment(float maxWeight, float maxWidth, int targetTemperature){
		super(maxWeight, maxWidth);
		this.targetTemperature = targetTemperature;
	}
	public void storeObject(Storable storable) throws NotStorableException{
		System.out.println("sard");
		if(super.checkWeight(storable) && 
				super.checkWidth(storable) && 
				storable.getType() == StorageType.COOLED &&
				(((CooledObject) storable).getRequiredTemperature() >= this.targetTemperature) )
		{
				super.storeObject(storable);			
		}else throw new NotStorableException(this ,storable);
	}
}
