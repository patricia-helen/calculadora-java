import java.util.Scanner;

public class Calculadora
{
    public static void main (String[] args)
    {
        //Cria Scanner para entrada (como no AccountTest)
        Scanner input = new Scanner(System.in);

        //Cria objeto Operacoes (Como Account em AccountTest)
        Operacoes calc = new Operacoes();

        System.out.println("=== CALCULADORA JAVA ===");
        System.out.println("Conceitos OOP aplicados do Capítulo 3");
        System.out.println("======================================\n");

        // Pede números ao usuário
        System.out.print("Digite o primeiro valor: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double num2 = input.nextDouble();

        // Mostra o menu de operações
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Sua opção (1-4): ");

        // Lê a escolha do usuário
        int opcao = input.nextInt();

        //Variável para resultado
        double resultado = 0;
        boolean operacaoValida = true;

        //IF para decidir qual operação fazer
        if (opcao == 1) {
            resultado = calc.somar(num1, num2);
            System.out.printf("%.2f + %.2f = ", num1, num2);
        }
        else if (opcao == 2) {
            resultado = calc.subtrair(num1, num2);
            System.out.printf("%.2f - %.2f = ", num1, num2);
        }
        else if (opcao == 3) {
            resultado = calc.multiplicar(num1, num2);
            System.out.printf("%.2f * %.2f = ", num1, num2);
        }
        else if (opcao == 4) {
            resultado = calc.dividir(num1, num2);
            System.out.printf("%.2f / %.2f = ", num1, num2);
        }
        else
        {
            System.out.println("Opção inválida! Escolha 1 a 4.");
            operacaoValida = false;
        }

        // Mostra resultado
        if (operacaoValida)
        {
            System.out.println("\n=== RESULTADO ===");
            System.out.println("Resultado: " + resultado);
            System.out.println("Total de operações realizadas: " + calc.getTotalOperacoes());
        }

        // Fecha Scanner
        input.close();
    }
}
