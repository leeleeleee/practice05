package prob5;

public class MyStack implements Stack {
	int top = -1;
	String[] str = new String[5];
	public MyStack() {
		
	}

	@Override
	public void push(String item) {
		top++;
		str[top] = item;
	}
	

	@Override
	public String pop() throws MyStackException {
			if( top == -1 ){
				throw new MyStackException();
			} else {
				String result = str[top];
				top--;
				return result;
		}
		
		

	}

	@Override
	public boolean isEmpty() {
		if( top <0 ){
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
