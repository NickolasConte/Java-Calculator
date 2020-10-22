/*
A standard single operation calculator
*/

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        StringBuilder line = new StringBuilder();
        String operator = new String();
        BigDecimal x = BigDecimal.valueOf(0);
        BigDecimal y = BigDecimal.valueOf(0);

        System.out.println("Welcome to Math World");
        int i = 0;
        while (i < 4){



            if (i == 0){
                System.out.println(x);
                x = new BigDecimal(input.nextLine());
                line.append(x + " ");
                i = 1;
            }
            else if(i == 1){
                System.out.println(line);
                System.out.println("Operation:  +   -   *   /");
                operator = input.nextLine();


                line.append(operator + " ");
                i = 2;
            }

            else if(i == 2){

                System.out.println("Number:");
                String numOrOp = input.nextLine();

                if (numOrOp.equals("+") || numOrOp.equals("-") || numOrOp.equals("*") || numOrOp.equals("/"))
                {
                    operator = numOrOp;
                    line.replace(line.length()-2, line.length(), operator + " ");
                    System.out.println(line);
                }
                else{
                    y =  new BigDecimal(numOrOp);
                    line.append(y + " ");
                    System.out.println(line);
                    i = 3;
                }

            }

            else if (i == 3){
                BigDecimal solution = BigDecimal.valueOf(0);
                switch (operator){
                    case "+":
                        solution = x.add(y);
                        break;
                    case "-":
                        solution = x.subtract(y);
                        break;
                    case "*":
                        solution = x.multiply(y);
                        break;
                    case "/":
                        solution = x.divide(y);
                        break;
                }
                line.append("= " + solution);
                System.out.println(line);
                line.replace(0, line.length(), solution.toString() + " ");
                x = solution;
                i = 1;
            }

            }


        }





}
