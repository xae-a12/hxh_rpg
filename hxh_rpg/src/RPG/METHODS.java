package RPG;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;


public class METHODS {

	private Date dataHoraAtual;
	String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
	String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

	static String player1;

	boolean iniciarJogo = true;
	String options = "yes";

	private static ArrayList<Gameplay> gameplay = new ArrayList<>();
	private static ArrayList<Options> config = new ArrayList<>();
	private static Scanner read = new Scanner(System.in);

	/*
	 * CRUD:
	 * 
	 * if user choose: iniciar novo jogo faça: .carregar um jogo salvo .voltar ao
	 * menu principal .sair do jogo(exit)
	 * 
	 * if usuario choose "iniciar novo jogo" faça: .historia // enredo do jogo, o
	 * jogo irá rodar aqui dentro deste metodo (...)
	 * 
	 * if usuario choose "carregar um jogo salvo" faça: .abrir o menu de salvamento
	 * de jogos .opção de carregar jogo ou voltar ao menu principal
	 * 
	 * if user choose "options" do:
	 * 
	 * mostrar o menu de configurações, onde: .ajustar graficos .ajustar som do jogo
	 * .configurar controles .jogar tutorial voltar ao menu principal
	 * 
	 * 
	 * if user choose "exit game" do: perguntar "deseja realmente sair do jogo?"
	 * caso positivo, o game se encerra. caso negativo, nada acontece.
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

		if (player1 == "yes") {

			System.out.println("Bem vindo à ilha de Greed Island. \r\n" + "\r\n"
					+ "Um Hunter (ハンタ Hantā), é um membro VIP da sociedade humana, um  hunter possui uma Licença Hunter que lhe concede o direito ir a qualquer lugar do mundo e fazer quase tudo. Normalmente, os Hunter se dedicam a rastrear itens inestimáveis, lugares místicos e as maravilhas escondidas do mundo. \r\n"
					+ "Com um espírito aventureiro e o uso de NEN, os Hunters são procurados por governos e iniciativas privadas para agir no descobrimento de coisas novas e raras, prender criminosos, realizar serviços sujos de forma eficiente, realizar grandes feitos à humanidade, entre outras coisas, que estejam ligadas ao seu objetivo pessoal. Além de todas as facilidades que uma licença Hunter pode proporcionar, a maior vantagem de um hunter é a liberdade de escolha de seus serviços.\r\n"
					+ "\r\n"
					+ "Para obter uma licença Hunter deve-se passar no rigoroso Exame Hunter, organizado pela Associação de Hunters, que tem uma taxa de aprovação inferior a 1 em cem mil.\r\n"
					+ "\r\n"
					+ "O seu objetivo nesse jogo será a obtenção da sua licença hunter, e para isso será necessario atravessar até o outro lado dessa ilha, com vida, enquanto faz novas amizades.\r\n"
					+ "\r\n" + "\r\n" + "\r\n" + "Por favor, escolha seu personagem:\r\n" + "\r\n"
					+ "Killua : resumo\r\n" + "\r\n"
					+ "Killua Zoldyack, um menino de 14 anos, nasceu como o filho do meio de uma renomada família de assassinos, os Zoldyack.  Killua seguiu a criação tradicional dos Zoldyeck desde seu nascimento até então, mas agora ele não quer mais seguir seu destino de assassino empregado pelos outros, e deseja conquistar a sua liberdade.\r\n"
					+ "\r\n" + "\r\n" + "Gon : resumo\r\n" + "\r\n"
					+ "O objetivo de Gon é encontrar o seu pai Ging Freaks, um renomado hunter profissional que o abandonou com sua tia quando ele ainda era um bebê. Resoluto a fim de encontrá-lo, Gon é um garoto simples e amigável que ama a natureza e que está sempre em busca de uma aventura.  \r\n"
					+ "\r\n" + "\r\n" + "Kurapica : resumo\r\n" + "\r\n"
					+ "Kurapika (クラピカ) é o último sobrevivente do Clã Kurta. A inteligência é sua notoriedade. Seu objetivo é vingar seu clã e recuperar os  Olhos Escarlates roubados pelo grupo criminoso da Aranha. Os membros dos clã Kurata possuem  olhos que mudam de sua cor natural (geralmente castanhos) para vermelho em momentos de raiva ou agitação emocional.\r\n"
					+ "\r\n" + "\r\n" + "Hisoka : resumo\r\n" + "\r\n"
					+ "Hisoka (ヒソカ) né um mágico com grandes habilidades, muito misterioso, é considerado por muitos como um louco, o joker. Ele tem pintado em seu rosto uma estrela rosa, abaixo de seu olho direito, e uma lágrima azul abaixo de seu olho esquerdo. Seu personagem é um enigma que fala pouco sobre seu passado, porque ele não está interessado nele. Hisoka é um membro da Aranha.\r\n"
					+ "\r\n" + "\r\n" + "\r\n" + "Illumi : resumo\r\n" + "\r\n" + "\r\n"
					+ "Illumi Zaoldyeck é o irmão mais velho de Killua, usa como arma as agulhas Anchi (agulhas secretas). Illumi, na maior parte, demonstra muita pouca expressão em seu rosto. Em contraste com seu comportamento inexpressivo, Illumi muitas vezes fala em um tom um tanto alegre e distraído. Ainda assim, ele tem uma forma retorcida e superprotetora de amor por seu irmão mais novo, Killua.\r\n"
					+ "\r\n" + "\r\n" + "\r\n" + "Chrollo Lucilfer: resumo\r\n" + "\r\n" + "\r\n"
					+ "Ele o líder do Genei Ryodan. Chrollo mostra calma mesmo em situações difíceis, ele é um homem de fala mansa, frio, inteligente e carismático, pois parece ser um líder nato e capaz de manter a Aranha unida, sua principal habilidade é roubar habilidades de outros e armazenar em um livro que ele materializa, chamado Caçador de Habilidades. A vítima do roubo não consegue usar mais sua habilidade.\r\n"
					+ "\r\n" + "\r\n" + "");

		}
		System.out.println("");

	}

	public static void options() {

		if (player1 == "yes") {
			System.out.println("graficos \n tutorial \n controles \n voltar ao menu");
		}

	}

	public static void creditos() {

		if (player1 == "yes") {
			System.out.println("\r\n"
					+ "Este jogo é um produto independente produzido inteiramente por Gyü aka Giovanni Dias\r\n"
					+ "Se você gostou desse conteúdo, por favor, sinta-se livre para me contatar com feedbacks\r\n"
					+ "através do meu email kuroigyo@gmail.com, ou então pelo instagram @slyblur.\r\n"
					+ "Esse jogo idealizado para ser uma obra curta e objetiva, caso queira contribuir \r\n"
					+ "com a trilha sonora, por exemplo, me contate através do email acima.\r\n" + "\r\n"
					+ "Tenha um bom jogo!! >> voltar");

		}

	}

	public static void exitGame() {
		Scanner leia = new Scanner(System.in);
		if (player1 == "yes") {
			System.out.println("Deseja realmente sair? S/N");
			if (player1 == "S") {
				exitGame();

			}
		}

	}

}
