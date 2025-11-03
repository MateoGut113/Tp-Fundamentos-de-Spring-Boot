package com.utn.tareas.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class MensajeProdService implements MensajeService{
    @Override
    public void MostrarBienvenida() {
        System.out.println("\nBienvenido, proceso de produccion iniciado.");
    }

    @Override
    public void MostrarDespedida() {
        System.out.println("\nProceso de produccion finalizado.");
    }
}
