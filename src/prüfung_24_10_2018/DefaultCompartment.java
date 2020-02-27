package prüfung_24_10_2018;

public class DefaultCompartment extends StorageCompartment{

	public DefaultCompartment(float maxWeight, float maxWidth) {
		super(maxWeight, maxWidth);
		// TODO Auto-generated constructor stub
	}
	public void storeObject(Storable storable) throws NotStorableException{
		if(super.checkWeight(storable) && 
				super.checkWidth(storable))
		{
				super.storeObject(storable);			
		}else throw new NotStorableException(this ,storable);
	}
}
