public class Simulador{
  public static void main (String Args[]){


       Motocicleta moto = new Motocicleta(1,0);
       Bicicleta bike = new Bicicleta(2,0);
       moto.desenhar();
       bike.desenhar();
       moto.mover();
       bike.mover();
       moto.mover();
       if(moto.getcombustivel()<3.2){
         bike.mover();
         bike.mover();
         bike.mover();
         System.out.println("Bike manda");
       }
       else{
         bike.mover();
         moto.mover();
         bike.mover();
       }
       bike.desenhar();
       moto.desenhar();
  }


}
