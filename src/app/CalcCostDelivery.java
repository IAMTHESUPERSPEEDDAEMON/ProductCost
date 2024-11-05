package app;

// Клас розрахунку вартості товару,
// враховуючи вартість доставки
// ЗАВДАННЯ: Виправити код класу.
// Клас успадковує клас CalcCostBase.
public class CalcCostDelivery extends CalcCostBase {

    // Розрахунок вартості товару,
    // з урахуванням вартості доставки
    @Override
    public double calcCost(Product product) {
        // Вартість доставки
        double deliveryPrice = Constants.deliveryCost;

        return product.getQuota() * product.getPrice()
                + deliveryPrice;
    }
}
