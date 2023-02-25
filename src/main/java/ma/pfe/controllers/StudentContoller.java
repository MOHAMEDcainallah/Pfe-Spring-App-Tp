package ma.pfe.controllers;

import ma.pfe.dtos.StudentsDTO;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.javapoet.ClassName;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping("/Students")
public class StudentContoller {
    private StudentService service ;
     void StudentController(StudentService service){
         this.service=service;
    }
    @PostMapping("/save")
    public long create (@RequestBody StudentsDTO dto)
    {
       // return service.create(dto);
        LOG.debug("start method name");
        long result = service.create(dto);
        LOG.debug("end method name");
        return result ;

    }
    @PostMapping
    public boolean update (@RequestBody StudentsDTO dto)
    {
        //return service.update(dto);
        LOG.debug("start method name");
        boolean result = service.update(dto);
        LOG.debug("end method name");
        return result ;
    }
    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable ("id") long id){
        // return service.delete(id);
        LOG.debug("start method name");
        boolean result = service.delete(id);
        LOG.debug("end method name");
        return result ;
    }
    @GetMapping
    public List<StudentsDTO> readAll(){
         //return service.readAll();
        LOG.debug("start method name");
        List<StudentsDTO> result = service.readAll();
        LOG.debug("end method name");
        return result ;

    }
    private final static Logger LOG =
            LoggerFactory.getLogger(ClassName.class);

    }

