/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio;

/**
 *
 * @author Aulas Heredia
 */
public class Datos {
    public String Nombrecliente;
    private int Cedulacliente;
    private int Codigofactura;
    public double montofactura;
    public int Mesfactura;
    public int anniofactura;
    public int Estadofactura;

    public Datos(String Nombrecliente, int Cedulacliente, int Codigofactura, double montofactura, int Mesfactura, int anniofactura, int Estadofactura) {
        this.Nombrecliente = Nombrecliente;
        this.Cedulacliente = Cedulacliente;
        this.Codigofactura = Codigofactura;
        this.montofactura = montofactura;
        this.Mesfactura = Mesfactura;
        this.anniofactura = anniofactura;
        this.Estadofactura = Estadofactura;
    }

    public void setNombrecliente(String Nombrecliente) {
        this.Nombrecliente = Nombrecliente;
    }

    public void setCedulacliente(int Cedulacliente) {
        this.Cedulacliente = Cedulacliente;
    }

    public void setCodigofactura(int Codigofactura) {
        this.Codigofactura = Codigofactura;
    }

    public void setMontofactura(double montofactura) {
        this.montofactura = montofactura;
    }

    public void setMesfactura(int Mesfactura) {
        this.Mesfactura = Mesfactura;
    }

    public void setAnniofactura(int anniofactura) {
        this.anniofactura = anniofactura;
    }

    public void setEstadofactura(int Estadofactura) {
        this.Estadofactura = Estadofactura;
    }

    public String getNombrecliente() {
        return Nombrecliente;
    }

    public int getCedulacliente() {
        return Cedulacliente;
    }

    public int getCodigofactura() {
        return Codigofactura;
    }

    public double getMontofactura() {
        return montofactura;
    }

    public int getMesfactura() {
        return Mesfactura;
    }

    public int getAnniofactura() {
        return anniofactura;
    }

    public int getEstadofactura() {
        return Estadofactura;
    }
    }
