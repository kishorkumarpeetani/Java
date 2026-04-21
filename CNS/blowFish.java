import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Scanner;

public class blowFish {
    private static SecretKey generateKey() throws Exception{
        KeyGenerator key = KeyGenerator.getInstance("Blowfish");
        key.init(128);
        return key.generateKey();
    }

    private static String encrypt(String text, SecretKey key) throws Exception{
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encryptedBytes = cipher.doFinal(text.getBytes());

        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String text, SecretKey key) throws Exception{
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, key);

        byte[] bytes = Base64.getDecoder().decode(text);

        byte[] decryptedBytes = cipher.doFinal(bytes);

        return new String(decryptedBytes);
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text : ");
        String text = sc.nextLine();

        SecretKey key = generateKey();

        String ct = encrypt(text, key);

        String pt = decrypt(ct, key);

        System.out.println("Ct : " +ct);
        System.out.println("pt : " +pt);

        sc.close();
    }
}
