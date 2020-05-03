public class Main {
    public static void main(String[] args) {
        T1.Measurable1[] measure = new T1.Measurable1[2];
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        measure[0] = circle;
        measure[1] = triangle;
        double sumS= 0;
        double sumP= 0;
        for (T1.Measurable1 measurable1 : measure){
            sumP += measurable1.getP();
            sumS += measurable1.getS();
        }
        System.out.println("SumP: " + sumP);
        System.out.println("SumS: " + sumS);

    }
}
