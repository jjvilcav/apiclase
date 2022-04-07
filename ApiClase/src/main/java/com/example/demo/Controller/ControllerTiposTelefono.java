package com.example.demo.Controller;


import com.example.demo.interfaceService.ITiposTelefonoService;
import com.example.demo.interfaces.ITiposTelefono;
import com.example.demo.modelo.TiposDeTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerTiposTelefono {

    @Autowired
    private ITiposTelefonoService serviceTipos;

    @GetMapping("/listar_tipos_telefonos")
    public List<TiposDeTelefono> listarTipos(){
        List<TiposDeTelefono> tiposDeTelefonos = serviceTipos.listarTipos();
        return tiposDeTelefonos;
   }

   @GetMapping("/listar_prueba")
    public String listar_prueba_tipos(){
        return "Esto es una prueba del listar tipos de telefono";
   }
}
