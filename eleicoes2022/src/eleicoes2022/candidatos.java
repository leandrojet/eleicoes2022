package eleicoes2022;

public class candidatos {
	
	private String nome;
	private String partido;
	private String fichalimpa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public String getFichalimpa() {
		return fichalimpa;
	}
	public void setFichalimpa(String fichalimpa) {
		this.fichalimpa = fichalimpa;
	}
	
	public String getDadoscandidatos() {
		return "nome: " + this.nome + "partido: " + this.partido + "fichalimpa: " + this.fichalimpa;
		
		
	}

}
