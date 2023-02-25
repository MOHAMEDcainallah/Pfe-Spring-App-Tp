package ma.pfe.services;

import ma.pfe.dtos.StudentsDTO;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentService {
   long create(StudentsDTO dto);
   boolean update(StudentsDTO dto);
   boolean delete(long id);

    List<StudentsDTO> readAll();

}
