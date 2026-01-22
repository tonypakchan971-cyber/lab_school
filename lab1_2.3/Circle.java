public class Circle extends Shape{
    // instance variables - replace the example below with your own
    private double redius;
    private Point center;

   
    public Circle(double redius,double x, double y)
    {
      super("circle");
      this.redius = redius;
      this.center = new Point(x,y);
    
    }

    public double getRedius()
    {
        return redius;
    }
    
     public Point getCenter()
    {
        return center;
    }
    
    public void setRedius(double redius)
    {
        this.redius = redius;
    }
    
    public void setCenter(Point center)
    {
        this.center = center;
    }
    
        public double getArea()
    {
        return Math.PI * redius * redius;
    }
    
           public String toString()
    {
        return "center" + center.toString() + "redius=" + redius + "; Area=" + 
        getArea();
    }
}

