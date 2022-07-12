import java.util.ArrayList;

public class Project_Challenge1_v1 {

    public static ArrayList<String[]> printColumns(ArrayList<String> numbers)
    {
        int elementNums = (int) numbers.stream().count();
        int columnNum = 1;
        int cubeNum = 0;
        while ((columnNum * columnNum * columnNum) <= elementNums)
        {
            columnNum++;
        }
        cubeNum = columnNum * columnNum * columnNum;
        int currentNum = 0;

        ArrayList<String[]> columns = new ArrayList<>();
        for (int i = 0; i < columnNum; i++)
        {
            if (currentNum < elementNums)
            {
                if ((currentNum + (columnNum * columnNum)) < (elementNums))
                {
                    int temp = cubeNum / columnNum;
                    String[] array = new String[temp];
                    columns.add(array);
                    currentNum += temp;
                }
                else
                {
                    int temp = (elementNums - currentNum);
                    String[] array = new String[temp];
                    columns.add(array);
                    currentNum += temp;
                }
            }

            /*if ((cubeNum - currentNum) > (columnNum * columnNum))
            {
                int temp = cubeNum / columnNum;
                String[] array = new String[temp];
                columns.add(array);
                currentNum += temp;
            }
            else if ((cubeNum - currentNum) < (columnNum * columnNum))
            {
                int temp = (elementNums - currentNum);
                String[] array = new String[temp];
                columns.add(array);
            }*/
        }

        int k = 0;
        for (int i = 0; i < columns.size(); i++)
        {
            for (int j = 0; j < columns.get(i).length; j++)
            {
                columns.get(i)[j] = numbers.get(k);
                k++;
            }
        }

        return columns;
    }
}
