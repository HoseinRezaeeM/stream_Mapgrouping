package grouping;

import java.util.Arrays;
import java.util.Map;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeStream {

    public static String[] scannerWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Enter Word ?");
        int count = scanner.nextInt();
        System.out.println("Please Enter Word: ");
        String[] sc = new String[count];
        for (int i = 0; i < count; i++) {
            sc[i] = scanner.next();
        }
        return sc;
    }


    public static Map<String, Integer> wordByLength(String[] word) {
        Map<String, Integer> map;
        map = Arrays.stream(word)
                .collect(Collectors.toMap(String::new, String::length));
        return map;
    }


    public static Map<Integer, Set<String>> groupingWordByLength(String[] word) {
        Map<Integer, Set<String>> integerSetMap;
        integerSetMap = Arrays.stream(word)
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(String::new, Collectors.toSet())));
        return integerSetMap;
    }

}
