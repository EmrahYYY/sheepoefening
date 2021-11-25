package be.intecbrussel;

public class Rectangle extends Shape {

    private static int count;
    public final int ANGLES=4;
    private int height;
    private int width;
    {count++;}
    public Rectangle(){}
    public Rectangle(int height, int width){setHeight(height); this.width=width;}
    public Rectangle(int height, int width, int x, int y){ setWidth(width); setHeight(height); super.getX(); super.getY();



    }
    public void Rectangle(Rectangle rectangle){ }




    public void setHeight(int height) {
        this.height = height;

        if (this.height<0){ this.height=-height;}
        else {this.height=height;}

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width2) {
        if (width2 < 0) {
            width = -width2;
        } else {
            width = width2;
        }
    }

    public int getHeight() {
        return height;
    }

    @Override
    public  double getArea(){ return width*height;};
@Override
    public double getPerimeter(){return height*2+width*2; };

public void grow (int d ){ while (d>0 && d!=0){ setHeight(height*d);setWidth(width*d); break;  } ;



}


    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "count=" + count +
                ", ANGLES= " + ANGLES +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
