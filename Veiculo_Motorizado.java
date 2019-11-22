public abstract class Veiculo_Motorizado extends Veiculo{

  //Atributos
  private static  float gastoMotocicleta = 0.25f;
  private static  float gastoCarro = 0.75f;
  private static  float gastoFerrari = 2.3f;
  private static  float combustivel;

  //Metodos
  public Veiculo_Motorizado(int ID, int distancia, int qtdrodas){
    super(ID, distancia, qtdrodas);
    this.combustivel = 3.5f;
  }

  public abstract void abastecer();
  public abstract String toString();
  public void mudacombustivel(){
    this.combustivel = this.combustivel - 
  }

}
