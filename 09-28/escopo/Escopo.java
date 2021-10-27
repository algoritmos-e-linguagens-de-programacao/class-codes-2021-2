class Escopo {    
    static int a = 99;

    public static void main(String[] args) {
        // Shadowing
        String a = "palavra"; 

        System.out.println(a);
    }
    
}