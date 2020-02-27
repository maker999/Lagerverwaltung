package prüfung_24_10_2018;

public abstract class TemperedObject extends StorageObject {
	protected int requiredTemperature;
	protected TemperedObject(float weight, float width){
		super(weight, width);
	}
}
