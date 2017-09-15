import java.io.*;
import java.util.*;
public class XCreate_File {
	public static void main (String[]args){
		//Files are created
		File X = new File ("Sales2016.txt");
		File Y = new File ("COG2016.txt");
		File Z = new File ("Sales2016revised.txt");
		File P = new File ("COG2016revised.txt");
		File Q = new File ("PL.txt");
		final Formatter newFileName1;
		final Formatter newFileName2;
		final Formatter newFileName3;
		final Formatter newFileName4;
		final Formatter newFileName5;
		//checks to see if file exists
		if (X.exists()){
			System.out.println(X.getName()+" exists!");
		}else{
			//if file does not exists it creates one
			try{newFileName1 = new Formatter("Sales2016.txt");
			System.out.println("File Sales2016.txt was created");
			}
			//if file does not exists and can not be created an error message is displayed
			catch (Exception e){
				System.out.println("An error occured");
			}
		}
		//checks to see if file exists
		if (Y.exists()){
			System.out.println(Y.getName()+" exists!");
		}else{
			//if file does not exists it creates one
			try{newFileName2 = new Formatter("COG2016.txt");
			System.out.println("File COG2016.txt was created");
			}
			//if file does not exists and can not be created an error message is displayed
			catch (Exception e){
				System.out.println("An error occured");
			}
		}
		//checks to see if file exists
		if (Z.exists()){
			System.out.println(Z.getName()+" exists!");
		}else{
			//if file does not exists it creates one
			try{newFileName3 = new Formatter("Sales2016revised.txt");
			System.out.println("File Sales2016revised.txt was created");
			}
			//if file does not exists and can not be created an error message is displayed
			catch (Exception e){
				System.out.println("An error occured");
			}
		}
		//checks to see if file exists
		if (P.exists()){
			System.out.println(P.getName()+" exists!");
		}else{
			//if file does not exists it creates one
			try{newFileName4 = new Formatter("COG2016revised.txt");
			System.out.println("File COG2016revised.txt was created");
			}
			//if file does not exists and can not be created an error message is displayed
			catch (Exception e){
				System.out.println("An error occured");
			}
		}
		//checks to see if file exists
		if (Q.exists()){
			System.out.println(Q.getName()+" exists!");
		}else{
			//if file does not exists it creates one
			try{newFileName5 = new Formatter("PL.txt");
			System.out.println("File PL.txt was created");
			}
			//if file does not exists and can not be created an error message is displayed
			catch (Exception e){
				System.out.println("An error occured");
		
	}
		}
}}








public class XWriteToFileMain {
	public static void main (String [] args){
		XWriteToFile get = new XWriteToFile();
		//Methods are called from XWriteToFile
		get.openFile();
		get.addRecords();
		get.closeFile();
		get.openFile1();
		get.addRecords1();
		get.closeFile1();
		get.openFile2();
		get.addRecords2();
		get.closeFile2();
		get.openFile3();
		get.addRecords3();
		get.closeFile3();
	
	}

}














import java.io.*;
import java.util.*;
import java.lang.*;
public class XWriteToFile {
	//Formatters are created for each file
	private Formatter COG2016;
	private Formatter Sales2016;
	private Formatter COG2016revised;
	private Formatter Sales2016revised;
	
	public void openFile(){
		// check to see if file exists and opens it
			try{
				Sales2016 = new Formatter ("Sales2016.txt");
				System.out.print("File was found -");
			//if file could not be found an error pops up
			}catch(Exception e){
				System.out.println("Beep Boop Bop Error");
			}
		}
		public void addRecords(){
			System.out.println("Sales2016");
			//File is populated
			Sales2016.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", "1426","1295","1250","875","629","583","492","241","653","927","1682","2140");
		
		}
		
		public void closeFile(){
			//closes file
			Sales2016.close();
		}
		
