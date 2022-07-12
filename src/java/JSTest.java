import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class JSTest {
    public static void main(String[] args) throws IOException {

        Converter cvt = new Converter();

        ArrayList<String> readIn = new ArrayList<>(DataAccess.readInputFile());
        System.out.println("-----ReadIn----: "+readIn.size());

        ArrayList<Integer> numList = new ArrayList<>();




        for (String s:readIn) {
            Integer temp = cvt.wordToNumber(s);
            if(temp != null){
                numList.add(cvt.wordToNumber(s));
            }
        }

/*
        numList.stream().forEach(System.out::println);
        Collections.sort(numList);


        ArrayList<String> backToString = new ArrayList<>();
        for(int n:numList){
            backToString.add(cvt.numberToWord(n));
        }

        backToString.stream().forEach(System.out::println);


        ArrayList<String[]> afterColumn = new ArrayList<>(Project_Challenge1_v1.printColumns(backToString));

        DisplayData.displayData(afterColumn);


 */
    }
}
