

public class task1 {

    public static void main(String[] args) {
        Measurable Circle = new Measurable() {
            @Override
            public double getS() {
                return 0;
            }

            @Override
            public double getP() {
                return 0;
            }
        };
        Measurable Triangle = new Measurable() {
            @Override
            public double getS() {
                return 0;
            }

            @Override
            public double getP() {
                return 0;
            }
        };
        double [] b = {Circle.getP(), Triangle.getP(), Circle.getS(), Triangle.getS()};
        System.out.println(Circle.getP() + Triangle.getP());
        System.out.println(Circle.getS()+Triangle.getS());



    }
    interface Measurable{
        double getS();
        double getP();
    }
    public class Circle implements Measurable{
        int d;
        int r;
        final double Pi= 3.14;
        public double getS() {
            return Pi * d;
        }
        public double getP() {
            return Pi*r*r;
        }
    }
    public class Triangle implements Measurable{
        int a;
        int b;
        int c;
        int alfa;
        int sin = (int) Math.sin(alfa);
        public double getS(){
            return 0.5 * a* b *sin ;
        }
        public double getP(){
            return a+b+c;
        }

    }
}
