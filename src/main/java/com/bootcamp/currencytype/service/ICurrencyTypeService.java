package com.bootcamp.currencytype.service;

import com.bootcamp.currencytype.domain.CurrencyType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICurrencyTypeService {
    Flux<CurrencyType> findAll();

    Mono<CurrencyType> findById(String id);

    Mono<CurrencyType> save(CurrencyType currencyType);

    Mono<CurrencyType> update(CurrencyType currencyType);

    Mono<Void> deleteById(String id);
}
