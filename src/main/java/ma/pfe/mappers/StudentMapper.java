package ma.pfe.mappers;

import ma.pfe.dtos.StudentsDTO;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class StudentMapper {
    StudentsDTO convertEntitytoDto(StudentEntity entity){
     StudentsDTO studentDto= new StudentsDTO();
     studentDto.setId(entity.getId());
     studentDto.setName(entity.getName());
     return studentDto;

    }

    StudentEntity convertDtoToEntity(StudentsDTO dto){
        StudentEntity studententity= new StudentEntity();
        studententity.setId(dto.getId());
        studententity.setName(dto.getName());
        return studententity;

    }
    List<StudentEntity> convertDTOToEntities(List<StudentsDTO> dtos){
       return dtos.stream().map(dto -> convertDtoToEntity(dto)).collect(Collectors.toList());

    }
    List<StudentsDTO> convertEntityToDto (List<StudentEntity> entities){
        return entities.stream().map(entity -> convertEntitytoDto(entity)).collect(Collectors.toList());

    }

}
