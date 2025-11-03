package com.utn.tareas.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")

@Service
public class MensajeDevService implements MensajeService{
    @Override
    public void MostrarBienvenida() {
        System.out.println("\nHola y bienvenidos a nuestro programa, iniciamos el proceso de desarrollo.");
    }

    @Override
    public void MostrarDespedida() {
        System.out.println("\nNos vemos, que tengan un lindo dia, damos por finalizado el proceso de desarrollo.");
    }
}
