import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
     public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da Agencia: ");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite Saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        " sua conta é: " + conta + " e seu saldo de " + saldo + " já está disponível para saque!");
     }

}     