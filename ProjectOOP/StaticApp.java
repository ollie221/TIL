class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar);//OK
//		System.out.println(instanceVar);//Error
		//class method 안에서는 class 변수만 접근 가능
	}
	public void instanceMethod() {
		System.out.println(classVar);//OK
		System.out.println(instanceVar);//OK
		//instance method 안에서는 class와 instance변수 모두 접근 가능
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //class를 통해 class variable에는 접근 되는가 OK
//		System.out.println(Foo.instanceVar); // class를 통해 instance variable에는 접근되는가 Error
		//instance는 instance를 통해 사용되도록 고안된 변수
		Foo.classMethod();
//		Foo.intanceMethod();
		//Foo의 classMethod는 접근 가능. Foo의 instanceMethod는 접근 불가능(instance method는 instance 소속 so class로 instance에 접근 불가)
	
		Foo f1 = new Foo();
		Foo f2 = new Foo();
//      
        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var
//      
        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar);  // changed by f1
//      
        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var
	}

}
