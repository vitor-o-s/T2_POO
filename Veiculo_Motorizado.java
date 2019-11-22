public abstract class Veiculo_Motorizado{

  //Atributos
  private static  float gastoMotocicleta = 0.25;
  private static  float gastoCarro = 0.75;
  private static  float gastoFerrari = 2.3;
  private static  float combustivel;

  //Metodos
  public Veiculo_Motorizado(int ID, int distancia, int qtdrodas){
    super(ID, distancia, qtdrodas);
    this.combustivel = 3.5;
  }

  public abstract void abastecer();
  public abstract String toString();

}
