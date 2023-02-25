package ma.pfe.services;

import ma.pfe.dtos.StudentsDTO;
import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.javapoet.ClassName;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentService service;

    public StudentServiceImpl(StudentService service) {
        this.service = service;
    }

    @Override
    public long create(StudentsDTO dto) {
       // return 0;
        LOG.debug("start method name");
        long result = service.create(dto);
        LOG.debug("end method name");
        return result ;
    }

    @Override
    public boolean update(StudentsDTO dto) {
       // return false;
        LOG.debug("start method name");
        boolean result = service.update(dto);
        LOG.debug("end method name");
        return result ;
    }

    @Override
    public boolean delete(long id) {
        //return false;
        LOG.debug("start method name");
        boolean result = service.delete(id);
        LOG.debug("end method name");
        return result ;
    }

    @Override
    public List<StudentsDTO> readAll() {
        //return null;
        LOG.debug("start method name");
        List<StudentsDTO> result = service.readAll();
        LOG.debug("end method name");
        return result ;

    }
    private final static Logger LOG =
            LoggerFactory.getLogger(ClassName.class);
}
