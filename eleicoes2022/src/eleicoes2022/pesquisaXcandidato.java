package eleicoes2022;

public class pesquisaXcandidato {
	
	private String candidato;
	private String pesquisa;
	private int votos;
	
	public pesquisaXcandidato(String candidato,String pesquisa, int votos) {
		this.candidato = candidato;
		this.pesquisa = pesquisa;
		this.votos = votos;
		
	}

	public String getCandidato() {
		return candidato;
	}

	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

}
