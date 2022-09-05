package controler;

import java.util.List;

import dao.candidatosdao;
import eleicoes2022.candidatos;

public class candidatoscontroler {
	
	public void salvar(candidatos candidatos) throws Exception {
		if (candidatos.getNome() == null || candidatos.getNome().length()< 3) {
			throw new Exception();
			
		}
		candidatosdao.getinstance().salvar(candidatos);
	}
	 
	public void atualizar(candidatos candidatos) throws Exception {
	}
		
	public List<candidatos> listar(){
		return null;
	}
	
	
}
