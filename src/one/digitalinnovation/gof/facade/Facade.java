package one.digitalinnovation.gof.facade;

import subsisitema2.cep.CepApi;
import subsistema1.crm.CrmService;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
		
	}
}
