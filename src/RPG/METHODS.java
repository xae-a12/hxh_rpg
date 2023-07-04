package RPG;

import java.util.ArrayList;
import java.util.Scanner;

import models.Gameplay;
import models.Options;

public class METHODS {

	private static ArrayList<Gameplay> gameplay = new ArrayList<>();
	private static ArrayList<Options> config = new ArrayList<>();
	private static Scanner read = new Scanner(System.in);

	/*  CRUD:
	 * 
	 * if user choose: iniciar novo jogo faça:
	 *  	.carregar um jogo salvo 
	 *  	.voltar ao menu principal 
	 *  	.sair do jogo(exit)
	 * 
	 * if usuario choose "iniciar novo jogo" faça:
	 * 		 .historia // enredo do jogo, o jogo irá rodar aqui dentro deste metodo (...)
	 * 
	 * if usuario choose "carregar um jogo salvo" faça:
	 * 		 .abrir o menu de salvamento de jogos
	 * 		 .opção de carregar jogo ou voltar ao menu principal
	 * 
	 * if user choose "options" do:
	 * 
	 *  	mostrar o menu de configurações, onde:
	 *  		 .ajustar graficos 
	 *  		 .ajustar som do jogo 
	 *  		 .configurar controles 
	 *  		 .jogar tutorial voltar ao menu principal
	 * 
	 * 
	 * if user choose "exit game" do:
	 *  	perguntar "deseja realmente sair do jogo?" 
	 *  		caso positivo, o game se encerra. 
	 *  		caso negativo, nada acontece.
	 */

	public static void mostrarMenu() {
		System.out.println("""


				              ---------------------------
				            _|         ♣  ♥  ♠  ♦        |_
				           | ============================  |
				           |  welcome to HxH ultimate rpg  |
				           |                               |
				           |       |____|     |____|       |
				           |       |====|  X  |====|       |
				           |       |    |     |    |       |
				           |	 						   |
				           |     	1 - Iniciar jogo	   |
				           |     	2 - Load               |
				           | 	    3 - Options		       |
				           | 	    4 - Creditos	       |
				           | 	    5 - Exit game		   |
				           |  __________________________   |
				           |                               |
				           |          ♣  ♥  ♠  ♦           |
				           | ============================  |
				           |  Greed Island now:(horario)   |
				            |_____________________________|

				""");
	}

	public static void iniciarJogo() {
		System.out.println("");

	}

	public static void options() {
		System.out.println("");

	}

	public static void creditos() {
		System.out.println("");

	}

	public static void exitGame() {
		System.out.println("");

	}

}
