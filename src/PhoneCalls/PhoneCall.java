/*
    My name is Don and I wrote this
    It's an abstract class
 */
package PhoneCalls;

public abstract class PhoneCall {
    protected String phoneNumber;
    protected Double priceOfCall;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPriceOfCall(Double priceOfCall) {
        this.priceOfCall = priceOfCall;
    }

    abstract String getPhoneNumber();
    abstract Double getPriceOfCall();
    abstract void printCallInfo();

}
