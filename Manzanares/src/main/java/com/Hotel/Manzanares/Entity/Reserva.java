package com.Hotel.Manzanares.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Reserva")
@Getter
@Setter
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dniCliente;

    private Long idHabitacion;

    private Date fechaAlta;

    private Date fechaCheckin;

    private Date fechaCheckout;

    private Long idDescuento;

    private String listaServicios;

    private String listaExtras;

    private Double precioTotal;

}
