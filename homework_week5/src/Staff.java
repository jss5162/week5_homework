public class Staff {
private long sales= 100_000;//실적(매상)
    private Shoes shoes;
    private boolean havingShoes;

    public Staff(Shoes shoes, boolean havingShoes) {
        this.shoes = shoes;
        this.havingShoes = havingShoes;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public boolean isHavingShoes() {
        return havingShoes;
    }

    public void setHavingShoes(boolean havingShoes) {
        this.havingShoes = havingShoes;
    }

    public void explainShoes() {
        System.out.println("이 신발은 " + shoes.getFeature()+ "의 특성을 가지고 있습니다. \n가격은 : "
                +shoes.getPrice()+"원 입니다.");

    }

    public boolean checkShoeStock() {
        if(havingShoes)
            return true;
        return false;
    }

    public void processShoePayment(Customer customer) {
        System.out.println("신발가격은 "+shoes.getPrice()+"원 이 결제됩니다.");
        customer.setCash(customer.getCash()-shoes.getPrice());
        sales+=customer.getCash();

    }

    public void refundShoePayment(Customer customer) {
        System.out.println("신발가격 "+shoes.getPrice()+"원 이 환불됩니다.");
        customer.setCash(customer.getCash() + shoes.getPrice());  // 고객 잔고 증가
        sales -= shoes.getPrice();  // 매출에서 금액 차감
    }
    public void sendShoes(){
        System.out.println("여기 신발입니다.");
    }

    public long requestDelivery(DeliveryManager deliveryManager) {
        System.out.println("예정소요일자는 "+deliveryManager.getDaysForDeliver()+"일이고 배송료는 "+
                deliveryManager.getCostForDeliver()+"원 입니다.");
    return (long) deliveryManager.getCostForDeliver()+shoes.getPrice();
    }

}
