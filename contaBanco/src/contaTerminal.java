import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Digite o número de sua conta:");
        numero = scanner.nextInt();

        System.out.println("Digite sua agencia:");
        agencia = scanner.next();

        System.out.println("Digite seu nome:");
        nomeCliente = scanner.next();

        System.out.println("Digite seu saldo atual:");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível!");

        scanner.close();
    }
}
