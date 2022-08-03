package com.bootcamp.currencytype.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.currencytype.domain.CurrencyType;
import com.bootcamp.currencytype.repository.ICurrencyTypeRepository;
import com.bootcamp.currencytype.service.ICurrencyTypeService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CurrencyTypeService implements ICurrencyTypeService {
	@Autowired
	private final ICurrencyTypeRepository iCurrencyTypeRepository; 
	@Override
	public Flux<CurrencyType> findAll() {
		return iCurrencyTypeRepository.findAll();
	}

	@Override
	public Mono<CurrencyType> findById(String id) {
		return iCurrencyTypeRepository.findById(id);
	}

	@Override
	public Mono<CurrencyType> save(CurrencyType currencyType) {
		return iCurrencyTypeRepository.save(currencyType);
	}

	@Override
	public Mono<CurrencyType> update(CurrencyType currencyType) {
		return iCurrencyTypeRepository.save(currencyType);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return iCurrencyTypeRepository.deleteById(id);
	}

}
