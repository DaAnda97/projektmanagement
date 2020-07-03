import java.util.HashSet;
import java.util.Set;

public class Algorithm {

    public static Set<String> isPrim(int n, String pruefverfahren){
        boolean isPrim;
        Set<String> durchlaufeneBedingungen = new HashSet<>();

        if(n<=1){
            durchlaufeneBedingungen.add("Bedingung 1: true");
            isPrim = false;
        } else {
            durchlaufeneBedingungen.add("Bedingung 1: false");
            int m = 2;
            do {

                if(pruefverfahren.equals("V3") | pruefverfahren.equals("V4")){
                    if (m * m <= n){
                        durchlaufeneBedingungen.add("Bedingung 2a: true");
                    } else {
                        durchlaufeneBedingungen.add("Bedingung 2a: false");
                    }

                    if(n % m != 0){
                        durchlaufeneBedingungen.add("Bedingung 2b: true");
                    } else {
                        durchlaufeneBedingungen.add("Bedingung 2b: false");
                    }
                }
                if (pruefverfahren.equals("V4")){
                    if((m * m <= n) & (n % m != 0)){
                        durchlaufeneBedingungen.add("Bedingung 2: true");
                    } else {
                        durchlaufeneBedingungen.add("Bedingung 2: false");
                    }
                }

                if((m * m <= n) & (n % m != 0)){
                    m = m+1;
                }
            }
            while ((m * m <= n) & (n % m != 0));

            if(!(m * m <= n)){
                durchlaufeneBedingungen.add("Bedingung 3: true");
                isPrim = true;
            } else {
                durchlaufeneBedingungen.add("Bedingung 3: false");
                isPrim = false;
            }
        }

        //System.out.println(isPrim);
        return durchlaufeneBedingungen;

    }


}
