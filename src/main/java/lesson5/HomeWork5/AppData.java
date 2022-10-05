package lesson5.HomeWork5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppData {
    public static String[] header2;
    public static Integer[][] data;

    public AppData(String filename, String[] header, int[][] line) throws IOException {
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        outputWriter.write(Arrays.toString(header));
        outputWriter.newLine();
        for (int i = 0; i < line.length; i++) {
           // outputWriter.write(header[i] + ";");
            for (int j=0; j< line.length; j++) {
                outputWriter.write(line[i][j] + ";");
            }

            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();


    }

    public static void load(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            header2 = bufferedReader.readLine().split(";");
            ArrayList<Integer[]> dataList = new ArrayList<>();
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                dataList.add(stringToDataRow(tempString));
            }
            data = dataList.toArray(new Integer[][]{{}});

    }


    private static Integer[] stringToDataRow(String str) {
        String[] strings = str.split(";");

        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;
    }





}
