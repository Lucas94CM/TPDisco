package ar.edu.unlam.disco;

import static org.junit.Assert.*;
import org.junit.Test;
import ar.edu.unlam.disco.Disco;

public class TestDisco {
	
	@Test
	public void TestPerimetroInterior() {
		Disco miDisco=new Disco(5.0,8.5);
		miDisco.calcularPerimetroInterior();
		assertNotEquals(0.0,miDisco.getPerimetroInterior(),0.0);
	}
	@Test
	public void TestPerimetroExterior() {
		Disco miDisco=new Disco(5.0,8.5);
		miDisco.calcularPerimetroExterior();
		assertNotEquals(0.0,miDisco.getPerimetroExterior(),0.0);
	}
	@Test
	public void TestSuperficie() {
		Disco miDisco=new Disco(1.0,2.0);
		miDisco.calcularSuperficie();
		assertEquals(9.42477796076938,miDisco.getSuperficie(),0.0);
	}

}
