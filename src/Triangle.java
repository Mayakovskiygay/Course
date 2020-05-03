public class Triangle implements T1.Measurable1 {
    private double side1;
    private double side2;
    private double side3;
    private int alfa;
    int sin = (int) Math.sin(alfa);
    @Override
    public double getP() {
        return side1+side2+side3;
    }

    @Override
    public double getS() {
        return 1/2*side1*side2*sin;
    }
}
