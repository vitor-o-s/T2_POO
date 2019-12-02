import java.util.Random;

public class Motocicleta extends Veiculo_Motorizado implements IPVA{

  //Atributos
  private String[] moto = {"   ,_oo\n",".-/c-//::          Motocicleta\n","(_)'==(_)\n\n"};
  private boolean IPVA;

  //Método construtor
  public Motocicleta(int ID, int dist){
    super(ID, dist, 2);
    Random x = new Random();
    int i =  x.nextInt(100);
    if(i % 2 == 0) {
      this.IPVA = true;
    }
    else{
      this.IPVA = false;
    }
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

    if(getcombustivel()>0 && IPVA == true && r_cali() == 2){
      for(int i = 0; i< moto.length; i++)
      	moto[i] = giroMoto +moto[i];
      System.out.print(moto[0]);
      System.out.print(moto[1]);
      System.out.print(moto[2]);
      setDistancia();
      mudacombustivel(getMoto());
    }
    else{
      System.out.println("Veja se o veiculo possui IPVA pago e combustivel");
    }

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

  public boolean getIPVA(){
    return IPVA;
  }

}
