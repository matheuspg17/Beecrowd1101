
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] lista;
        String linha;
        int num1, num2, numeromaior, numeromenor, controle = 1, soma;

        for (int i = 0; i < controle; i++) {
            linha = leia.nextLine();
            lista = linha.split(" ");
            num1 = Integer.parseInt(lista[0]);
            num2 = Integer.parseInt(lista[1]);
            
            soma = 0;

            if (num1 <= 0 || num2 <= 0) {
                controle = 0;
            } else {
                controle++;
            }
            
            if (num1 > num2) {
                numeromaior = num1;
                numeromenor = num2;
            } else {
                numeromaior = num2;
                numeromenor = num1;
            }
            
            for (int j = numeromenor; j <= numeromaior; j++) {
                if (numeromenor > 0) {
                soma += j;
                System.out.print(j + " ");
                }
            }
                if(soma > 0){
                    System.out.println("Sum=" + soma);
                }
        }   
    }
}
