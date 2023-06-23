package com.simform.dtomapper.repository;

import com.simform.dtomapper.dto.StudentDto;
import com.simform.dtomapper.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapstructMapper {

  @Mapping(source = "dtoName", target = "name")
  @Mapping(source = "dtoStack", target = "stack")
  Student dtoToEntity(StudentDto studentDto);

/*  @Mapping(source = "name", target = "nameDto")
  @Mapping(source = "stack", target = "stackDto")
  StudentDto entityToDto(Student student);*/
}
