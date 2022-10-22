package com.example.esme.lambdas;

public class CamisaRojaPredicate implements CamisaPredicate {

	@Override
	public boolean test(Camisa camisaRojo) {
		return "ROJO".equals(camisaRojo.getColor());
	}

}
