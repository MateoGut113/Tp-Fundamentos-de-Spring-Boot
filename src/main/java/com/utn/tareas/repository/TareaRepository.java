package com.utn.tareas.repository;

import com.utn.tareas.model.Prioridad;
import com.utn.tareas.model.Tarea;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TareaRepository {
    private final List<Tarea> tareas = new ArrayList<>();
    private final AtomicLong contadorId = new AtomicLong(1);

    public TareaRepository(){
        Tarea tarea1 = new Tarea(contadorId.getAndIncrement(),"Tarea ejemplo 1", true, Prioridad.BAJA);
        Tarea tarea2 = new Tarea(contadorId.getAndIncrement(),"Tarea ejemplo 2", false, Prioridad.ALTA);
        Tarea tarea3 = new Tarea(contadorId.getAndIncrement(),"Tarea ejemplo 3", true, Prioridad.MEDIA);
        Tarea tarea4 = new Tarea(contadorId.getAndIncrement(),"Tarea ejemplo 4", false, Prioridad.BAJA);
        Tarea tarea5 = new Tarea(contadorId.getAndIncrement(),"Tarea ejemplo 5", true, Prioridad.MEDIA);
        tareas.add(tarea1);
        tareas.add(tarea2);
        tareas.add(tarea3);
        tareas.add(tarea4);
        tareas.add(tarea5);
    }

    public Tarea guardar(String descripcion, boolean completada, Prioridad prioridad) {
        Tarea nueva = new Tarea(contadorId.getAndIncrement(), descripcion, completada, prioridad);
        tareas.add(nueva);
        return nueva;
    }

    public List<Tarea> todasLasTareas() {
        return tareas;
    }

    public Optional<Tarea> buscarTareaPorId(Long id) {
        return tareas.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst();
    }

    public boolean eliminarTareaPorId(Long id) {
        return tareas.removeIf(t -> t.getId().equals(id));
    }
}
