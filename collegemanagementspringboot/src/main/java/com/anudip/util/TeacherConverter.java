package com.anudip.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.anudip.dto.TeacherDTO;
import com.anudip.entity.Teacher;
//this class will be responsible to convert from DTO to entity and vice versa

//instead of teacher entity we are using teacher DTO
@Component
public class TeacherConverter {
	
	public Teacher ConvertTeacherDTOToTeacher(TeacherDTO tdto) {
		
		Teacher tc=new Teacher();
		if(tdto !=null)
		{	
		BeanUtils.copyProperties(tdto, tc);
			
		}
		return tc;
	}
		
		public TeacherDTO convertTeacherToTeacherDTO(Teacher teacher) {
			
			TeacherDTO tdto=new TeacherDTO();
			
			if(teacher != null) {
				
				BeanUtils.copyProperties(teacher, tdto);
			}
			
			return tdto;
		}
	}


