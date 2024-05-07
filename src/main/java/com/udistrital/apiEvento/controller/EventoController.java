/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.apiEvento.controller;

import com.udistrital.apiEvento.dto.EventoDto;
import com.udistrital.apiEvento.dto.Mensaje;
import com.udistrital.apiEvento.entity.Evento;
import com.udistrital.apiEvento.service.EventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping("/events")
@CrossOrigin(origins = "*")
public class EventoController {

    @Autowired
    EventoService eventoService;

    @GetMapping("")
    public ResponseEntity<List<Evento>> findAll() {
        List<Evento> list = eventoService.list();
        return new ResponseEntity<List<Evento>>(list, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") int id){
    if(!eventoService.existsById(id)){
        return new ResponseEntity<>(new Mensaje("El evento no existe"), HttpStatus.NOT_FOUND);
    }
  
    Evento evento = eventoService.getOne(id).get();
    return new ResponseEntity<Evento>(evento, HttpStatus.OK);
    }
    
    @PostMapping("/save")
    public ResponseEntity<Mensaje> create (@RequestBody EventoDto eventoDto){
        if(eventoService.existsByNombre(eventoDto.getNombre())){
        return new ResponseEntity<Mensaje>(new Mensaje("el nombre: "+eventoDto.getNombre()+" ya esta registrado"), HttpStatus.BAD_REQUEST);
        }
        
        Evento evento = new Evento(1, eventoDto.getNombre(), eventoDto.getDescripcion(), eventoDto.getHora_inicio(),eventoDto.getHora_fin(),eventoDto.getFecha());
        eventoService.save(evento);
        return new ResponseEntity<Mensaje>(new Mensaje("El evento creado con exito"), HttpStatus.CREATED);
    }
    
    
    
    

}
