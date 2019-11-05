
public class Lesson3{

	public static void sum(){
	
	int n1 = 5;
	int n2 = 3;
	int sum;
	sum = n1 + n2 ;
	System.out.println(sum);	 

}
public static void main(String[] args){
	sum();
	Lesson4 ls = new Lesson4();
	ls.framed();
	Lesson4.printSum(ls.num);
	int d = Lesson4.pr();
	System.out.println(d);	
}

}