package com.anudip.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.dto.TeacherDTO;
import com.anudip.entity.Teacher;
import com.anudip.exception.TeacherIdNotFoundException;
import com.anudip.repository.TeacherRepository;
import com.anudip.service.TeacherService;
import com.anudip.util.TeacherConverter;

@Service
public class TeacherServiceImpl implements TeacherService 
{

	@Autowired
	TeacherRepository teacherRepo;
	
	@Autowired
	TeacherConverter tcover;
	
	@Override
	public TeacherDTO addTeacher(Teacher teacher) {
		
		return tcover.convertTeacherToTeacherDTO(teacherRepo.save(teacher));
	}

	@Override
	public Teacher getTeacherDetail(int tid) {
		
		return teacherRepo.findById(tid).
				orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
	}

	@Override
	public Teacher updateTeacherDetail(Teacher teacher, int tid) {
		Teacher UpdateTeacher = teacherRepo.findById(tid).
				orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
				// set new value
				UpdateTeacher.setTphone(teacher.getTphone());
				UpdateTeacher.setDesignation(teacher.getDesignation());
				teacherRepo.save(UpdateTeacher);
		return UpdateTeacher;
	}

	@Override
	public void deleteTeacherDetail(int tid) 
	{
		Teacher delTeacher =teacherRepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
		teacherRepo.delete(delTeacher);
		
		/* or
		 * teacherRepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
		teacherRepo.deleteById(tid);*/
	}

	@Override
	public Teacher getTeacherByPhone(long tphone) {
		// TODO Auto-generated method stub
		return teacherRepo.findTeacherByPhone(tphone);
	}

	@Override
	public List<Teacher> getTeacherdesignation(String designation) {
		// TODO Auto-generated method stub
		return teacherRepo.findTeacherDesignation(designation);
	}

}
