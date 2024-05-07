/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.apiEvento.service;

import com.udistrital.apiEvento.entity.Evento;
import com.udistrital.apiEvento.repository.EventoRepository;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@Service
@Transactional
public class EventoService {

    @Autowired
    EventoRepository eventoRepository;

    public Optional<Evento> getByNombreEvento(String nombreEvento) {

        return eventoRepository.findByNombre(nombreEvento);
    }

    public Optional<Evento> getByFecha(Date fecha) {
        return eventoRepository.findByFecha(fecha);
    }
public Optional<Evento> getOne(int id){
return eventoRepository.findById(id);
}
    public Optional<Evento> getById(int id) {

        return eventoRepository.findById(id);
    }
    public  boolean existsById(int id){
    return eventoRepository.existsById(id);
    }
    public boolean existsByNombre(String nombre) {
        return eventoRepository.existsByNombre(nombre);
    }

    public void save(Evento evento) {
        eventoRepository.save(evento);
    }
    
    public List<Evento> list() {
        return eventoRepository.findAll();
    }

}
