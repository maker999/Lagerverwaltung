package prüfung_24_10_2018;

public class DefaultCompartment extends StorageCompartment{

	public DefaultCompartment(float maxWeight, float maxWidth) {
		super(maxWeight, maxWidth);
		// TODO Auto-generated constructor stub
	}
	public void storeObject(Storable storable) throws NotStorableException{
		System.out.println("def");
		if(super.checkWeight(storable) && 
				super.checkWidth(storable) && storable.getType()==StorageType.DEFAULT )
		{
				super.storeObject(storable);			
		}else throw new NotStorableException(this ,storable);
	}
}
