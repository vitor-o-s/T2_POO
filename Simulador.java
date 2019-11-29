import java.util.Scanner;

public class Simulador {
	private static final int max = 20;
	private static int n_veiculos = 0;
	private static Veiculo[] veiculos = new Veiculo[max];
	private static boolean[] ocupados = new boolean[max];
	private int IdVe;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Funcao para leitura de dados
		String aux;

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

				if (n_veiculos < max) {
					char tipoVeiculo;
					// mostraVeiculos();
					do {
						System.out.println("Bicicleta (B) | Motocicleta (M) | Carro Popular (C) | Ferrari (F)");
						System.out.print("Informe o tipo de veiculo para ser adicionado: ");

						tipoVeiculo = teclado.next().charAt(0);

						System.out.println("Informe o ID do veiculo:");
						IdVe = teclado.nextInt();

					} while (!validaTipo(tipoVeiculo));
					adicionaVeiculo(IdVe,tipoVeiculo);
				} else
					System.out.println("Numero maximo de veiculos atingido!");

				break;
			}
			// Remover um veiculo
			case 'b': {
					System.out.println("Informe o ID do veiculo que deseja remover:");
					IdVe = teclado.nextInt();
					removeV(IdVe);
			}


				break;
			}
			// Abastecer veiculo
			case 'c': {

				break;
			}
			// Movimentar veiculo
			case 'd': {

				break;
			}
			// Movimentar veiculos por tipo
			case 'e': {

				break;
			}
			// Imprimir todos os dados de todos os veículos
			case 'f': {

				break;
			}
			// Imprimir dados de veículo por tipo
			case 'g': {

				break;
			}
			// Esvaziar um pneu específico
			case 'h': {

				break;
			}
			// Calibrar um pneu específico
			case 'i': {

				break;
			}
			// Calibrar todos os pneus por tipo veiculo
			case 'j': {

				break;
			}
			// Imprimir pista de corrida
			case 'k': {

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

/**
 * Valida se existe o tipo de veiculo informado
 */
private static boolean validaTipo(char nome) {
	if(nome == 'B' || nome == 'M' || nome == 'C' || nome == 'F') {
		return true;
	} else {
		return false;
	}
}



// já irá validar se tem posição no inicio do case a da main
public static void adicionaVeiculo(int ID, char tipo) {

	int i=0;
	while(ocupados[i] != false) { // vai percorrer o vetor ocupados até achar um false ... o tipo + (indice + 1) desse vetor sera o NICK do Veiculo
		i++;
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
	ocupados[i] = true; // Como foi adicionado um novo Objeto ... setar aquela posição como ocupada (true)
	nveiculos++;
}

public static void removeV(int ID){

	int i=0;

	while(veiculos[i].getID()!=ID){
		i++;
	}
	veiculos[i] = null;
	ocupados[i] = false;

}

}
