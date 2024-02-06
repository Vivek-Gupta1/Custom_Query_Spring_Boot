package com.vivek;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vivek.Entity.Student;
import com.vivek.Repo.StudentRepo;

@SpringBootApplication
public class SpringBootCrudRepo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootCrudRepo1Application.class, args);
		StudentRepo bean = run.getBean(StudentRepo.class);
//		Student st = new Student();
//		st.setSId(2);
//		st.setSName("Vikash");
//		st.setSAdd("Hydrabad");
//		
//		Student st1 = new Student();
//		st1.setSId(3);
//		st1.setSName("Pandu");
//		st1.setSAdd("virar");
//		
//		Student st2 = new Student();
//		st2.setSId(4);
//		st2.setSName("Vishakha");
//		st2.setSAdd("adheri");
//		
//		Student st3 = new Student();
//		st3.setSId(5);
//		st3.setSName("rakesh");
//		st3.setSAdd("vashi");
//		
//		Student st4 = new Student();
//		st4.setSId(6);
//		st4.setSName("Vilas");
//		st4.setSAdd("waliv");
//		
//		Student st6 = new Student();
//		st6.setSId(7);
//		st6.setSName("Ramu");
//		st6.setSAdd("Goa");
//		
//		Student st5 = new Student();
//		st5.setSId(8);
//		st5.setSName("Manish");
//		st5.setSAdd("Hy");
//		
//		bean.saveAll(Arrays.asList(st,st1,st2,st3,st4,st5,st6));
		
//		List<Student> list = bean.getAllStudent();
//		for(Student sts:list) {
//			System.out.println(sts);
//			
//		}
		List<Student> list2 = bean.getOrderBySName();
		for(Student std:list2) {
			System.out.println(std);
		}
		List<Student> list = bean.getSalGreaterThan();
		for(Student st:list) {
			System.out.println(st);
		}
		
		
	}

}
