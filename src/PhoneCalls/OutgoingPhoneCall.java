/*
    My name is Don and I wrote this
    It's an extension of an abstract class
 */
package PhoneCalls;

public class OutgoingPhoneCall extends PhoneCall{
    int callTime;

    public OutgoingPhoneCall(String phoneNumber, int callTime){
        super(phoneNumber);
        this.callTime = callTime;
        this.setPriceOfCall(callTime*0.02);
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public Double getPriceOfCall(){
        return this.priceOfCall;
    }
    public void printCallInfo(){
        System.out.println( "Call Type: Outgoing \n" +
                            "Phone Number: " + this.phoneNumber + "\n" +
                            "Rate: 0.02\n" +
                            "Price Of Call: " + this.priceOfCall + "\n");
    }
}
