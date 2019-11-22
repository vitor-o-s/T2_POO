public class Bicicleta extends Veiculo{

  //Atributos
  //private final int QTDRODAS = 2;
  private String[] bike;
  private String[] giroBike;
  private int dist_perc;

  //Métodos
  public Bicicleta(int ID, int distancia){
    super(ID, distancia, 2);
  }

  //Metodos Herdados de Veiculos
  public String toString(){
    return "Eu sou uma Bicicleta";
  }

  public void calibrarPneu(int n){

  }

  public void desenhar(){
    String[] bike = {"   __o\n"," _`\\<,_\n","(*)/ (*)\n\n"};
    System.out.print(bike[0]);
    System.out.print(bike[1]);
    System.out.print(bike[2]);
  }

  public void mover(){
    String giroBike = "    ";
    dist_perc = getDistancia();
    for (int i = 0; i < dist_perc ; i++)
          giroBike = "    " + giroBike;
    for(int i = 0; i<bike.length; i++)
    	bike[i] = giroBike + bike[i];
    System.out.print(bike[0]);
    System.out.print(bike[1]);
    System.out.print(bike[2]);
    setDistancia();

  }

}
