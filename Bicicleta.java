public class Bicicleta extends Veiculo{

  //Atributos
  //private final int QTDRODAS = 2;
  private String[] bike = {"   __o\n"," _`\\<,_       Bike\n","(*)/ (*)\n\n"};


  //Métodos
  public Bicicleta(int ID, int distancia){
    super(ID, distancia, 2);
  }

  //Metodos Herdados de Veiculos
  public String toString(){
    return "Eu sou uma Bicicleta e andei"+getDistancia();
  }

  public void calibrarPneu(int n){

  }

  public void desenhar(){

    System.out.print(bike[0]);
    System.out.print(bike[1]);
    System.out.print(bike[2]);
  }

  public void mover(){
    String giroBike = "    ";

    for(int i = 0; i<bike.length; i++)
    	bike[i] = giroBike + bike[i];
    System.out.print(bike[0]);
    System.out.print(bike[1]);
    System.out.print(bike[2]);
    setDistancia();

  }

}
