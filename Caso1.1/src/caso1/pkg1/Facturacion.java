package caso1.pkg1;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;



    
public class Facturacion {
    private int codigoFactura;
    private int montoFactura;
    private int facturas;
    private int mes;
    private boolean electricos;
    private boolean construccion;
    private boolean automotriz;

    public Facturacion(int codigoFactura, int montoFactura, int facturas, int mes, boolean electricos, boolean construccion, boolean automotriz) {
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.facturas = facturas;
        this.mes = mes;
        this.electricos = electricos;
        this.construccion = construccion;
        this.automotriz = automotriz;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(int montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getFacturas() {
        return facturas;
    }

    public void setFacturas(int facturas) {
        this.facturas = facturas;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
                switch (mes) {
            case 1:
                JOptionPane.showConfirmDialog(null,"Mes enero");
                break;
            case 2:
                JOptionPane.showConfirmDialog(null,"Mes Febrero");
                break;
            case 3:
                JOptionPane.showConfirmDialog(null,"Mes Marzo");
                break;  
            case 4:
                JOptionPane.showConfirmDialog(null,"Mes Abril");
                break;
            case 5:
                JOptionPane.showConfirmDialog(null,"Mes Mayo");
                break;
            case 6:
                JOptionPane.showConfirmDialog(null,"Mes Junio");
                break;  
            case 7:
                JOptionPane.showConfirmDialog(null,"Mes Julio");
                break;
            case 8:
                JOptionPane.showConfirmDialog(null,"Mes Agosto");
                break;
            case 9:
                JOptionPane.showConfirmDialog(null,"Mes Septiembre");
                break;  
            case 10:
                JOptionPane.showConfirmDialog(null,"Mes Octubre");
                break;
            case 11:
                JOptionPane.showConfirmDialog(null,"Mes Noviembre");
                break;
            case 12:
                JOptionPane.showConfirmDialog(null,"Mes Diciembre");
                break;  
             default:
                throw new AssertionError();
        }
        this.mes = mes;
    }

    public boolean isElectricos() {
        return electricos;
    }

    @SuppressWarnings("DeadBranch")
    public int setElectricos(boolean electricos) {
        if (electricos = true) {
            int cantidad;
            cantidad = cantidad = Integer.decode(JOptionPane.showInputDialog("Ingrese la cantidad de productoas electricoas"));
            if (cantidad >= 3) {
                JOptionPane.showConfirmDialog(null, "Haz ganado un % de bono");
                return montoFactura / 4 * 100;
            } else {
                boolean dos = cantidad <= 2 && cantidad > 0;
                JOptionPane.showConfirmDialog(null, "Haz ganado un 2% de bono");
                int montoFactura = 0;
                return montoFactura / 2 * 100;
            }
    }
    public void setConstruccion(boolean construccion) {
        this.construccion = construccion;
    }

    public boolean isAutomotriz(boolean automotriz) {
        return automotriz;
    }

    public void setAutomotriz(boolean automotriz) {
    }

     
    
    
    
}
