package step1;

public class step1 {

    public static void main(String[] args) {
        Customer customerlee = new Customer();
        customerlee.setCustomerID(10010);
        customerlee.setCustomerName("이순신");
        customerlee.bonusPoint = 1000;
        System.out.println(customerlee.showCustomerInfo());

        VIPcustomer customerkim = new VIPcustomer();
        customerkim.setCustomerID(10020);
        customerkim.setCustomerName("김유신");
        customerkim.bonusPoint = 10000;
        System.out.println(customerkim.showCustomerInfo());




    }

}
