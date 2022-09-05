package dao;

import java.util.List;

import eleicoes2022.candidatos;

public class candidatosdao {
	
	private static candidatosdao instance;
	
	
	public static candidatosdao getcandidatosdao() {
		if (instance == null) {
			instance = new candidatosdao();
		}
		return instance;
		
	}
	
	public void salvar(candidatos candidatos) {
		
	}
	
	public void atualizar(candidatos candidatos) {
		
		
	}
	
		
	public static candidatosdao getinstance() {
		return null;
	}
	
}
