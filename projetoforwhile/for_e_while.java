package projetoforwhile;

public class for_e_while {
public static void main(String[] args) {
    int[] numeros = {3, 5, 2, 7}; 

    
    for (int numero : numeros) {
        System.out.println("Contando até " + numero + ":");

        int contador = 1; 
        
        while (contador <= numero) {
            System.out.print(contador + " ");
            contador++; 
        }

        System.out.println(); 
    }
}

}