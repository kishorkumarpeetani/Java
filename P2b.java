public class P2b {

    static String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String Key = "QWERTYUIOPASDFGHJKLZXCVBNM";

    public static String encrypt(String s){
        s = s.toUpperCase();
        String res = "";
        for(int i=0 ; i<s.length() ; i++){
            int indx = a.indexOf(s.charAt(i));

            if(indx != -1){
                res += Key.charAt(indx);
            }
        }
        return res;
    }
    public static String decrypt(String s){
        String res = "";
        for(int i=0 ; i<s.length() ; i++){
            int indx = Key.indexOf(s.charAt(i));

            if(indx != -1){
                res += a.charAt(indx);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String text = "Hello";

        String ct =  encrypt(text);
        System.out.println("encrypted text :"+ct);

        String pt = decrypt(ct);
        System.out.println("decrypted text :"+pt);
    }
}
