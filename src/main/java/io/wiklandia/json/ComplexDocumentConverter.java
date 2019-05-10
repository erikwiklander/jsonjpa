package io.wiklandia.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import javax.persistence.AttributeConverter;

public class ComplexDocumentConverter implements AttributeConverter<ComplexDocument, String> {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    @SneakyThrows
    public String convertToDatabaseColumn(ComplexDocument attribute) {
        return attribute == null
                ? null
                : objectMapper.writeValueAsString(attribute);
    }

    @Override
    @SneakyThrows
    public ComplexDocument convertToEntityAttribute(String dbData) {
        return dbData == null
                ? null
                : objectMapper.readValue(dbData, ComplexDocument.class);
    }
}
