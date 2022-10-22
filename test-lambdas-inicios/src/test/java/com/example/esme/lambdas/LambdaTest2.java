package com.example.esme.lambdas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LambdaTest2 {

	public int sumaAB(int numA, int numB) {
		return numA + numB;
	}

	@Test
	public void sumaABTest() {
		int numA = 2;
		int numB = 2;
		Calculadora suma = (int numberA, int numberB) -> numberA + numberB;
		int resultado = numA + numB;
		assertEquals(resultado, suma.ejecutar(numA, numB));
		
		Calculadora restar = (int numberA, int numberB) -> numberA - numberB;
		resultado = numA - numB;
		assertEquals(resultado, restar.ejecutar(numA, numB));
		
		Calculadora dividir = (int numberA, int numberB) -> {
			if(numberB == 0) {				
				return 0;
			}
			return numberA / numberB;
		};
		resultado = numA / numB;
		assertEquals(resultado, dividir.ejecutar(numA, numB));
	}
}
