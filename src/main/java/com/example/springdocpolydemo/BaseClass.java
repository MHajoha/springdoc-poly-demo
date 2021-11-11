package com.example.springdocpolydemo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.swagger.v3.oas.annotations.media.DiscriminatorMapping;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonTypeInfo(
		use = Id.NAME,
		property = "type"
)
@JsonSubTypes({
		@JsonSubTypes.Type(value = Impl1.class, name = "Impl1"),
		@JsonSubTypes.Type(value = Impl2.class, name = "Impl2")
})
@Schema(
		discriminatorProperty = "type",
		discriminatorMapping = {
				@DiscriminatorMapping(value = "Impl1", schema = Impl1.class),
				@DiscriminatorMapping(value = "Impl2", schema = Impl2.class)
		}
)
public abstract class BaseClass {

}
