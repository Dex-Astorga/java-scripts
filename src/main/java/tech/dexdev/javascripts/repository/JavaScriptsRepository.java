package tech.dexdev.javascripts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.dexdev.javascripts.entity.JavaScript;

@Repository
public interface JavaScriptsRepository extends JpaRepository<JavaScript, Long> {

}
