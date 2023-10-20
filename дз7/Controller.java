import java.util.Scanner;

public class Controller {
    Calculator calc  = new Calculator();
    public Controller(){};

    public void start(){
        System.out.println("Калькулятор комплексных чисел! ");
        System.out.println("Введите значения вещественной и мнимой части первого числа: ");
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        System.out.println("Введите значения вещественной и мнимой части второго числа: ");
        float c = scan.nextFloat();
        float d = scan.nextFloat();
        System.out.println("Введены числа : " + a + "+"+b+"i, " + c + "+"+d+"i, ");

        ComplexNumb numb1 = new ComplexNumb(a, b);
        ComplexNumb numb2 = new ComplexNumb(c, d);
        ComplexNumb result;
        System.out.println("Выберете операцию: 1 - сложение, 2 - умножение, 3 - деление");
        int q = scan.nextInt();

        scan.close();
        switch (q) {
            case 1:result = calc.addition(numb1, numb2);
            System.out.println("результат сложения:"+result.getRealPart()+"+"+result.getImaginaryPart()+"i");
            break;
            case 2:result = calc.multiplication(numb1, numb2);
            System.out.println("результат умножения:"+result.getRealPart()+"+"+result.getImaginaryPart()+"i");

            break;
            case 3:result = calc.division(numb1, numb2);
            System.out.println("результат деления:"+result.getRealPart()+"+"+result.getImaginaryPart()+"i");

            break;
            default:System.out.println("неправильный ввод");
            break;

        } 


    }


}
