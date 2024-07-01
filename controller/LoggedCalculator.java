package Exam_to_intro_OOP_ver_4.controller;

import Exam_to_intro_OOP_ver_4.model.Calculator;
import Exam_to_intro_OOP_ver_4.model.CalculatorInf;
import Exam_to_intro_OOP_ver_4.model.ComplexNumber;
import Exam_to_intro_OOP_ver_4.util.Loggable;


public class LoggedCalculator implements CalculatorInf<ComplexNumber> {

    private final Calculator calculator;
    private final Loggable logger;


    public LoggedCalculator(Calculator calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }


    @Override
    public void summation(ComplexNumber a, ComplexNumber b) {
        logger.log(String.format("Sum up %s and %s", a, b));
        calculator.summation(a,b);
    }

    @Override
    public void subtraction(ComplexNumber a, ComplexNumber b) {
        logger.log(String.format("Subtract  %s from %s", a, b));
        calculator.subtraction(a,b);
    }

    @Override
    public void multiplicatio(ComplexNumber a, ComplexNumber b) {
        logger.log(String.format("Multiply %s and %s", a, b));
        calculator.multiplicatio(a,b);
    }

    @Override
    public void divid(ComplexNumber a, ComplexNumber b) {
        logger.log(String.format("Divide %s and %s", a, b));
        calculator.divid(a,b);
        System.out.println(calculator.result());

    }

    @Override
    public ComplexNumber result() {
        ComplexNumber result = calculator.result();
        logger.log(String.format("result %s", result));
        return calculator.result();
    }


}
