import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String opcao;
        float num1, num2, ope;
        boolean sair = false;
        while (sair == false) {
            System.out.println("Escolha uma das opções válidas: soma, sub (para a subtração), multi (para a multiplicação), div (para a divisão) e sair.");
            opcao = ler.nextLine();
            if (opcao.equalsIgnoreCase("soma")) {
                System.out.println("Escolha 2 números para somar.");
                num1 = ler.nextFloat();
                num2 = ler.nextFloat();
                ler.nextLine();
                ope = num1 + num2;
                System.out.printf("O resultado da soma é: %.2f.\n", ope);
            } else if (opcao.equalsIgnoreCase("sub")) {
                System.out.println("Escolha 2 números para serem subtraídos.");
                num1 = ler.nextFloat();
                num2 = ler.nextFloat();
                ler.nextLine();
                ope = num1 - num2;
                System.out.printf("O resultado da subtração é: %.2f.\n", ope);
            }else if (opcao.equalsIgnoreCase("multi")) {
                System.out.println("Escolha 2 números para serem multiplicados.");
                num1 = ler.nextFloat();
                num2 = ler.nextFloat();
                ler.nextLine();
                ope = num1 * num2;
                System.out.printf("O resultado da multiplicação é: %.2f.\n", ope);
            }else if (opcao.equalsIgnoreCase("div")) {
                System.out.println("Escolha 2 números para serem divididos (o primeiro dividido pelo segundo).");
                num1 = ler.nextFloat();
                num2 = ler.nextFloat();
                ler.nextLine();
                if (num2 != 0) {
                    ope = num1 / num2;
                    System.out.printf("O resultado da divisão é: %.2f.\n", ope);
                } else {
                    System.out.println("Não é possível dividir por 0.");
                }
            }else if (opcao.equalsIgnoreCase("sair")) {
                sair = true;
            } else {
                System.out.println("Opção inválida.");
            }
        }
        ler.close();
    }
}