public class Rectangle {
    private double length;
    private double width;

    public Rectangle (double initiLength, double initiWidth) {
        this.length = initiLength;
        this.width = initiWidth;
    }

    public double Area () {
        double area = this.length * this.width;
        System.out.println("Area: " + area);
        return area;
    }

    public boolean Square (double length, double width) {
        System.out.println("Is it a square?");
        if (length == width) {
            System.out.print("It's a square");
            return true;
        }
        else {
            System.out.println("It's not a square");
            return false;
        }
    }

    public void Compare (double length1, double width1, double length2, double width2) {
        if (width1*length1 > width2*length2) {
            System.out.println("Rectangle 1 is greater than Rectangle 2");
        } else  if (width2*length2 > width1*length1) {
            System.out.println("Rectangle 2 is greater than Rectangle 1");
        } else {
            System.out.println("They are equal");
        }
    
    }

    public static void main(String [] args) {
        Rectangle r1 = new Rectangle (3.0, 4.0);
        Rectangle r2 = new Rectangle (2.0,7.0);
        r1.Area();
    }
}