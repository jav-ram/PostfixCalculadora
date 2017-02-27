import java.util.Stack;

public class StackFactory<T> {
	
	public Stacks getStack(String op){
		switch (op){
			case "array":{
				return new ArrayLists<T>();
			}
			case "vector":{
				return new Vectors<T>();
			}
			case "lista simple":{
				return new Lista<T>();
			}
			case "lista doble":{
				return new Vectors<T>();
			}
			case "lista circular":{
				return new Vectors<T>();
			}
			default:{
				return null;
			}
		}
	}

}
