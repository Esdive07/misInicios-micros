package com.example.esme.lambdas;

public class CamisaRojaXLPredicate implements CamisaPredicate {

	@Override
	public boolean test(Camisa camisa) {
		return "ROJO".equals(camisa.getColor()) && "XL".equals(camisa.getTalla());
	}

}
