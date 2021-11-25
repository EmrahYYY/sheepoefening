package be.intecbrussel;

public class Square extends Rectangle{

    private static int count;
    {count++;}
    public Square(){};
    public Square(int side){setSide(side);};
    public Square(int side, int x, int y){

        super.setX(x);
        super.setY(y);
        {count++;}

        super.setHeight(side);
        super.setWidth(side);

    }

    public void setSide(int side){ super.setHeight(side); super.setWidth(side);}

@Override
    public void grow (int d ){ setSide(getHeight()*2*d); }


        @Override
    public void setHeight(int height) {
        setSide(height);
    }
@Override
    public void setWidth(int width) {
       setSide(width);}



    public static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "Square{" +
                "count=" + count +
                '}';
    }
}
