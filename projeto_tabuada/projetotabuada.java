package projeto_tabuada;

public class projetotabuada {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("Tabuada do " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); // Move para a próxima linha para a próxima tabela
        }
    }
}