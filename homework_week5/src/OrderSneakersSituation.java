public class OrderSneakersSituation {

    public static void main(String[] args){
        // 변수 변경 가능
        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.

        boolean isCustomerLikeDelivery = false; // 고객의 배송 주문 선호 여부

        String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        long nikeSneakersPrice = 50_000;
        boolean havingNikeSneakersInStore = true; // 매장 Nike sneakers 재고 여부

        int daysForDeliver = 3;
        int costForDeliver = 15_000;

        Shoes shoes = new Shoes(nikeSneakersPrice,nikeSneakersFeature);
        Customer customer = new Customer(isCustomerLikeDelivery);
        Staff staff = new Staff(shoes,havingNikeSneakersInStore);
        DeliveryManager deliveryManager = new DeliveryManager(daysForDeliver,costForDeliver);
        /**
         *  필수 인스턴스 생성
         *  Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 Customer, Staff, DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         *
         *  Customer: 자신의 Cache 와 배송 주문선호 여부
         *  Staff: 자신의 매상, Nike 운동화 정보, 매장의 Nike 운동화 재고 보유여부
         *  DeliverManager: 자신의 매상, Nike 운동화 정보, 포장 정보
         * */

        /**
         *  필수 인스턴스 생성
         *  Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 Customer, Staff, DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         * */

        // TODO: 클래스를 선언하고, 객체간의 협력으로 구현해주세요.
        customer.askAboutShoes(staff);
        if(!customer.paymentPossible(staff))
            return; //잔고 부족시 상황종료
        if(staff.isHavingShoes()){
            //재고가 있을경우
            staff.processShoePayment(customer);
            staff.sendShoes();
            customer.wearShoes(staff);
           return;
        }
            // 재고가 없을경우
        if(!customer.isDeliveryPreferred()) { //  배송선호 안할시 상황종료
                customer.endWithSeeYouNextTime();
                return;
            }
        staff.processShoePayment(customer);
        if(staff.requestDelivery(deliveryManager)> customer.getCash()+ shoes.getPrice())
        /**
         * 이미 결제는 진행됐으니 신발값 더해줘야됨 주의
         */

        {
            staff.refundShoePayment(customer);
            customer.endWithSeeYouNextTime();
            return;

        }
        deliveryManager.setDeliveryPackage(new DeliveryPackage(shoes)); //포장
        customer.payDeliveryFee(deliveryManager); // 계산
        customer.wearShoesFromPackage(deliveryManager); //신기
















    }
}