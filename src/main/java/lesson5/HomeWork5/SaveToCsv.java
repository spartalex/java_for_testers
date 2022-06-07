package lesson5.HomeWork5;

import java.io.*;
import java.util.Arrays;

public class SaveToCsv {
    public static void main(String[] args) throws IOException {
        String[] header1 = {"apples", "green","ver3", "victims"};
        //int[][] line1 = new int[5][6];
        //BWriter("Заголовок", 1);
        new AppData("333.csv", header1, toLine());
        AppData.load("333.csv");
        System.out.println(Arrays.toString(AppData.header2));
        System.out.println(Arrays.deepToString(AppData.data));


    }

    public static int[][] toLine(){
        int[][] line1 = new int[5][6];
        int line2=0;
        for(int i =0; i<line1.length; i++){
            for (int j = 0; j<line1.length; j++){
                line1[i][j]=line2;
                line2++;

            }


        }

        return line1;
    }

    /*private static void BWriter(String header, int numberlines) {
        File file = new File("list.csv");
        FileWriter fw = null;
        BufferedWriter bw = null;
        String[] wdata={"12","444","444"};

        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int i = numberlines; i > 0; i--) {
                bw.write(header);
                bw.write(toLine().toString());
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try{
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(toLine());

    }*/
}