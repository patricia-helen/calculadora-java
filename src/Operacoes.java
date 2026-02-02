
public class Operacoes
{
    //Atributo para guardar o ultimo resultado calculado
    private double ultimoResultado;

    //Atributo para contar quantas operações foram realizadas
    private int totalOperacoes;

    //Construtor - inicializa quando cria objeto : new Operacoes()
    public Operacoes()
    {
        this.ultimoResultado = 0.0;
        this.totalOperacoes = 0;
    }
    public double somar(double a, double b)
    {
        this.totalOperacoes++; //Aumenta contador (totalOperacoes = totalOperacoes +1)
        this.ultimoResultado = a+ b; // Calcula e guarda
        return this.ultimoResultado; // Retorna resultado
    }
    public double subtrair(double a, double b)
    {
        this.totalOperacoes++;
        this.ultimoResultado = a - b;
        return this.ultimoResultado;
    }
    public double multiplicar(double a, double b)
    {
        this.totalOperacoes++;
        this.ultimoResultado = a * b;
        return this.ultimoResultado;
    }
    public double dividir(double a, double b)
    {
        if(b == 0){
            System.out.println(" ERRO: Não pode divir por zero!");
            return 0;
        }
        this.totalOperacoes++;
        this.ultimoResultado = a / b;
        return this.ultimoResultado;
    }
    // método get usado na classe Caluladora:
    public int getTotalOperacoes() {
        return totalOperacoes;
    }
}