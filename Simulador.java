public class Simulador{
  public static void main (String Args[]){


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

  public static incluirV(int ID){
    
  }
}
