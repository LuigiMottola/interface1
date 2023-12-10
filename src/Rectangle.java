public class Rectangle implements Form {
    private double base = 10;
    private double height = 6;
    private double area = base * height;

    @Override
    public void areaCalculator() {
        System.out.println("Rectangle area is: " + area);
    }
}
