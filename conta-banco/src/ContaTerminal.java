// Importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Exibir as mensagens para o usuário.
        // Ler os valores digitados no terminal.

        // Criando o objeto scanner:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String agencia = "000-0";
        int numero = 0;
        String nomeCliente = " ";
        double saldo = 0.00;



        // Mensagens para o usuário:
        System.out.println("Por favor, digite o número da sua agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();
                
        scanner.close();

        // Exibir a mensasem criada.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
