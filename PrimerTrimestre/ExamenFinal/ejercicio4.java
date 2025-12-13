package ExamenCorreccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int SALDOINICIAL = 100;
		int saldo = SALDOINICIAL;
		int contadorHistorial = 1;
		int contadorCosas = 0;
		List<String> historial = new ArrayList<>();

		while (true) {


			System.out.println("--- CAJERO AUTOMATICO ---");
			System.out.println("1. Consultar Saldo");
			System.out.println("2. Ingrasar dinero");
			System.out.println("3. Retirar dinero");
			System.out.println("4. Ver historial");
			System.out.println("5. Salir");
			
			int opciones = sc.nextInt();
			System.out.println("Eligio la opción: " + opciones);
			if(opciones == 5) {
                System.out.println("Fin");
                break;
            }
			switch (opciones) {
			case 1 -> {
				System.out.println("Saldo actual: " + saldo + "€");

			}
			case 2 -> {
				System.out.println("Cantdad a ingresar");
				int ingreso = sc.nextInt();
				while (ingreso <= 0) {
                    System.out.println("Error, cantidad no válida");
                    System.out.print("Cantidad a ingresar: ");
                    ingreso = sc.nextInt();
				}
				saldo = saldo + ingreso;
				System.out.println("Saldo actual: " + saldo + "€");
				String ingresar1 = Integer.toString(ingreso);
                historial.add("Ingreso de " + ingresar1 + "€");
				

			}
			case 3 -> {
				System.out.println("Cantidad a retirar: ");
				int retirar = sc.nextInt();
				while (retirar > saldo) {
                    System.out.println("La retirada supera tu saldo, porfavor intente de nuevo (saldo = " + saldo + "): ");
                    retirar = sc.nextInt();
                }
				saldo = saldo - retirar;
				System.out.println("Retirada realizada.");
				System.out.println("Nuevo saldo: " + saldo + "€");
				String retirar1 = Integer.toString(retirar);
                historial.add("Retirada de " + retirar1 + "€");

			}
			case 4 -> {
				System.out.println("HGisotriosa");
				for (String fin : historial) {
                    System.out.println(fin);
                }

                System.out.println();

				
			}
			case 5 -> {
				break;
			}
			}

		}

	}

}
