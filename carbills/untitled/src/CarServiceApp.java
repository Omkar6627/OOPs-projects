import java.util.*;




public class CarServiceApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car type (HATCHBACK/SEDAN/SUV): ");
        CarType carType = CarType.valueOf(scanner.nextLine().toUpperCase());
        CarService carService = new CarService(carType);

        System.out.print("Enter the service codes (Space-separated): ");
        String input = scanner.nextLine();
        List<ServiceCode> requestedServiceCodes = new ArrayList<>();
        for (String code : input.split(" ")) {
            try {
                requestedServiceCodes.add(ServiceCode.valueOf(code.toUpperCase()));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid service code: " + code);
            }
        }

        int totalBill = carService.calculateTotalBill(requestedServiceCodes);
        System.out.println("****** YOUR BILL ******");
        System.out.println("Type of Car – " + carType);
        for (ServiceCode code : requestedServiceCodes) {
            int servicePrice = carService.getServicePrice(code);
            if (servicePrice > 0) {
                System.out.println("Charges for " + code + " – ₹ " + servicePrice);
            }
        } if (totalBill > 10000) {System.out.println("Complimentary cleaning worth - 2000 provided.");
        }
        System.out.println("---------------------------" );
        System.out.println("Total Bill – ₹ " + totalBill);


        System.out.print("Thankyou visit Again :)");
    }
}
