

public class Main {

        //return variable declaration
        static String Operation = "";

        // function created to solve coding challenge
        static String mathFunction(int number1, int number2, int number3){
            if (number1 + number2 == number3) {
                Operation += "+";

                if(number1 * number2 == number3){
                    Operation += "*";
                }
            }else if (number1 - number2 == number3) {
                Operation += "-";

                if (number1 / number2 == number3){
                    Operation += "/";
                }

            }else if (number1 / number2 == number3) {
                Operation += "/";

            }else if (number1 * number2 == number3) {
                Operation += "*";

            }else {
                Operation = "none";
            }
            return Operation;
        }

        public static void main(String[] args) {
            //implementation of the function.
            System.out.println(mathFunction(3,3,9));
        }

}