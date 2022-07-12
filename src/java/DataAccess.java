
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class DataAccess {
    static String inputPath = "src/resources/input.txt";
    static File inputFile = new File(inputPath);


    public static Boolean inputFileExists(){
        if(!inputFile.exists()){
            System.out.println(inputFile.toString() + " File not found. File will be created.");
            return false;
        }
        return true;
    }
    public static Boolean createInputFile(){
        try{
            inputFile.createNewFile();
            return true;
        }catch(Exception e){
            System.out.println("Unable to create new file");
            return false;
        }
    }

    public static ArrayList<String> readInputFile() throws IOException {
        ArrayList<String> input = new ArrayList<>();
        try {
            input = ((ArrayList<String>) Files.lines(Path.of(inputPath)).collect(Collectors.toList()));
        }catch (Exception e){
            System.out.println("Unable to read from file");
        }
        return input;
    }


    public static Boolean fillInputFile() throws FileNotFoundException {
        ArrayList<String> numberStrings = new ArrayList<>();
        numberStrings.add("One");
        numberStrings.add("Four");
        numberStrings.add("Seven");
        numberStrings.add("Five");
        numberStrings.add("Six");
        numberStrings.add("Twelve");
        numberStrings.add("Eight");
        numberStrings.add("Nine");
        numberStrings.add("Ten");
        numberStrings.add("Eleven");
        numberStrings.add("Eighteen");
        numberStrings.add("Thirteen");
        numberStrings.add("Fourteen");
        numberStrings.add("Twenty Four");
        numberStrings.add("Fifteen");
        numberStrings.add("Two");
        numberStrings.add("Three");
        numberStrings.add("Sixteen");
        numberStrings.add("Seventeen");
        numberStrings.add("Nineteen");
        numberStrings.add("Twenty");
        numberStrings.add("Twenty Two");
        numberStrings.add("Twenty One");
        numberStrings.add("Twenty Three");
        numberStrings.add("Twenty Five");

        try{
            OutputStream out = new FileOutputStream(inputPath);
            for (String s:numberStrings) {
                byte[] bytes = s.getBytes();
                out.write(bytes);
                out.write(System.lineSeparator().getBytes());
            }
            return true;
        }
        catch (IOException ex) {
            System.out.println("Unable to write to file.");
        }
        return false;

    }
}
