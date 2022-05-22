package lesson2;


public class WrongArrayData extends Exception {
    public int i;
    public int j;

     WrongArrayData(int i, int j) {
           this.i = i;
            this.j = j;

      //  super("Ошибка ");
        }
    }
