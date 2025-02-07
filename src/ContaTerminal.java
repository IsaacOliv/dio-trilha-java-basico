import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente;
        int numero;
        String agencia;
        double saldo;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Para darmos continuidade ao seu cadastro, precisamos de algumas informações. Por favor, preencha os dados necessários para concluirmos o processo.");

        System.out.println("Por favor, digite seu nome e sobrenome:");
        nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite seu numero de conta:");
        numero = scan.nextInt();
        System.out.println("Por favor, digite sua agencia:");
        agencia = scan.next();
        System.out.println("Por favor, digite deposito inicial:");
        saldo = scan.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
