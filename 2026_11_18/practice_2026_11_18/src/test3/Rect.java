package test3;

public class Rect extends Shape{

    public Rect(int length, int width){
        super(length,width);
    }

    @Override
    public double rectArea() {
        return super.length * super.width;
    }
}
