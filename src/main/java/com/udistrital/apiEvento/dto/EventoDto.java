/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.apiEvento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author User
 */

@Getter
@Setter
@NoArgsConstructor
public class EventoDto {
    
 @NotNull
    private Integer id_plantacion_fk;

    @NotBlank
    private String nombre;
    
    private String descripcion;

    private Time hora_inicio;

    private Time hora_fin;

    private Date fecha;

    public EventoDto(@NotNull Integer id_plantacion_fk, @NotBlank String nombre, String descripcion, Time hora_inicio, Time hora_fin, Date fecha) {
        this.id_plantacion_fk = id_plantacion_fk;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.fecha = fecha;
    }

    
    
}


