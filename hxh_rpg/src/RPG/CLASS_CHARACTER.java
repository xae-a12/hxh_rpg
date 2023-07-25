package RPG;

public class CLASS_CHARACTER extends ABSTRACT_CLASS_CHARACTER {

	private String nome;
	private String frase;
	private int ataque;
	private int defesa;
	private int hp;
	private int mana;

	public CLASS_CHARACTER(String especialidade, String habilidades, String nome, String frase, int ataque, int defesa,
			int hp, int mana) {

		super(especialidade, habilidades);
		this.nome = nome;
		this.frase = frase;
		this.ataque = ataque;
		this.defesa = defesa;
		this.hp = hp;
		this.mana = mana;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

}
