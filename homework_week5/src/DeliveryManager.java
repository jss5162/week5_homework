public class DeliveryManager {
    private int daysForDeliver;
    private int costForDeliver;
    private DeliveryPackage deliveryPackage;
    private long money = 100_000;

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public DeliveryPackage getDeliveryPackage() {
        return deliveryPackage;
    }

    public void setDeliveryPackage(DeliveryPackage deliveryPackage) {
        this.deliveryPackage = deliveryPackage;
    }

    public DeliveryManager(int daysForDeliver, int costForDeliver) {
        this.daysForDeliver = daysForDeliver;
        this.costForDeliver = costForDeliver;
    }

    public int getDaysForDeliver() {
        return daysForDeliver;
    }

    public void setDaysForDeliver(int daysForDeliver) {
        this.daysForDeliver = daysForDeliver;
    }

    public int getCostForDeliver() {
        return costForDeliver;
    }

    public void setCostForDeliver(int costForDeliver) {
        this.costForDeliver = costForDeliver;
    }
}
