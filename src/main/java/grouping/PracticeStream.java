package grouping;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeStream {

    public static String[] scannerNumer(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("--How many enter word ?");
        int n = scanner.nextInt();
        System.out.println("--Please Enter Word :");
        String[] sc =new String[n];
        for (int i = 0; i < n; i++) {
            sc[i] =scanner.nextLine();
        }
        return sc;
    }

}
