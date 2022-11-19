package oopBasics.callenges;

class Main {
    public static void main(String[] args) {
        //hitung Rectangle
        Rectangle rectangle = new Rectangle(12, 8);
        int result = rectangle.computeAreaRectangle();
        System.out.println("======Compute Rectangle====");
        System.out.println("Length : " + rectangle.length );
        System.out.println("Breadth : " + rectangle.breadth );
        System.out.println(result);

        //Hitung Triagle
        Triangle triangle = new Triangle(8, 3);
        double area = triangle.computeAreaTriangle();
        System.out.println("======Calculate Triangle====");
        System.out.println("Base : " + triangle.base);
        System.out.println("Height : " + triangle.height);
        System.out.println(area);


    }
}
