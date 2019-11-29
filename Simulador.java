public class Simulador{
  public static void main (String Args[]){

       Veiculo[] veiculo = new Veiculo[20];
       veiculo[0] = new Motocicleta(5,0);
       Motocicleta moto = new Motocicleta(1,0);
       Bicicleta bike = new Bicicleta(2,0);
       Ferrari F1 = new Ferrari(3,0);
       CarroPopular car = new CarroPopular(4,0);
       bike.desenhar();
       moto.desenhar();
       F1.desenhar();
       car.desenhar();

       bike.mover();
       moto.mover();
       F1.mover();
       car.mover();

       if(F1.getIPVA() == false){
         bike.mover();
         moto.mover();
         car.mover();
         System.out.print("Falso");
       }
       else{
         F1.mover();
         System.out.print("Verdadeiro");
       }


       for(int i = 0; i < 4; i++){

         if(moto.getcombustivel()<2.7){
           bike.mover();
           bike.mover();
         }
         else{
           bike.mover();
           moto.mover();
           F1.mover();
           car.mover();
         }

       }

       bike.desenhar();
       moto.desenhar();
       F1.desenhar();
       car.desenhar();
  }

  public void incluirV(Veiculo v, int ID, String Tipo){

    switch(Tipo){
      case B: v[] = new Bicicleta(ID,0);
                    break;
      case M: v[] = new Motocicleta(ID,0);
                    break;
      case F: v[] = new Ferrari(ID,0);
              break;
      case C: v[] = new CarroPopular(ID,0);
              break;
      default: System.out.print("Opcao invalida");
    }
  }


}
