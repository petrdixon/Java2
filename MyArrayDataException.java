package Lesson2;


public class MyArrayDataException extends Exception{
    public int range;
    public int row;

    public MyArrayDataException(int range, int row){
        this.range = range;
        this.row = row;
    }


}
