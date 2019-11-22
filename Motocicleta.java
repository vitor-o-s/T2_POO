public class Motocicleta extends Veiculo_Motorizado implements IPVA{

  //Atributos
  //private int id;
  //private int distanciaPercorrida;
  //private Roda[] rodas;
  private final int QTDRODAS = 2;
  //private float combustivel

  //Método construtor
  public Motocicleta(int ID, int dist){
    super(ID, dist, QTDRODAS);
  }


  //Métodos Herdados de Veiculo
  public void desenhar(){
    String[] moto = {"   ,_oo\n", ".-/c-//::\n","(_)'==(_)\n\n"};
    System.out.print(moto[0]);
    System.out.print(moto[1]);
    System.out.print(moto[2]);
  }

  public void mover(){
    String giroMoto = "      ";
    for (int i = 0; i < distanciaPercorrida ; i++)
          giroMoto = "    " + giroMoto;
    for(i=0;i<moto.length;i++)
    	moto[i] = giroMoto +moto[i];
    System.out.print(moto[0]);
    System.out.print(moto[1]);
    System.out.print(moto[2]);
    //Como o giro moto é de 2 espaços ja formatado contaremos quantas
    //vezes  a bike andou
    distanciaPercorrida = distanciaPercorrida + 1;

  }

  public String toString(){
    return 'Eu sou uma Motocicleta';
  }

  //Métodos Herdados de Veículo Motorizado
  public void abastecer(){

  }

  //Métodos Herdados de IPVA
  public double calcularIPVA(){
    return (cte_Motocicleta * valor_Base);
  }

}
