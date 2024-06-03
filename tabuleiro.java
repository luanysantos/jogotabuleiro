package tabuleiro;

import java.util.Random;
import java.util.Scanner;

public class tabuleiro {
	public static int posicaotabuleiro(int posicao) {
		int casaatual = 0;

		switch (posicao) {
		case 2:
			System.out.println("REVÉS! Tropicou em uma raiz. Volte 1 casa. ");
			casaatual = (posicao - 1);
			return casaatual;

		case 3:
			System.out.println("SORTE! Virou o Peter Pan e voou direto em um buraco. Avance 2 casas. ");
			casaatual = (posicao + 2);
			return casaatual;

		case 4:
			System.out.println("REVÉS! Capitão gancho te sequestrou e te levou pra terra do nunca. Volte 2 casas ");
			casaatual = (posicao - 2);
			return casaatual;

		case 6:
			System.out.println("SORTE! Descanso na clareira. Recupere energia e avance 1 casa. ");
			casaatual = (posicao + 1);
			return casaatual;

		case 7:
			System.out.println("REVÉS! Deu de cara com um vespeiro. Volte 2 casas. ");
			casaatual = (posicao - 2);
			return casaatual;

		case 8:
			System.out.println("SORTE! Achar um mapa antigo. Avance 2 casas. ");
			casaatual = (posicao + 2);
			return casaatual;

		case 9:
			System.out.println("REVÉS! Uma onça te engoliu! Volte 5 casas. ");
			casaatual = (posicao - 5);
			return casaatual;

		case 11:
			System.out.println("SORTE! Ajuda de um espírito da floresta. Avance 2 casas. ");
			casaatual = (posicao + 2);
			return casaatual;

		case 12:
			System.out.println("REVÉS! Encontrou com o Sherek. Volte 3 casas. ");
			casaatual = (posicao - 3);
			return casaatual;
			
		case 14:
			System.out.println("SORTE! Descobrir uma ponte mágica. Avance 2 casas. ");
			casaatual = (posicao + 2);
			return casaatual;
			
		case 17:
			System.out.println("SORTE! Coletar ervas curativas. Avance 1 casa. ");
			casaatual = (posicao + 1);
			return casaatual;
			
		case 18:
			System.out.println("REVÉS! Nevoeiro denso. Volte 1 casa. ");
			casaatual = (posicao - 1);
			return casaatual;
			
		case 20:
			System.out.println("REVÉS! Encontrou uma chave. Avance 1 casa.  ");
			casaatual = (posicao + 1);
			return casaatual;
			
		case 21:
			System.out.println("SORTE! Bateu a cabeça em um tronco. Volte 1 casa. ");
			casaatual = (posicao - 1);
			return casaatual;
			
		case 22:
			System.out.println("REVÉS! Encontrou um atalho duvidoso. Avance 3 casas. ");
			casaatual = (posicao + 3);
			return casaatual;
			
		case 25:
			System.out.println("SORTE! Recebeu uma benção de um veado. Avance 5 casas. ");
			casaatual = (posicao + 5);
			return casaatual;
			
		case 28:
			System.out.println("SORTE! Luz do luar ilumina o caminho. Avance 2 casas. ");
			casaatual = (posicao + 2);
			return casaatual;
			
		case 30:
			System.out.println("REVÉS! Um doende te mordeu. Volte 1 casa. ");
			casaatual = (posicao - 1);
			return casaatual;
			
		case 32:
			System.out.println("REVÉS! Passou pelo pântano do Sherek e foi arremessado 5 casas. ");
			casaatual = (posicao + 5);
			return casaatual;
			
		default:
			return posicao;
		}
	}

	public static void main(String[] args) {

		Random sorteia = new Random();
		Scanner leia = new Scanner(System.in);
		int numAleatorio = 0;
		int posicaoJog1 = 0;
		int posicaoJog2 = 0;
		int posicao = 0;
		boolean jogada = false;

		while (jogada != true) {

			System.out.println("\nJogador 1 Aperte ENTER para girar o dado");
			leia.nextLine();
			numAleatorio = sorteia.nextInt(6) + 1;
			System.out.println("Dado jogador 1= " + numAleatorio);
			posicaoJog1 += numAleatorio;
			System.out.println("Verificando a casa que o jogador 1 caiu");
			posicaoJog1=posicaotabuleiro(posicaoJog1);
			System.out.println("Casa Jogador 1: " + (posicaoJog1));

			numAleatorio = 0;

			System.out.println("\nJogador 2 Aperte ENTER para girar o dado");
			leia.nextLine();
			numAleatorio = sorteia.nextInt(6) + 1;
			System.out.println("Dado jogador 2= " + numAleatorio);
			posicaoJog2 += numAleatorio;
			System.out.println("Verificando a casa que o jogador 2 caiu");
			posicaoJog2=posicaotabuleiro(posicaoJog2);
			System.out.println("Casa Jogador 2: " + (posicaoJog2));

			if (posicaoJog1 >= 33) {
				System.out.println("\nPARABÉNS! Jogador 1 foi o vencedor");
				jogada = true;
			} else if (posicaoJog2 >= 33) {
				System.out.println("\nPARABÉNS! Jogador 2 foi o vencedor");
				jogada = true;
			}
		}
	}
}