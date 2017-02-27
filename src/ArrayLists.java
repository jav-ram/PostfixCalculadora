import java.util.Stack;

public class ArrayLists<T> implements Stacks{
	private Stack<T> list = new Stack<T>();

	@Override
	public void push(Object value) {
		// TODO Auto-generated method stub
		list.add((T) value);
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return list.pop();
	}
}
