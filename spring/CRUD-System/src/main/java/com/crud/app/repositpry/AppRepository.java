package com.crud.app.repositpry;

import org.springframework.data.repository.CrudRepository;
import com.crud.app.models.Pessoa;
import java.util.List;


public interface AppRepository extends CrudRepository<Pessoa, String> {//
    Pesoa findByIdPessoa(long idPessoa);

}

//  no crud de repositorio 