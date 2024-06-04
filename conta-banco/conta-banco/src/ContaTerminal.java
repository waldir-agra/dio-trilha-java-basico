import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Por favor digite o numero da sua agênca: ");
        int agencia = scanner.nextInt(); // Solicita entrada dos numeros referente a agência

        System.out.println("Agora digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt(); // Solicita entrada dos numeros referente a conta
        scanner.nextLine(); // Limpar o buffer do scanner após o nextInt
    
        System.out.println("Agora digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine(); // Solicita entrada de dados sobre o nome do cliente

        System.out.println("Por favor digite o saldo da sua conta: ");
        double saldo = scanner.nextDouble(); // Solicita entrada dos numeros referente ao saldo da conta

        System.out.println("Olá Sr(a)" + nomeCliente + ", Obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", Conta: " + numeroConta + " e seu saldo é R$" + saldo + " Já está disponível para saque.");

        scanner.close();
    }
}
