package Hierarchical.com;

public class College {

	public static void main(String[] args)
	{
		WrittenExam w=new WrittenExam(5,"TestSeries");
		w.showExamDetails();
		w.showWrittenExamDetails();
		
		PracticalExam p=new PracticalExam(7,100);
		p.showExamDetails();
		p.showPracticalExamdetails();
		
		OralExam o=new OralExam("all");
		o.showExamDetails();
		o.showOralExamDetails();
				
	}

}
