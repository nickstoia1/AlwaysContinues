
public class Driver {

	public static void main(String[] args) {
		System.out.println("GitHub here.");
		
		SuperStack<String> stack = new SuperStack<>();
		stack.push("aha");
		System.out.println(stack.peek());
		
	}

}
