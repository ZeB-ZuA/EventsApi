
package com.udistrital.apiEvento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;






@Entity
@Table(name = "evento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Evento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_plantacion_fk;
    private String nombre;
    private String descripcion;
    private Time hora_inicio;
    private Time hora_fin;
    private Date fecha;

    public Evento(int id_plantacion_fk, String nombre, String descripcion, Time hora_inicio, Time hora_fin, Date fecha) {
        this.id_plantacion_fk = id_plantacion_fk;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.fecha = fecha;
    }
    
}
