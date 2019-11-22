public class Motocicleta extends Veiculo_Motorizado implements IPVA{

  //Atributos
  private int dist_perc;
  private String[] moto;
  private String[] giroMoto;

  //Método construtor
  public Motocicleta(int ID, int dist){
    super(ID, dist, 2);
  }


  //Métodos Herdados de Veiculo
  public void desenhar(){
    String[] moto = {"   ,_oo\n", ".-/c-//::          Motocicleta\n","(_)'==(_)\n\n"};
    System.out.print(moto[0]);
    System.out.print(moto[1]);
    System.out.print(moto[2]);
  }

  public void mover(){
    String giroMoto = "      ";
    dist_perc = getDistancia();
    for (int i = 0; i < dist_perc; i++)
          giroMoto = "    " + giroMoto;
    for(int i = 0; i<moto.length; i++)
    	moto[i] = giroMoto +moto[i];
    System.out.print(moto[0]);
    System.out.print(moto[1]);
    System.out.print(moto[2]);
    setDistancia();
    //combustivel = combustivel -

  }

  public String toString(){
    return "Eu sou uma Motocicleta";
  }

  //Métodos Herdados de Veículo Motorizado
  public void abastecer(){

  }

  //Métodos Herdados de IPVA
  public double calcularIPVA(){
    return (cte_Motocicleta * valor_Base);
  }

}
