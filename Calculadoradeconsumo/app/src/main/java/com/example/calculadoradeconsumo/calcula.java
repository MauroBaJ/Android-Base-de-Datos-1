package com.example.calculadoradeconsumo;

public class calcula{
    double consumoB = 0.612;
    double consumoIB = 0.772;
    double consumoIA = 1.006;
    double consumoExcedente = 2.969;

    public double t1(double v1, double v2){
        double consumo = v2 - v1;

        if (consumo <= 25) return 49.5;
        else if (consumo > 25 && consumo <= 75) return consumo * 0.793;
        else if (consumo <= 140 && consumo > 75) return consumo * 0.956;
        else return consumo * 2.802;
    }
    public double t1A(double v1, double v2){
        double consumo = v2 - v1;

        if (consumo <= 25) return 49.5;
        else if ( consumo > 25 && consumo <= 100) return consumo * consumoB;
        else if (consumo <= 150 && consumo > 100) return consumo * consumoIA;
        else return consumo * consumoExcedente;
    }
    public double t1B(double v1, double v2){
        double consumo = v2 - v1;

        if (consumo <= 25) return 49.5;
        else if ( consumo > 25 && consumo <= 125) return consumo *consumoB;
        else if (consumo <= 225 && consumo > 125) return consumo * consumoIA;
        else return consumo * consumoExcedente;
    }
    public double t1C(double v1, double v2){
        double consumo = v2 - v1;

        if (consumo <= 25) return 49.5;
        else if ( consumo > 25 && consumo <= 150) return consumo *consumoB;
        else if (consumo <= 300 && consumo > 150) return consumo * consumoIB;
        else if (consumo > 300 && consumo <= 450) return consumo * consumoIA;
        else return consumo * consumoExcedente;
    }
    public double t1D(double v1, double v2){
        double consumo = v2 - v1;

        if (consumo <= 25) return 49.5;
        else if ( consumo > 25 && consumo <= 175) return consumo *consumoB;
        else if (consumo <= 400 && consumo > 175) return consumo * consumoIB;
        else if (consumo > 400 && consumo <= 625) return consumo * consumoIA;
        else return consumo * consumoExcedente;
    }
    public double t1E(double v1, double v2){
        double consumo = v2 - v1;

        if (consumo <= 25) return 49.5;
        else if ( consumo > 25 && consumo <= 300) return consumo *consumoB;
        else if (consumo <= 750 && consumo > 300) return consumo * consumoIB;
        else if (consumo > 750 && consumo <= 1100) return consumo * consumoIA;
        else return consumo * consumoExcedente;
    }
    public double t1F(double v1, double v2){
        double consumo = v2 - v1;

        if (consumo <= 25) return 49.5;
        else if ( consumo > 25 && consumo <= 300) return consumo *consumoB;
        else if (consumo <= 1200 && consumo > 300) return consumo * consumoIB;
        else if (consumo > 1200 && consumo <= 2400) return consumo * consumoIA;
        else return consumo * consumoExcedente;
    }
    public double DAC(double v1, double v2){
        double consumo = v2 - v1;

        return consumo * 4.365;
    }

}
