public interface Phone {
    boolean powerOn(); // either it will ON or OFF.
    void callNumber(String phoneNo); // i want to make call
    void receiveCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();

}
