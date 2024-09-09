public class Customer {
    private long cash = 100_000; //잔액
    private boolean isDeliveryPreferred;// 배송주문 선호여부
    private String feeling = "좋지않음";


    /**
     * 생성자와 getter setter
     */

    public Customer(boolean isDeliveryPreferred) {
        this.isDeliveryPreferred = isDeliveryPreferred;
    }


    public long getCash() {
        return cash;
    }

    public void setCash(long cash) {
        this.cash = cash;
    }

    public boolean isDeliveryPreferred() {
        return isDeliveryPreferred;
    }

    public void setDeliveryPreferred(boolean deliveryPreferred) {
        isDeliveryPreferred = deliveryPreferred;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }


    public void askAboutShoes(Staff staff) {
        System.out.println("Nike 운동화에 대해 알려주세요.");
        staff.explainShoes();

    }

    @Override
    public String toString() {
        return "Customer{" +
                "돈 : " + cash +
                ", 기분 : '" + feeling + '\'' +
                '}';
    }

    public void endWithSeeYouNextTime(){
        System.out.println("다음에 올게요.");
        System.out.println(this.toString());
    }

    public boolean paymentPossible(Staff staff) {
        if (cash - staff.getShoes().getPrice() < 0) {
            endWithSeeYouNextTime();
            return false;
        }
        return true;
    }
    public void wearShoes(Staff staff) {
        System.out.println("신발을 신었는데 "+staff.getShoes().getFeature() +"의 특징이 있네요");
        setFeeling("좋음");
        System.out.println("기분이 "+feeling +"입니다.");
        System.out.println(this.toString());


    }
    public void wearShoesFromPackage(DeliveryManager deliveryManager) {
        System.out.println("신발을 신었는데 "+deliveryManager.getDeliveryPackage().getShoes().getFeature() +"의 특징이 있네요");
        setFeeling("좋음");
        System.out.println("기분이 "+feeling +"입니다.");
        System.out.println(this.toString());

    }

    public void payDeliveryFee(DeliveryManager deliveryManager){
        setCash(cash-deliveryManager.getCostForDeliver());
        deliveryManager.setMoney(deliveryManager.getMoney()-cash);


    }
}
