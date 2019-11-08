public class CarroPopular extends Veiculo_Motorizado implements IPVA{

  //Métodos Herdados de IPVA
  public abstract double calcularIPVA(){
    return (cte_CarroPopular * valor_Base);
  }

}
