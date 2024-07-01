package Exam_to_intro_OOP_ver_4.model;

public class ComplexNumber extends Numbers {

    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString(){
        if (imaginaryPart<0){
            return String.format("%s - %si", realPart,Math.abs(imaginaryPart));
        }
        else
            return String.format("%s + %si", realPart,Math.abs(imaginaryPart));
    }


}
