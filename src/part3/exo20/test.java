package part3.exo19;

import part3.exo19.users.Customer;

public class test {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer("Jack","Smith",30);
        System.out.println(cust1 == cust2);
        System.out.println(cust1.equals(cust2));
        cust2 = cust1;
        System.out.println(cust1 == cust2);
        System.out.println(cust1.equals(cust2));
    }
}
