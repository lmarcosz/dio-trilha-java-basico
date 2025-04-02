import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        try{
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome: ");
            String nome = scan.next();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scan.next();
            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();
            System.out.println("Digite sua idade: ");
            double altura = scan.nextDouble();
            System.out.print("Olá, me chamo " + nome + " " + sobrenome);
            System.out.print(", tenho " + idade + " anos de idade ");
            System.out.println("e minha altura é " + altura + "m.");
            scan.close();
        } catch(InputMismatchException e){
            System.err.println("Formato de entrada inválido!");
        }
    }
}
