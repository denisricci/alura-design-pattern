package br.com.alura.pattern.state.orcamento;

import br.com.alura.pattern.model.Orcamento;

public interface EstadoOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento);
	public void reprovar(Orcamento orcamento);
	public void finalizar(Orcamento orcamento);
	
}
