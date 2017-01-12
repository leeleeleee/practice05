package prob5;

public class MainApp {

	public static void main(String[] args) {
		try {
			Stack stack = new MyStack();
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (stack.isEmpty() == false) {
				System.out.println(stack.pop());
			}

			System.out.println("======================================");

			stack = new MyStack();
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		} catch (MyStackException ex) {
			System.out.println( ex );
		}

	}

}
