class BitOperations{
    public static void main(String[] args) {
        String s = "Hello World";
        StringBuilder xorRes = new StringBuilder();
        StringBuilder orRes = new StringBuilder();
        StringBuilder andRes = new StringBuilder();

        for(char c : s.toCharArray()){
            xorRes.append((char)(127 ^ c));
            orRes.append((char)(127 | c));
            andRes.append((char)(127 & c));
        }

        System.out.println("XOR result :"+ xorRes);
        System.out.println("OR result :"+ orRes);
        System.out.println("AND result :"+ andRes);
    }
}