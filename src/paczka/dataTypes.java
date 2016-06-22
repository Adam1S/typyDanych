package paczka;

import com.bethecoder.ascii_table.ASCIITable;

public class dataTypes {

	public static void main(String[] args) {
		String [] header = { "Variable Type", "It's size"};

	    String[][] data = {
	            { "byte", "1" },
	            { "short", "2" },
	            { "byte", "1" },
	         };
	    
	    ASCIITable.getInstance().printTable(header, data);
		
		byte byteVarMin, byteVarMax;
			byteVarMin=-128;
			byteVarMax=127;
		short shortVar=1;
		int intVar=1;
		long longVar=1;
		System.out.println("byte - 1 bajt pamięci"
				+ "\nshort - 2 bajty pamięci "
				+ "\nint - 4 bajty pamięci"
				+ "\nlong - 8 bajtów pamięci");
	}

}
