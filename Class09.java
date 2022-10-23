class Caaa{
    private int num;
    public void display(){
        System.out.println("printed from Caaa Class");
    }
}
class Cbbb extends Caaa{
    public void display() {
        System.out.println("printed from Cbbb Class");
    }
}
public class Class09 {
    public static void main(String[] args) {
        Caaa bb=new Cbbb();
        bb.display();
    }
}
