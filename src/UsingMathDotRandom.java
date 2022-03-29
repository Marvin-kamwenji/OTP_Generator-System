public class UsingMathDotRandom {

    public static void otpGenerator(){
        int otpMessage = (int)(Math.random() * 9000) + 1000;

        System.out.println("Your OTP message is: " + otpMessage);
    }
    public static void main(String [] args){
        otpGenerator();
    }
}
