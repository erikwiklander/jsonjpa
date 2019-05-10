package io.wiklandia.json;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InformationRepository extends JpaRepository<Information, UUID> {
}
