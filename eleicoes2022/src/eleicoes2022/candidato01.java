package eleicoes2022;

public class candidato01 extends candidatos {
	private String nome;
	private String nomepartido;
	
	
	public candidato01(String nome, String partido) {
		this.nome = nome;
		this.nomepartido = partido;
		
	}
	public candidato01() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return nomepartido;
	}
	public void setPartido(String partido) {
		this.nomepartido = partido;
	}
	
	public String toString() {
		return nome;
		
	}
}