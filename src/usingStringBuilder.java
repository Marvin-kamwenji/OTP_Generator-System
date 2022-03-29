import java.util.SplittableRandom;

public class usingStringBuilder {
    public static void otpGenerator(int lengthOfOTP){
        StringBuilder otpValue = new StringBuilder();
        SplittableRandom splittableRandom = new SplittableRandom();

        for(int i = 0; i < lengthOfOTP; i++){
            int randomNo = splittableRandom.nextInt(0, 9);
            otpValue.append(randomNo);
        }
        System.out.println("Your otp message is: " + otpValue.toString());
    }

    public static void main (String [] args){
        otpGenerator(6);
    }
}
