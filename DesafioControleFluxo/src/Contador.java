import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int parametro1, parametro2;

        System.out.print("Insira o primeiro parâmetro: ");
        parametro1 = scan.nextInt();
        System.out.print("Insira o segundo parâmetro: ");
        parametro2 = scan.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.err.println("ERRO NA ENTRADA DE PARÂMETROS: " + e.getMessage());
        }

        scan.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        int contagem = parametro2 - parametro1;

        if(contagem==0){
            throw new ParametrosInvalidosException("os parâmetros não podem ser iguais!");
        } else if (contagem<0) {
            throw new ParametrosInvalidosException("os primeiro parâmetro não pode ser maior do que o segundo!");
        }

        System.out.println("Contando...");
        for(int i=1; i<=contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
        System.out.println("Contagem realziada!");
    }
}
