
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human a= new Human();
		male b = new male();
		female c= new female();
		
		System.out.println(a.topic );
		System.out.println(a.object );
		System.out.println(a.Attribute );
		System.out.println(a.Operation );
		
		System.out.println();
		System.out.println(a.name + b.name);
		System.out.println(a.age + b.age);
		System.out.println(a.sex + b.sex);
		System.out.print(b.speak);
		b.printSpeak();
		
		System.out.println();
		System.out.println(a.name + c.name);
		System.out.println(a.age + c.age);
		System.out.println(a.sex + c.sex);
		System.out.print(c.speak);
		c.printSpeak();
	}

}
