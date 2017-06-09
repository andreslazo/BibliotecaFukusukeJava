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
public class Clientes {
    int idCliente;
    String rut;
    String dv;
    String nombre;
    String apPat;
    String apMat;
    String calle;
    String numero;
    String dpto;
    String block;
    String telefono;
    String celular;
    String mail;
    String idComuna;
    String usuario;
    String idGenero;
    
    public Clientes() {
    }

    public Clientes(int idCliente, String rut, String dv, String nombre, String apPat, String apMat, String calle, String numero, String dpto, String block, String telefono, String celular, String mail, String idComuna, String usuario, String idGenero) {
        this.idCliente = idCliente;
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.calle = calle;
        this.numero = numero;
        this.dpto = dpto;
        this.block = block;
        this.telefono = telefono;
        this.celular = celular;
        this.mail = mail;
        this.idComuna = idComuna;
        this.usuario = usuario;
        this.idGenero = idGenero;
    }

    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(String idComuna) {
        this.idComuna = idComuna;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(String idGenero) {
        this.idGenero = idGenero;
    }
    
}
