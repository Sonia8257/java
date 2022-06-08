package executor;
import entity.Studentmarks;

public class Testmarks {

	public static void main(String[] args) {
		Studentmarks s = new Studentmarks("sonia");
		s.setSub1(88);
		s.setSub2(90);
		s.setSub3(85);
		
		System.out.println("Student name :"+s.getStud_name());
		System.out.println("Subject 1 marks :"+ s.getSub1());
		System.out.println("Subject 2 marks :"+ s.getSub2());
		System.out.println("Subject 3 marks :"+ s.getSub3());
		System.out.println("Total marks :"+s.getTotal_marks());    
		
		
		

	}

}
