public class SayHello{
	public static void main(String[] args){
		System.out.println("Below is the function of sayhello");
		SayHello sayhello = new SayHello();
		sayhello.sayHello(0);
	}
	public void sayHello(int sum){
		System.out.println("say Hello !"+sum);
	}
	public static int sum(){
		return 1+3; 
	}
}