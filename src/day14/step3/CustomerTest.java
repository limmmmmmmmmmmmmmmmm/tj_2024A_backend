package day14.step3;

public class CustomerTest {
    public static void main(String[] args) {


        //buyer.buy(); -> 추상메소드 호출해봤자 구현할수 없기 떄문에 에러


        //객체 생성
        Customer customer = new Customer();

        // customer 타입이 buy 타입으로 변환(자동 타입 변환 가능)
        Buy buyer = customer;
        buyer.buy(); //태생으로 호출
        buyer.order();

        // customer 타입이 sell 타입으로 변환(자동 타입 변환 가능)
        Sell seller = customer;
        seller.sell();
        seller.order();

        if (seller instanceof Customer){
            Customer customer2 = new Customer();
            customer2.buy();
            customer2.sell();
        }
        customer.order();
    }
}
