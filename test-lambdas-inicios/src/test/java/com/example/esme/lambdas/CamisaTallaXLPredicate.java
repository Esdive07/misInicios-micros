package com.example.esme.lambdas;

public class CamisaTallaXLPredicate implements CamisaPredicate {

	@Override
	public boolean test(Camisa camisa) {
		return "XL".equals(camisa.getTalla());
	}

}
