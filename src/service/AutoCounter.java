package service;

import java.util.HashMap;
import java.util.Map;

public class AutoCounter {

    // equivalente a numpy.unique + count
    public static Map<String, Integer> contarAutos(String[] autos) {

        Map<String, Integer> conteo = new HashMap<>();

        for (String auto : autos) {
            conteo.put(auto, conteo.getOrDefault(auto, 0) + 1);
        }

        return conteo;
    }

    // conteo total ( similar a numpy.size)
    public static int totalAutos(String[] autos) {
        return autos.length;    
    }
}
