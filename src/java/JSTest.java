import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class JSTest {
    public static void main(String[] args) throws IOException {
        //DataAccess.createInputFile();
        //DataAccess.fillInputFile();
        Converter cvt = new Converter();

        ArrayList<String> readIn = new ArrayList<>(DataAccess.readInputFile());
        System.out.println("-----ReadIn----: "+readIn.size());
        //readIn.stream().forEach(System.out::println);
        ArrayList<Integer> numList = new ArrayList<>();


       // System.out.println(readIn.size());
/*
        for (String s:readIn) {
            numList.add(cvt.wordToNumber(s));
        }
*/
        //int temp = cvt.wordToNumber("fifty one");
        String temp = cvt.numberToWord(0);
        System.out.println(temp);

  //      numList.stream().forEach(System.out::println);
        //Collections.sort(numList);

        /*
        ArrayList<String> backToString = new ArrayList<>();
        for(int n:numList){
            backToString.add(cvt.numberToWord(n));
        }

         */

        //backToString.stream().forEach(System.out::println);
        //numList.stream().forEach(System.out::println);

//        ArrayList<String[]> afterColumn = new ArrayList<>(Project_Challenge1_v1.printColumns(backToString));
        //afterColumn.stream().forEach(System.out::println);

  //      DisplayData.displayData(afterColumn);


        /*
        ArrayList<String[]> getColumn = new ArrayList<>(Project_Challenge1_v1.printColumns(readIn));

        DisplayData.displayData(getColumn);
        */
    }
}
