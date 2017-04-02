package br.com.alura.pattern.decorator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.alura.pattern.model.Conta;

public class FiltroDeContasTest {

	@Test
	public void filtroDeContas() {
		Conta conta1 = new Conta("Denis Ricci", 200d);
		conta1.setDataAbertura(LocalDate.of(2017, Month.JANUARY, 5));

		Conta conta2 = new Conta("Debora Ricci", 200d);
		conta2.setDataAbertura(LocalDate.of(2017, Month.APRIL, 2));

		Conta conta3 = new Conta("Edson Porciuncula", 50d);
		conta3.setDataAbertura(LocalDate.of(2017, Month.MARCH, 23));

		Conta conta4 = new Conta("Adriana Ricci", 6000000d);
		conta4.setDataAbertura(LocalDate.of(2016, Month.DECEMBER, 25));

		List<Conta> contas = new ArrayList<>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);

		Filtro filtro = new AbertaNesseMes(Month.APRIL, 2017, 
				new SaldoMaiorQueQuinhentosMill(
						new SaldoMenorQueCem()));
		List<Conta> filtrada = filtro.filtrar(contas);
				
		assertThat(filtrada, hasSize(3));
		assertThat(filtrada, containsInAnyOrder(conta2, conta3, conta4));		
	}

}
