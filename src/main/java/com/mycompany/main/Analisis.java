package com.mycompany.main;


import java.util.List;


public class Analisis {
    private List<Amigo> amigos;
    private List<Movimiento> movimientos;

    public Analisis(List<Amigo> amigos, List<Movimiento> movimientos) {
        this.amigos = amigos;
        this.movimientos = movimientos;
    }

    public void agregarMovimiento(Movimiento movimiento) {
        movimientos.add(movimiento);
    }

    public String calcularDeuda(Amigo amigoPago, Amigo amigoDeudor) {

        double deuda = 0;

        for(Movimiento m : movimientos) {
            if(m.getQuienPago().equals(amigoDeudor) && m.getParticipantes().contains(amigoPago)) {
                deuda -= m.getMonto() / m.getParticipantes().size();
            }else if (m.getQuienPago().equals(amigoPago) && m.getParticipantes().contains(amigoDeudor)) {
                deuda += m.getMonto() / m.getParticipantes().size();
            }
        }

        return amigoDeudor + " le debe a " + amigoPago + " un total de " + deuda + " Dolares";
    }


}
