import java.sql.SQLOutput;

public class Landline implements Phone{

    //Attributes of landline class
   private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;

        this.isRinging=false; // initially phone is not ringing. that's why i set it as false.
        this.isPowerOn=true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public boolean powerOn() {
        this.isPowerOn=true;
        return true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn==true){
            System.out.println("You are dialing the number "+phoneNo);
        }
        else{
            System.out.println("Your landline is off");
        }

    }

    @Override
    public void receiveCall(String phoneNo) {
      if(isPowerOn && myPhoneNo.equals(phoneNo)){
          this.isRinging=true;
          System.out.println("Your are receiving call "+myPhoneNo);

      }
      else{
          System.out.println("Call not received");
      }
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true) {
            System.out.println("Call answered");
            isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
