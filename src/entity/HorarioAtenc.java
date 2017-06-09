/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author amlazo
 */
public class HorarioAtenc {
    int idHorario;
    String diaSem;
    Date horaInicio;
    Date horaFin;
    int idSucursal;

    public HorarioAtenc() {
    }

    public HorarioAtenc(int idHorario, String diaSem, Date horaInicio, Date horaFin, int idSucursal) {
        this.idHorario = idHorario;
        this.diaSem = diaSem;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.idSucursal = idSucursal;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getDiaSem() {
        return diaSem;
    }

    public void setDiaSem(String diaSem) {
        this.diaSem = diaSem;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    
}
