public abstract class Veiculo{

  //Atributos
  private int id;
  private int distanciaPercorrida;
  private Roda[] rodas;
  private int quantidadeRodas;

  //Metodos
  public  Veiculo();
  public abstract void mover();
  public abstract String toString();
  public abstract void desenhar();
  public void calibrarPneu(int n);

}
