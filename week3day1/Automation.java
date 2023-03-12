package assignment.week3day1;

public class Automation extends MultipleLanguage{
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.selenium();
		auto.java();
		auto.python();
		auto.ruby();
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is a automation tool");
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java is a automation tool");
	}

	@Override
	void ruby() {
		System.out.println("Ruby gets implemented");
		
	}

}
