package com.mycompany.main;


import java.util.List;


public class Movimiento {
    private String descripcion;
    private List<Amigo> participantes;
    private Amigo quienPago;
    private double monto;
    private String moneda;

    public Movimiento(){}
    public Movimiento(String descripcion, List<Amigo> participantes, Amigo quienPago, double monto, String moneda) {
        this.descripcion = descripcion;
        this.participantes = participantes;
        this.quienPago = quienPago;
        this.monto = monto;
        this.moneda = moneda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Amigo> getParticipantes() {
        return participantes;
    }

    public void setParticipants(List<Amigo> participants) {
        this.participantes = participants;
    }

    public Amigo getQuienPago() {
        return quienPago;
    }

    public void setQuienPago(Amigo quienPago) {
        this.quienPago = quienPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}
