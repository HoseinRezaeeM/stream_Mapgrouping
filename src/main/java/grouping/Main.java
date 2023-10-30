package grouping;


public class Main {
    public static void main(String[] args) {

        System.out.println("********* Hosein Rezaei Q2-HW11 *********\n");
        while (true){
        try {
            String[] sc = PracticeStream.scannerWords();
          System.out.println("------- WordByLength -------\n");
            System.out.println(PracticeStream.wordByLength(sc) + "\n");
            System.out.println("--- GroupingWordByLength ---\n");
            System.out.println(PracticeStream.groupingWordByLength(sc) + "\n");
            System.out.println("--- groupingWordBySum ----\n");
            PracticeStream.groupingWordBySum(sc);
            break;
        } catch (Exception e) {
            System.out.println("invalid Enter!!! ");
        }





    }
}}
