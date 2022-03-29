import java.util.Random;

public class UsingJavaDotUtil {
    public static void otpGenerator(int lengthOfOtp){
        char [] otpValue = new char[lengthOfOtp];
        String allDigit = "0123456789";
        Random randomObj = new Random();

        for(int i = 0; i < lengthOfOtp; i++){
        int otpMessage = randomObj.nextInt(allDigit.length());
        otpValue[i] = allDigit.charAt(otpMessage);
        }
        System.out.println("Your OTP message is: " + new String (otpValue));
    }
    public static void main (String [] args){

        otpGenerator(5);
    }
}
