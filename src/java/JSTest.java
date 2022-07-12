import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class JSTest {
    public static void main(String[] args) throws IOException {

        Converter cvt = new Converter();

        ArrayList<String> readIn = new ArrayList<>(DataAccess.readInputFile());
        System.out.println("-----ReadIn----: "+readIn.size());

        ArrayList<Integer> numList = new ArrayList<>();


        for (String s:readIn) {
            Object temp = cvt.wordToNumber(s);
            if(temp != null){
                int i = (Integer) temp;
                numList.add((Integer)temp);
            }

        }
        System.out.println("NumList: "+numList.size());

        numList.stream().forEach(System.out::println);

        Collections.sort(numList);

        ArrayList<String> backToString = new ArrayList<>();
        for(int n:numList){
            backToString.add(cvt.numberToWord(n));
        }

        backToString.stream().forEach(System.out::println);


        ArrayList<String[]> afterColumn = new ArrayList<>(Project_Challenge1_v1.printColumns(backToString));

        DisplayData.displayData(afterColumn);
    }
}
