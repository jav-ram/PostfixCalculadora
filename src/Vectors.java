import java.util.Vector;

public class Vectors<T> implements Stacks {
	
	private Vector<T> list = new Vector<T>();
	
		@Override
	public void push(Object value) {
		list.add((T)value);
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		T ret = list.lastElement();
		list.remove(list.lastElement());
		return ret;
	}
	
}
