import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SequenciaFibonacci {


    public static boolean verificarNumero(int numero){

        int x = 0;
        int y = 1;
        boolean pertence = false;
        if (numero == x || numero == y) {
            pertence = true;
        }

        int proximo = x + y;

        while (proximo <= numero) {
            if (proximo == numero) {
                pertence = true;
            }
            x = y;
            y = proximo;
            proximo = x + y;
        }

        return pertence;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if(verificarNumero(numero)){
            System.out.println("O número: "+ numero+ " pertence a sequência  de Fibonacci."  );
        }
        else {
            System.out.println("O número: "+ numero+ " NÃO pertence a sequência  de Fibonacci."  );

        }

        scanner.close();
    }

}