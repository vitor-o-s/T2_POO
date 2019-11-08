public interface IPVA{
  //Atributos
  //Atributos em interface por padrão são estáticos e finais
  public static final double cte_CarroPopular = 1.3;
  public static final double cte_Motocicleta = 0.75;
  public static final double cte_Ferrari = 3.15;
  public static final double valor_Base = 500.00;

  //Método
  public abstract double calcularIPVA();
}
