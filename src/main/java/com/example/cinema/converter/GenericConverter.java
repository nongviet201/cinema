package com.example.cinema.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Converter(autoApply = true)
public class GenericConverter<T extends Enum<T>> implements AttributeConverter<List<T>, String> {

    private final Class<T> clazz;
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public GenericConverter(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public String convertToDatabaseColumn(List<T> enumList) {
        if (enumList == null) {
            return null; // or return "[]", depending on your preference
        }
        try {
            return objectMapper.writeValueAsString(enumList);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert list to JSON", e);
        }
    }

    @Override
    public List<T> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return Collections.emptyList(); // or return null, based on preference
        }
        try {
            CollectionType collectionType = objectMapper.getTypeFactory().constructCollectionType(List.class, clazz);
            return objectMapper.readValue(dbData, collectionType);
        } catch (IOException e) {
            throw new RuntimeException("Failed to convert JSON to list", e);
        }
    }
}
