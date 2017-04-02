package br.com.alura.pattern.strategy.imposto;

import br.com.alura.pattern.model.Orcamento;

/**
 * @author dricci
 *
 */
public abstract class Imposto {
	
	/**	 
	 * Atributo utilizado para implementar o padrai decorator
	 * onde nós estamos adicionando a funcionalidade de calcular
	 * um segundo imposto.
	 */
	private final Imposto outroImposto;
	
	public Imposto(Imposto imposto) {		
		this.outroImposto = imposto;
	}	
	
	public Imposto() {
		outroImposto = null;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	public double calculaOutroImposto(Orcamento orcamento){
		if(outroImposto == null) return 0d;
		return outroImposto.calcula(orcamento);
	}
	
}
