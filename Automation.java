package week5.day2;

public class Automation extends MultipleLangauge implements Language{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation obj=new Automation();
		obj.java();
		obj.selenium();
		obj.python();
		obj.ruby();
		
		
		
		

	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby is an abstract un implemented method in MultipleLanguage abstract class");
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium in TestTool interface");
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java in Language interface");
		
	}

}
