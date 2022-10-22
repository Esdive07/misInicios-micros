package com.example.esme.lambdas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LambdaTest {

	@Test
	public void testRojo() {
		List<Camisa> inv = new ArrayList<>();
		Camisa camisa = new Camisa();
		camisa.setColor("AZUL");
		camisa.setTalla("M");
		inv.add(camisa);

		camisa = new Camisa();
		camisa.setColor("ROJO");
		camisa.setTalla("S");
		inv.add(camisa);

		List<Camisa> response = this.filtrarRojas(inv);
		assertNotNull(response);
		assertEquals(1, response.size());
	}

	public List<Camisa> filtrarRojas(List<Camisa> inv) {
		List<Camisa> sub = new ArrayList<>();
		for (Camisa camisa : inv) {

			if ("ROJO".equals(camisa.getColor())) {
				sub.add(camisa);
			}
		}
		return sub;
	}

	@Test
	public void testColor() {
		List<Camisa> inv = new ArrayList<>();
		String color = "AZUL";

		Camisa camisa = new Camisa();
		camisa.setColor("AZUL");
		camisa.setTalla("M");
		inv.add(camisa);

		camisa = new Camisa();
		camisa.setColor("ROJO");
		camisa.setTalla("S");
		inv.add(camisa);

		camisa = new Camisa();
		camisa.setColor("AZUL");
		camisa.setTalla("XL");
		inv.add(camisa);

		List<Camisa> response = this.filtrar(inv, color);
		assertNotNull(response);
		assertEquals(2, response.size());
	}

	public List<Camisa> filtrar(List<Camisa> inv, String color) {
		List<Camisa> sub = new ArrayList<>();
		for (Camisa camisa : inv) {
			if (camisa.getColor().equals(color)) {
				sub.add(camisa);
			}
		}
		return sub;
	}

	@Test
	public void testFiltro() {
		List<Camisa> inv = new ArrayList<>();
		String color = "AZUL";
		String talla = "M";

		Camisa camisa = new Camisa();
		camisa.setColor("AZUL");
		camisa.setTalla("M");
		inv.add(camisa);

		camisa = new Camisa();
		camisa.setColor("ROJO");
		camisa.setTalla("S");
		inv.add(camisa);

		camisa = new Camisa();
		camisa.setColor("AZUL");
		camisa.setTalla("XL");
		inv.add(camisa);

		List<Camisa> response = this.filtrar(inv, color, talla, true);
		assertNotNull(response);
		assertEquals(2, response.size());
	}

	public List<Camisa> filtrar(List<Camisa> inv, String color, String talla, boolean bool) {
		List<Camisa> sub = new ArrayList<>();
		for (Camisa camisa : inv) {
			if ((bool && camisa.getColor().equals(color)) || (!bool && camisa.getTalla().equals(talla))) {
				sub.add(camisa);
			}
		}
		return sub;
	}

	@Test
	public void filtrarPredicate() {
		CamisaPredicate camisaRoja = new CamisaRojaPredicate();

		List<Camisa> inv = new ArrayList<>();
		String color = "AZUL";
		String talla = "M";

		Camisa camisa = new Camisa();
		camisa.setColor("AZUL");
		camisa.setTalla("M");
		inv.add(camisa);

		camisa = new Camisa();
		camisa.setColor("ROJO");
		camisa.setTalla("S");
		inv.add(camisa);

		camisa = new Camisa();
		camisa.setColor("ROJO");
		camisa.setTalla("XL");
		inv.add(camisa);

		List<Camisa> response = this.filtrar(inv, camisaRoja);
		assertNotNull(response);
		assertEquals(1, response.size());
	}

	public List<Camisa> filtrar(List<Camisa> inv, CamisaPredicate predicado) {
		List<Camisa> sub = new ArrayList<>();
		for (Camisa camisa : inv) {
			if (predicado.test(camisa)) {
				sub.add(camisa);
			}
		}
		return sub;
	}
}
