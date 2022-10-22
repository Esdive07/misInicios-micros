package com.rah.demo.crud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.rah.demo.crud.entity.UserEntity;

class DemoCrudV2ApplicationTests {

	void contextLoads() {
	}

	@Disabled
	public void aprendiendoIf() {

		// ejercicio 1: validar cual numero es mayor y pasar el valor a resultado
		int numA = 5;
		int numB = 6;
		int resultado = 0;

		// validaciones con if aquí

		if (numA > numB) {
			resultado = numA;
		} else {
			resultado = numB;
		}
		System.out.println("El numero mayor es: " + resultado);
		assertEquals(numB, resultado);

		// ejercicio 2: ordenar los numero de mayor a menor e imprimirlos en consola
		numA = 2;
		numB = 3;
		int numC = 1;

		// validaciones con if aquí

		System.out.println("MAYOR a MENOR");

		if ((numA > numB) && (numA > numC)) {
			if (numB > numC) {
				System.out.println("Mayor: " + numA);
				System.out.println("Medio: " + numB);
				System.out.println("Menor: " + numC);
			} else {
				System.out.println("Mayor: " + numA);
				System.out.println("Medio: " + numC);
				System.out.println("Menor: " + numB);
			}
		} else {
			if ((numB > numA) && (numB > numC)) {
				if (numA > numC) {
					System.out.println("Mayor: " + numB);
					System.out.println("Medio: " + numA);
					System.out.println("Menor: " + numC);
				} else {
					System.out.println("Mayor: " + numB);
					System.out.println("Medio: " + numC);
					System.out.println("Menor: " + numA);
				}
			} else {
				if ((numC > numA) && (numC > numB)) {
					if (numA > numB) {
						System.out.println("Mayor: " + numC);
						System.out.println("Medio: " + numA);
						System.out.println("Menor: " + numB);
					} else {
						System.out.println("Mayor: " + numC);
						System.out.println("Medio: " + numB);
						System.out.println("Menor: " + numA);
					}
				}
			}
		}

		System.out.println("MENOR a MAYOR");

		if (numA < numB && numA < numC) {
			if (numB < numC) {
				System.out.println("Menor: " + numA);
				System.out.println("Medio: " + numB);
				System.out.println("Mayor: " + numC);
			} else {
				System.out.println("Menor: " + numA);
				System.out.println("Medio: " + numC);
				System.out.println("Mayor: " + numB);
			}

		} else {
			if (numB < numA && numB < numC) {
				if (numA < numC) {
					System.out.println("Menor: " + numB);
					System.out.println("Medio: " + numA);
					System.out.println("Mayor: " + numC);
				} else {
					System.out.println("Menor: " + numB);
					System.out.println("Medio: " + numC);
					System.out.println("Mayor: " + numA);
				}
			} else {
				if (numC < numA && numC < numB) {
					if (numA < numB) {
						System.out.println("Menor: " + numC);
						System.out.println("Medio: " + numA);
						System.out.println("Mayor: " + numB);
					} else {
						System.out.println("Menor: " + numC);
						System.out.println("Medio: " + numB);
						System.out.println("Mayor: " + numA);
					}
				}
			}
		}

	}

	@Test
	public void aprendiendoSwitch() {

		/**
		 * Robin -imprima apellido Esme- imprima documento Caro- imprima edad sino
		 * imprima nombre
		 */
		UserEntity userEntity = new UserEntity();

		userEntity.setNombre("Leidy");
		userEntity.setApellido("Arellano");
		userEntity.setDocumento(1234);
		userEntity.setEdad(27);

		switch (userEntity.getNombre()) {
		case "Robin":
			System.out.println(userEntity.getApellido());
			break;
		case "Esme":
			System.out.println(userEntity.getDocumento());
			break;
		case "Caro":
			System.out.println(userEntity.getEdad());
			break;
		default:
			System.out.println(userEntity.getNombre());
			break;
		}
	}

	public void apreniendoFor() {

	}
}
