import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        String saldoTexto = scanner.nextLine().replace(",", ".");
        double saldo = Double.parseDouble(saldoTexto);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}