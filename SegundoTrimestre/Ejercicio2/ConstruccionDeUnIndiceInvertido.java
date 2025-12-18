/*     Se proporciona una colección de frases identificadas por un número entero 
    (posición en la lista). Cada frase contiene varias palabras separadas por espacios.
    Se pide construir una estructura Map<String, List<Integer>> donde cada palabra 
    sea una clave y el valor asociado sea la lista de identificadores de las frases en las que aparece.
    Use únicamente operaciones vistas en teoría: putIfAbsent, get, getOrDefault, y operaciones sobre listas.
    Si una palabra aparece varias veces dentro de la misma frase, su identificador solo deberá registrarse una vez.
    El mapa final deberá almacenarse en una implementación ordenada (por ejemplo, TreeMap) de 
    forma que las claves queden alfabéticamente ordenadas.
    Se exige mostrar el índice invertido completo siguiendo el formato:
    palabra → [lista de frases].

    Frases procesadas:
    0: "java es divertido"
    1: "aprender java con mapas"
    2: "mapas y colecciones en java"
    
    
    Índice invertido (palabra → [frases]):
    aprender     -> [1]
    colecciones  -> [2]
    con          -> [1]
    divertido    -> [0]
    es           -> [0]
    java         -> [0, 1, 2]
    mapas        -> [1, 2]
    y            -> [2] */

package Ejercicio2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class ConstruccionDeUnIndiceInvertido {
		
    Map<String, List<Integer>> historial = new LinkedHashMap<>();
    String[][] datos = {
        {"java es divertido", "0"}, 
        {"aprender java con mapas", "1"}, 
        {"mapas y colecciones en java", "2"}

    };
    for (String[] separadas : datos){
        String k = separadas[0];
    }
}
