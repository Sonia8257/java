package executor;

import service.Relationinclass;
import entity.Student1;
import entity.Teacher1;


public class Mainmethod
{
	public static void main (String [] args0) {
		
	
	Student1 s1 = new Student1();
	s1.setId(1);
	s1.setName("pooja");
	Teacher1 t = new Teacher1();
    t.setTname("priya");
    t.setSubname("java)");
    Relationinclass.giveClass(s1);
    Relationinclass.takeClass(t);
    
}
}

