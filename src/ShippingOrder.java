import java.util.List;
import java.util.ArrayList;

public class ShippingOrder {
    private List<Item> items;
    private double shippingCost;
    private double totalWeight;

    public ShippingOrder(List<Item> initialItems, String address, ShippingService shippingService) {
        this.items = new ArrayList<>(initialItems);
        this.totalWeight = calculateTotalWeight();
        this.shippingCost = shippingService.calculateShippingCost(address, totalWeight);
    }

    private double calculateTotalWeight() {
        double weight = 0;
        for (Item i : items) {
            weight += i.getWeight();
        }
        return weight;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items); // Encapsulation: Return a copy to prevent modification
    }
}
