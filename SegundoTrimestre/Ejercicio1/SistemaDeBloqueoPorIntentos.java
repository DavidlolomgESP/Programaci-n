package Ejercicio1;
//	Ejercicio 1 — Sistema de bloqueo por intentos fallidos
//	Se recibe una secuencia de identificadores de usuario, donde cada aparición representa un 
//	intento de acceso fallido. Se pide implementar un sistema que registre los fallos por usuario y 
//	determine qué cuentas deben bloquearse.
//	Utilice un Map<String, Integer> para almacenar el número de intentos fallidos por usuario.
//	Cada vez que un usuario aparezca en la secuencia, increméntese su contador utilizando 
//	exclusivamente operaciones del mapa (getOrDefault, put, putIfAbsent).
//	Considérese que un usuario debe quedar bloqueado en el momento en que acumule 3 
//	intentos fallidos. El conjunto de usuarios bloqueados deberá almacenarse en una estructura Set<String>.
//	Al finalizar el procesamiento, se exige:
//	a) Mostrar el número total de intentos fallidos por cada usuario.
//	b) Mostrar el conjunto de usuarios bloqueados.
//	c) Determinar qué usuario ha registrado el mayor número de intentos fallidos.
import java.util.HashMap;
import java.util.Map;

public class SistemaDeBloqueoPorIntentos {

	public static void main(String[] args) {

		int maximo = Integer.MIN_VALUE;
		String maximon = "";
        String bloqueados = "";
		String[] fallos = {"ana","ana","luis","ana","ana","ana","marta","marta","pedro","pedro","pedro"};
		Map<String, Integer> intentos = new HashMap<>();
		for(String p : fallos) {
			intentos.put(p, intentos.getOrDefault(p, 0) + 1 );
		}
		
		for(String k : intentos.keySet()) {
			if(intentos.get(k) >= 3) {
				bloqueados = k;
				}
			if(intentos.get(k) > maximo) {
				maximo = intentos.get(k);
				maximon = k + " (" + intentos.get(k) + " intentos)";
			}
		}
		System.out.println(intentos);
		System.out.println();
		System.out.println("Usuarios bloqueados (3 o más intentos):");
		System.out.println(bloqueados);
		System.out.println();
		System.out.println("Usuarios co mas intetnos: ");
		System.out.println(maximon);
	}
}
