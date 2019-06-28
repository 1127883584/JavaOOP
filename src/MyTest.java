import model.Student;

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("郭小明", "男", "1452441213");
		System.out.println("姓名:" + s.getName());
		System.out.println("性别：" + s.getSex());
		System.out.println("学号：" + s.getNumber());
	}

}
