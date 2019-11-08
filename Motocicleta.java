public class Motocicleta extends Veiculo_Motorizado implements IPVA{

  //Atributos


  //Métodos Herdados de Veiculo
  public void desenhar(){

  }
  //Métodos Herdados de IPVA
  public double calcularIPVA(){
    return (cte_Motocicleta * valor_Base);
  }

}
