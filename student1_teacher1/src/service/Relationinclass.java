package service;

import entity.Student1;
import entity.Teacher1; 

public class Relationinclass 
{
	public static void giveClass(Student1 s)	
	{
		System.out.println("the teacher is teaching to "+s.getName());
		
	}
	public static void takeClass(Teacher1 t)
	{
		System.out.println("the name of teacher who teaches "+t.getTname());
	}
}
