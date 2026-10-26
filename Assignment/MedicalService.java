package Assignment;



// Abstract Parent Class
abstract class MedicalService {

    String serviceId;
    String serviceName;
    double baseCost;

    MedicalService(String serviceId, String serviceName, double baseCost) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.baseCost = baseCost;
    }

    /// Concrete Method
    public void displayServiceInfo() {
        System.out.println("Service ID: " + serviceId);
        System.out.println("Service: " + serviceName);
    }

    /// Abstract Method
    public abstract double calculateTotalCost();
}

/// Consultation Class
class Consultation extends MedicalService {

    double doctorFee;

    Consultation(String serviceId, String serviceName,
                 double baseCost, double doctorFee) {

        super(serviceId, serviceName, baseCost);
        this.doctorFee = doctorFee;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + doctorFee;
    }
}

/// Laboratory Test Class
class LaboratoryTest extends MedicalService {

    double testCharge;

    LaboratoryTest(String serviceId, String serviceName,
                   double baseCost, double testCharge) {

        super(serviceId, serviceName, baseCost);
        this.testCharge = testCharge;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + testCharge;
    }
}

/// Ultrasound Class
class Ultrasound extends MedicalService {

    double additionalFee;

    Ultrasound(String serviceId, String serviceName,
               double baseCost, double additionalFee) {

        super(serviceId, serviceName, baseCost);
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + additionalFee;
    }
}

/// Main Class
class HospitalBillingSystem {

    public static void main() {

        Consultation s1 =
                new Consultation("S001", "Consultation", 15, 10);

        LaboratoryTest s2 =
                new LaboratoryTest("S002", "Laboratory Test", 10, 8);

        Ultrasound s3 =
                new Ultrasound("S003", "Ultrasound", 25, 15);

        double totalBill =
                s1.calculateTotalCost()
                        + s2.calculateTotalCost()
                        + s3.calculateTotalCost();

        System.out.println(" HOSPITAL BILLING SYSTEM ");

        s1.displayServiceInfo();
        System.out.println("Total Cost: " + s1.calculateTotalCost());

        System.out.println();

        s2.displayServiceInfo();
        System.out.println("Total Cost: " + s2.calculateTotalCost());

        System.out.println();

        s3.displayServiceInfo();
        System.out.println("Total Cost: $" + s3.calculateTotalCost());


        System.out.println("Total Hospital Bill: " + totalBill);
    }
}
