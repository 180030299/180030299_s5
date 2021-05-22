package classandobject;
public class problem1 {

    double h,w,d;

     problem1(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    problem1 bc = new problem1(8.5,80.3,9.6);
    System.out.println(bc.volume());

    }

}

