import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CarService {
    private Map<ServiceCode, Integer> servicePrices = new HashMap<>();
    private CarType carType;

    public CarService(CarType carType) {
        this.carType = carType;
        initializeServicePrices();
    }

    private void initializeServicePrices() {
        servicePrices.put(ServiceCode.BS01, carType == CarType.HATCHBACK ? 2000 : carType == CarType.SEDAN ? 4000 : 5000);
        servicePrices.put(ServiceCode.EF01, carType == CarType.HATCHBACK ? 5000 : carType == CarType.SEDAN ? 8000 : 10000);
        servicePrices.put(ServiceCode.CF01, carType == CarType.HATCHBACK ? 2000 : carType == CarType.SEDAN ? 4000 : 6000);
        servicePrices.put(ServiceCode.BF01, carType == CarType.HATCHBACK ? 1000 : carType == CarType.SEDAN ? 1500 : 2500);
        servicePrices.put(ServiceCode.GF01, carType == CarType.HATCHBACK ? 3000 : carType == CarType.SEDAN ? 6000 : 8000);
    }

    public int getServicePrice(ServiceCode serviceCode) {
        return servicePrices.getOrDefault(serviceCode, 0);
    }

    public int calculateTotalBill(List<ServiceCode> requestedServiceCodes) {
        int totalBill = 0;
        for (ServiceCode code : requestedServiceCodes) {
            int servicePrice = getServicePrice(code);
            if (servicePrice > 0) {
                totalBill += servicePrice;
            }

        }
        return totalBill;
    }
}
