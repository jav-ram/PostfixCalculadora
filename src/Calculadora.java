import java.util.Stack;


public class Calculadora <T> {
	//Lista
	
	private Stacks<T> L;
	private StackFactory<T> factory = new StackFactory<T>();
	
	public Calculadora(String op){
		L = factory.getStack(op);
	}
	
	public boolean isInt(Character c){
		boolean flag = false;
		int ascii = (int) c;
		if (ascii >= 48 && ascii <= 57){
			flag = true;
		}
		return flag;
	}
	
	public int Sum(int o1, int o2){
		return o1+o2;
	}
	public int Res(int o1, int o2){
		return o1-o2;
	}
	public int Mul(int o1, int o2){
		return o1*o2;
	}
	public int Div(int o1, int o2){
		return o1/o2;
	}
	
	public void Operacion(String line){
		int pos = 0;
		T op2;
		T op1;
		Character c;
		while(pos<line.length()){
			c = line.charAt(pos);
			pos++;
			if (isInt(c)){
				L.push(((T)(Object) Character.getNumericValue(c)));
			} else {
				op2 = L.pop();
				op1 = L.pop();
				if (c.equals('+')){
					L.push((T)((Object)Sum((int)op1,(int)op2)));
				} else if (c.equals('-')){
					L.push((T)((Object)Res((int)op1,(int)op2)));
				} else if (c.equals('*')){
					L.push((T)((Object)Mul((int)op1,(int)op2)));
				} else if (c.equals('/')){
					L.push((T)((Object)Div((int)op1,(int)op2)));
				}
			}
		}
	}
	
	public String getResultado(String line){
		Operacion(line);
		return ""+L.pop();
	}
	
}
