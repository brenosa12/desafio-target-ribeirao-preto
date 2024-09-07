import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Existencia {


    public static int  verificarOcorrencias(String palavra){
        palavra = palavra.toUpperCase();
        char[] letras = palavra.toCharArray();
        int ocorrencias = 0;

        for( int i = 0; i < letras.length; i++){
            if ( letras[i] == 'A'){
                ocorrencias += 1;
            }
        }
        return ocorrencias;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine();
        int ocorrencias = verificarOcorrencias(palavra);
        if (ocorrencias == 0){
            System.out.println("NÃO há existência  da letra 'a'.");
        }
        else {
            System.out.println("Existem: " + ocorrencias + " ocorrências da letra 'a'.");
        }

        scanner.close();
    }

}