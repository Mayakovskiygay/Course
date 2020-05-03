public class Circle implements T1.Measurable1 {
    private double r;
    final double Pi =3.14;
    @Override
    public double getP() {
        return Pi*2*r;
    }

    @Override
    public double getS() {
        return Pi*r*r;
    }
}
