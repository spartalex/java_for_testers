package lesson2;
//666
public class CheckArray {
    public static void main(String[] args) {
        String[][] Array1 = new String[][]{{"u", "2", "3", "4"}, {"5", "2", "6", "4"}, {"2", "2", "8", "3"}, {"1", "2", "2", "2"}};
        try {
            try {
                int result = arr(Array1);
                System.out.println(result);
            } catch (Stackoverflow e) {
                System.out.println("Wrong size");
            }
        } catch (WrongArrayData e) {

            System.out.println("Wrong data"+e.i+e.j);


        }




    }
    public static int arr(String[][] Array1) throws Stackoverflow, WrongArrayData{
        int cell = 0;
        if (Array1.length !=4)  {
            throw new Stackoverflow("ADasf");
        }
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i].length != 4) {
                throw new Stackoverflow("fdsgsdg");
            }
            for (int j = 0; j < Array1[i].length; j++) {
                try {
                    cell = cell + Integer.parseInt(Array1[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new WrongArrayData(i, j);
                }
            }

        }
        return cell;

    }

}
