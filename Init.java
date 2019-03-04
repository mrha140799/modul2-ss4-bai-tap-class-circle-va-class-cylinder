package Circle;

public class Init {
    public static void main(String[] args) {
        Circle crl1 = new Circle(10,"Đỏ");
        System.out.println(crl1.toString() +", area= " + crl1.getArea());
        Cylinder cld1 = new Cylinder(8,"Xanh", 5);
        System.out.println(cld1.toString() + ", volume= " + cld1.getVolume());
    }
}
