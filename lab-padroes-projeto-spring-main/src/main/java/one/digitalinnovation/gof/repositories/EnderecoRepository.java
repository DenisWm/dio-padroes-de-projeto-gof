package one.digitalinnovation.gof.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.gof.domain.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}