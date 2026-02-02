public class TesteOperacoes
{
    public static void main(String[] args)
    {
        // Cria o objeto da classe Operacoes
        Operacoes calc = new Operacoes();

        //Testa o metodo somar
        double resultado = calc.somar(10, 5);
        System.out.println(" 10 + 5 = " + resultado);

        // Testa novamente
        resultado = calc.somar(20, 30);
        System.out.println(" 20 + 30 = " + resultado);

        // Testa subtração
        resultado = calc.subtrair(20, 5);
        System.out.println(" 20 - 5 = " + resultado);

        //Testa multiplicação
        resultado = calc.multiplicar(10,3);
        System.out.println(" 10 * 3 = " +resultado);

        //Testa divisão
        resultado = calc.dividir(20, 4);
        System.out.println("20 / 4 = " +resultado);

        //Testa divisão por zero
        resultado = calc.dividir(10, 0);
        System.out.println(" 10 / 0 = " +resultado);



        //Mostra status
        System.out.println(" Teste concluído com sucesso! ");
    }
}
