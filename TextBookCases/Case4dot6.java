package TextBookCases;

public class Case4dot6 {
    public static void main(String[] args) {
        Circle c=new Circle(6);
        System.out.println(c.getR());
        Circular circular = new Circular(c,20);
        System.out.println(circular.getVolume());
    }
}

class Circle{
    double r;
    double area;
    Circle(double R){
        r = R;
    }

    double getR(){
        return r;
    }

    void setR(double R){
        r = R;
    }

    double getArea(){
        area = 3.14*r*r;
        return area;
    }
}

class Circular{
    Circle bottom;
    double height;
    Circular(Circle c,double h){
        bottom = c;
        height = h;
    }
    double getVolume(){
        return bottom.getArea()*height/3;
    }
}
