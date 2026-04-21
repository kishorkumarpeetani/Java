import java.util.Scanner;
import java.security.MessageDigest;

public class sha {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message :");
        String input = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-1");

        byte[] messageDigest = md.digest(input.getBytes());

        StringBuilder hexString = new StringBuilder();

        for(byte b : messageDigest){
            String hex = Integer.toHexString(0xff & b);

            if(hex.length() == 1) hexString.append('0');

            hexString.append(hex);
        }

        System.out.println("Message digest : "+hexString.toString());

        sc.close();
    }
}
