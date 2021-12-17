/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Sleer2.SLeer2;

/**
 *
 * @author usuario
 */
public class Nomina {

    private int diaIn = 0;
    private int diaFin = 0;
    private int mesIn = 0;
    private int mesFin = 0;
    private int anyoIn = 0;
    private int anyoFin = 0;
    private int numDia = 0;
    private double salarioBase = 0;
    private double complemento = 0;
    private double horasE = 0;//%dedducir
    private double tDevengado = 0;
    private double cc = 0;
    private double desempleo = 0;
    private double fp = 0;
    private double horasEx = 0;
    private double tAport = 0;
    private double irpf = 0;
    private double tDeducir = 0;
    private double tPercibir = 0;
    private int diaFirma = 0;
    private int mesFirma = 0;
    private int anyoFirma = 0;

    public Nomina() {
    }

    public void pideFecIn(String dia, String mes, String anyo) {
        do {
            diaIn = SLeer2.datoInt(dia);
            if (diaIn < 1 && diaIn > 31) {
                System.out.println("Has introducido un día no valido.");
                diaIn = SLeer2.datoInt(dia);
            }
        } while (diaIn < 1 && diaIn > 31);
        do {
            mesIn = SLeer2.datoInt(mes);
            if (mesIn < 1 && mesIn > 12) {
                System.out.println("Has introducido un mes no valido.");
                mesIn = SLeer2.datoInt(mes);
            }
        } while (mesIn < 1 && mesIn > 12);
        do {
            anyoIn = SLeer2.datoInt(anyo);
            if (anyoIn < 2020 && anyoIn > 2100) {
                System.out.println("Has introducido un año no valido.");
                anyoIn = SLeer2.datoInt(anyo);
            }

        } while (anyoIn < 2020 && anyoIn > 2100);
    }

    public void pideFecFin(String dia, String mes, String anyo) {
        do {
            diaFin = SLeer2.datoInt(dia);
            if (diaFin < 1 && diaFin > 31) {
                System.out.println("Has introducido un día no valido.");
                diaFin = SLeer2.datoInt(dia);
            }
        } while (diaFin < 1 && diaFin > 31);
        do {
            mesFin = SLeer2.datoInt(mes);
            if (mesFin < 1 && mesFin > 12) {
                System.out.println("Has introducido un mes no valido.");
                mesFin = SLeer2.datoInt(mes);
            }
        } while (mesFin < 1 && mesFin > 12);
        do {
            anyoFin = SLeer2.datoInt(anyo);
            if (anyoFin < 2020 && anyoFin > 2100) {
                System.out.println("Has introducido un año no valido.");
                anyoFin = SLeer2.datoInt(anyo);
            }

        } while (anyoFin < 2020 && anyoFin > 2100);
    }

    public int calcDias() {
        numDia = 30;

        return numDia;
    }

    /*public int calcSalarioBase(String grupo){
        
        return salarioBase;
    }
     */
    public void pideComplemento(String mCant) {
        complemento = SLeer2.datoDouble(mCant);
        while (complemento < 0) {
            System.out.println("Has introducido un dato no valido.");
            complemento = SLeer2.datoDouble(mCant);
        }
    }

    public double getComplemento() {
        return complemento;
    }

    public void pideHorasEx(String mCant) {
        horasEx = SLeer2.datoDouble(mCant);
        while (horasEx < 0) {
            System.out.println("Has introducido un dato no valido.");
            horasEx = SLeer2.datoDouble(mCant);
        }
    }

    public double getHorasEx() {
        return horasEx;
    }

    public double calcTDevengado() {
        tDevengado = salarioBase + complemento + horasEx;
        return tDevengado;
    }

    public double calcCC() {
        cc = salarioBase * 4.70 / 100;
        return cc;
    }

    public double calcDesempleo() {
        desempleo = salarioBase * 1.70 / 100;
        return desempleo;
    }

    public double calcFP() {
        fp = salarioBase * 0.10 / 100;
        return fp;
    }

    public double calcHE() {
        horasE = horasEx * 23.60 / 100;
        return horasE;
    }

    public double calcTAport() {
        tAport = horasE + desempleo + fp + cc;
        return tAport;
    }

    public double calcIRPF() {
        return irpf;
    }

    public double calcTDeducir() {
        tDeducir = irpf + tAport;
        return tDeducir;
    }

    public double calcTPercibir() {
        tPercibir = tDevengado - tDeducir;
        return tPercibir;
    }

    public void pideFechaFirma(String dia, String mes, String anyo) {
        do {
            diaFirma = SLeer2.datoInt(dia);
            if (diaFirma < 1 && diaFirma > 31) {
                System.out.println("Has introducido un día no valido.");
                diaFirma = SLeer2.datoInt(dia);
            }
        } while (diaFirma < 1 && diaFirma > 31);
        do {
            mesFirma = SLeer2.datoInt(mes);
            if (mesFirma < 1 && mesFirma > 12) {
                System.out.println("Has introducido un mes no valido.");
                mesFirma = SLeer2.datoInt(mes);
            }
        } while (mesFirma < 1 && mesFirma > 12);
        do {
            anyoFirma = SLeer2.datoInt(anyo);
            if (anyoFirma < 2020 && anyoFirma > 2100) {
                System.out.println("Has introducido un año no valido.");
                anyoFirma = SLeer2.datoInt(anyo);
            }

        } while (anyoFirma < 2020 && anyoFirma > 2100);
    }
}
