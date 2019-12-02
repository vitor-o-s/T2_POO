public abstract class Veiculo_Motorizado extends Veiculo{

  //Atributos
  private static  float gastoMotocicleta = 0.25f;
  private static  float gastoCarro = 0.75f;
  private static  float gastoFerrari = 2.3f;
  private static  float combustivel = 3.5f;

  //Metodos
  public Veiculo_Motorizado(int ID, int distancia, int qtdrodas){
    super(ID, distancia, qtdrodas);
    this.combustivel = 3.5f;
  }

  public void abastecer(float qtd){
    this.combustivel =  this.combustivel + qtd;
  }

  public float getCarro(){
    return gastoCarro;
  }

  public float getMoto(){
    return gastoMotocicleta;
  }

  public float getFerrari(){
    return gastoFerrari;
  }

  public void mudacombustivel(float tipoV){
    this.combustivel = this.combustivel - tipoV;
  }
  public float getcombustivel(){
    return combustivel;
  }

  public String toString(){
    return "Sou um veiculo motorizado com "+getcombustivel()+"litros";
  }

}
