package pe.joedayz.samples.InnerClass;

public class PrintNumbers {

    private int length = 5;

    public void calculate() {

        final int width = 20;

        class Calculator {

            public void multiply(){
                System.out.println(length * width);
            }
        }

        var calculator = new Calculator();
        calculator.multiply();
    }

    public void processData(){

        final int length = 5;
        int width = 10;
        int height = 2;

        class VolumeCalculator {

            public int multiply() {
//                return length * width * height; //NO COMPILA PORQUE width ES EFECTIVAMENTE FINAL
                return 0;
            }
        }

        width = 2; //EFECTIVAMENTE FINAL

        var calculator = new VolumeCalculator();
        System.out.println(calculator.multiply() + width);
    }

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate(); //100
        printer.processData(); //100
    }
}
