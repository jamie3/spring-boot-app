package springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootapp.dao.Beer;
import springbootapp.dao.BeerRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/beer", produces = "application/json")
public class BeerController {

    @Autowired
    BeerRepository beerRepository;

    @GetMapping(produces = "application/json")
    public List<Beer> beer() {
        List<Beer> beer = beerRepository.findAll();
        return beer;
    }

    @GetMapping("/{name}")
    public Beer beerByName(@PathVariable final String name) {
        return beerRepository.findByName(name);
    }
}
