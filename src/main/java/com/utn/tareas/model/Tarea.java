package com.utn.tareas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString

public class Tarea {
    private Long id;
    private String descripcion;
    private boolean completada;
    private Prioridad prioridad;

    public Tarea(Long id, String descripcion, boolean completada, Prioridad prioridad){
        this.id = id;
        this.descripcion = Objects.requireNonNull(descripcion, "El descripcion no puede ser nulo.");
        this.completada = completada;
        this.prioridad = prioridad;
    }

}
