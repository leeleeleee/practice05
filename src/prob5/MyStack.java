	package prob5;

public class MyStack<T> implements Stack<T> {
	int top = -1;
	T[] buffer;
	public MyStack( int size ) {
		//buffer = new T[size]; -error
		buffer = (T[])new Object[ size ];
		top = -1;
		
		
	}

	@Override
	public void push(T item) {
		top++;
		buffer[top] = item;
	}
	

	@Override
	public String<T> pop() throws MyStackException {
			if( top == -1 ){
				throw new MyStackException();
			} else {
				String result = buffer[top];
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
