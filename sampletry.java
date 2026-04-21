class sampletry{
    public static void main(String[] args) {
        int age = 20;
        String name = "kishor";

        // String s = "Hello your age is " +age+ ".";
        String s = """
                    Hello %s !! your age is %d.
                    """.formatted(name, age);



        System.out.println(s);
    }
}