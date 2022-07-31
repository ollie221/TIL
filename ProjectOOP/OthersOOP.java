import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.PI);//Math라는 class 바로 사용
		System.out.println(Math.floor(1.8));//Math의 PI나 floor은 내부적으로 어떤 상태를 유지할 필요x. 필요할때마다 사용(일회용)
		System.out.println(Math.ceil(1.8));
		
		FileWriter f1 = new FileWriter("data.txt");//f1이라는 변수에 담기는 복제본.data.txt라는 내용을 저장하겠다는 상태를 가진 복제본 
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");//FileWrite라는 class의 또다른 복제본 f2.f2는 내부적으로 data2.txt라는 내용저장.f1과는 다름
		f2.write("Hello");//"Hello Java2"는 data2.txt에 저장됨
		f2.write(" Java2");//FileWriter는 
		f2.close();
		
	}

}
