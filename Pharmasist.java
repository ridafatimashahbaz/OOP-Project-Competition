public class Pharmacist {
    public Pharmacist(int id,String name,String license)
    { 
	this.id=id;
	this.name=name;
	this.license=license;
	}
	;

    public void displayInfo();
	 System.out.println("Pharmacist Id: "+id+"\nPharmacist Name: "+name+"Pharmacist License: "+license);
}