		public void openFile1(){
			// check to see if file exists and opens it
			try{
				COG2016 = new Formatter ("COG2016.txt");
				System.out.print("File was found -");
				//if file could not be found an error pops up
			}catch(Exception e){
				System.out.println("Beep Boop Bop Error");
			}
		}
		public void addRecords1(){
			System.out.println("COG2016.txt");
			//File is populated
			COG2016.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", "1207","1124","1093","751","524","475","425","195","542","804","1487","2854");
		
		}
		public void closeFile1(){
			//closes file
			COG2016.close();
		}
		public void openFile2(){
			//check to see if file exists and opens it
			try{
				Sales2016revised = new Formatter ("Sales2016revised.txt");
				System.out.print("File was found -");
				//if file could not be found an error pops up
			}catch(Exception e){
				System.out.println("Beep Boop Bop Error");
			}
		}
		public void addRecords2(){
			System.out.println("Sales2016revised");
			//File is populated
			Sales2016revised.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", "1426","1295","1250","875","629","583","492","241","653","927","1682","3231");
			
		}
		public void closeFile2(){
			//closes file
			Sales2016revised.close();
		}
		public void openFile3(){
			//checks to see if file exists and opens it
			try{
				COG2016revised = new Formatter ("COG2016revised.txt");
				System.out.print("File was found -");
				//if file could not be found an error pops up
			}catch(Exception e){
				System.out.println("Beep Boop Bop Error");
			}
		}
		public void addRecords3(){
			System.out.println("COG2016revised.txt");
			//File is populated
			COG2016revised.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", "1207","1124","1093","751","524","475","425","195","542","804","1487","1854");
			
		}
		public void closeFile3(){
			//closes file
			COG2016revised.close();
		}



}











public class XReadFromFileMain {
	public static void main (String[]args){
		XReadFromFile get = new XReadFromFile();
		//Methods are called from XReadFileMain
		get.openFile();
		get.readFile();
		get.closeFile();
		get.openFile1();
		get.readFile1();
		get.closeFile1();
	}

}






import java.io.*;
import java.util.*;
import java.lang.*;
public class XReadFromFile {
	private Scanner grFile;
	
	ArrayList<String>PLArchive = new ArrayList<String>();
	//Variables are created for Sales and Cog values
	static double Sale1,Sale2,Sale3,Sale4,Sale5,Sale6,Sale7,Sale8,Sale9,Sale10,Sale11,Sale12,Cog1,Cog2,Cog3,Cog4,Cog5,Cog6,Cog7,Cog8,Cog9,Cog10,Cog11,Cog12,sale1,sale2,sale3,sale4,cogs1,cogs2,cogs3,cogs4;
	public void openFile(){
		//Scanner is initialized for Sales file 
		try{
			grFile=new Scanner(new File("Sales2016revised.txt"));
		//if unable to fined file, shows error code 
		}catch(Exception e){
			System.out.println("Unable to open file. File not found");
		}
	}
	
	public void readFile(){
		System.out.printf("\t\t\t   Acme Hockey Equipment\n\t\t\t2016 Profit/Loss Statement\n\t\t\t     (Quarterly $,000)\n\n\t\tJan-Mar \tApr-Jun \tJul-Sep \tOct-Dec \n");
		//Goes through each variable in Sales file and turns them into doubles
		while(grFile.hasNext()){
			String price1 = grFile.next();					
					Sale1= Double.parseDouble(price1);
			String price2 = grFile.next();
					Sale2= Double.parseDouble(price2);
			String price3= grFile.next();
					Sale3= Double.parseDouble(price3);
			String price4= grFile.next();
					Sale4= Double.parseDouble(price4);
			String price5 = grFile.next();
					Sale5= Double.parseDouble(price5);
			String price6 = grFile.next();
					Sale6= Double.parseDouble(price6);
			String price7= grFile.next();
					Sale7= Double.parseDouble(price7);
			String price8= grFile.next();
					Sale8= Double.parseDouble(price8);
			String price9 = grFile.next();
					Sale9= Double.parseDouble(price9);
			String price10 = grFile.next();
					Sale10= Double.parseDouble(price10);
			String price11= grFile.next();
					Sale11= Double.parseDouble(price11);
			String price12= grFile.next();
					Sale12= Double.parseDouble(price12);
			//Sale's for every 3 months are added for quarterly values
		    sale1 = Sale1 + Sale2 + Sale3;		
		    sale2 = Sale4 + Sale5 + Sale6;	
		    sale3 = Sale7 + Sale8 + Sale9;	
		    sale4 = Sale10 + Sale11 + Sale12;	
			//quarterly values are printed		
		    System.out.printf("Sales\t\t$%.2f\t$%.2f\t$%.2f\t$%.2f\n",sale1,sale2,sale3,sale4);
		}
		}
		public void closeFile(){
			grFile.close();
		}
		
		
		public void openFile1(){
			//Scanner is initialized for Cog file 
			try{
				grFile=new Scanner(new File("COG2016revised.txt"));
				//if unable to fined file, shows error code 
			}catch(Exception e){
				System.out.println("Unable to open file. File not found");
			}
		}
		
