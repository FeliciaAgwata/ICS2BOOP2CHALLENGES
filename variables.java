public class variables {void showArea() {
    double length;
    double width;
    double area;

    length = 4.2;
    width = 3.8;
    area = (length * width);
    System.out.println("Area is " + length);
    System.out.println("Width is " + width);
    System.out.println("Area is " + area);

}
    public static void main(String[] args){
        variables obj = new variables();
        obj.showArea();
    }

}





