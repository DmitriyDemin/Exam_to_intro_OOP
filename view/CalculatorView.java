package Exam_to_intro_OOP_ver_4.view;

import Exam_to_intro_OOP_ver_4.model.CalculatorInf;
import Exam_to_intro_OOP_ver_4.model.ComplexNumber;
import Exam_to_intro_OOP_ver_4.util.Operators;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CalculatorView {

        private final CalculatorInf calculator;
        private final List<String> validOperators;

        public CalculatorView(CalculatorInf calculator) {
            this.calculator = calculator;
            this.validOperators = Arrays.stream(Operators.values())
                    .map(Operators::operator)
                    .collect(Collectors.toList());
        }

        public void run() {
            while (true) {
                prepare();
                String action = prompt();
                if (!action.equalsIgnoreCase("y")) {
                    System.exit(0);
                }
            }
        }

    public ComplexNumber fillingNumber(int countArgument) {
        ComplexNumber a = new ComplexNumber(0, 0);
        System.out.printf("Введите %sй аргумент", countArgument);
        System.out.println();
        System.out.println("через пробел введите вещественную, а затем мнимую часть комплексного числа");
        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine();
        String[] scStrings = scString.split(" ");
        double[] scNumbers = new double[2];
        try {
            for (int i = 0; i < scStrings.length; i++) {
                scNumbers[i] = Double.valueOf(scStrings[i]);
            }
        } catch (NumberFormatException e) {
            System.err.println("Некорректно введено число. Пожалуйста, введите число");
            fillingNumber(countArgument);
        }
        a.setRealPart(scNumbers[0]);
        a.setImaginaryPart(scNumbers[1]);
        return a;
    }



        private void prepare() {
            ComplexNumber a = fillingNumber(1);
            String operator = getOperator();
            ComplexNumber b = fillingNumber(2);

            if (operator.equals("*")) {
                calculator.multiplicatio(a, b);
            }

            if (operator.equals("+")) {
                calculator.summation(a, b);
            }

            if (operator.equals("/")) {
                calculator.divid(a, b);
            }

            if (operator.equals("-")) {
                calculator.subtraction(a, b);
            }

            calculator.result();
//            calculator.clear();
        }

        private String prompt() {
            Scanner in = new Scanner(System.in);
            System.err.println("Continue?... (y/n)");
            return in.nextLine();
        }

        private String getOperator() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the math operation (*, +, /, -) : ");
            String operator = in.nextLine();
            while (true) {
                if (isInvalidOperator(operator)) {
                    System.err.println("Entered invalid math operator. " + "Enter the math operation (*, +, /, -) : ");
                    operator = in.nextLine();
                } else return operator;
            }
        }

        private boolean isInvalidOperator(String operator) {
            return !validOperators.contains(operator);
        }

        private int promptInt(String message) {
            Scanner in = new Scanner(System.in);
            System.out.print(message);
            int result = -1;
            try {
                result = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Некорректно введено число. Пожалуйста, введите число");
                promptInt(message);
            }
            return result;
        }

    }