		public void readFile1(){
			//Goes through each variable in Cog file and turns them into doubles
			while(grFile.hasNext()){
				String cog1 = grFile.next();
						Cog1= Double.parseDouble(cog1);
				String cog2 = grFile.next();
						Cog2= Double.parseDouble(cog2);
				String cog3= grFile.next();
						Cog3= Double.parseDouble(cog3);
				String cog4= grFile.next();
						Cog4= Double.parseDouble(cog4);
				String cog5 = grFile.next();
						Cog5= Double.parseDouble(cog5);
				String cog6 = grFile.next();
						Cog6= Double.parseDouble(cog6);
				String cog7= grFile.next();
						Cog7= Double.parseDouble(cog7);
				String cog8= grFile.next();
						Cog8= Double.parseDouble(cog8);
				String cog9 = grFile.next();
						Cog9= Double.parseDouble(cog9);
				String cog10 = grFile.next();
						Cog10= Double.parseDouble(cog10);
				String cog11= grFile.next();
						Cog11= Double.parseDouble(cog11);
				String cog12= grFile.next();
						Cog12= Double.parseDouble(cog12);
			    //Sale's for every 3 months are added for quarterly values		
				cogs1 = Cog1 + Cog2 + Cog3;		
				cogs2 = Cog4 + Cog5 + Cog6;	
				cogs3 = Cog7 + Cog8 + Cog9;	
				cogs4 = Cog10 + Cog11 + Cog12;
				//quarterly values are printed	
			System.out.printf("COG\t\t$%.2f \t$%.2f \t$%.2f \t$%.2f\n",cogs1,cogs2,cogs3,cogs4);	
			//Profit/Loss is calculated and then turned into a string to send to archive
			double PL1=sale1-cogs1;
			String PLS1 =Double.toString(PL1);
			double PL2=sale2-cogs2;
			String PLS2 =Double.toString(PL2);
			double PL3=sale3-cogs3;
			String PLS3 =Double.toString(PL3);
			double PL4=sale4-cogs4;
			String PLS4 =Double.toString(PL4);
			
			System.out.printf("------------------------------------------------------------------------ \nProfit/Loss\t$%.2f \t$%.2f \t$%.2f \t$%.2f\n",PL1,PL2,PL3,PL4);	
			//Profit/Loss Strings are sent to archive
			PLArchive.add(PLS1);
			PLArchive.add(PLS2);
			PLArchive.add(PLS3);
			PLArchive.add(PLS4);
			}
			XUpdater set = new XUpdater();
			//Methods are called from XUpdater
			set.openFile();
			set.addRecords(PLArchive);
			set.closeFile();
		}
			public void closeFile1(){
				grFile.close();
			}
	
}
			




import java.io.*;
import java.util.*;
import java.lang.*;
public class XUpdater {
	private Formatter PL;
	
	public void openFile(){
		//Creates file
		try{
		PL = new Formatter ("PL.txt");
	}
		//if file could not be created an error pops up
		catch(Exception e){
		System.out.println("Unable to open File, File nto found");
	}
}
	
	public void addRecords(ArrayList PLArchive){
		//For loop populates archive file with profit/loss strings 
		for(int i=0; i<PLArchive.size(); i++){
			PL.format("%s\n", PLArchive.get(i));		
		}
	}
	public void closeFile(){
		PL.close();
	}


}

