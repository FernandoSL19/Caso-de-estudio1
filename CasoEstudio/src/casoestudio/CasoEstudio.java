/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class CasoEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombrecliente = JOptionPane.showInputDialog("Cuál es el nombre del cliente" );
        int Cedulacliente = Integer.parseInt(JOptionPane.showInputDialog("cual es la cedula del cliente?"));
        int Codigofactura = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de factura"));
        double montofactura = Double.parseDouble(JOptionPane.showInputDialog("Cual es el monto de la factura?"));
        int Mesfactura = Integer.parseInt(JOptionPane.showInputDialog("Mes de la factura:"));
        int anniofactura = Integer.parseInt(JOptionPane.showInputDialog("Annio de la factura:"));
        int Estadofactura = Integer.parseInt(JOptionPane.showInputDialog("Digite estado de la factura"));
       
         
        
        Datos datos = new Datos(Nombrecliente, Cedulacliente, Codigofactura, montofactura, Mesfactura, anniofactura, Estadofactura);
        int Cantfacturas;
        for (int i = 1; i<= i ;i++){
            System.out.println(datos.getCodigofactura());
        if (Estadofactura ==1);
        System.out.println("Factura pagada");
        if (Estadofactura ==2);
        System.out.println("Factura no pagada");
        
        double Totaldebecliente;
        Totaldebecliente = i*montofactura;
        
        double Totalfraccionado;
        Totalfraccionado = ((Totaldebecliente*0.15)+Totaldebecliente)/4;
        
            System.out.println("Cuota 1)" +Totalfraccionado);
            System.out.println("Cuota 2)" +Totalfraccionado);
            System.out.println("Cuota 3)" +Totalfraccionado);
            System.out.println("Cuota 3)" +Totalfraccionado);
    }
        
  
        
        
        }
    }
    