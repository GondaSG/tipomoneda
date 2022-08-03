package com.bootcamp.currencytype.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.bootcamp.currencytype.domain.CurrencyType;

public interface ICurrencyTypeRepository extends ReactiveCrudRepository<CurrencyType,String>{

}
