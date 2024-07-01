package Exam_to_intro_OOP_ver_4.model;


public class Calculator implements CalculatorInf<ComplexNumber> {

    private ComplexNumber result = new ComplexNumber(0.0,0.0);

    @Override
    public void summation(ComplexNumber a, ComplexNumber b) {
        result.setRealPart(a.getRealPart() + b.getRealPart());
        result.setImaginaryPart(a.getImaginaryPart() + b.getImaginaryPart());

    }

    @Override
    public void subtraction(ComplexNumber a, ComplexNumber b) {
        result.setRealPart(a.getRealPart() - b.getRealPart());
        result.setImaginaryPart(a.getImaginaryPart() - b.getImaginaryPart());

    }

    @Override
    public void multiplicatio(ComplexNumber a, ComplexNumber b) {
        result.setRealPart(a.getRealPart()*b.getRealPart() - a.getImaginaryPart()*b.getImaginaryPart());
        result.setImaginaryPart(a.getImaginaryPart()*b.getRealPart() + a.getRealPart()*b.getImaginaryPart());

    }

    @Override
    public void divid(ComplexNumber a, ComplexNumber b) {
        try {
            result.setRealPart((a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart()) /
                    (b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart()));
            result.setImaginaryPart((a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart()) /
                    (b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart()));

        } catch (ArithmeticException e){
            throw new ArithmeticException("Divide by zero exception");
        }

    }

    @Override
    public ComplexNumber result() {
        return result;
    }

    public ComplexNumber genulltResult() {
        return result;
    }

}
