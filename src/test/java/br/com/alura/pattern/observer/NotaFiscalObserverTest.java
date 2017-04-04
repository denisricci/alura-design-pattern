package br.com.alura.pattern.observer;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.alura.pattern.builder.ItemDaNota;
import br.com.alura.pattern.builder.NotaFiscal;
import br.com.alura.pattern.builder.NotaFiscalBuilder;

public class NotaFiscalObserverTest {

	@Mock
	private AcaoAposGerarNota acaoEnvioDeEmail;

	@Mock
	private AcaoAposGerarNota notaFiscalDAO;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void acoesAposCriacaoDeNota() {
		NotaFiscal notaFiscal = new NotaFiscalBuilder().paraEmpresa("Denis Ricci ME").comCnpj("46341014000170")
				.comObeservacao("Nota fiscal de teste").naDataAtual().com(new ItemDaNota("PS4", 1000d))
				.com(new ItemDaNota("XBOX ONE", 1000d)).aposContruirExecutar(acaoEnvioDeEmail)
				.aposContruirExecutar(notaFiscalDAO).build();
		
		Mockito.verify(acaoEnvioDeEmail).executa(notaFiscal);
		Mockito.verify(notaFiscalDAO).executa(notaFiscal);
	}

}
