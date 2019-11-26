public class CarroPopular extends Veiculo_Motorizado implements IPVA{

  //Atributos
  private String[] carro = {"    ____\n"," __/  |_ \\_\n",
  "|  _     _``-.       Carro popular\n","'-(_)---(_)--'\n\n\n"};

  //Método construtor
  public CarroPopular(int ID, int dist){
    super(ID,dist,4);
  }

  //Métodos Herdados de Veiculos
  public void desenhar(){
    System.out.print(carro[0]);
    System.out.print(carro[1]);
    System.out.print(carro[2]);
    System.out.print(carro[3]);
  }

  public void mover(){
    String giroC = "          ";

    for(int i = 0; i< carro.length; i++)
      carro[i] = giroC + carro[i];
      System.out.print(carro[0]);
      System.out.print(carro[1]);
      System.out.print(carro[2]);
      System.out.print(carro[3]);
    setDistancia();
    mudacombustivel(getCarro());
  }

  //Métodos Herdados de IPVA
  public double calcularIPVA(){
    return (cte_CarroPopular * valor_Base);
  }

}
