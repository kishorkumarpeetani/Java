import java.util.Scanner;

class SubstituteCipher {
    static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String key = "QWERTYUIOPASDFGHJKLZXCVBNM";

    private static String encryption(String t) {
        StringBuilder res = new StringBuilder();

        for (char c : t.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int indx = alpha.indexOf(c);
                res.append(key.charAt(indx));
            } else {
                res.append(c); // keep spaces & symbols
            }
        }
        return res.toString();
    }

    private static String decryption(String t) {
        StringBuilder res = new StringBuilder();

        for (char c : t.toCharArray()) {
            if (Character.isLetter(c)) {
                int indx = key.indexOf(c);
                res.append(alpha.charAt(indx));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Plain Text: ");
        String pt = sc.nextLine();

        String ct = encryption(pt);
        String dt = decryption(ct);

        System.out.println("Encrypted Text: " + ct);
        System.out.println("Decrypted Text: " + dt);

        sc.close();
    }
}