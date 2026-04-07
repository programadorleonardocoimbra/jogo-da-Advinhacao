import java.util.Scanner;

public class contagemDeNumerosNaturais2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var name = "Lucia"; //Declarei a variável certa

        System.out.println(" ");
        System.out.println("======================================");
        System.out.println("==== JOGO: ADVINHE O NOME CORRETO ====");
        System.out.println("======================================");

        System.out.println("=>>> Advinhe o qual o nome correto para ganhar o sorteio, ESCOLHA um nome Abaixo: ");
        System.out.println(" ");
        System.out.println("((( Leandra - Michele - Lucia - Sara - Bruna )))");
        System.out.println(" ");
        System.out.println("BOA SORTE!");
        System.out.println(" ");


        while (true) {
            System.out.print("Digite aqui: ");
            name = scanner.nextLine();

            if (name.equals("Lucia")) {
                System.out.println("---------------------------------------------------------------");
                System.out.println("Você acertou!");
                System.out.println("---------------------------------------------------------------");
                System.out.println("Fim de Jogo");
                break;
            }

            if (!name.equalsIgnoreCase("Sara" + "Leandra" + "Michele" + "Bruna")) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Você Perdeu :( - TENTE NOVAMENTE");
            System.out.println("---------------------------------------------------------------");
            System.out.println(" ");
        }

        }

    }
}
