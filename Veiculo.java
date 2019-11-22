public abstract class Veiculo{

  //Atributos
  private final int ID;
  private int distanciaPercorrida;
  private Roda[] rodas;
  private final int quantidadeRodas;

  //Metodos
  public  Veiculo(int ID, int distancia, int qtdrodas){
    this.ID = ID;
    this.distanciaPercorrida = distancia;
    this.quantidadeRodas = qtdrodas;
    this.rodas = new Roda[quantidadeRodas];
  }

  public abstract void mover();
  public abstract void desenhar();
  public abstract String toString();

  public void calibrarPneu(Roda rodas[], int quantidadeRodas){
    for(int i = 0; i < quantidadeRodas; i++){
      rodas[i] = new Roda();
    }
  }

  public int getDistancia(){
    return distanciaPercorrida;
  }
  public void setDistancia(){
    distanciaPercorrida = distanciaPercorrida + 1;
  }

}
