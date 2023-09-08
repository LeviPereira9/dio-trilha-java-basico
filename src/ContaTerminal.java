import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Por favor, informe o número de sua conta: ");
            int contaNumero = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Agora, informe o número da Agência: ");
            String contaAgencia = scanner.nextLine();

            System.out.print("Por favor, o nome completo: ");
            String contaNome = scanner.nextLine();

            double contaSaldo = 312.31;

            System.out.printf(
                    "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é a %s, conta Nº %d e seu saldo de R$%.2f já está disponível para saque.",
                    contaNome, contaAgencia, contaNumero, contaSaldo);
        }

    }
}
