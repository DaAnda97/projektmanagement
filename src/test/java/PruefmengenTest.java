import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruefmengenTest {

    @ParameterizedTest(name = "Pruefmenge{index} is V3")
    @MethodSource("allPruefmengen")
    void isPruefverfahrenV3(List<Integer> pruefmenge){

        Set<String> durchlaufeneBedingungen = new HashSet<>();
        for (int n : pruefmenge){
            durchlaufeneBedingungen.addAll(Algorithm.isPrim(n, "V3"));
        }

        assertEquals(new HashSet<>(Arrays.asList(
                "Bedingung 1: true","Bedingung 1: false",
                "Bedingung 2a: true","Bedingung 2a: false",
                "Bedingung 2b: true","Bedingung 2b: false",
                "Bedingung 3: true","Bedingung 3: false")), durchlaufeneBedingungen);
    }


    @ParameterizedTest(name = "Pruefmenge{index} is V4")
    @MethodSource("allPruefmengen")
    void isPruefverfahrenV4(List<Integer> pruefmenge){

        Set<String> durchlaufeneBedingungen = new HashSet<>();
        for (int n : pruefmenge){
            durchlaufeneBedingungen.addAll(Algorithm.isPrim(n, "V4"));
        }

        assertEquals(new HashSet<>(Arrays.asList(
                "Bedingung 1: true","Bedingung 1: false",
                "Bedingung 2: true","Bedingung 2: false",
                "Bedingung 2a: true","Bedingung 2a: false",
                "Bedingung 2b: true","Bedingung 2b: false",
                "Bedingung 3: true","Bedingung 3: false")), durchlaufeneBedingungen);
    }

    private static List<List<Integer>> allPruefmengen(){
        List<List<Integer>> allPruefmengen = new ArrayList<>();

        List<Integer> pruefmengeA = new ArrayList<>(Arrays.asList(1, 3, 4));
        List<Integer> pruefmengeB = new ArrayList<>(Arrays.asList(1, 3, 6));
        List<Integer> pruefmengeC = new ArrayList<>(Arrays.asList(1, 3, 10));
        List<Integer> pruefmengeD = new ArrayList<>(Arrays.asList(1, 7));
        List<Integer> pruefmengeE = new ArrayList<>(Arrays.asList(1, 4, 5));
        List<Integer> pruefmengeF = new ArrayList<>(Arrays.asList(1, 5, 6));
        List<Integer> pruefmengeG = new ArrayList<>(Arrays.asList(1, 2, 3, 9));
        List<Integer> pruefmengeH = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
        List<Integer> pruefmengeI = new ArrayList<>(Arrays.asList(1, 2, 6, 7));
        List<Integer> pruefmengeJ = new ArrayList<>(Arrays.asList(1, 9));

        allPruefmengen.add(pruefmengeA);
        allPruefmengen.add(pruefmengeB);
        allPruefmengen.add(pruefmengeC);
        allPruefmengen.add(pruefmengeD);
        allPruefmengen.add(pruefmengeE);
        allPruefmengen.add(pruefmengeF);
        allPruefmengen.add(pruefmengeG);
        allPruefmengen.add(pruefmengeH);
        allPruefmengen.add(pruefmengeI);
        allPruefmengen.add(pruefmengeJ);

        return allPruefmengen;
    }



}
