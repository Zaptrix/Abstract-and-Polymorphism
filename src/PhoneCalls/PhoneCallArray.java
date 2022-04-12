/*
    My name is Don and I wrote this
    It implements the classes to create an array of phone calls
 */
package PhoneCalls;

import java.util.ArrayList;
import java.util.Random;

public class PhoneCallArray {
    public static void main(String[] args) {
        ArrayList<PhoneCall> calls = new ArrayList<>();
        Random selector = new Random();
        int number;
        for (int i=0; i < 10;i++){
            number = 1+selector.nextInt(2);
            switch (number) {
                case 1 -> calls.add(new IncomingPhoneCall("312-600-7493"));
                case 2 -> calls.add(new OutgoingPhoneCall("312-600-7493", 15));
            }
        }

        for (int i = 0; i < 10; i++) {
            PhoneCall call = calls.get(i);
            call.printCallInfo();
        }
    }
}
