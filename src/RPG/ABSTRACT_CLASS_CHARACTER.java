package RPG;

/*a minha classe abstrata - SUPERCLASSE Personagem
 * vai conter as definições e atributos abtsrators
 * e os construtores.
 * */

public class ABSTRACT_CLASS_CHARACTER {

	public String especialidades = ("Fisico, Magia, Fis&Mag");
	public String habilidades;

	public ABSTRACT_CLASS_CHARACTER(String especialidade, String habilidade) {
		super();
		this.especialidades = especialidade;
		this.habilidades = habilidade;
	}

	public String getEspecialidade() {
		return especialidades;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidades = especialidade;
	}

	public String getHabilidade() {
		return habilidades;
	}

	public void setHabilidade(String habilidade) {
		this.habilidades = habilidade;
	}


}
