package com.bootcamp.currencytype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.currencytype.domain.CurrencyType;
import com.bootcamp.currencytype.service.ICurrencyTypeService;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/currencytype")
public class CurrencyTypeController {
    @Autowired
    private ICurrencyTypeService currencyTypeService;

    @GetMapping
    public Flux<CurrencyType> findAll(){
        return currencyTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<CurrencyType> getById(@PathVariable("id") String id){return  currencyTypeService.findById(id);
    }

    @PostMapping
    public Mono<CurrencyType> create(@RequestBody CurrencyType currencyType){
        return currencyTypeService.save(currencyType);
    }

    @PutMapping
    public Mono<CurrencyType> update(@RequestBody CurrencyType currencyType){
        return currencyTypeService.update(currencyType);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        return currencyTypeService.deleteById(id);
    }
}
