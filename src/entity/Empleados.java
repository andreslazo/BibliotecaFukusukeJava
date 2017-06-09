/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author amlazo
 */
public class Empleados {
    int idEmpleado;
    String rut;
    String dv;
    String nombre;
    String apPat;
    String apMat;
    String celular;
    String mail;
    String activo;
    int comuna;
    int idCargo;

    public Empleados() {
    }

    public Empleados(int idEmpleado, String rut, String dv, String nombre, String apPat, String apMat, String celular, String mail, String activo, int comuna, int idCargo) {
        this.idEmpleado = idEmpleado;
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.celular = celular;
        this.mail = mail;
        this.activo = activo;
        this.comuna = comuna;
        this.idCargo = idCargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    
    
}
