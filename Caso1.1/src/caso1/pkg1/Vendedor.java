/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.pkg1;

/**
 *
 * @author Laboratorio
 */
public class Vendedor {
    private String nombreVendedor;
    private int codigoVendedor;
    private int puntos;

    public Vendedor(String nombreVendedor, int codigoVendedor, int puntos) {
        this.nombreVendedor = nombreVendedor;
        this.codigoVendedor = codigoVendedor;
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

   
    
    
    
}
