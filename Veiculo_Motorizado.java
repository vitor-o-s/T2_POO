public abstract class Veiculo_Motorizado{

  //Atributos
  private static  int gastoMotocicleta = 0.25;
  private static  int gastoCarro = 0.75;
  private static  int gastoFerrari = 2.3;
  private static  float combustivel;

  //Metodos
  public abstract Veiculo_Motorizado();
  public abstract void abastecer();
  public abstract String toString();

}
