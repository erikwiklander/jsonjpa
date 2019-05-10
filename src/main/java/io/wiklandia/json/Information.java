package io.wiklandia.json;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@EntityListeners(AuditingListener.class)
class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Convert(converter = ComplexDocumentConverter.class)
    private ComplexDocument doc;

}
