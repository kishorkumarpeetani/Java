

public class P2a {
    public static void main(String[] args) {
        String s = "HelloWorld";
        String andResult = "";
        String orResult = "";
        String xorResult = "";


        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);

            andResult += (char)(c & 127);
            orResult += (char)(c | 127);
            xorResult += (char)(c ^ 127);
        }

        System.out.println(andResult);
        System.out.println(orResult);
        System.out.println(xorResult);
    }
}
