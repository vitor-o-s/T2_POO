public class Bicicleta extends Veiculo{


  private int id;
  private int distanciaPercorrida;
  private Roda[] rodas;
  private int quantidadeRodas;

  //Metodos
  public String toString(){
    return 'Eu sou uma Bicicleta';
  }
  public void calibrarPneu(int n){
    //Implementar
  }

  public void desenhar(){
    String[] bike = {"   __o\n"," _`\\<,_\n","(*)/ (*)\n\n"};
    System.out.print(bike[0]);
    System.out.print(bike[1]);
    System.out.print(bike[2]);
  }

  public void mover(){
    String giroBike = "    ";
    for (int i = 0; i < distanciaPercorrida ; i++)
          giroBike = "    " + giroBike;
    for(i=0;i<bike.length;i++)
    	bike[i] = giroBike + bike[i];
    System.out.print(bike[0]);
    System.out.print(bike[1]);
    System.out.print(bike[2]);
    //Como o giro bike é de 2 espaços ja formatado contaremos quantas
    //vezes  a bike andou
    distanciaPercorrida = distanciaPercorrida + 1;

  }

}
