package com.example.desaparecidos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.desaparecidos.models.PessoaDesaparecida;

@Repository
public interface PessoaRepository extends CrudRepository<PessoaDesaparecida, Long> {
}



// package com.example.desaparecidos.repository;

// import org.springframework.data.repository.CrudRepository;
// import org.springframework.stereotype.Repository;
// import com.example.desaparecidos.models.PessoaDesaparecida;

// @Repository
// public interface PessoaRepository extends CrudRepository<PessoaDesaparecida, Long> {
// }