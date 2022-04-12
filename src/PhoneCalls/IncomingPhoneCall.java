/*
    My name is Don and I wrote this
    It's an extension of an abstract class
 */
package PhoneCalls;

public class IncomingPhoneCall extends PhoneCall{

    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        this.setPriceOfCall(0.05);
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public Double getPriceOfCall(){
        return this.priceOfCall;
    }
    public void printCallInfo(){
        System.out.println( "Call Type: Incoming \n" +
                            "Phone Number: " + this.phoneNumber + "\n" +
                            "Rate: " + this.priceOfCall + "\n" +
                            "Price Of Call: " + this.priceOfCall + "\n");
    }
}
