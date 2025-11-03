package com.utn.tareas;

import com.utn.tareas.model.Prioridad;
import com.utn.tareas.service.MensajeService;
import com.utn.tareas.service.TareaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareasApplication implements CommandLineRunner {
    private final TareaService tareaService;
    private final MensajeService mensajeService;

    public TareasApplication(TareaService tareaService, MensajeService mensajeService) {
        this.tareaService = tareaService;
        this.mensajeService = mensajeService;
    }

	public static void main(String[] args) {
        SpringApplication.run(TareasApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\nAplicación iniciada.");
        mensajeService.MostrarBienvenida();

        tareaService.mostrarConfiguracion();

        System.out.println("\nTareas iniciales:\n " +tareaService.obtenerTodasLasTareas());

        tareaService.agregarTarea("Tarea nueva", Prioridad.MEDIA);
        System.out.println("\nSe agregó la tarea id: 6L");

        System.out.println("\nTareas pendientes:\n " +tareaService.tareasPendientes());

        tareaService.marcarTareaCompletada(2L);
        System.out.println("\nSe completó la tarea id: 2L");

        System.out.println("\nEstadisticas actuales:");
        tareaService.tareasEstadisticas();

        System.out.println("\nTareas completadas:\n " +tareaService.tareasCompletadas());

        mensajeService.MostrarDespedida();

    }
}
