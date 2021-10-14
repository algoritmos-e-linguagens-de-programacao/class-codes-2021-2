class Exemplo {
    public static void main(String[] args) {
        
        int[] lista = {1, 9, 5, 32, 27, 81, 16, 33};

        System.out.println("Tamanho de lista " + lista.length);

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }

        int[] lista2 = new int[lista.length * 2];
        for (int i = 0; i < lista.length; i++) {
            lista2[i] = lista[i];
        }

        lista = lista2;

        System.out.println(" ");

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }

        System.out.println(" ");

        System.out.println("Tamanho de lista " + lista.length);

    }
}