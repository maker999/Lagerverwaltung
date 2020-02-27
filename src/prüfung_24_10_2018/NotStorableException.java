package prüfung_24_10_2018;

public class NotStorableException extends Throwable{
	Storable storableObject;
	StorageCompartment storageArea;
	NotStorableException(StorageCompartment storageArea, Storable storableObject){
		this.storableObject = storableObject;
		this.storageArea = storageArea;
	}
	public String getMessage(){
		 return "Compartment's Max Width = " + 
				 String.valueOf(this.storageArea.getMaxWidth()) + 
				 " m , used = " + 
				 String.valueOf(this.storageArea.calculateSumOfWidth()) +
				 ", New Object's Width = " + 
				 String.valueOf(this.storableObject.getWidth()) + " m\n" +
				 "Compartment's Max Weight = " + 
				 String.valueOf(this.storageArea.getMaxWeight()) +
				 " kg , used = " + 
				 String.valueOf(this.storageArea.calculateSumOfWeights())+
				 "kg , new object's weight = " + 
				 String.valueOf(this.storableObject.getWeight()) + " kg";
	}

}
