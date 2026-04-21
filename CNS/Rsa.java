import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;

public class Rsa {

    private BigInteger p, q, n, phi, e, d;
    private int bitLength = 1024;

    public Rsa(){
        SecureRandom random = new SecureRandom();

        p = BigInteger.probablePrime(bitLength, random);
        q = BigInteger.probablePrime(bitLength, random);

        n = p.multiply(q);

        phi = (p.subtract(BigInteger.ONE)).multiply((q.subtract(BigInteger.ONE)));

        e = BigInteger.valueOf(65537);

        d = e.modInverse(phi);
    }

    public BigInteger encrypt(BigInteger message){
        return message.modPow(e, n);
    }
    public BigInteger decrypt(BigInteger cipher){
        return cipher.modPow(d, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rsa rsa = new Rsa();

        System.out.println("ENter message :");
        String text = sc.nextLine();

        BigInteger message = new BigInteger(text.getBytes());

        BigInteger cipher = rsa.encrypt(message);
        BigInteger plaintxt = rsa.decrypt(cipher);

        String res = new String(plaintxt.toByteArray());

        System.out.println("Cipher text : "+cipher);
        System.out.println("Message : "+res);

        sc.close();
    }
}
