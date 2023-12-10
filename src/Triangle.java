public class Triangle implements Form {
    private double base = 6;
    private double height = 4;
    private double area = (base * height) / 2;

    @Override
    public void areaCalculator() {
        System.out.println("Triangle area is: " + area);
    }
}
