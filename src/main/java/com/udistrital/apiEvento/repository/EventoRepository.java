/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.apiEvento.repository;

import com.udistrital.apiEvento.entity.Evento;
import java.sql.Date;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer>{
    
    Optional<Evento> findByNombre(String nombre);
    Optional<Evento> findByFecha(Date fecha);
    boolean existsByNombre(String nombre);
}

