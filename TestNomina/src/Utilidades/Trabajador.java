/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Sleer1.SLeer1;

/**
 *
 * @author laura
 */
public class Trabajador {
    private String nombre;
    private String nif;
    private String nus;
    private String grupoProf;
    private String grupoCot;
    
    public Trabajador(String nom, String nifT, String nusT, String gProf, String gCot){
        nombre = nom;
        nif = nifT;
        nus = nusT;
        grupoProf = gProf;
        grupoCot = gCot;
    }
    public Trabajador(){
        nombre = "";
        nif = "";
        nus = "";
        grupoProf = "";
        grupoCot = "";
    }
    
    public String getNom(){
        return nombre;
    }
    public String getNIF(){
        return nif;
    }
    public String getNUS(){
        return nus;
    }
    public String getGProf(){
        return grupoProf;
    }
    public String getGCot(){
        return grupoCot;
    }
    public void setNom(String mNom){
        nombre = SLeer1.datoString(mNom);
    }
    public void setNIF(String mNIF){
        nif = SLeer1.datoString(mNIF);
    }
    public void setNUS(String mNUS){
        nus = SLeer1.datoString(mNUS);
    }
    public void setGProf(String mGProf){
        grupoProf = SLeer1.datoString(mGProf);
    }
    public void setGCot(String mGCot){
        grupoCot = SLeer1.datoString(mGCot);
    }
}
