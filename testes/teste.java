package testes;

public class  teste {

public static void main(String[] args) {
    char conceito = 'A';

switch (conceito) {
    case 'A':
        System.out.println("Excelente!");
        break;
    case 'B':
    case 'C':
        System.out.println("Muito Bem");
        break;
    case 'D':
        System.out.println("Aprovado");
    case 'F':
        System.out.println("Reprovado");
        break;
    default:
        System.out.println("Conceito invalido");
}
System.out.println("Seu conceito é " + conceito);
 }
}

    
