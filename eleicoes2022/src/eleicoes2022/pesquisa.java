package eleicoes2022;


public class pesquisa  {	
	private String datafolha;
	private String tipodepesquisa;
	
	public pesquisa(String datafolha, String tipodepesquisa) {
		this.datafolha = datafolha;
		this.tipodepesquisa = tipodepesquisa;
		
	}

	public String getDatafolha() {
		return datafolha;
	}

	public void setDatafolha(String datafolha) {
		this.datafolha = datafolha;
	}

	public String getTipodepesquisa() {
		return tipodepesquisa;
	}

	public void setTipodepesquisa(String tipodepesquisa) {
		this.tipodepesquisa = tipodepesquisa;
	}
	
	public String toString() {
		return datafolha;
		
	}
}