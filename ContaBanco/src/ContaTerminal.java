import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da Agência: ");
        String agenciaConta = scan.next();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.print("Digite seu primeiro nome: ");
        String nomeCliente = scan.next();

        System.out.print("Digite o saldo da conta: ");
        double saldoConta = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");

        scan.close();
    }
}
