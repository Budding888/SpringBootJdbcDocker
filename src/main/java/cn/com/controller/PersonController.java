package cn.com.controller;

import cn.com.db.model.Person;
import cn.com.db.repository.PersonJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by xiaxuan on 16/11/29.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonJpaRepository personJpaRepository;

    @RequestMapping(value = "/")
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("/people");
    }

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public List<Person> people() {
        return personJpaRepository.findAll();
    }

    @RequestMapping(value = "/people/names", method = RequestMethod.GET)
    public List<String> peoplenames() {
        return personJpaRepository.findAll()
                .stream()
                .map(p -> p.getFirst() + " " + p.getLast())
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/people", method = RequestMethod.POST)
    public Person create(@RequestBody Person person) {
        return personJpaRepository.save(person);
    }

    @RequestMapping(value = "/people/{id}", method = RequestMethod.GET)
    public Person find(@PathVariable final Long id) {
        return personJpaRepository.findOne(id);
    }
}
