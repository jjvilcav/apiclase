package com.example.demo.interfaces;

import com.example.demo.modelo.TiposDeTelefono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITiposTelefono extends CrudRepository<TiposDeTelefono, Integer> {

}
