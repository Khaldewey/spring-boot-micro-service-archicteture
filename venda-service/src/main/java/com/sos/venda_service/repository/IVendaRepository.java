package com.sos.venda_service.repository;

/**
 * 
 */


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sos.venda_service.domain.Venda;



/**
 * @author rodrigo.pires
 *
 */
@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

	Optional<Venda> findByCodigo(String codigo);
}
