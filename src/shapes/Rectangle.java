package shapes;

class Rectangle  {
    protected double height;  // To hold height.
    protected double width;  //To hold width or base

    /**
     *  The setValue method sets the data
     *  in the height and width field.
     */
    public void setValues(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public static void main (String[] args)
    {
        double length = 4.5;
        double width = 8.0;
        double area = length*width;
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle is " + perimeter + " units.");
        System.out.println("Area of rectangle is " + area + " sq. units.");
    }




}