package grouping;

import java.util.*;


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

    public static void groupingWordBySum(String[] word) {
        Map<Integer, Set<String>> integerSetMap;
        integerSetMap = Arrays.stream(word)
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(String::new, Collectors.toSet())));

        for (Set<String> strings : integerSetMap.values()) {
            final Optional<Integer> reduce = strings.stream().map(String::length).reduce(Integer::sum);
            reduce.ifPresent(integer -> System.out.println(integer + "  =  " + (strings)));

        }

    }


}
