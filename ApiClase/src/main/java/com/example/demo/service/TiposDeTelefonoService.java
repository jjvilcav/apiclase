package com.example.demo.service;

import com.example.demo.interfaceService.ITiposTelefonoService;
import com.example.demo.interfaces.ITiposTelefono;
import com.example.demo.modelo.Telefonos;
import com.example.demo.modelo.TiposDeTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiposDeTelefonoService implements ITiposTelefonoService {

    @Autowired
    ITiposTelefono dataTipos;

    @Override
    public List<TiposDeTelefono> listarTipos (){
        return (List<TiposDeTelefono>) dataTipos.findAll();
    }

//    public Optional<TiposDeTelefono> listaridTipos(int id) {
//        return dataTipos.findById(id);
//    }
//
//    public int saveTipo(TiposDeTelefono t) {
//        int resTipo = 0;
//        TiposDeTelefono tiposDeTelefono = dataTipos.save(t);
//        if (tiposDeTelefono != null) {
//            resTipo = 1;
//        }
//        return resTipo ;
//    }
//
//
//    public void eliminar(int id) {
//        dataTipos.deleteById(id);
//    }
//

}
