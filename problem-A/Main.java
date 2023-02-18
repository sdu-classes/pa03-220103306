class Main{
public static void main(String[] args){
try{
            String num1 = scan.next();
            String num2 = scan.next();
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            Calculator myCalc = new Calculator(a,b);
            System.out.println(myCalc.Add());
            System.out.println(myCalc.Subtract());
            System.out.println(myCalc.Multiplication());
            System.out.println(myCalc.Division());
        }catch (NumberFormatException e){
            System.out.println("Number is not int");
        }
        }
 }
