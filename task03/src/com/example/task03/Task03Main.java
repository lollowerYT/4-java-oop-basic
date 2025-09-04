package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 4);
        ComplexNumber num2 = new ComplexNumber(10, 6);
        ComplexNumber sum = num1.add(num2);
        ComplexNumber mul = num1.multiply(num2);
        System.out.println(sum);
        System.out.println(mul);
    }
}

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}
