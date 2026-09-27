public class Medicine {
	
	int id;
	String name;
	double price;
	int quantity;
    public Medicine(int id,String name,double price,int quantity,MedicineType type,boolean prescriptionRequired,Supplier supplier)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	    this.quantity=quantity;
		prescriptionRequired=true;
	}
		;

    public void displayInfo(){
		System.out.println("Medicine:\n id: "+id+"\nName: "+name+"\nPrice: "+price+"
		;

    public Medicine shallowCopy();
    public Medicine deepCopy();

    public int compareTo(Medicine other){
		return this.id-other.id;

    public Supplier getSupplier();
}
