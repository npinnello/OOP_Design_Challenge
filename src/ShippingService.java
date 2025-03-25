public class ShippingService {
    public double calculateShippingCost(String address, double weight) {
        double rate = fetchShippingRate(address);
        return rate * weight;
    }

    private double fetchShippingRate(String address) {
        // External API call or logic to determine rate
        return 5.0; // Example rate
    }
}
