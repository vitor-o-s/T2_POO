import java.util.Scanner;

public class Simulador {

	private static final int max = 20;
	private static Veiculo[] veiculos = new Veiculo[max];
	private static int IdVe;


public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Funcao para leitura de dados
		String aux;
		char tipoVeiculo;
		float comb; //combustivel
		int pneu;

		char opcao; // Variavel para selecionar as opções do simulador

		do { // Inciando MENU de Opções (interativo)
			System.out.println("(a) Incluir veiculo");
			System.out.println("(b) Remover um veiculo");
			System.out.println("(c) Abastecer veiculo");
			System.out.println("(d) Movimentar veiculo");
			System.out.println("(e) Movimentar veiculos por tipo");
			System.out.println("(f) Imprimir todos os dados de todos os veículos");
			System.out.println("(g) Imprimir dados de veículo por tipo");
			System.out.println("(h) Esvaziar um pneu específico");
			System.out.println("(i) Calibrar um pneu específico");
			System.out.println("(j) Calibrar todos os pneus por tipo veiculo");
			System.out.println("(k) Imprimir pista de corrida");
			System.out.println("(l) Sair da aplicacao");

			System.out.print("Opcao: ");
			aux = teclado.next();
			opcao = aux.charAt(0); // convertendo string para char

			switch (opcao) {
			// Incluir veiculo
			case 'a': {

					System.out.println("Bicicleta (B) | Motocicleta (M) | Carro Popular (C) | Ferrari (F)");
					System.out.println("Informe o tipo de veiculo para ser adicionado: ");

					tipoVeiculo = teclado.next().charAt(0);
					System.out.println("Informe o ID do veiculo:");
					IdVe = teclado.nextInt();
				  adicionaVeiculo(IdVe,tipoVeiculo);

				break;
			}

			// Remover um veiculo
			case 'b': {
					System.out.println("Informe o ID do veiculo que deseja remover:");
					IdVe = teclado.nextInt();
					removeV(IdVe);

					break;
			}

			// Abastecer veiculo
			case 'c': {
				System.out.println("Informe o ID do veiculo que deseja remover:");
				IdVe = teclado.nextInt();
				System.out.println("Informe a quantidade de litros que deseja repor:");
				comb = teclado.nextFloat();
				abasteceV(IdVe,comb);

				break;
			}
			// Movimentar veiculo
			case 'd': {
				System.out.println("Informe o ID do veiculo que deseja remover:");
				IdVe = teclado.nextInt();
				moveV(IdVe);

				break;
			}
			// Movimentar veiculos por tipo
			case 'e': {
				System.out.println("Bicicleta (B) | Motocicleta (M) | Carro Popular (C) | Ferrari (F)");
				System.out.println("Informe o tipo de veiculo a ser movido: ");
				tipoVeiculo = teclado.next().charAt(0);
				moveTipo(tipoVeiculo);

				break;
			}
			// Imprimir todos os dados de todos os veículos
			case 'f': {
				imprimeinfo();

				break;
			}
			// Imprimir dados de veículo por tipo
			case 'g': {
				System.out.println("Bicicleta (B) | Motocicleta (M) | Carro Popular (C) | Ferrari (F)");
				System.out.println("Informe o tipo de veiculo a ser movido: ");
				tipoVeiculo = teclado.next().charAt(0);
				imprimeTipo(tipoVeiculo);

				break;
			}
			// Esvaziar um pneu específico
			case 'h': {
				System.out.println("Informe o ID do veiculo:");
				IdVe = teclado.nextInt();
				System.out.println("Informe a posição do pneu:");
				pneu = teclado.nextInt();
				esvaziaEsp(IdVe,pneu);

				break;
			}
			// Calibrar um pneu específico
			case 'i': {
				System.out.println("Informe o ID do veiculo:");
				IdVe = teclado.nextInt();
				System.out.println("Informe a posição do pneu:");
				pneu = teclado.nextInt();
				calibraEsp(IdVe,pneu);
				break;
			}
			// Calibrar todos os pneus por tipo veiculo
			case 'j': {
				System.out.println("Bicicleta (B) | Motocicleta (M) | Carro Popular (C) | Ferrari (F)");
				System.out.println("Informe o tipo de veiculo a ser movido: ");
				tipoVeiculo = teclado.next().charAt(0);
				calibraTipo(tipoVeiculo);
				break;
			}
			// Imprimir pista de corrida
			case 'k': {
				ImprimirPista();

				break;
			}
			// Sair da aplicacao
			case 'l': {

				break;
			}
			// caso opção for diferente do intervalo [a-j]
			default: {
				System.out.println("Opcao invalida!");
			}
			}
			System.out.println("");
		} while (opcao != 'l');
	}


