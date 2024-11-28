package Framework;

public class Sample1 {
	
private	int num;

public Sample1(int a) {
	num=a;
	
}

public void SquareOfNum() {
	System.out.println(num*num);
}

public static void main(String[] args) {
	Sample1 s1 = new Sample1(10);
	s1.SquareOfNum();
}

}
