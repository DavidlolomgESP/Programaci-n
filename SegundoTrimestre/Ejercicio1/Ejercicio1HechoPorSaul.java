/* Ejercicio 1 — Sistema de bloqueo por intentos fallidos
 
Se recibe una secuencia de identificadores de usuario, donde cada aparición representa un intento de acceso fallido. Se pide implementar un sistema que registre los fallos por usuario y determine qué cuentas deben bloquearse.
Utilice un Map<String, Integer> para almacenar el número de intentos fallidos por usuario.
Cada vez que un usuario aparezca en la secuencia, increméntese su contador utilizando exclusivamente operaciones del mapa (getOrDefault, put, putIfAbsent).
Considérese que un usuario debe quedar bloqueado en el momento en que acumule 3 intentos fallidos. El conjunto de usuarios bloqueados deberá almacenarse en una estructura Set<String>.
Al finalizar el procesamiento, se exige:
 
a) Mostrar el número total de intentos fallidos por cada usuario.
b) Mostrar el conjunto de usuarios bloqueados.
c) Determinar qué usuario ha registrado el mayor número de intentos fallidos. */
 
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Ejercicio1HechoPorSaul {
    public static void main(String[] args) {
        String[] intentos = {"ana","ana","luis","ana","ana","ana","marta","marta","pedro","pedro","pedro"};
 
        final int NUMEROS_BLOQUEO = 3;
 
        Map<String, Integer> fallos_por_usuario = new HashMap<>();
        List<String> nombres_bloqueados = new ArrayList<>();        
       
        for (String nombre : intentos) {
            /* if(!fallos_por_usuario.containsKey(nombre)) {
                fallos_por_usuario.put(nombre, 1);
            } else {
                int contador = fallos_por_usuario.get(nombre);
                fallos_por_usuario.put(nombre, contador+1);
            } */
 
            int nuevo_valor = fallos_por_usuario.getOrDefault(nombre, 0) + 1;
           
            fallos_por_usuario.put(nombre, nuevo_valor);
 
            if (nuevo_valor == NUMEROS_BLOQUEO) {
                nombres_bloqueados.add(nombre);
            }            
        }
       
        System.out.println(fallos_por_usuario);
        System.out.println("Usuarios bloqueados: " + nombres_bloqueados);
   
        String clave_maxima = "";
        int valor_maximo = 0;
 
        for ( String clave : fallos_por_usuario.keySet()) {
            int valor = fallos_por_usuario.get(clave);
 
            if (valor > valor_maximo) {
                valor_maximo = valor;
                clave_maxima = clave;
            }
        }
 
        System.out.println("El usuario "+clave_maxima+" ha fallado "+valor_maximo+" veces.");
   
    }
}