public static void adicionaVeiculo(int ID, char tipo) {

	int i=0;
	while(veiculos[i] != null && i<max) { // vai percorrer o vetor ocupados até achar um false ... o tipo + (indice + 1) desse vetor sera o NICK do Veiculo
		i++;
	}

	if(i==max){

	}

	switch(tipo) {
		case 'B': // CRIANDO OBJETO Bicicleta
		{
			veiculos[i] = new Bicicleta(ID,0);
			break;
		}

		case 'M': // CRIANDO OBJETO Motocicleta
		{
			veiculos[i] = new Motocicleta(ID,0);
			break;
		}

		case 'C': // CRIANDO OBJETO CarroPopular
		{
			veiculos[i] = new CarroPopular(ID,0);
			 break;
		}

		case 'F': // CRIANDO OBJETO Ferrari
		{
			veiculos[i] = new Ferrari(ID,0);
			break;
		}
	}
}

public static  void removeV(int ID){

	int i=0;

	while(veiculos[i].getID()!=ID && i < max){
		i++;
	}

	if(i==max){
		System.out.println("O id não foi encontrado e portanto nenhum veículo removido");
	}
	else{
		veiculos[i] = null;
		System.out.println("Veiculo removido com sucesso");
	}
}

public static void ImprimirPista(){

		for(int i = 0; i<veiculos.length; i++){
			if(veiculos[i]!=null){
				veiculos[i].desenhar();
			}
		}
}


//É pra funcionar
public static void calibraTipo(char tipo){


	for(int i = 0; i < veiculos.length; i++){
		if(tipo == 'B'){
			if(veiculos[i] instanceof Bicicleta){
				veiculos[i].calibraALL();
			}
		}
		else if (tipo == 'F'){
			if(veiculos[i] instanceof Ferrari){
				veiculos[i].calibraALL();
			}
		}
		else if(tipo == 'M'){
			if(veiculos[i] instanceof Motocicleta){
				veiculos[i].calibraALL();
			}
		}
		else{
			if(veiculos[i] instanceof CarroPopular){
				veiculos[i].calibraALL();
			}
		}

	}
}
//Deve funcionar
public static void calibraEsp(int ID, int n_pneu){
	int i=0;

	while(veiculos[i].getID()!=ID && i < max){
		i++;
	}

	if(i==max){
		System.out.println("O id não foi encontrado e portanto nenhum veículo removido");
	}
	else{
		veiculos[i].calibra(n_pneu);
		System.out.println("Calibrado com sucesso");
	}
}
//Deve funcionar
public static void esvaziaEsp(int ID, int n_pneu){
	int i=0;

	while(veiculos[i].getID()!=ID && i < max){
		i++;
	}
	if(i==max){
		System.out.println("O id não foi encontrado e portanto nenhum veículo removido");
	}
	else{
		veiculos[i].descalibrar(n_pneu);
		System.out.println("Descalibrado com sucesso");
	}
}
//Ta vazio
public static void imprimeTipo(char tipo){

}
//Também ta vazio
public static void imprimeinfo(){

}
//Se pa funciona
public static void moveTipo(char tipo){
	for(int i = 0; i < veiculos.length; i++){
		if(veiculos[i]!=null){
			if(tipo == 'B'){
				if(veiculos[i] instanceof Bicicleta){
					veiculos[i].mover();
				}
			}
			else if (tipo == 'F'){
				if(veiculos[i] instanceof Ferrari){
					veiculos[i].mover();
				}
			}
			else if(tipo == 'M'){
				if(veiculos[i] instanceof Motocicleta){
					veiculos[i].mover();
				}
			}
			else{
				if(veiculos[i] instanceof CarroPopular){
					veiculos[i].mover();
				}
			}
		}
	}
}
//É pra funcionar
public static void moveV(int ID){
	int i=0;

	while(veiculos[i].getID()!=ID && i < max){
		i++;
	}

	if(i==max){
		System.out.println("O id não foi encontrado e portanto nenhum veículo removido");
	}
	else{
		veiculos[i].mover();
	}
}
//Junges salvou
public static void abasteceV(int ID, float litros){
	int i=0;

	while(veiculos[i].getID()!=ID && i < max){
		i++;
	}

	if(i==max){
		System.out.println("O id não foi encontrado e portanto nenhum veículo removido");
	}
	else{
		if(veiculos[i] instanceof Veiculo_Motorizado){

			((Veiculo_Motorizado) veiculos[i]).abastecer(litros);
			System.out.println ("Veiculo abastecido com sucesso");
		}
	}

}

}
