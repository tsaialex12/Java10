class CShape{
    public double area(){
        return 0;
    }
}
class CCircle extends CShape{
    double radius;
    public CCircle(double r){
        this.radius=r;
    }
    public double area(){
        return (Math.PI*radius*radius);
    }
}
class CSquare extends CShape{
    double side;
    public CSquare(double s){
        this.side=s;
    }
    public double area(){
        return(side*side);
    }
}
class CTriangle extends CShape{
    double base,height;
    public CTriangle(double b ,double h){
        this.base=b;
        this.height=h;
    }
    public double area(){
        return (base*height/2);
    }
}
public class Class11 {
    public static void main(String[] args) {
        CCircle cir1=new CCircle(1.0);
        CCircle cir2=new CCircle(2.1);
        CSquare squ1=new CSquare(1.0);
        CSquare squ2=new CSquare(2.0);
        CTriangle tri1=new CTriangle(3,6);
        CTriangle tri2=new CTriangle(4,10);
        double a[]=new double[6];
        a[0]=cir1.area();a[1]=cir2.area();
        a[2]=squ1.area();a[3]=squ2.area();
        a[4]=tri1.area();a[5]=tri2.area();
        largest;
    }
    public static  double largest(double a[]){
        double max=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
