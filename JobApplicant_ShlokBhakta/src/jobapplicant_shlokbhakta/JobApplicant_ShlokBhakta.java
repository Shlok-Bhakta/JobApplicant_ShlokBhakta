/*
Name - Shlok Bhakta
Date - 9/18/2020
Project name - Job Applicant
*/
package jobapplicant_shlokbhakta;
import javax.swing.JOptionPane;

public class JobApplicant_ShlokBhakta {




	public static void main(String[] args) {
	
	String input;
	boolean inputboo;
	int middle;
	
	String nam;
	String numbe;
	boolean words;
	boolean excel;
	boolean access;
	boolean adobe;
	
	
	
	
	
	
	
	
	input = JOptionPane.showInputDialog(null, "What is the applicants name");
	
		
	String a = input;
	//name
	TestJobApplicants name = new TestJobApplicants();
	name.setString(a);
	nam = name.getString();
		
	input = JOptionPane.showInputDialog(null, "What is the applicants phone number? (please use dashes if you wish)");
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String b = input;	
	
	//number
	TestJobApplicants number = new TestJobApplicants();
	number.setString(b);
	numbe = number.getString();
	
	middle = JOptionPane.showConfirmDialog(null, "is the applicant good at word processing?");
	inputboo = (middle == JOptionPane.YES_OPTION);
		
	
	
	
	
	
	
	
	
	
	
	
	
	boolean c = inputboo;	
	
	//word
	TestJobApplicants word = new TestJobApplicants();
	word.setboo(c);
	words = word.getboo();	

	middle = JOptionPane.showConfirmDialog(null, "is the applicant good with spreadsheets?");
	inputboo = (middle == JOptionPane.YES_OPTION);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	boolean d = inputboo;	
	
	//excel
	TestJobApplicants spreadsheet = new TestJobApplicants();
	spreadsheet.setboo(d);
	excel = spreadsheet.getboo();
	
	middle = JOptionPane.showConfirmDialog(null, "is the applicant good at database processing?");
	inputboo = (middle == JOptionPane.YES_OPTION);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	boolean e = inputboo;	

	//access
	TestJobApplicants database = new TestJobApplicants();
	database.setboo(e);
	access = database.getboo();

	middle = JOptionPane.showConfirmDialog(null, "is the applicant good at graphical design?");
	inputboo = (middle == JOptionPane.YES_OPTION);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	boolean f = inputboo;	

	//adobe
	TestJobApplicants GraphicalDesign = new TestJobApplicants();
	GraphicalDesign.setboo(f);
	adobe = GraphicalDesign.getboo();
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	calculation(nam, numbe, words, excel, access, adobe);
	
	
	
	
	
	
	
	
	
	}
	
	public static void calculation(String name, String num, boolean doc, boolean xlx, boolean acc, boolean adob){
		int x = 0;
		if (doc == true){
			x++;
		}
		if (xlx == true){
			x++;
		}
		if (acc == true){
			x++;
		}		
		if (adob == true){
			x++;
		}		
		
		if (x >= 3){
			System.out.println(name + " is a qualified employee. Their number is " + num);
		} else {
			System.out.println(name + " is an unqualified employee. Their number is " + num);
		}
		
	}
	
	
	
	
	
}
