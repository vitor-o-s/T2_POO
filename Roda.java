import java.util.Random;

public  class Roda{

  //Atributos
  private boolean calibragempneu;

  //Métodos
  public Roda(){
    Random x = new Random();
    int i =  x.nextInt(100);
    if(i % 2 == 0) {
      calibragempneu = true;
    }
    else{
      calibragempneu = false;
    }
  }

  public void setCalibragem(){
    calibragempneu = true;
  }

  public boolean getCalibragem(){
     return calibragempneu;
  }

}
