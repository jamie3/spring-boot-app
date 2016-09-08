package springbootapp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BeerRepository extends MongoRepository<Beer, String> {

    Beer findByName(String name);

    List<Beer> findByStyle(String style);
}