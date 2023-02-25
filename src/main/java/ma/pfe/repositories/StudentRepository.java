package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
   Long create(StudentEntity e);
   boolean update(StudentEntity e);

    //@DeleteMapping
    boolean delete(Long id);

    List<StudentEntity> readAll();

}
