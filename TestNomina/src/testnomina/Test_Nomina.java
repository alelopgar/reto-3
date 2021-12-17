/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testnomina;
import Sleer2.SLeer2;
import Sleer1.SLeer1;
import Utilidades.Empresa;
import Utilidades.Nomina;
import Utilidades.Trabajador;
/**
 *
 * @author usuario
 */
public class Test_Nomina {
     public static double Redondear( double num, int decimales) { 
         return Math.round(num* Math.pow(10, decimales))/Math.pow(10, decimales);} 
    
    public static void main(String[] args) {
        Nomina n1;
        Trabajador t1;
        Empresa e1;
        n1 = new Nomina();
        t1 = new Trabajador();
        e1 = new Empresa();
        
        System.out.println("\t*****NÓMINA******");
        
        t1.setNom("Introduce tu nombre: ");
        t1.setNIF("Introduce tu NIF: ");
        t1.setNUS("Intoduce tu NUS: ");
        t1.setGCot("Introduce tu Grupo de Cotización: ");
        e1.setNom("Introduce el nombre de la empresa: ");
        e1.setCIF("Introduce el CIF de la empresa: ");
        e1.setDom("Introduce el domicilio: ");
        e1.setCCC("Introduce el CCC: ");
        n1.pideFecIn();
        n1.pideFecFin();
        
        t1.getGCot();
        n1.calcSalarioBase(t1.getGCot());
        n1.pideComplemento();
        n1.getComplemento();
        
        System.out.println("Has introducido el complementos de horas extra.");
        n1.pideHorasEx("Introduce las horas extra: ");
        n1.calcTDevengado();
        n1.calcCC();
        n1.calcDesempleo();
        n1.calcFP();
        n1.calcHE();
        n1.calcTAport();
        n1.calcIRPF();
        n1.calcTDeducir();
        n1.calcTPercibir();
        n1.pideFechaFirma();
        n1.getFecFirma();
        
        
        System.out.println(" \t- Datos de la nomimna: ");
        System.out.println("\n\t*****Nombre : "+t1.getNom());
        System.out.println("\t*****NIF : "+t1.getNIF());
        System.out.println("\t*****NUS: "+t1.getNUS());
        System.out.println("\t*****Grupo de Cotización: "+t1.getGCot());
        System.out.println("\t\n***Datos de la empresa****");
        System.out.println("**Nombre de la empresa: "+e1.getNom());
        
        System.out.println("La fecha de inicio es: "+n1.getdiaIn()+"/"+n1.getMesIn()+"/"+n1.getAñoIn());
        System.out.println("La fecha de finalización es: "+n1.getDiaFin()+"/"+n1.getMesFin()+"/"+n1.getAñoFin());
        System.out.println("\n\tRemuneración de horas extra: "+n1.getHorasEx());
        System.out.println("\n\tDías trabajados: "+n1.calcDias());
        System.out.println("\n\tIRPF Descontado: "+n1.calcIRPF());
        System.out.println("\t\nTotal devengado: "+n1.getDevengado());
        System.out.println("\t\nBases de contingencias comunes: "+n1.CalcBCCC());
  
       
       
        
        
        
       
      
        
        
        
    }
    
       
        
        
       
    }
