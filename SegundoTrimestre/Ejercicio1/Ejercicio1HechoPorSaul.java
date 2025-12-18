import java.util.HashMap;
import java.util.Map;
public class Ejercicio1HechoPorSaul {
    public static void main(String[] args) {

        String[] intentos = {"ana","ana","luis","ana","ana","ana","marta","marta","pedro","pedro","pedro"};

        final int NUMEROS_BLOQUEO = 3;

        Map<String, Integer> fallos_por_usuario = new HashMap<>();

        for(String nombre : intentos){
            fallos_por_usuario.put(nombre, fallos_por_usuario.getOrDefault(nombre, defaultValue: 0) + 1);
        }
    }
}
