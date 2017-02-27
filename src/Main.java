import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Calculadora<Integer> calc = new Calculadora<Integer>("lista simple");
		
		String everything;
        char c[];
        
        FileReader fr = new FileReader(ClassLoader.getSystemResource("operation.txt").getFile());
        try {
            StringBuilder sb = new StringBuilder();
            c = new char[27];
            fr.read(c);
            everything = sb.toString();
        } finally {
            fr.close();
        }
        
        boolean flag = false;
        String n1 = "";
        String n2 = "";
        int i = 0;
        for (Character l:c){
        	i++;
        	if (l == '\n'){
        		flag = true;
        	}
        	else if (l != ' '){
            	if (flag){
            		n2 += l; 
            	}else {
            		n1 += l; 
            	}       		
        	}
        }
		
		
		System.out.println(calc.getResultado(n1));
	}

}
