import java.util.Scanner;

class Calculator{
    private int number1;
    private int number2;

    public Calculator(){}

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int Add () throws ArithmeticException{

        if(number1 < 0  number2 < 0){
            throw(new ArithmeticException("Number can not be less than zero"));
        }else
        return number1 + number2;

    }
    public int Subtract() throws ArithmeticException{
        if(number1 < 0  number2 < 0){
            throw(new ArithmeticException("Number can not be less than zero"));
        }else
        return number1 - number2;
    }

    public int Multiplication () throws ArithmeticException{
        if(number1 == 0  number2 == 0){
            throw(new ArithmeticException("Number can not be equal to zero"));
        }else
        return number1 * number2;
    }

    public int Division() throws ArithmeticException{
        if(number1 == 0  number2 == 0){
            throw(new ArithmeticException("Number can not be equal to zero"));
        }else
        return number1 / number2;
    }
}
