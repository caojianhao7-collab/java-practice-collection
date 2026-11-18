package test3;

public abstract class Shape {
    public int length;
    public int width;

    public Shape(int length,int width){
        this.length = length;
        this.width = width;
    }

    public abstract double rectArea();

}
