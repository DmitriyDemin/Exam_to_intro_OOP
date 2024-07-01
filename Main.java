package Exam_to_intro_OOP_ver_4;

import Exam_to_intro_OOP_ver_4.controller.LoggedCalculator;
import Exam_to_intro_OOP_ver_4.model.Calculator;
import Exam_to_intro_OOP_ver_4.util.ConsoleLogger;
import Exam_to_intro_OOP_ver_4.view.CalculatorView;


public class Main {
    public static void main(String[] args) {

        CalculatorView view = new CalculatorView(new LoggedCalculator(new Calculator(), new ConsoleLogger()));
        view.run();

    }
}
