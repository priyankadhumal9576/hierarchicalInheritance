package Hierarchical.com;

public class Exam 
{
	private String examType;
	 private String subject;
	 
	 public Exam()
	 {
		 
	 }
	 public Exam(String e,String s)
	 {
		 examType=e;
		 subject=s;
	 }
	 
	 public void showExamDetails()
	 {
		 System.out.println("Exam type is:"+examType);
		 System.out.println("Subject is:"+subject);
	 }
}
 class PracticalExam extends Exam 
{
	private int topic;
	private int outOfMarks;
	
	public PracticalExam()
	{
		
	}
    public PracticalExam(int t,int o)
    {
    	super("semester","physics");
    	topic=t;
    	outOfMarks=o;
    }
    public void showPracticalExamdetails()
    {
    	System.out.println("Topics are:"+topic);
    	System.out.println("out of marks:"+outOfMarks);
    }

}
class WrittenExam extends Exam
{
	private int chapNo;
	private String examType;
	
	public WrittenExam() {}
	public WrittenExam(int chap,String e)
	{
		super("Final","java");
		chapNo=chap;
		examType=e;
	}
	public void showWrittenExamDetails()
	{
		System.out.println("The number of chapters are:"+chapNo);
		System.out.println("The type of the exam is:"+examType);
	}
	
	
}
 class OralExam extends Exam
 {
	 private int marks;
	 private String syllabus;
	 
	 public OralExam() 
	 {
		 super("midTest","oops");
		 int marks=20; 
	 }
	 public OralExam(String syllabus)
	 {
		 this();
		this.syllabus=syllabus; 
	 }
	 public void showOralExamDetails()
	 {
		 System.out.println("Total marks of the exam are:"+marks);
		 System.out.println("The syllabus is:"+syllabus);
	 }
	 
 }
 
 
 
 
 
 
 
 