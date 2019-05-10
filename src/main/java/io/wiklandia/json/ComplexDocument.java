package io.wiklandia.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.TreeSet;

@Data
@NoArgsConstructor
class ComplexDocument {
    private final Set<String> countries = new TreeSet<>();
    private final Set<String> cities = new TreeSet<>();
    private Integer count;
    private String name;
}
