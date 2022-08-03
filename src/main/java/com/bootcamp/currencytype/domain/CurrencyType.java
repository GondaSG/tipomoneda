package com.bootcamp.currencytype.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
@Document("currencytype")
public class CurrencyType {
	@Id
	private String id;
	private String name;
}
