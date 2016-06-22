package paczka;

import com.bethecoder.ascii_table.ASCIITable;

public class dataTypes {

	public static void main(String[] args) {
		String [] header = { "Variable Type", "It's size"};

	    String[][] data = {
	            { "byte", "1" },
	            { "short", "2" },
	            { "int", "4" },
	            { "long", "8" },
	            { "=", "=" },
	            { "float", "4" }, //8 liczb po przecinku
	            { "double", "8" },//16 liczb po przecinku
	         };
	    
	    ASCIITable.getInstance().printTable(header, data);
		
	    //typy wraz ze swoimi zakresami
		byte byteVarMin, byteVarMax;
			byteVarMin=-128;
			byteVarMax=127;
		short shortVarMin, shortVarMax;
			shortVarMin=-32_768;  //mozna podkreslic dla czytelnosci
			shortVarMax=32_767;
		int intVarMin, IntVarMax=1;
			intVarMin=-2^31;
			IntVarMax=2^31-1;
		long longVarMin, longVarMax;
			longVarMin=-2^63l;		//na koncu longa
			longVarMax=2^63-1l;		//warto dodac 'l'
			
		float flpoint=0.1f;			//do floata dodac f
		double dblpoint = 0.123d;	//do dbl dodac d
		
		char a='a';		//UTF-16
		char b='\\';	//tak zapiszemy backslash
		char c='\'';	//a tak apostrof
		
		boolean truth=true;	//typ boolowski
		
		
	}

}
