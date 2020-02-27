package prüfung_24_10_2018;

public class CooledObject extends TemperedObject{
	public CooledObject(float weight, float width, int minimalTemperature){
		super(weight, width);
		super.requiredTemperature = minimalTemperature;		
	}
	public StorageType getType(){
		return StorageType.COOLED;
	}
	public int getRequiredTemperature(){
		return super.requiredTemperature;
	}
}
