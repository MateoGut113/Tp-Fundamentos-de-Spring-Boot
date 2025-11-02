package com.utn.tareas.service;

import com.utn.tareas.model.Prioridad;
import com.utn.tareas.model.Tarea;
import com.utn.tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {
    private final TareaRepository tareaRepository;

    @Value("${app.nombre}")
    private String appNombre;

    @Value("${app.max-tareas}")
    private int maxTareas;

    @Value("${app.mostrar-estadisticas}")
    private boolean mostrarEstadisticas;

    public TareaService(TareaRepository tareaRepository){
        this.tareaRepository = tareaRepository;
    }

    public Tarea agregarTarea(String descripcion, Prioridad prioridad){
        if(tareaRepository.todasLasTareas().size() < maxTareas){
            return tareaRepository.guardar(descripcion, false, prioridad);
        } else {
            throw new IllegalArgumentException("Se alcanzó el límite máximo de tareas");
        }
    }

    public List<Tarea> obtenerTodasLasTareas() {
        return tareaRepository.todasLasTareas();
    }

    public List<Tarea> tareasPendientes() {
        return tareaRepository.todasLasTareas().stream()
                .filter(t -> !t.isCompletada())
                .toList();
    }

    public List<Tarea> tareasCompletadas() {
        return tareaRepository.todasLasTareas().stream()
                .filter(Tarea::isCompletada)
                .toList();
    }

    public Optional<Tarea> marcarTareaCompletada(Long id) {
        Optional<Tarea> tareaObtenida = tareaRepository.buscarTareaPorId(id);
        tareaObtenida.ifPresent(t -> t.setCompletada(true));
        return tareaObtenida;
    }

    public void tareasEstadisticas(){
        int totalTareas = (int) tareaRepository.todasLasTareas().stream().count();
        System.out.println("Total de tareas: " + totalTareas);
        int totalTareasPendientes = (int) this.tareasCompletadas().stream().count();
        System.out.println("Total de tareas completadas: " + totalTareasPendientes);
        int totalTareasCompletadas = (int) this.tareasPendientes().stream().count();
        System.out.println("Total de tareas pendientes: " + totalTareasPendientes);
    }

    public void mostrarConfiguracion(){
        System.out.println("Nombre de aplicacion: "+appNombre+", maximo total de tareas permitido: "+maxTareas+", permiso para mostrar estadisticas: "+mostrarEstadisticas);
    }
}
