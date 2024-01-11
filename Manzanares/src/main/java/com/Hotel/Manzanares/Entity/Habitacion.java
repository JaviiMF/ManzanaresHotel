package com.Hotel.Manzanares.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "Habitacion")
@Getter
@Setter
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double m2;
    private Integer num;
    private Integer numcamas;
    private String gama;
    private Boolean mascotas;
    private Boolean activa;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return Objects.equals(id, that.id) && Objects.equals(m2, that.m2) && Objects.equals(numcamas, that.numcamas) && Objects.equals(gama, that.gama) && Objects.equals(mascotas, that.mascotas) && Objects.equals(activa, that.activa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, m2, numcamas, gama, mascotas, activa);
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", m2=" + m2 +
                ", numcamas=" + numcamas +
                ", gama='" + gama + '\'' +
                ", mascotas=" + mascotas +
                ", activa=" + activa +
                '}';
    }
}
