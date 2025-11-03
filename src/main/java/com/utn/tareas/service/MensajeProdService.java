package com.utn.tareas.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class MensajeProdService implements MensajeService{
    @Override
    public void MostrarBienvenida() {
        System.out.println("Bienvenido, proceso de produccion iniciado.");
    }

    @Override
    public void MostrarDespedida() {
        System.out.println("Proceso de produccion finalizado.");
    }
}
