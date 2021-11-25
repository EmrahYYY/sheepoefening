package be.intecbrussel;

public abstract class Shape {
        private static int count;
        private int y=3;
        private int x;

    {count++;}

        public Shape(){this(0,0);}
        public Shape(int x, int y){ this.x=x; this.y=y;}

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setPosition(int x, int y){ setX(x); setY(y);}

    public abstract double getArea();

        public abstract   double getPerimeter();

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "count=" + count +
                ", y=" + y +
                ", x=" + x +
                '}';
    }
}
