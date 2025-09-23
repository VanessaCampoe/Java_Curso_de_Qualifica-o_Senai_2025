package com.crud.app.repositpry;

import org.springframework.data.repository.CrudRepository;
import com.crud.app.models.Pessoa;


public interface AppRepository extends CrudRepository<Pessoa, Long> {//
    Pessoa findByIdPessoa(long idPessoa);

}

//  no crud de repositorio 