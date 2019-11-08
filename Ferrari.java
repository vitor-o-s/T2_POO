public class Ferrari extends Veiculo_Motorizado implements IPVA{

  //Métodos Herdados de IPVA
  public abstract double calcularIPVA(){
    return (cte_Ferrari * valor_Base);
  }

}
