/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Cliente {
        public String nombre;
    public String apellidos;
    public int cedula;

    public Cliente(String nombre, String apellidos, int cedula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }


    public int getCedula() {
        return cedula;
    }
     /*ingresar nombre*/
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    /*ingresar nombre*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getApellidos() {
        return apellidos;
    }
     /*ingresar apellido*/

    public void setApellidos(String apellidos) {
        JOptionPane.showInputDialog(this);
        this.apellidos = apellidos;
    }

    public void llenarDatos(){
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setCedula(cedula);
        
    }
        
 }
    