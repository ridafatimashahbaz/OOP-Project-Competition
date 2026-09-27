public class Customer {
    public Customer(int id, String name);

    public void displayInfo();

    public Sale purchaseMedicine(
            Medicine medicine,
            int quantity,
            Pharmacist pharmacist
    ) throws InvalidMedicineException;

    public Sale purchaseMedicine(
            Medicine medicine,
            int quantity,
            Pharmacist pharmacist,
            Prescription prescription
    ) throws InvalidMedicineException;
}
