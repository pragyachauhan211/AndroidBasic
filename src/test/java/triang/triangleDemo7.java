package triang;

public class triangleDemo7 {
	
	public void triangle()
	{int rows=7;      
	//inner loop  
	for (int i= rows-1; i>=0 ; i--)  
	{  
	//outer loop  
	for (int j=0; j<=i; j++)  
	{  
	//prints star and space  
	System.out.print("*" + " ");  
	}  
	//throws the cursor in the next line after printing each line  
	System.out.println();  
	}  
	}   

	public static void main(String[] args) {
		triangleDemo7 sp = new triangleDemo7();
		sp.triangle();

	}

}
