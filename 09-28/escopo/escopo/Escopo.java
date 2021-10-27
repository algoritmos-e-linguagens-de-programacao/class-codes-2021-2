class Escopo {        
    
    public static void main(String[] argumentos) {
        int[] lista = {1,2,3,4,5,6,7};
        // Shadowing
        //String a = "palavra"; 
        int lista2[] = new int[10];
        
        for(int i = 0; i < lista.length; i++){
            lista2[i] = lista[i];
        }
        
        lista = lista2;

        System.out.println(lista.length);
        
        lista[99] = 100;
                
    }
    
}