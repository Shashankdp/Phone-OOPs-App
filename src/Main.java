public class Main {
    public static void main(String[] args) {
        Landline l1 = new Landline("9035245276"); //to make a call
        Landline l2= new Landline("9972526498"); // to receive a call.

        l1.callNumber("9972526498");
        l2.receiveCall("9972526498");

        System.out.println(l2.answerCall());


    }
}