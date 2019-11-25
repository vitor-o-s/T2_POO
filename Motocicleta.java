public class Motocicleta extends Veiculo_Motorizado implements IPVA{

  //Atributos
  private String[] giroMoto;
  private String[] moto = {"   ,_oo\n",".-/c-//::          Motocicleta\n","(_)'==(_)\n\n"};

  //Método construtor
  public Motocicleta(int ID, int dist){
    super(ID, dist, 2);
  }


  //Métodos Herdados de Veiculo
  public void desenhar(){

    System.out.print(moto[0]);
    System.out.print(moto[1]);
    System.out.print(moto[2]);
  }

  //A cada iteração vai andar mais do que deveria
  //Propagação de erro corrigir

  public void mover(){
    String giroMoto = "      ";

    //dist_perc = getDistancia();
    //for (int i = 0; i < dist_perc; i++)
    //      giroMoto = "    " + giroMoto;

    for(int i = 0; i< moto.length; i++)
    	moto[i] = giroMoto +moto[i];
    System.out.print(moto[0]);
    System.out.print(moto[1]);
    System.out.print(moto[2]);
    setDistancia();
    mudacombustivel(getMoto());

  }

  public String toString(){
    return "Eu sou uma Motocicleta";
  }

  //Métodos Herdados de Veículo Motorizado
  public void abastecer(){

  }
  /*public float getcombustivel(){
    return getcombustivel();
  }*/
  //Métodos Herdados de IPVA
  public double calcularIPVA(){
    return (cte_Motocicleta * valor_Base);
  }


}
