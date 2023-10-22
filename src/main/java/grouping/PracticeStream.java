package grouping;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeStream {

    public static String[] scannerNumer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--How many enter word ?");
        int n = scanner.nextInt();
        System.out.println("--Please Enter Word :");
        String[] sc = new String[n];
        for (int i = 0; i < n; i++) {
            sc[i] = scanner.nextLine();
        }
        return sc;
    }

    public Map<String, Integer> wordByLength() {
        Map<String, Integer> map;
        map = Arrays.stream(scannerNumer())
                .collect(Collectors.toMap(String::new, String::length));
        return map;
    }

    public Map<Integer, Set<String>> groupingWordByLength() {
        Map<Integer, Set<String>> integerSetMap;
        integerSetMap = Arrays.stream(scannerNumer())
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(String::new, Collectors.toSet())));
        return integerSetMap;
    }
}
