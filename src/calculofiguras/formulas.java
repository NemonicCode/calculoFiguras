/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofiguras;

/**
 *
 * @author Oficina
 */
public class formulas {

    private int base, altura, radio, lado;
    private double area;
    private double pi;

    public formulas() {

        area = 0;
        base = 0;
        altura = 0;
        radio = 0;
        lado = 0;
        pi = Math.PI;

    }

    public void formulaCuadrado(int lado) {

        area = lado * lado;
    }

    public void formulaTrianRectangulo(int alto, int base) {

        area = base * alto / 2;

    }

    public void formulaTrianEquilatero(double alto, double base) {

        area = ((base)*( Math.sqrt(Math.pow(altura, 2)-(Math.pow(base, 2) / 4))) / 2);

    }

    public void formulaTrianIsosceles(int alto, int base) {

        area = (base * altura) / 2;

    }

    //set
    public void setArea(int area) {
        this.area = area;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    //get
    public double getArea() {
        return area;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getRadio() {
        return radio;
    }

    public int getLado() {
        return lado;
    }

    public double getPi() {
        return pi;
    }

}
