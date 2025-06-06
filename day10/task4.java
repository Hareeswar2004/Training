package day10;
interface PaymentGateway{
    boolean processpayment(double amount);
    String getTransactionId(String TransactionId);
}
class CreditCardPayment implements PaymentGateway{
    public boolean processpayment(double amount){
        System.out.println("Processing payment $" +amount);
        return true;
    }
    public String getTransactionId(String TransactionId){
        return"Credit Card Transaction ID : "+TransactionId;
    }
}
class UPIPayment implements PaymentGateway{
    public boolean processpayment(double amount){
        System.out.println("Processing payment $" +amount);
        return true;
    }
    public String getTransactionId(String TransactionId){
        return "UPI transaction ID: "+TransactionId;
    }

}
public class task4 {
    public static void main(String[] args) {
        PaymentGateway payment1 = new CreditCardPayment();
        payment1.processpayment(100000);
        System.out.println(payment1.getTransactionId("KLU5051"));

        PaymentGateway payment2 = new UPIPayment();
        payment2.processpayment(200000);
        System.out.println(payment2.getTransactionId("KLU5052"));
    }
}
