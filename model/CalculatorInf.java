package Exam_to_intro_OOP_ver_4.model;

public interface CalculatorInf<T extends Numbers>{

    public void summation (T a, T b);
    public void subtraction (T a, T b);
    public void multiplicatio (T a, T b);
    public void divid (T a, T b);
    public T result();



}
