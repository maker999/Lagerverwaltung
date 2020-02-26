package prüfung_24_10_2018;

public class CooledCompartment extends StorageCompartment{
	private int targetTemperature;
	public CooledCompartment(float maxWeight, float maxWidth, int targetTemperature){
		super(maxWeight, maxWidth);
		this.targetTemperature = targetTemperatue;
	}
	public void storeObject(Storable storable) throws NotStorableException{
		if(super.checkWeight(storable) && 
				super.checkWidth(storable) && 
				storable.getType() == COOLED &&
				((CooledObject)storable).getRequiredTemperature() >= this.targetTemperature){
			super.storeObject(storable);
		}else throw new NotStorableException();
	}
}
