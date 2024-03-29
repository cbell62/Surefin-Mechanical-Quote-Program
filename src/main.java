import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.EventObject;
import java.util.Scanner;

import javax.swing.JFrame;

public class main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
    	main rc=new main();   //object of the class
    	GUI Frame = new GUI();
    	
        try {
            Frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	public static void formCalculations(GUI inFrame) throws IOException 
	{
        main rc = new main();
        	
    	//reading the value of 45th row and 3rd column  
    	double vOutput=rc.ReadCellData(44, 3);  //reading price of aluminum fin .006
    	double v2Output=rc.ReadCellData(45,3); //reading price of aluminum fin .008
    	double v3Output=rc.ReadCellData(46, 3); //reading price of aluminum fin .010
    	double v4Output=rc.ReadCellData(47, 3); //reading price of copper fin .008
    	double v5Output=rc.ReadCellData(48, 3); //reading price of copper fin .010
    	double v6Output=rc.ReadCellData(49, 3); //reading price of copper fin .015
    	double v7Output=rc.ReadCellData(51, 3); //reading price of stainless steel .006
    	double v8Output=rc.ReadCellData(52, 3); //reading price of stainless steel fin .008
    	double v9Output=rc.ReadCellData(53, 3); //reading price of stainless steel .010
    	double v10Output=rc.ReadCellData(99, 3); //reading price of alum 3in x .010
    	double rOutput=rc.ReadCellData(81,3); //reading price of tubing 1/2 x 0.035 cu
    	double r2Output=rc.ReadCellData(82,3); 
    	double r3Output=rc.ReadCellData(83,3); 
    	double r4Output=rc.ReadCellData(84,3); 
    	double r5Output=rc.ReadCellData(85,3); 
    	double r6Output=rc.ReadCellData(86,3);
    	double r7Output=rc.ReadCellData(87,3); 
    	double r8Output=rc.ReadCellData(88,3); 
    	double r9Output=rc.ReadCellData(89,3);
    	double r10Output=rc.ReadCellData(90,3); 
    	double r11Output=rc.ReadCellData(95,3); 
    	double r12Output=rc.ReadCellData(91,3); 
    	double r13Output=rc.ReadCellData(92,3);
    	double r14Output=rc.ReadCellData(93,3);
    	double r16Output=rc.ReadCellData(98,3);
    	double r15Output=rc.ReadCellData(78, 3); //reading price of return Bends
    	double fOutput=rc.ReadCellData(56, 3); //ss frame
    	double f1Output=rc.ReadCellData(57, 3); //galvanneal frame
    	double f2Output=rc.ReadCellData(58, 3); //galvanize frame
    	double sOutput = rc.ReadCellData (79,3); //solder 5% silver
    	double s1Output = rc.ReadCellData (80,3); //solder 15% silver
    	double s2Output = rc.ReadCellData (94,3); //vents
        double hOutput = rc.ReadCellData(59,3);
        double h2Output = rc.ReadCellData(60,3);
        double h3Output = rc.ReadCellData(61,3);
        double h4Output = rc.ReadCellData(62,3);
        double h5Output = rc.ReadCellData(63,3);
        double h6Output = rc.ReadCellData(64,3);
        double h7Output = rc.ReadCellData (65,3);
        double dOuput = rc.ReadCellData(19,3);
        double tOutput = rc.ReadCellData(20, 3);
        double t1Output = rc.ReadCellData(21, 3);
        double t2Output = rc.ReadCellData(22, 3);
        double t3Output = rc.ReadCellData(23, 3);
        double t4Output = rc.ReadCellData(24, 3);
        double t5Output = rc.ReadCellData(25, 3);
        double t6Output = rc.ReadCellData(26, 3);
        double t7Output = rc.ReadCellData(27, 3);
        double t8Output = rc.ReadCellData(28, 3);
        double t9Output = rc.ReadCellData(29, 3);
        double t10Output = rc.ReadCellData(30, 3);
        double t11Output = rc.ReadCellData(31, 3);
        double t12Output = rc.ReadCellData(32, 3);
        double t13Output = rc.ReadCellData(33, 3);
        double t14Output = rc.ReadCellData(34, 3);
        double t15Output = rc.ReadCellData(35, 3);
        double t16Output = rc.ReadCellData(36, 3);
        double t17Output = rc.ReadCellData(37, 3);
        double t18Output = rc.ReadCellData(38, 3);
        double t19Output = rc.ReadCellData(39, 3);
        double t20Output = rc.ReadCellData(40, 3);
        double t21Output = rc.ReadCellData(41, 3);
        double t22Output = rc.ReadCellData(42, 3);
        double szOutput = rc.ReadCellData(75, 3);
        double sz2Output = rc.ReadCellData(76, 3);
        double sz3Output = rc.ReadCellData(77, 3);
        double cOutput = rc.ReadCellData(2, 3);
        double c1Output = rc.ReadCellData(3, 3);
        double c2Output = rc.ReadCellData(4, 3);
        double c3Output = rc.ReadCellData(5, 3);
        double c4Output = rc.ReadCellData(15,3);
        double c5Output = rc.ReadCellData(6, 3);
        double c6Output = rc.ReadCellData(7,3);
        double c7Output = rc.ReadCellData(8, 3);
        double c8Output = rc.ReadCellData(9, 3);
        double c9Output = rc.ReadCellData(10, 3);
        double c10Output = rc.ReadCellData(12, 3);
        double c11Output = rc.ReadCellData(11, 3);
        double c12Output = rc.ReadCellData(13, 3);
        double c13Output = rc.ReadCellData(14, 3);
        double c14Output = rc.ReadCellData(17, 3);
        double c15Output = rc.ReadCellData(16, 3);
        double lOutput = rc.ReadCellData(97, 3);
       
        Scanner scan = new Scanner(System.in); //declaring scan as an object of Scanner class.
        // input will be given to the system through system.in
        int type; //declaring variable type
        int rowNumber; //declaring variable rowNumber
        int finmaterialSelection; //declaring variable finmaterialselection
        int hdiameterSelect; //declares variable hdiameterSelect
        int distributorSelect; //declares variable distributorSelect
        int typeSelect; //declares variable typeSelect
        int sizeSelect; //declares variable sizeSelect
        int amountSelect; //declares variable amountSelect
        int tmaterialSelect; //declares variable tmaterialSelect
        int priceSelect; 
        int smaterialSelect;
        int fmaterialSelect;
        int categorySelect;
        int connectionsSelect;
        int connectionS;
        double headerCost = 0;
        double newPrice=0;
        double finCost = 0;
        double tubingPrice = 0;
        double tubingPrice1=0;
        double frameCost = 0;
        double solderCost = 0;
        double discCost=0;
        double totaldCost = 0;
        double totalPrice=0;
        double rbendsPrice = 0;
        double ventsPrice = 0;
        double connectionPrice = 0;
        double capCost = 0;
        double finalPrice = 0;
        double laborCost=0;
        ConnectionSelection connectionSelection = null;
        CategorySelection categorySelection = null;
        SolderMaterial solderMaterial = null;
        FrameMaterial frameMaterial = null;
        CoilType coilType = null; //setting coilType from enum class CoilType to null
        FinMaterial finMaterial = null; //setting finMaterial from enum class FinMaterial to null
        HeaderDiameter headerDiameter = null; //setting headerDiameter from enum HeaderDiameter to null
        DistributorType distributorType = null; //setting distributorType from enum DistributorType to null
        TypeSelector typeSelector = null; //setting typeSelector from enum TypeSelector to null
        SizeSelector sizeSelector = null; //setting sizeSelector from enum SizeSelector to null
        AmountSelector amountSelector = null; //setting amountSelector from enum AmountSelector to null
        TubingMaterialSelect tubingMaterialSelect = null; //setting tubingMaterialSelect from enum TubingMaterialSelect to null
               
        		//while (ready)
        		do {
                    //this prints out the menu choices for the type of coil for the user to choose from
                    System.out.println("1. Water Coil\n" + "2. Steam Coil\n" + "3. Evaporator/DX Coil\n" + "4. Steam Distributing Coil\n"
                            + "5. Condensing Coil\n" + "6. Booster/Hot Water Coil\n");
                  
                   
                    // used to input value of an integer variable 'type' from user.
                   // System.out.print("Enter type of coil: ");  type=scan.nextInt();
                  type = inFrame.type_of_coil_Inp();
                
                    switch (type) {
                        case 1:
                            coilType = CoilType.Water_Coil;
                            break;
                        case 2:
                            coilType = CoilType.Steam_Coil;
                            break;
                        case 3:
                            coilType = CoilType.Evaporater_Coil;
                            break;
                        case 4:
                            coilType = CoilType.Steam_Distributing_Coil;
                            break;
                        case 5:
                            coilType = CoilType.Condensing_Coil;
                            break;
                        case 6:
                            coilType = CoilType.Booster_Coil;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            coilType = CoilType.Water_Coil;
                            break;

                    }
                } while (type < 1 || type > 6);
                if (type == 1) {
                  waterCoil(inFrame);
                    
                } else if (type == 2) {
                   steamCoil(inFrame);
                    
                   
                } else if (type == 3) {
                	evaporaterCoil(inFrame);
                    
                } else if (type == 5) {
                	condensingCoil(inFrame);
                	
                } else if (type == 4) {
                    steamdistributionCoil(inFrame);
                    
                } else if (type == 6) {

                   boosterCoil(inFrame);
                    
                    }
                
             
               	 }
                           
	public String ReadCellData1(int vRow, int vColumn)  
				{  
					String value;          //variable for storing the cell value  
					Workbook wb=null;           //initialize Workbook null  
				try  
				{  
					//reading data from a file in the form of bytes  
					FileInputStream fis=new FileInputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\dbs.xlsx");
					//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
					wb=new XSSFWorkbook(fis);  
				}  
				catch(FileNotFoundException e)  
				{  
				     e.printStackTrace();  
				}  
				catch(IOException e1)  
				{  
				     e1.printStackTrace();  
				}  
					Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
					Row row=sheet.getRow(vRow); //returns the logical row  
					Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
					value=cell.getStringCellValue();    //getting cell value  
					return value;               //returns the cell value  
				}  
				
	public double ReadCellData(int vRow, int vColumn)  
				{  
				double value;          //variable for storing the cell value  
				Workbook wb=null;           //initialize Workbook null  
				try  
				{  
				//reading data from a file in the form of bytes  
				FileInputStream fis=new FileInputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\dbs.xlsx");
				//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
				wb=new XSSFWorkbook(fis);  
				}  
				catch(FileNotFoundException e)  
				{  
				e.printStackTrace();  
				}  
				catch(IOException e1)  
				{  
				e1.printStackTrace();  
				}  
				Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
				Row row=sheet.getRow(vRow); //returns the logical row  
				Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
				value=cell.getNumericCellValue();    //getting cell value  
				return value;               //returns the cell value  
				}				
			        
	public static void waterCoil (GUI inFrame) throws IOException {
				main rc=new main();   //object of the class  
				//reading the value of 45th row and 3rd column  
				double vOutput=rc.ReadCellData(44, 3);  //reading price of aluminum fin .006
				double v2Output=rc.ReadCellData(45,3); //reading price of aluminum fin .008
				double v3Output=rc.ReadCellData(46, 3); //reading price of aluminum fin .010
				double v4Output=rc.ReadCellData(47, 3); //reading price of copper fin .008
				double v5Output=rc.ReadCellData(48, 3); //reading price of copper fin .010
				double v6Output=rc.ReadCellData(49, 3); //reading price of copper fin .015
				double v7Output=rc.ReadCellData(51, 3); //reading price of stainless steel .006
				double v8Output=rc.ReadCellData(52, 3); //reading price of stainless steel fin .008
				double v9Output=rc.ReadCellData(53, 3); //reading price of stainless steel .010
				double v10Output=rc.ReadCellData(99, 3); //reading price of alum 3in x .010
				double rOutput=rc.ReadCellData(81,3); //reading price of tubing 1/2 x 0.035 cu
				double r2Output=rc.ReadCellData(82,3); 
				double r3Output=rc.ReadCellData(83,3); 
				double r4Output=rc.ReadCellData(84,3); 
				double r5Output=rc.ReadCellData(85,3); 
				double r6Output=rc.ReadCellData(86,3);
				double r7Output=rc.ReadCellData(87,3); 
				double r8Output=rc.ReadCellData(88,3); 
				double r9Output=rc.ReadCellData(89,3);
				double r10Output=rc.ReadCellData(90,3); 
				double r11Output=rc.ReadCellData(95,3); 
				double r12Output=rc.ReadCellData(91,3); 
				double r13Output=rc.ReadCellData(92,3);
				double r14Output=rc.ReadCellData(93,3); 
				double r16Output=rc.ReadCellData(98,3);
				double r15Output=rc.ReadCellData(78, 3); //reading price of return Bends
				double fOutput=rc.ReadCellData(56, 3); //ss frame
				double f1Output=rc.ReadCellData(57, 3); //galvanneal frame
				double f2Output=rc.ReadCellData(58, 3); //galvanize frame
				double sOutput = rc.ReadCellData (79,3); //solder 5% silver
				double s1Output = rc.ReadCellData (80,3); //solder 15% silver
				double s2Output = rc.ReadCellData (94,3); //vents
			    double hOutput = rc.ReadCellData(59,3);
			    double h2Output = rc.ReadCellData(60,3);
			    double h3Output = rc.ReadCellData(61,3);
			    double h4Output = rc.ReadCellData(62,3);
			    double h5Output = rc.ReadCellData(63,3);
			    double h6Output = rc.ReadCellData(64,3);
			    double h7Output = rc.ReadCellData (65,3);
			    double dOuput = rc.ReadCellData(19,3);
			    double tOutput = rc.ReadCellData(20, 3);
			    double t1Output = rc.ReadCellData(21, 3);
			    double t2Output = rc.ReadCellData(22, 3);
			    double t3Output = rc.ReadCellData(23, 3);
			    double t4Output = rc.ReadCellData(24, 3);
			    double t5Output = rc.ReadCellData(25, 3);
			    double t6Output = rc.ReadCellData(26, 3);
			    double t7Output = rc.ReadCellData(27, 3);
			    double t8Output = rc.ReadCellData(28, 3);
			    double t9Output = rc.ReadCellData(29, 3);
			    double t10Output = rc.ReadCellData(30, 3);
			    double t11Output = rc.ReadCellData(31, 3);
			    double t12Output = rc.ReadCellData(32, 3);
			    double t13Output = rc.ReadCellData(33, 3);
			    double t14Output = rc.ReadCellData(34, 3);
			    double t15Output = rc.ReadCellData(35, 3);
			    double t16Output = rc.ReadCellData(36, 3);
			    double t17Output = rc.ReadCellData(37, 3);
			    double t18Output = rc.ReadCellData(38, 3);
			    double t19Output = rc.ReadCellData(39, 3);
			    double t20Output = rc.ReadCellData(40, 3);
			    double t21Output = rc.ReadCellData(41, 3);
			    double t22Output = rc.ReadCellData(42, 3);
			    double szOutput = rc.ReadCellData(75, 3);
			    double sz2Output = rc.ReadCellData(76, 3);
			    double sz3Output = rc.ReadCellData(77, 3);
			    double cOutput = rc.ReadCellData(2, 3);
			    double c1Output = rc.ReadCellData(3, 3);
			    double c2Output = rc.ReadCellData(4, 3);
			    double c3Output = rc.ReadCellData(5, 3);
			    double c4Output = rc.ReadCellData(15,3);
			    double c5Output = rc.ReadCellData(6, 3);
			    double c6Output = rc.ReadCellData(7,3);
			    double c7Output = rc.ReadCellData(8, 3);
			    double c8Output = rc.ReadCellData(9, 3);
			    double c9Output = rc.ReadCellData(10, 3);
			    double c10Output = rc.ReadCellData(12, 3);
			    double c11Output = rc.ReadCellData(11, 3);
			    double c12Output = rc.ReadCellData(13, 3);
			    double c13Output = rc.ReadCellData(14, 3);
			    double c14Output = rc.ReadCellData(17, 3);
			    double c15Output = rc.ReadCellData(16, 3);
			    double lOutput = rc.ReadCellData (97,3);
				Scanner scan = new Scanner(System.in); //declaring scan as an object of Scanner class.
				int type; //declaring variable type
			    int rowNumber; //declaring variable rowNumber
			    int finmaterialSelection; //declaring variable finmaterialselection
			    int hdiameterSelect; //declares variable hdiameterSelect
			    int distributorSelect; //declares variable distributorSelect
			    int typeSelect; //declares variable typeSelect
			    int sizeSelect; //declares variable sizeSelect
			    int amountSelect; //declares variable amountSelect
			    int tmaterialSelect; //declares variable tmaterialSelect
			    int priceSelect; 
			    int smaterialSelect;
			    int fmaterialSelect;
			    int categorySelect;
			    int connectionsSelect;
			    int connectionS;
			    double headerCost = 0;
			    double newPrice=0;
			    double finCost = 0;
			    double tubingPrice = 0;
			    double tubingPrice1=0;
			    double frameCost = 0;
			    double solderCost = 0;
			    double discCost=0;
			    double totaldCost = 0;
			    double totalPrice=0;
			    double rbendsPrice = 0;
			    double ventsPrice = 0;
			    double connectionPrice = 0;
			    double capCost = 0;
			    double laborCost = 0;
			    double finalPrice = 0;
			    ConnectionSelection connectionSelection = null;
			    CategorySelection categorySelection = null;
			    SolderMaterial solderMaterial = null;
			    FrameMaterial frameMaterial = null;
			    CoilType coilType = null; //setting coilType from enum class CoilType to null
			    FinMaterial finMaterial = null; //setting finMaterial from enum class FinMaterial to null
			    HeaderDiameter headerDiameter = null; //setting headerDiameter from enum HeaderDiameter to null
			    DistributorType distributorType = null; //setting distributorType from enum DistributorType to null
			    TypeSelector typeSelector = null; //setting typeSelector from enum TypeSelector to null
			    SizeSelector sizeSelector = null; //setting sizeSelector from enum SizeSelector to null
			    AmountSelector amountSelector = null; //setting amountSelector from enum AmountSelector to null
			    TubingMaterialSelect tubingMaterialSelect = null; //setting tubingMaterialSelect from enum TubingMaterialSelect to nu
			    //declares variable finHeight and is used to input an integer variable 'finheight' from users
				  //declares variable finHeight and is used to input an integer variable 'finheight' from users
			    double finHeight = inFrame.fin_height_Inp();
			
			    //declares variable finLength and is used to input an integer variable 'finLength' from users
			    double finLength = inFrame.fin_length_Inp();
			    //prompts users to enter in fins per inch
			    double finperInch = inFrame.fin_pinch_Inp();
			   
			    double finWeight; //declares double variable finWeight
			
			    //sets value of fin weight by taking the fin height times fin length times fins per inch and divides it by 12
			    finWeight = (finHeight * finLength * finperInch) / 12;
			
			
			    //prompts user to enter in the number of rows
			    rowNumber = inFrame.row_num_Inp();
			  //Read the spreadsheet that needs to be updated
				
			    
			    //prints out empty line (to make output in terminal look neater)
			    System.out.println();
			
			    do {
			        //this prints out the menu choices for fin material for the user to choose from
			        System.out.println("1. Aluminum .006\n" + "2. Aluminum .008\n" + "3. Aluminum .010\n" + "4. Copper .008\n"
			                + "5. Copper .010\n" + "6. Copper .015\n" + "7. Stainless Steel .006\n"
			                + "8. Stainless Steel .008\n" + "9. Stainless Steel .010\n" + "10. Aluminum 3 x .010\n");
			        // used to input value of an integer variable 'finmaterialSelection' from user.
			        finmaterialSelection = inFrame.mat_of_fin_Inp();
			        switch (finmaterialSelection) {
			            case 1:
			                finMaterial = FinMaterial.Aluminum_Six;
			                break;
			            case 2:
			                finMaterial = FinMaterial.Aluminum_Eight;
			                break;
			            case 3:
			                finMaterial = FinMaterial.Aluminum_Ten;
			                break;
			            case 4:
			                finMaterial = FinMaterial.Copper_Eight;
			                break;
			            case 5:
			                finMaterial = FinMaterial.Copper_Ten;
			                break;
			            case 6:
			                finMaterial = FinMaterial.Copper_Fifthteen;
			                break;
			            case 7:
			                finMaterial = FinMaterial.Stainless_Steel_Six;
			                break;
			            case 8:
			                finMaterial = FinMaterial.Stainless_Steel_Eight;
			                break;
			            case 9:
			                finMaterial = FinMaterial.Stainless_Steel_Ten;
			                break;
			            case 10:
			            	finMaterial = FinMaterial.three_ten_alum;
			            	
			            default:
			                System.out.println("Invalid choice!");
			                finMaterial = FinMaterial.Aluminum_Six;
			                break;
			
			        }
			    } while (finmaterialSelection < 1 || finmaterialSelection > 10);
			    if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 1) {
			        finWeight = finWeight * .010;
			        finCost = finWeight * vOutput;
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 1) {
			         finWeight = finWeight * .013;
			         finCost = finWeight * v2Output;
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 1) {
			         finWeight = finWeight * .016;
			         finCost = finWeight * v3Output;
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 1) {
			         finWeight = finWeight * .043;
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 1) {
			         finWeight = finWeight * .054;
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 1) {
			         finWeight = finWeight * .0756;
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 1) {
			         finWeight = finWeight * .028;
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 1) {
			         finWeight = finWeight * .038;
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 1) {
			         finWeight = finWeight * .047;
			         finCost = finWeight * v9Output;
			     } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 1) {
			    	 finWeight = finWeight * .049;
			    	 finCost = finWeight * v10Output;
			     } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 2) {
			    	 finWeight = finWeight * .097;
			    	 finCost = finWeight * v10Output;
			     } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 2) {
			         finWeight = finWeight * .020;
			         finCost = finWeight * vOutput;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 2) {
			         finWeight = finWeight * .026;
			         finCost = finWeight * v2Output;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 2) {
			         finWeight = finWeight * .032;
			         finCost = finWeight * v3Output;
			         
			
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 2) {
			         finWeight = finWeight * .086;
			         finCost = finWeight * v4Output;
			
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 2) {
			         finWeight = finWeight * .107;
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 2) {
			         finWeight = finWeight * .1522;
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 2) {
			         finWeight = finWeight * .056;
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 2) {
			         finWeight = finWeight * .075;
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 2) {
			         finWeight = finWeight * .093;
			         finCost = finWeight * v9Output;
			     } 

				    //number of rows equaling 3
			      else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 3) {
			         finWeight = finWeight * .029;
			         finCost = finWeight * vOutput;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 3) {
			         finWeight = finWeight * .039;
			         finCost = finWeight * v2Output;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 3) {
			         finWeight = finWeight * .049;
			         finCost = finWeight * v3Output;
			
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 3) {
			         finWeight = finWeight * .129;
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 3) {
			         finWeight = finWeight * .161;
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 3) {
			         finWeight = finWeight * .2268;
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 3) {
			         finWeight = finWeight * .084;
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 3) {
			         finWeight = finWeight * .112;
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 3) {
			         finWeight = finWeight * .140;
			         finCost = finWeight * v9Output;
			     } 
			    
			    //number of rows equaling 4
			     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 4) {
			         finWeight = finWeight * .039;
			         finCost = finWeight * vOutput;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 4) {
			         finWeight = finWeight * .052;
			         finCost = finWeight * v2Output;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 4) {
			         finWeight = finWeight * .065;
			         finCost = finWeight * v3Output;
			
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 4) {
			         finWeight = finWeight * .172;
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 4) {
			         finWeight = finWeight * .215;
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 4) {
			         finWeight = finWeight * .3023;
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 4) {
			         finWeight = finWeight * .112;
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 4) {
			         finWeight = finWeight * .149;
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 4) {
			         finWeight = finWeight * .187;
			         finCost = finWeight * v9Output;
			     } 
			     
			    //number of rows equaling 5
			     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 5) {
			         finWeight = finWeight * .049;
			         finCost = finWeight * vOutput;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 5) {
			         finWeight = finWeight * .065;
			         finCost = finWeight * v2Output;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 5) {
			         finWeight = finWeight * .081;
			         finCost = finWeight * v3Output;
			
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 5) {
			         finWeight = finWeight * .215;
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 5) {
			         finWeight = finWeight * .269;
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 5) {
			         finWeight = finWeight * .378;
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 5) {
			         finWeight = finWeight * .140;
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 5) {
			         finWeight = finWeight * .187;
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 5) {
			         finWeight = finWeight * .233;
			         finCost = finWeight * v9Output;
			     } 
			     
			  //number of rows equaling 6
			     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 6) {
			         finWeight = finWeight * .058;
			         finCost = finWeight * vOutput;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 6) {
			         finWeight = finWeight * .078;
			         finCost = finWeight * v2Output;
			
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 6) {
			         finWeight = finWeight * .081;
			         finCost = finWeight * v3Output;
			
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 6) {
			         finWeight = finWeight * .258;
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 6) {
			         finWeight = finWeight * .322;
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 6) {
			         finWeight = finWeight * .4515;
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 6) {
			         finWeight = finWeight * .168;
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 6) {
			         finWeight = finWeight * .224;
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 6) {
			         finWeight = finWeight * .280;
			         finCost = finWeight * v9Output;
			     } 
			     
			  //number of rows equaling 7
			     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 7) {
			    	 finWeight = (finWeight * .039) + (finWeight * .029);
			         finCost = finWeight * vOutput;
			     }  else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 7) {
			    	 finWeight = (finWeight * .052) + (finWeight * .039);
			         finCost = finWeight * v2Output;
			    } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 7) {
			    	 finWeight = (finWeight * .065) + (finWeight * .049);
			         finCost = finWeight * v3Output;
			    } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 7) {
			    	 finWeight = (finWeight * .172) + (finWeight * .129);
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 7) {
			    	 finWeight = (finWeight * .215) + (finWeight * .161);
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 7) {
			    	 finWeight = (finWeight * .3023) + (finWeight * .2268);
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 7) {
			    	  finWeight = (finWeight * .112) + (finWeight * .084);
				      finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 7) {
			    	 finWeight = (finWeight * .149) + (finWeight * .112);
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 7) {
			    	 finWeight = (finWeight * .187) + (finWeight * .140);
			         finCost = finWeight * v9Output;
			         
			    }
			      //number of rows equaling 8
			     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 8)
			     {
			    	 finWeight = (finWeight * .039) +  (finWeight * .039);
			         finCost = finWeight * vOutput;
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 8)
			     {
			     finWeight = (finWeight * .052) + (finWeight * .052);
			         finCost = finWeight * v2Output;
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 8) {
			         finWeight = finWeight * .129;
			         finCost = finWeight * v3Output; 
			      
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 8)
			     {
			    	 finWeight = (finWeight * .172) + (finWeight * .172);
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 8)
			     {
			     finWeight = (finWeight * .215) + (finWeight * .215);
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 8) {
			         finWeight = (finWeight * .3023) + (finWeight * .3023);
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 8)
			     {
			    	  finWeight = (finWeight * .112) + (finWeight * .112);
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 8)
			     {
			         finWeight = (finWeight * .149) + (finWeight * .149);
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 8) {
			         finWeight = (finWeight * .187) + (finWeight * .187);
			         finCost = finWeight * v9Output;

			     }
			     
			      //number of rows equaling 9
			      
			     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 9)
			     {
			    	 finWeight = (finWeight * .039) + (finWeight * .049);
			         finCost = finWeight * vOutput;
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 9)
			     {
			     finWeight = (finWeight * .052) + (finWeight * .065);
			         finCost = finWeight * v2Output;
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 9) {
			         
			      finWeight = (finWeight * .065) + (finWeight * .081);
			         finCost = finWeight * v3Output;
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 9)
			     {
			    	 finWeight = (finWeight * .172) + (finWeight * .215);
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 9)
			     {
			     finWeight = (finWeight * .215) + (finWeight * .269);
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 9) {
			         finWeight = (finWeight * .3023) + (finWeight * .378);
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 9)
			     {
			    	  finWeight = (finWeight * .112) + (finWeight * .140);
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 9)
			     {
			     finWeight = (finWeight * .149) + (finWeight * .187);
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 9) {
			         
			         finWeight = (finWeight * .187) + (finWeight * .233);
			         finCost = finWeight * v9Output;
			     }
			      
			     //number of rows equaling 10
			     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 10)
			     {
			    	finWeight = (finWeight * .039) + (finWeight * .058);
			         finCost = finWeight * vOutput; 
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 10)
			     {
			     finWeight = (finWeight * .052) + (finWeight * .078);
			         finCost = finWeight * v2Output;
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 10) {
			         
			      finWeight = (finWeight * .065) + (finWeight * .081);
			         finCost = finWeight * v3Output;
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 10)
			     {
			    	 finWeight = (finWeight * .172) + (finWeight * .258);
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 10)
			     {
			     finWeight = (finWeight * .215) + (finWeight * .322);
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 10) {
			      finWeight = (finWeight * .3023) + (finWeight * .4515);
			         finCost = finWeight * v6Output;   
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 10)
			     {
			    	  finWeight = (finWeight * .112) + (finWeight * .168);
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 10)
			     {
			     finWeight = (finWeight * .149) + (finWeight * .224);
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 10) {
			         
			         finWeight = (finWeight * .187) + (finWeight * .280);
			         finCost = finWeight * v9Output;
			     } 
			     
			     //number of rows equaling 11
			     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 11)
			     {
			    	 finWeight = (finWeight * .039) + ((finWeight * .039) + (finWeight * .029));
			         finCost = finWeight * vOutput;
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 11)
			     {
			         finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .039));
			         finCost = finWeight * v2Output;
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 11) {
			         finWeight = (finWeight * .065) + ((finWeight * .065) + (finWeight * .049));
			         finCost = finWeight * v3Output;
			      
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 11)
			     {
			    	 finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .129));
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 11)
			     {
			         finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .161));
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 11) {
			         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .2268));
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 11)
			     {
			    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .084));
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 11)
			     {
			     finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .112));
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 11) {
			         finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .140));
			         finCost = finWeight * v9Output;
			     }
			     //number of rows equaling 12
			     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 12)
			     {
			    	 finWeight = (finWeight * .039) + ((finWeight * .039) +  finWeight * .039);
			         finCost = finWeight * vOutput;
			     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 12)
			     {
			     finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .052));
			         finCost = finWeight * v2Output;
			     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 12) {
			         
			      finWeight = (finWeight * .065) + (finWeight * .129);
			         finCost = finWeight * v3Output;
			     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 12)
			     {
			    	finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .172));
			         finCost = finWeight * v4Output;
			     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 12)
			     {
			     finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .215));
			         finCost = finWeight * v5Output;
			     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 12) {
			         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .3023));
			         finCost = finWeight * v6Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 12)
			     {
			    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .112));
			         finCost = finWeight * v7Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 12)
			     {
			       finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .149));
			         finCost = finWeight * v8Output;
			     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 12) {
			        finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .187));
			         finCost = finWeight * v9Output; 
			         
			     } 
			     
			
			    //prints out the value of Fin Weight
			
			    
			    GUI.finWeight.setText(finWeight + "");
			      
			
			    //declares double variable named tubeFeet
			    double tubeFeet;
			    //calculates5 by taking the fin length + 4 inches times fin height divided by 1.5
			    //times the number of rows and divided by 12. Math.round is to round the answer
			    tubeFeet = Math.round(((finLength + 4) * ((finHeight / 1.5) * rowNumber)) / 12);
			    
			
			    //prints out the value of feet of tubing
			
			    
			    GUI.tubingFeet.setText(tubeFeet + "");
			
			    do {
			        //this prints out the menu choices for tubing material for the user to choose from
			        System.out.println("1. 1/2 x 0.035 cu\n" + "2. 5/8 x 0.030 cu\n" + "3. 5/8 x 0.035 cu\n"
			                + "4. 5/8 x 0.038 cu\n" + "5. 1-1/8 in x .050 cu\n" + "6. 1/4 in x .020 Stnls\n" +
			                "7. 5/8 in x .035 Stnls\n" + "8. 5/8 in. x .038 Stnls\n" + "9. 5/8 in. x .049 Stnls\n"
			                + "10. 1-1/8 in. x .049 Stnls\n" + "11. 5/8 x .035 CuNi\n" + "12. 1/4 in. Ref.Cu\n"
			                + "13. 5/16 in. Ref.Cu\n" + "14.  1/2 in. Ref.Cu\n" + "15. 1-1/8 in. x .049 Cu\n");
			   
			        // used to input value of an integer variable 'tmaterialSelect' from user.
			        tmaterialSelect = inFrame.mat_of_Tubing_Inp();
			        switch (tmaterialSelect) {
			            case 1:
			                tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
			                break;
			            case 2:
			                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_30_cu;
			                break;
			            case 3:
			                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Cu;
			                break;
			            case 4:
			                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_38_cu;
			                break;
			            case 5:
			                tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_50_cu;
			                break;
			            case 6:
			                tubingMaterialSelect = TubingMaterialSelect.one_fourth_0_20_stnls;
			                break;
			            case 7:
			                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Stnls;
			                break;
			            case 8:
			                tubingMaterialSelect = TubingMaterialSelect.five_eight_o_38_stnls;
			                break;
			            case 9:
			                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_49_stnls;
			                break;
			            case 10:
			                tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_stnls;
			                break;
			            case 11:
			                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_cuni;
			                break;
			            case 12:
			                tubingMaterialSelect = TubingMaterialSelect.one_four_ref;
			                break;
			            case 13:
			                tubingMaterialSelect = TubingMaterialSelect.five_sixteen_ref;
			                break;
			            case 14:
			                tubingMaterialSelect = TubingMaterialSelect.one_half_ref;
			                break;
			            case 15:
			                tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_cu;
			                break;
			
			            default:
			                System.out.println("Invalid choice!");
			                tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
			                break;
			
			        }
			    } while (tmaterialSelect < 1 || tmaterialSelect > 15);
			    if (tmaterialSelect == 1)
			    {
			    	 tubingPrice = tubeFeet * rOutput;
			    }
			    else if (tmaterialSelect == 2)
			    {
			    	 tubingPrice = tubeFeet * r2Output;
			    }
			    else if (tmaterialSelect == 3)
			    {
			         tubingPrice = tubeFeet * r3Output;
			    }
			    else if (tmaterialSelect == 4)
			    {
			    	 tubingPrice = tubeFeet * r4Output;
			    }
			    else if(tmaterialSelect == 5)
			    {
			    	 tubingPrice = tubeFeet * r5Output;
			    }
			    else if (tmaterialSelect == 6)
			    {
			    	 tubingPrice = tubeFeet * r6Output;
			    }
			    else if (tmaterialSelect == 7)
			    {
			         tubingPrice = tubeFeet * r7Output;
			    }
			    else if (tmaterialSelect == 8)
			    {
			    	 tubingPrice = tubeFeet * r8Output;
			    }
			    else if (tmaterialSelect == 9)
			    {
			    	 tubingPrice = tubeFeet * r9Output;
			    }
			    else if(tmaterialSelect == 10)
			    {
			    	 tubingPrice = tubeFeet * r10Output;
			    }
			    else if (tmaterialSelect == 11)
			    {
			         tubingPrice = tubeFeet * r11Output;
			    }
			    else if (tmaterialSelect == 12)
			    {
			      tubingPrice = tubeFeet * r12Output;
			    }
			    else if(tmaterialSelect == 13)
			    {
			      tubingPrice = tubeFeet * r13Output;
			    }
			    else if (tmaterialSelect == 14)
			    {
			     tubingPrice = tubeFeet * r14Output;
			    }
			    else if (tmaterialSelect == 15)
			    {
			    	tubingPrice = tubeFeet * r16Output;
			    }
			   
			    //declares double variable returnBends and sets it equal to 0
			    double returnBends = 0;
			
			    //declares double variable num2
			    double num2;
			    if (rowNumber == 3 || rowNumber == 4 || rowNumber == 5 || rowNumber == 6 || rowNumber == 8) {
			        returnBends = finHeight / 1.5 * rowNumber / 2.0 * 0.5 + finHeight / 1.5 * rowNumber / 2.0;
			    } else {
			        num2 = finHeight / 1.5 * rowNumber / 2.0;
			        returnBends = Math.round(num2);
			    }
			    //prints out number of return bends
			 
			    
			    GUI.returnBends.setText(returnBends + "");
			    
			    rbendsPrice = (returnBends * r15Output);
			
			    
			    
			    connectionS = inFrame.connections_num_Inp();
			    do {
			        //this prints out the menu choices for distributors for the user to choose from
			        System.out.println("1. 1/2 in FPT\n" + "2. 3/4 in FPT\n" + "3. 1 in. FPT\n" + "4. 1 in MPT\n"
			                + "5. 1-1/4 in MPT\n" + "6. 1-1/2 in MPTM\n" + "7. 1-1/2 in FPT\n" + "8. 2 in FPT\n"
			                + "9. 2 in MPT\n" + "10. 2.5 in FPT\n" + "11. 2.5 in MPT\n" + "12. 3 in MPT\n" + "13. 4 in MPT\n" + "14. 1-1/2 in Brass\n" + "15. 2-3/8 in Brass\n");
			        // used to input value of an integer variable 'distributorSelect' from user.
			        connectionsSelect = inFrame.size_of_connection_Inp();
			        switch (connectionsSelect) {
			            case 1:
			                connectionSelection = ConnectionSelection.one_half_fpt;
			                break;
			            case 2:
			           	 connectionSelection = ConnectionSelection.three_fourth_fpt;
			                break;
			            case 3:
			           	 connectionSelection = ConnectionSelection.one_fpt;
			                break;
			            case 4:
			           	 connectionSelection = ConnectionSelection.one_mpt;
			                break;
			            case 5:
			           	 connectionSelection = ConnectionSelection.one_one_fourth_mpt;
			                break;
			            case 6:
			           	 connectionSelection = ConnectionSelection.one_one_half_mpt;
			                break;
			            case 7:
			           	 connectionSelection = ConnectionSelection.one_one_half_fpt;
			                break;
			            case 8:
			           	 connectionSelection = ConnectionSelection.two_fpt;
			                break;
			            case 9:
			           	 connectionSelection = ConnectionSelection.two_mpt;
			                break;
			            case 10:
			           	 connectionSelection = ConnectionSelection.two_five_fpt;
			                break;
			            case 11:
			           	 connectionSelection = ConnectionSelection.two_five_mpt;
			                break;
			            case 12:
			           	 connectionSelection = ConnectionSelection.three_mpt;
			                break;
			            case 13:
			           	 connectionSelection = ConnectionSelection.four_mpt;
			                break;
			            case 14:
			           	 connectionSelection = ConnectionSelection.one_one_half_brass;
			                break;
			            case 15:
			           	 connectionSelection = ConnectionSelection.two_three_eighths_brass;
			                break;
			           
			
			            default:
			                System.out.println("Invalid choice!");
			                connectionSelection = ConnectionSelection.one_half_fpt;
			                break;
			
			        }
			    } while (connectionsSelect < 1 || connectionsSelect > 15);
			     
			     if (connectionsSelect == 1)
			     {
			    	 connectionPrice = connectionS * c1Output;
			    	 
			    	
			     }
			     else if (connectionsSelect == 2)
			     {
			    	 connectionPrice = connectionS * c2Output;
			    	 
			    	 
			     }
			     else if (connectionsSelect == 3)
			     {
			    	 connectionPrice = connectionS * c3Output;
			    	 
			    
			     }
			     else if (connectionsSelect == 4)
			     {
			    	connectionPrice = connectionS * c4Output;
			    	 
			    	
			     }
			     else if (connectionsSelect == 5)
			     {
			    	 connectionPrice = connectionS * c5Output;
			    	 
			    	
			     }
			     else if (connectionsSelect == 6)
			     {
			    	 connectionPrice = connectionS * c6Output;
			  
			   	  
			     }
			     else if (connectionsSelect == 7)
			     {
			    	 connectionPrice = connectionS * c7Output;
			    	 
			     }
			    		 else if (connectionsSelect == 8)
			     {
			    			 connectionPrice = connectionS * c8Output;
			            	 
			            
			 
			     }
			     else if (connectionsSelect == 9)
			     {
			    	 connectionPrice = connectionS * c9Output;
			    	 
			    	
			     }
			     else if (connectionsSelect == 10)
			     {
			    	 connectionPrice = connectionS * c10Output;
			    	 
			 
			     }
			     else if (connectionsSelect == 11)
			     {
			    	 connectionPrice = connectionS * c11Output;
			    	 
			    
			     }
			     else if (connectionsSelect == 12)
			     {
			    	 connectionPrice = connectionS * c12Output;
			  
			     }
			     else if (connectionsSelect == 13)
			     {
			    	 connectionPrice = connectionS * c13Output;
			    	 
			    	
			     }
			     else if (connectionsSelect == 14)
			     {
			    	 connectionPrice = connectionS * c14Output;
			    	 
			    	                     }
			     else if (connectionsSelect == 15)
			     {
			    	 connectionPrice = connectionS * c15Output;
			    	 
			    	
			     }
			
			
			    //declares double variable frameWeight
			    double frameWeight;
			    	
			    //sets frame weight equal to the fin length times number of rows times 2 plus the fin height times
			    // number of rows times 2 and divides it by 12
			    frameWeight = ((finLength * rowNumber * 2.0) + (finHeight * rowNumber * 2.0)) / 12.0;
			    
			    do {
			        //this prints out the menu choices for frame material for the user to choose from
			        System.out.println("1. SS\n" + "2. Galvnl\n" + "3. Galvns\n");
			        
			        // used to input value of an integer variable 'fmaterialSelect' from user.
			        fmaterialSelect = inFrame.mat_of_frame_Inp();
			        switch (fmaterialSelect) {
			            case 1:
			               frameMaterial = FrameMaterial.stainless_steel;
			                break;
			            case 2:
			                frameMaterial = FrameMaterial.galvanneal;
			                break;
			            case 3:
			                frameMaterial = FrameMaterial.galvanized;
			                break;
			          
			
			            default:
			                System.out.println("Invalid choice!");
			                frameMaterial = FrameMaterial.stainless_steel;
			                break;
			
			        }
			    } while (fmaterialSelect < 1 || fmaterialSelect > 3);
			    if (fmaterialSelect == 1)
			    {
			    	frameCost = frameWeight * fOutput;
			    }
			    else if (fmaterialSelect == 2)
			    {
			    	
			    	frameCost = frameWeight * f1Output;
			    	
			    }
			    else if (fmaterialSelect == 3)
			    {
			    	
			    	frameCost = frameWeight * f2Output;
			    }
			
			    //this declares a string variable called strDouble and formats it as the frame weight rounded to two decimal places
			    String strDouble = String.format("%.2f", frameWeight);
			   
			   
			
			    //this prints out the value of the frame weight
			
			     GUI.frameWeight.setText(strDouble + "");
			
			
			    //this declares a double variable called solderNum
			    double solderNum;
			
			    //this sets the value of the number of solders to frameWeight times .138
			    solderNum = frameWeight * .138;
			    
			        
			
			    do {
			        //this prints out the menu choices for solder material for the user to choose from
			        System.out.println("1. 5% silver\n" + "2. 15% silver\n");
			        
			        // used to input value of an integer variable 'fmaterialSelect' from user.
			        smaterialSelect = inFrame.sil_per_solder_Inp();
			        switch (smaterialSelect) {
			            case 1:
			               solderMaterial = SolderMaterial.five_silver;
			                break;
			            case 2:
			                solderMaterial = SolderMaterial.fifteen_silver;
			                break;
			
			            default:
			                System.out.println("Invalid choice!");
			                solderMaterial = SolderMaterial.five_silver;;
			                break;
			
			        }
			    } while (smaterialSelect < 1 || smaterialSelect > 2);
			    if (smaterialSelect == 1)
			    {
			    	solderCost = solderNum * sOutput;
			    }
			    else if (smaterialSelect == 2)
			    {
			    	solderCost = solderNum * s1Output;
			    }
			
			    //this declares a string variable called strDouble1 and formats it as the number of solders rounded to two decimal places
			    String strDouble1 = String.format("%.2f", solderNum);
			
			
			    //this prints out the number of solders
			
			    GUI.solderNum.setText(strDouble1 + "");
			
			
			    //this declares a double variable called vents and sets it equal to 4
			    double vents = 4;
			
			    //this prints out the number of vents
			
			    GUI.ventNum.setText(vents + "");
			    ventsPrice = (vents * s2Output);
			   
			    
			
			    //this declares a double variable called headerNum
			    double headerNum = 2;
			
			    //this prints out the number of headers
			    
			    GUI.headerNum.setText(headerNum + "");
			
			    //this declares a double variable called headerLength and sets it equal to the finHeight
			    double headerLength = finHeight;
			
			    //this prints out the header length
			
			    GUI.headerLength.setText(headerLength + "");
			
			    //this declares a double variable called disc
			    double disc;
			
			    //this sets the value of disc to number of headers times 2
			    disc = headerNum * 2;
			
			    discCost = disc * dOuput;
			    
			 
			    
			
			
			    //this prints out the number of discs
			
			    GUI.discNum.setText(disc + "");
			
			    double headers;
			    headers = ((finHeight + 3) * 2) / 12;
			
			    System.out.println();
			
			    do {
			        //this prints out the menu choices for header diameter for the user to choose from
			        System.out.println("1. 3/4 in. cu\n" + "2. 1 in. cu\n" + "3. 1-1/2 in. cu\n" + "4. 2 in. cu\n"
			                + "5. 2-1/2 in. cu\n" + "6. 3 in. cu\n" + "7. 4 in. cu\n");
			        
			        // used to input value of an integer variable 'hdiameterSelect' from user.
			        hdiameterSelect = inFrame.dia_of_header_Inp();
			        switch (hdiameterSelect) {
			            case 1:
			                headerDiameter = HeaderDiameter.three_fourth;
			                break;
			            case 2:
			                headerDiameter = HeaderDiameter.one;
			                break;
			            case 3:
			                headerDiameter = HeaderDiameter.one_and_one_half;
			                break;
			            case 4:
			                headerDiameter = HeaderDiameter.two;
			                break;
			            case 5:
			                headerDiameter = HeaderDiameter.two_and_one_half;
			                break;
			            case 6:
			                headerDiameter = HeaderDiameter.three;
			                break;
			            case 7:
			                headerDiameter = HeaderDiameter.four;
			                break;
			
			            default:
			                System.out.println("Invalid choice!");
			                headerDiameter = HeaderDiameter.three_fourth;
			                break;
			
			        }
			    } while (hdiameterSelect < 1 || hdiameterSelect > 7);
			        if (hdiameterSelect == 1)
			        {
			            headerCost = headers * hOutput;
			        }
			        else if (hdiameterSelect == 2)
			        {
			            headerCost = headers * h2Output;
			        }
			        else if (hdiameterSelect == 3)
			        {
			            headerCost = headers * h3Output;
			        }
			        else if (hdiameterSelect == 4)
			        {
			            headerCost = headers * h4Output;
			        }
			        else if (hdiameterSelect == 5)
			        {
			            headerCost = headers * h5Output;
			        }
			        else if (hdiameterSelect == 6)
			        {
			            headerCost = headers * h6Output;
			        }
			        else if (hdiameterSelect == 7)
			        {
			            headerCost = headers * h7Output;
			        }
			
			    
			    System.out.println();
			    System.out.println();
			    
			    totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + connectionPrice;
			    String strDouble19 = String.format("%.2f",  totalPrice);
			    laborCost = lOutput;
			    finalPrice = (totalPrice * laborCost);
			    String strDouble35 = String.format("%.2f", finalPrice);
			
			    GUI.totalmaterialsCost.setText(strDouble19 + "");
			
			    GUI.totalCost.setText(strDouble35 + "");
			    
			    FileInputStream fis = new FileInputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook (fis);
				XSSFSheet sheet = workbook.getSheetAt(0);
				XSSFRow row1 = sheet.getRow(1);
				XSSFCell cell1 = row1.getCell(1);
				cell1.setCellValue("WA");
				XSSFCell cell2 = row1.getCell(2);
				cell2.setCellValue(finHeight);
				XSSFCell cell3 = row1.getCell(3);
				cell3.setCellValue(rowNumber);
				XSSFCell cell4 = row1.getCell(4);
				cell4.setCellValue(finperInch);
				XSSFCell cell6 = row1.getCell(6);
				cell6.setCellValue(finLength);      
				XSSFCell cell7 = row1.getCell(7);
				cell7.setCellValue(strDouble19);
				XSSFCell cell8 = row1.getCell(8);
				cell8.setCellValue(strDouble35);
				fis.close();
				FileOutputStream fos =new FileOutputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
			       workbook.write(fos);
			       fos.close(); 
			    System.out.println();
			     } 

			
	public static void steamCoil (GUI inFrame) throws IOException 
			{
					main rc=new main();   //object of the class  
					//reading the value of 45th row and 3rd column  
					double vOutput=rc.ReadCellData(44, 3);  //reading price of aluminum fin .006
					double v2Output=rc.ReadCellData(45,3); //reading price of aluminum fin .008
					double v3Output=rc.ReadCellData(46, 3); //reading price of aluminum fin .010
					double v4Output=rc.ReadCellData(47, 3); //reading price of copper fin .008
					double v5Output=rc.ReadCellData(48, 3); //reading price of copper fin .010
					double v6Output=rc.ReadCellData(49, 3); //reading price of copper fin .015
					double v7Output=rc.ReadCellData(51, 3); //reading price of stainless steel .006
					double v8Output=rc.ReadCellData(52, 3); //reading price of stainless steel fin .008
					double v9Output=rc.ReadCellData(53, 3); //reading price of stainless steel .010
					double v10Output=rc.ReadCellData(99, 3); //reading price of alum 3in x .010
					double rOutput=rc.ReadCellData(81,3); //reading price of tubing 1/2 x 0.035 cu
					double r2Output=rc.ReadCellData(82,3); 
					double r3Output=rc.ReadCellData(83,3); 
					double r4Output=rc.ReadCellData(84,3); 
					double r5Output=rc.ReadCellData(85,3); 
					double r6Output=rc.ReadCellData(86,3);
					double r7Output=rc.ReadCellData(87,3); 
					double r8Output=rc.ReadCellData(88,3); 
					double r9Output=rc.ReadCellData(89,3);
					double r10Output=rc.ReadCellData(90,3); 
					double r11Output=rc.ReadCellData(95,3); 
					double r12Output=rc.ReadCellData(91,3); 
					double r13Output=rc.ReadCellData(92,3);
					double r14Output=rc.ReadCellData(93,3);
					double r16Output=rc.ReadCellData(98, 3);
					double r15Output=rc.ReadCellData(78, 3); //reading price of return Bends
					double fOutput=rc.ReadCellData(56, 3); //ss frame
					double f1Output=rc.ReadCellData(57, 3); //galvanneal frame
					double f2Output=rc.ReadCellData(58, 3); //galvanize frame
					double sOutput = rc.ReadCellData (79,3); //solder 5% silver
					double s1Output = rc.ReadCellData (80,3); //solder 15% silver
					double s2Output = rc.ReadCellData (94,3); //vents
					double hOutput = rc.ReadCellData(59,3);
					double h2Output = rc.ReadCellData(60,3);
					double h3Output = rc.ReadCellData(61,3);
					double h4Output = rc.ReadCellData(62,3);
					double h5Output = rc.ReadCellData(63,3);
					double h6Output = rc.ReadCellData(64,3);
					double h7Output = rc.ReadCellData (65,3);
					double dOuput = rc.ReadCellData(19,3);
					double tOutput = rc.ReadCellData(20, 3);
					double t1Output = rc.ReadCellData(21, 3);
					double t2Output = rc.ReadCellData(22, 3);
					double t3Output = rc.ReadCellData(23, 3);
					double t4Output = rc.ReadCellData(24, 3);
					double t5Output = rc.ReadCellData(25, 3);
					double t6Output = rc.ReadCellData(26, 3);
					double t7Output = rc.ReadCellData(27, 3);
					double t8Output = rc.ReadCellData(28, 3);
					double t9Output = rc.ReadCellData(29, 3);
					double t10Output = rc.ReadCellData(30, 3);
					double t11Output = rc.ReadCellData(31, 3);
					double t12Output = rc.ReadCellData(32, 3);
					double t13Output = rc.ReadCellData(33, 3);
					double t14Output = rc.ReadCellData(34, 3);
					double t15Output = rc.ReadCellData(35, 3);
					double t16Output = rc.ReadCellData(36, 3);
					double t17Output = rc.ReadCellData(37, 3);
					double t18Output = rc.ReadCellData(38, 3);
					double t19Output = rc.ReadCellData(39, 3);
					double t20Output = rc.ReadCellData(40, 3);
					double t21Output = rc.ReadCellData(41, 3);
					double t22Output = rc.ReadCellData(42, 3);
					double szOutput = rc.ReadCellData(75, 3);
					double sz2Output = rc.ReadCellData(76, 3);
					double sz3Output = rc.ReadCellData(77, 3);
					double cOutput = rc.ReadCellData(2, 3);
					double c1Output = rc.ReadCellData(3, 3);
					double c2Output = rc.ReadCellData(4, 3);
					double c3Output = rc.ReadCellData(5, 3);
					double c4Output = rc.ReadCellData(15,3);
					double c5Output = rc.ReadCellData(6, 3);
					double c6Output = rc.ReadCellData(7,3);
					double c7Output = rc.ReadCellData(8, 3);
					double c8Output = rc.ReadCellData(9, 3);
					double c9Output = rc.ReadCellData(10, 3);
					double c10Output = rc.ReadCellData(12, 3);
					double c11Output = rc.ReadCellData(11, 3);
					double c12Output = rc.ReadCellData(13, 3);
					double c13Output = rc.ReadCellData(14, 3);
					double c14Output = rc.ReadCellData(17, 3);
					double c15Output = rc.ReadCellData(16, 3);
					double lOutput = rc.ReadCellData (97,3);
					Scanner scan = new Scanner(System.in); //declaring scan as an object of Scanner class.
					int type; //declaring variable type
					int rowNumber; //declaring variable rowNumber
					int finmaterialSelection; //declaring variable finmaterialselection
					int hdiameterSelect; //declares variable hdiameterSelect
					int distributorSelect; //declares variable distributorSelect
					int typeSelect; //declares variable typeSelect
					int sizeSelect; //declares variable sizeSelect
					int amountSelect; //declares variable amountSelect
					int tmaterialSelect; //declares variable tmaterialSelect
					int priceSelect; 
					int smaterialSelect;
					int fmaterialSelect;
					int categorySelect;
					int connectionsSelect;
					int connectionS;
					double headerCost = 0;
					double newPrice=0;
					double finCost = 0;
					double tubingPrice = 0;
					double tubingPrice1=0;
					double frameCost = 0;
					double solderCost = 0;
					double discCost=0;
					double totaldCost = 0;
					double totalPrice=0;
					double rbendsPrice = 0;
					double ventsPrice = 0;
					double connectionPrice = 0;
					double capCost = 0;
					double laborCost = 0;
					double finalPrice = 0;
					ConnectionSelection connectionSelection = null;
					CategorySelection categorySelection = null;
					SolderMaterial solderMaterial = null;
					FrameMaterial frameMaterial = null;
					CoilType coilType = null; //setting coilType from enum class CoilType to null
					FinMaterial finMaterial = null; //setting finMaterial from enum class FinMaterial to null
					HeaderDiameter headerDiameter = null; //setting headerDiameter from enum HeaderDiameter to null
					DistributorType distributorType = null; //setting distributorType from enum DistributorType to null
					TypeSelector typeSelector = null; //setting typeSelector from enum TypeSelector to null
					SizeSelector sizeSelector = null; //setting sizeSelector from enum SizeSelector to null
					AmountSelector amountSelector = null; //setting amountSelector from enum AmountSelector to null
					TubingMaterialSelect tubingMaterialSelect = null; //setting tubingMaterialSelect from enum TubingMaterialSelect to nu
					//declares variable finHeight and is used to input an integer variable 'finheight' from users
					double finHeight = inFrame.fin_height_Inp();
					//prompts users to enter in fin length
					double finLength = inFrame.fin_length_Inp();
					//prompts users to enter in fins per inch
					double finperInch = inFrame.fin_pinch_Inp();
					
					double finWeight; //declares double variable finWeight
					
					//sets value of fin weight by taking the fin height times fin length times fins per inch and divides it by 12
					finWeight = (finHeight * finLength * finperInch) / 12;
					
					//prompts user to enter in the number of rows
					rowNumber = inFrame.row_num_Inp();
					
					
					
					
					//prints out empty line (to make output in terminal look neater)
					System.out.println();
					
					do {
					    //this prints out the menu choices for fin material for the user to choose from
					    System.out.println("1. Aluminum .006\n" + "2. Aluminum .008\n" + "3. Aluminum .010\n" + "4. Copper .008\n"
					            + "5. Copper .010\n" + "6. Copper .015\n" + "7. Stainless Steel .006\n"
					            + "8. Stainless Steel .008\n" + "9. Stainless Steel .010\n" + "10. Aluminum 3 x .010\n");
					    // used to input value of an integer variable 'finmaterialSelection' from user.
					    finmaterialSelection = inFrame.mat_of_fin_Inp();
					    switch (finmaterialSelection) {
					        case 1:
					            finMaterial = FinMaterial.Aluminum_Six;
					            break;
					        case 2:
					            finMaterial = FinMaterial.Aluminum_Eight;
					            break;
					        case 3:
					            finMaterial = FinMaterial.Aluminum_Ten;
					            break;
					        case 4:
					            finMaterial = FinMaterial.Copper_Eight;
					            break;
					        case 5:
					            finMaterial = FinMaterial.Copper_Ten;
					            break;
					        case 6:
					            finMaterial = FinMaterial.Copper_Fifthteen;
					            break;
					        case 7:
					            finMaterial = FinMaterial.Stainless_Steel_Six;
					            break;
					        case 8:
					            finMaterial = FinMaterial.Stainless_Steel_Eight;
					            break;
					        case 9:
					            finMaterial = FinMaterial.Stainless_Steel_Ten;
					            break;
					        case 10:
				            	finMaterial = FinMaterial.three_ten_alum;
					
					        default:
					            System.out.println("Invalid choice!");
					            finMaterial = FinMaterial.Aluminum_Six;
					            break;
					
					    }
					} while (finmaterialSelection < 1 || finmaterialSelection > 10);
					if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 1) {
					    finWeight = finWeight * .010;
					    finCost = finWeight * vOutput;
					 } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 1) {
					     finWeight = finWeight * .013;
					     finCost = finWeight * v2Output;
					 } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 1) {
					     finWeight = finWeight * .016;
					     finCost = finWeight * v3Output;
					 } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 1) {
					     finWeight = finWeight * .043;
					     finCost = finWeight * v4Output;
					 } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 1) {
					     finWeight = finWeight * .054;
					     finCost = finWeight * v5Output;
					 } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 1) {
					     finWeight = finWeight * .0756;
					     finCost = finWeight * v6Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 1) {
					     finWeight = finWeight * .028;
					     finCost = finWeight * v7Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 1) {
					     finWeight = finWeight * .038;
					     finCost = finWeight * v8Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 1) {
					     finWeight = finWeight * .047;
					     finCost = finWeight * v9Output;
					 } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 1) {
				    	 finWeight = finWeight * .049;
				    	 finCost = finWeight * v10Output;
				     } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 2) {
				    	 finWeight = finWeight * .097;
				    	 finCost = finWeight * v10Output;
				     } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 2) {
					     finWeight = finWeight * .020;
					     finCost = finWeight * vOutput;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 2) {
					     finWeight = finWeight * .026;
					     finCost = finWeight * v2Output;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 2) {
					     finWeight = finWeight * .032;
					     finCost = finWeight * v3Output;
					     
					
					 } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 2) {
					     finWeight = finWeight * .086;
					     finCost = finWeight * v4Output;
					
					 } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 2) {
					     finWeight = finWeight * .107;
					     finCost = finWeight * v5Output;
					 } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 2) {
					     finWeight = finWeight * .1522;
					     finCost = finWeight * v6Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 2) {
					     finWeight = finWeight * .056;
					     finCost = finWeight * v7Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 2) {
					     finWeight = finWeight * .075;
					     finCost = finWeight * v8Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 2) {
					     finWeight = finWeight * .093;
					     finCost = finWeight * v9Output;
					 } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 3) {
					     finWeight = finWeight * .029;
					     finCost = finWeight * vOutput;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 3) {
					     finWeight = finWeight * .039;
					     finCost = finWeight * v2Output;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 3) {
					     finWeight = finWeight * .049;
					     finCost = finWeight * v3Output;
					
					 } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 3) {
					     finWeight = finWeight * .129;
					     finCost = finWeight * v4Output;
					 } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 3) {
					     finWeight = finWeight * .161;
					     finCost = finWeight * v5Output;
					 } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 3) {
					     finWeight = finWeight * .2268;
					     finCost = finWeight * v6Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 3) {
					     finWeight = finWeight * .084;
					     finCost = finWeight * v7Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 3) {
					     finWeight = finWeight * .112;
					     finCost = finWeight * v8Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 3) {
					     finWeight = finWeight * .140;
					     finCost = finWeight * v9Output;
					 } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 4) {
					     finWeight = finWeight * .039;
					     finCost = finWeight * vOutput;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 4) {
					     finWeight = finWeight * .052;
					     finCost = finWeight * v2Output;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 4) {
					     finWeight = finWeight * .065;
					     finCost = finWeight * v3Output;
					
					 } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 4) {
					     finWeight = finWeight * .172;
					     finCost = finWeight * v4Output;
					 } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 4) {
					     finWeight = finWeight * .215;
					     finCost = finWeight * v5Output;
					 } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 4) {
					     finWeight = finWeight * .3023;
					     finCost = finWeight * v6Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 4) {
					     finWeight = finWeight * .112;
					     finCost = finWeight * v7Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 4) {
					     finWeight = finWeight * .149;
					     finCost = finWeight * v8Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 4) {
					     finWeight = finWeight * .187;
					     finCost = finWeight * v9Output;
					 } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 5) {
					     finWeight = finWeight * .049;
					     finCost = finWeight * vOutput;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 5) {
					     finWeight = finWeight * .065;
					     finCost = finWeight * v2Output;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 5) {
					     finWeight = finWeight * .081;
					     finCost = finWeight * v3Output;
					
					 } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 5) {
					     finWeight = finWeight * .215;
					     finCost = finWeight * v4Output;
					 } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 5) {
					     finWeight = finWeight * .269;
					     finCost = finWeight * v5Output;
					 } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 5) {
					     finWeight = finWeight * .378;
					     finCost = finWeight * v6Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 5) {
					     finWeight = finWeight * .140;
					     finCost = finWeight * v7Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 5) {
					     finWeight = finWeight * .187;
					     finCost = finWeight * v8Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 5) {
					     finWeight = finWeight * .233;
					     finCost = finWeight * v9Output;
					 } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 6) {
					     finWeight = finWeight * .058;
					     finCost = finWeight * vOutput;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 6) {
					     finWeight = finWeight * .078;
					     finCost = finWeight * v2Output;
					
					 } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 6) {
					     finWeight = finWeight * .081;
					     finCost = finWeight * v3Output;
					
					 } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 6) {
					     finWeight = finWeight * .258;
					     finCost = finWeight * v4Output;
					 } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 6) {
					     finWeight = finWeight * .322;
					     finCost = finWeight * v5Output;
					 } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 6) {
					     finWeight = finWeight * .4515;
					     finCost = finWeight * v6Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 6) {
					     finWeight = finWeight * .168;
					     finCost = finWeight * v7Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 6) {
					     finWeight = finWeight * .224;
					     finCost = finWeight * v8Output;
					 } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 6) {
					     finWeight = finWeight * .280;
					     finCost = finWeight * v9Output;
					 }
					   //number of rows equaling 7
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 7) {
					    	 finWeight = (finWeight * .039) + (finWeight * .029);
					         finCost = finWeight * vOutput;
					     }  else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 7) {
					    	 finWeight = (finWeight * .052) + (finWeight * .039);
					         finCost = finWeight * v2Output;
					    } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 7) {
					    	 finWeight = (finWeight * .065) + (finWeight * .049);
					         finCost = finWeight * v3Output;
					    } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 7) {
					    	 finWeight = (finWeight * .172) + (finWeight * .129);
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 7) {
					    	 finWeight = (finWeight * .215) + (finWeight * .161);
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 7) {
					    	 finWeight = (finWeight * .3023) + (finWeight * .2268);
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 7) {
					    	  finWeight = (finWeight * .112) + (finWeight * .084);
						      finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 7) {
					    	 finWeight = (finWeight * .149) + (finWeight * .112);
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 7) {
					    	 finWeight = (finWeight * .187) + (finWeight * .140);
					         finCost = finWeight * v9Output;
					         
					    }
					      //number of rows equaling 8
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 8)
					     {
					    	 finWeight = (finWeight * .039) +  (finWeight * .039);
					         finCost = finWeight * vOutput;
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 8)
					     {
					     finWeight = (finWeight * .052) + (finWeight * .052);
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 8) {
					         finWeight = finWeight * .129;
					         finCost = finWeight * v3Output; 
					      
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 8)
					     {
					    	 finWeight = (finWeight * .172) + (finWeight * .172);
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 8)
					     {
					     finWeight = (finWeight * .215) + (finWeight * .215);
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 8) {
					         finWeight = (finWeight * .3023) + (finWeight * .3023);
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 8)
					     {
					    	  finWeight = (finWeight * .112) + (finWeight * .112);
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 8)
					     {
					         finWeight = (finWeight * .149) + (finWeight * .149);
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 8) {
					         finWeight = (finWeight * .187) + (finWeight * .187);
					         finCost = finWeight * v9Output;

					     }
					     
					      //number of rows equaling 9
					      
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 9)
					     {
					    	 finWeight = (finWeight * .039) + (finWeight * .049);
					         finCost = finWeight * vOutput;
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 9)
					     {
					     finWeight = (finWeight * .052) + (finWeight * .065);
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 9) {
					         
					      finWeight = (finWeight * .065) + (finWeight * .081);
					         finCost = finWeight * v3Output;
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 9)
					     {
					    	 finWeight = (finWeight * .172) + (finWeight * .215);
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 9)
					     {
					     finWeight = (finWeight * .215) + (finWeight * .269);
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 9) {
					         finWeight = (finWeight * .3023) + (finWeight * .378);
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 9)
					     {
					    	  finWeight = (finWeight * .112) + (finWeight * .140);
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 9)
					     {
					     finWeight = (finWeight * .149) + (finWeight * .187);
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 9) {
					         
					         finWeight = (finWeight * .187) + (finWeight * .233);
					         finCost = finWeight * v9Output;
					     }
					      
					     //number of rows equaling 10
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 10)
					     {
					    	finWeight = (finWeight * .039) + (finWeight * .058);
					         finCost = finWeight * vOutput; 
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 10)
					     {
					     finWeight = (finWeight * .052) + (finWeight * .078);
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 10) {
					         
					      finWeight = (finWeight * .065) + (finWeight * .081);
					         finCost = finWeight * v3Output;
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 10)
					     {
					    	 finWeight = (finWeight * .172) + (finWeight * .258);
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 10)
					     {
					     finWeight = (finWeight * .215) + (finWeight * .322);
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 10) {
					      finWeight = (finWeight * .3023) + (finWeight * .4515);
					         finCost = finWeight * v6Output;   
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 10)
					     {
					    	  finWeight = (finWeight * .112) + (finWeight * .168);
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 10)
					     {
					     finWeight = (finWeight * .149) + (finWeight * .224);
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 10) {
					         
					         finWeight = (finWeight * .187) + (finWeight * .280);
					         finCost = finWeight * v9Output;
					     } 
					     
					     //number of rows equaling 11
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 11)
					     {
					    	 finWeight = (finWeight * .039) + ((finWeight * .039) + (finWeight * .029));
					         finCost = finWeight * vOutput;
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 11)
					     {
					         finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .039));
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 11) {
					         finWeight = (finWeight * .065) + ((finWeight * .065) + (finWeight * .049));
					         finCost = finWeight * v3Output;
					      
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 11)
					     {
					    	 finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .129));
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 11)
					     {
					         finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .161));
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 11) {
					         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .2268));
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 11)
					     {
					    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .084));
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 11)
					     {
					     finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .112));
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 11) {
					         finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .140));
					         finCost = finWeight * v9Output;
					     }
					     //number of rows equaling 12
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 12)
					     {
					    	 finWeight = (finWeight * .039) + ((finWeight * .039) +  finWeight * .039);
					         finCost = finWeight * vOutput;
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 12)
					     {
					     finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .052));
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 12) {
					         
					      finWeight = (finWeight * .065) + (finWeight * .129);
					         finCost = finWeight * v3Output;
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 12)
					     {
					    	finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .172));
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 12)
					     {
					     finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .215));
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 12) {
					         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .3023));
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 12)
					     {
					    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .112));
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 12)
					     {
					       finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .149));
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 12) {
					        finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .187));
					         finCost = finWeight * v9Output; 
					         
					     } 
					
					
					
					//prints out the value of Fin Weight
					
					GUI.finWeight.setText(finWeight + "");
					
					//declares double variable named tubeFeet
					double tubeFeet;
					//calculates feet of tubing by taking the fin length + 4 inches times fin height divided by 1.5
					//times the number of rows and divided by 12. Math.round is to round the answer
					tubeFeet = Math.round(((finLength + 4) * ((finHeight / 1.5) * rowNumber)) / 12);
					
					
					//prints out the value of feet of tubing
					
					GUI.tubingFeet.setText(tubeFeet + "");
					do {
					    //this prints out the menu choices for tubing material for the user to choose from
					    System.out.println("1. 1/2 x 0.035 cu\n" + "2. 5/8 x 0.030 cu\n" + "3. 5/8 x 0.035 cu\n"
					            + "4. 5/8 x 0.038 cu\n" + "5. 1-1/8 in x .050 cu\n" + "6. 1/4 in x .020 Stnls\n" +
					            "7. 5/8 in x .035 Stnls\n" + "8. 5/8 in. x .038 Stnls\n" + "9. 5/8 in. x .049 Stnls\n"
					            + "10. 1-1/8 in. x .049 Stnls\n" + "11. 5/8 x .035 CuNi\n" + "12. 1/4 in. Ref.Cu\n"
					            + "13. 5/16 in. Ref.Cu\n" + "14.  1/2 in. Ref.Cu\n" + "15. 1-1/8 in. x .049 Cu\n");
					 
					    // used to input value of an integer variable 'tmaterialSelect' from user.
					    tmaterialSelect = inFrame.mat_of_Tubing_Inp();
					    switch (tmaterialSelect) {
					        case 1:
					            tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
					            break;
					        case 2:
					            tubingMaterialSelect = TubingMaterialSelect.five_eight_0_30_cu;
					            break;
					        case 3:
					            tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Cu;
					            break;
					        case 4:
					            tubingMaterialSelect = TubingMaterialSelect.five_eight_0_38_cu;
					            break;
					        case 5:
					            tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_50_cu;
					            break;
					        case 6:
					            tubingMaterialSelect = TubingMaterialSelect.one_fourth_0_20_stnls;
					            break;
					        case 7:
					            tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Stnls;
					            break;
					        case 8:
					            tubingMaterialSelect = TubingMaterialSelect.five_eight_o_38_stnls;
					            break;
					        case 9:
					            tubingMaterialSelect = TubingMaterialSelect.five_eight_0_49_stnls;
					            break;
					        case 10:
					            tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_stnls;
					            break;
					        case 11:
					            tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_cuni;
					            break;
					        case 12:
					            tubingMaterialSelect = TubingMaterialSelect.one_four_ref;
					            break;
					        case 13:
					            tubingMaterialSelect = TubingMaterialSelect.five_sixteen_ref;
					            break;
					        case 14:
					            tubingMaterialSelect = TubingMaterialSelect.one_half_ref;
					            break;
					        case 15:
					            tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_cu;
					            break;
					
					        default:
					            System.out.println("Invalid choice!");
					            tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
					            break;
					
					    }
					} while (tmaterialSelect < 1 || tmaterialSelect > 15);
					if (tmaterialSelect == 1)
					{
						 tubingPrice = tubeFeet * rOutput;
					}
					else if (tmaterialSelect == 2)
					{
						 tubingPrice = tubeFeet * r2Output;
					}
					else if (tmaterialSelect == 3)
					{
					     tubingPrice = tubeFeet * r3Output;
					}
					else if (tmaterialSelect == 4)
					{
						 tubingPrice = tubeFeet * r4Output;
					}
					else if(tmaterialSelect == 5)
					{
						 tubingPrice = tubeFeet * r5Output;
					}
					else if (tmaterialSelect == 6)
					{
						 tubingPrice = tubeFeet * r6Output;
					}
					else if (tmaterialSelect == 7)
					{
					     tubingPrice = tubeFeet * r7Output;
					}
					else if (tmaterialSelect == 8)
					{
						 tubingPrice = tubeFeet * r8Output;
					}
					else if (tmaterialSelect == 9)
					{
						 tubingPrice = tubeFeet * r9Output;
					}
					else if(tmaterialSelect == 10)
					{
						 tubingPrice = tubeFeet * r10Output;
					}
					else if (tmaterialSelect == 11)
					{
					     tubingPrice = tubeFeet * r11Output;
					}
					else if (tmaterialSelect == 12)
					{
					  tubingPrice = tubeFeet * r12Output;
					}
					else if(tmaterialSelect == 13)
					{
					  tubingPrice = tubeFeet * r13Output;
					}
					else if (tmaterialSelect == 14)
					{
					 tubingPrice = tubeFeet * r14Output;
					}
					else if (tmaterialSelect == 15)
					{
					 tubingPrice = tubeFeet * r16Output;
					}
					
					    connectionS = inFrame.connections_num_Inp();
					    do {
					        //this prints out the menu choices for distributors for the user to choose from
					        System.out.println("1. 1/2 in FPT\n" + "2. 3/4 in FPT\n" + "3. 1 in. FPT\n" + "4. 1 in MPT\n"
					                + "5. 1-1/4 in MPT\n" + "6. 1-1/2 in MPTM\n" + "7. 1-1/2 in FPT\n" + "8. 2 in FPT\n"
					                + "9. 2 in MPT\n" + "10. 2.5 in FPT\n" + "11. 2.5 in MPT\n" + "12. 3 in MPT\n" + "13. 4 in MPT\n" + "14. 1-1/2 in Brass\n" + "15. 2-3/8 in Brass\n");
					
					        // used to input value of an integer variable 'distributorSelect' from user.
					        connectionsSelect = inFrame.size_of_connection_Inp();
					        switch (connectionsSelect) {
					            case 1:
					                connectionSelection = ConnectionSelection.one_half_fpt;
					                break;
					            case 2:
					           	 connectionSelection = ConnectionSelection.three_fourth_fpt;
					                break;
					            case 3:
					           	 connectionSelection = ConnectionSelection.one_fpt;
					                break;
					            case 4:
					           	 connectionSelection = ConnectionSelection.one_mpt;
					                break;
					            case 5:
					           	 connectionSelection = ConnectionSelection.one_one_fourth_mpt;
					                break;
					            case 6:
					           	 connectionSelection = ConnectionSelection.one_one_half_mpt;
					                break;
					            case 7:
					           	 connectionSelection = ConnectionSelection.one_one_half_fpt;
					                break;
					            case 8:
					           	 connectionSelection = ConnectionSelection.two_fpt;
					                break;
					            case 9:
					           	 connectionSelection = ConnectionSelection.two_mpt;
					                break;
					            case 10:
					           	 connectionSelection = ConnectionSelection.two_five_fpt;
					                break;
					            case 11:
					           	 connectionSelection = ConnectionSelection.two_five_mpt;
					                break;
					            case 12:
					           	 connectionSelection = ConnectionSelection.three_mpt;
					                break;
					            case 13:
					           	 connectionSelection = ConnectionSelection.four_mpt;
					                break;
					            case 14:
					           	 connectionSelection = ConnectionSelection.one_one_half_brass;
					                break;
					            case 15:
					           	 connectionSelection = ConnectionSelection.two_three_eighths_brass;
					                break;
					           
					
					            default:
					                System.out.println("Invalid choice!");
					                connectionSelection = ConnectionSelection.one_half_fpt;
					                break;
					
					        }
					    } while (connectionsSelect < 1 || connectionsSelect > 15);
					     
					     if (connectionsSelect == 1)
					     {
					    	 connectionPrice = connectionS * c1Output;
					    	 
					 
					     }
					     else if (connectionsSelect == 2)
					     {
					    	 connectionPrice = connectionS * c2Output;
					    	 
					    	
					     }
					     else if (connectionsSelect == 3)
					     {
					    	 connectionPrice = connectionS * c3Output;
					    	 
					     }
					    	
					     else if (connectionsSelect == 4)
					     {
					    	connectionPrice = connectionS * c4Output;
					    	 
					    	
					     }
					     else if (connectionsSelect == 5)
					     {
					    	 connectionPrice = connectionS * c5Output;
					    	 
					
					     }
					     else if (connectionsSelect == 6)
					     {
					    	 connectionPrice = connectionS * c6Output;
					    	 
					  
					   	  
					     }
					     else if (connectionsSelect == 7)
					     {
					    	 connectionPrice = connectionS * c7Output;
					    	 
					    	 
					     }
					    		 else if (connectionsSelect == 8)
					     {
					    			 connectionPrice = connectionS * c8Output;
					            
					 
					     }
					     else if (connectionsSelect == 9)
					     {
					    	 connectionPrice = connectionS * c9Output;
					    	 
					    	 
					     }
					     else if (connectionsSelect == 10)
					     {
					    	 connectionPrice = connectionS * c10Output;
					    	 
					    	
					     }
					     else if (connectionsSelect == 11)
					     {
					    	 connectionPrice = connectionS * c11Output;
					    	 
					    	
					     }
					     else if (connectionsSelect == 12)
					     {
					    	 connectionPrice = connectionS * c12Output;
					    	 
					    	 
					     }
					     else if (connectionsSelect == 13)
					     {
					    	 connectionPrice = connectionS * c13Output;
					    	 
					    	
					     }
					     else if (connectionsSelect == 14)
					     {
					    	 connectionPrice = connectionS * c14Output;
					    	 
					    	
					     }
					     else if (connectionsSelect == 15)
					     {
					    	 connectionPrice = connectionS * c15Output;
					    	 
					    
					     }
					 //declares double variable frameWeight
					double frameWeight;
						
					//sets frame weight equal to the fin length times number of rows times 2 plus the fin height times
					// number of rows times 2 and divides it by 12
					frameWeight = ((finLength * rowNumber * 2.0) + (finHeight * rowNumber * 2.0)) / 12.0;
					
					do {
					    //this prints out the menu choices for frame material for the user to choose from
					    System.out.println("1. SS\n" + "2. Galvnl\n" + "3. Galvns\n");
					   
					    // used to input value of an integer variable 'fmaterialSelect' from user.
					    fmaterialSelect = inFrame.mat_of_frame_Inp();
					    switch (fmaterialSelect) {
					        case 1:
					           frameMaterial = FrameMaterial.stainless_steel;
					            break;
					        case 2:
					            frameMaterial = FrameMaterial.galvanneal;
					            break;
					        case 3:
					            frameMaterial = FrameMaterial.galvanized;
					            break;
					      
					
					        default:
					            System.out.println("Invalid choice!");
					            frameMaterial = FrameMaterial.stainless_steel;
					            break;
					
					    }
					} while (fmaterialSelect < 1 || fmaterialSelect > 3);
					if (fmaterialSelect == 1)
					{
						frameCost = frameWeight * fOutput;
					}
					else if (fmaterialSelect == 2)
					{
						frameCost = frameWeight * f1Output;
					}
					else if (fmaterialSelect == 3)
					{
						frameCost = frameWeight * f2Output;
					}
					
					//this declares a string variable called strDouble and formats it as the frame weight rounded to two decimal places
					String strDouble = String.format("%.2f", frameWeight);
					
					
					//this prints out the value of the frame weight
					
					 GUI.frameWeight.setText(strDouble + "");
					
					
					//this declares a double variable called solderNum
					double solderNum;
					
					//this sets the value of the number of solders to frameWeight times .138
					solderNum = frameWeight * .138;
					
					
					do {
					    //this prints out the menu choices for solder material for the user to choose from
					    System.out.println("1. 5% silver\n" + "2. 15% silver\n");
					
					    smaterialSelect = inFrame.sil_per_solder_Inp();
					    switch (smaterialSelect) {
					        case 1:
					           solderMaterial = SolderMaterial.five_silver;
					            break;
					        case 2:
					            solderMaterial = SolderMaterial.fifteen_silver;
					            break;
					
					        default:
					            System.out.println("Invalid choice!");
					            solderMaterial = SolderMaterial.five_silver;;
					            break;
					
					    }
					} while (smaterialSelect < 1 || smaterialSelect > 2);
					if (smaterialSelect == 1)
					{
						solderCost = solderNum * sOutput;
					}
					else if (smaterialSelect == 2)
					{
						solderCost = solderNum * s1Output;
					}
					
					//this declares a string variable called strDouble1 and formats it as the number of solders rounded to two decimal places
					String strDouble1 = String.format("%.2f", solderNum);
					
					
					
					//this prints out the number of solders
					
					GUI.solderNum.setText(strDouble1 + "");
					
					//this declares a double variable called vents and sets it equal to 4
					double vents = 4;
					
					//this prints out the number of vents
					
					GUI.ventNum.setText(vents + "");
					ventsPrice = (vents * s2Output);
					
					
					
					
					//this declares a double variable called headerNum
					double headerNum = 2;
					
					//this prints out the number of headers
					
					GUI.headerNum.setText(headerNum + "");
					
					//this declares a double variable called headerLength and sets it equal to the finHeight
					double headerLength = finHeight;
					
					//this prints out the header length
					
					GUI.headerLength.setText(headerLength + "");
					
					//this declares a double variable called disc
					double disc;
					
					//this sets the value of disc to number of headers times 2
					disc = headerNum * 2;
					
					discCost = disc * dOuput;
					
					
					
					
					
					//this prints out the number of discs
					
					GUI.discNum.setText(disc + "");
					
					double headers;
					headers = ((finHeight + 3) * 2) / 12;
					
					System.out.println();
					
					do {
					    //this prints out the menu choices for header diameter for the user to choose from
					    System.out.println("1. 3/4 in. cu\n" + "2. 1 in. cu\n" + "3. 1-1/2 in. cu\n" + "4. 2 in. cu\n"
					            + "5. 2-1/2 in. cu\n" + "6. 3 in. cu\n" + "7. 4 in. cu\n");
					   
					    // used to input value of an integer variable 'hdiameterSelect' from user.
					    hdiameterSelect = inFrame.dia_of_header_Inp();
					    switch (hdiameterSelect) {
					        case 1:
					            headerDiameter = HeaderDiameter.three_fourth;
					            break;
					        case 2:
					            headerDiameter = HeaderDiameter.one;
					            break;
					        case 3:
					            headerDiameter = HeaderDiameter.one_and_one_half;
					            break;
					        case 4:
					            headerDiameter = HeaderDiameter.two;
					            break;
					        case 5:
					            headerDiameter = HeaderDiameter.two_and_one_half;
					            break;
					        case 6:
					            headerDiameter = HeaderDiameter.three;
					            break;
					        case 7:
					            headerDiameter = HeaderDiameter.four;
					            break;
					
					        default:
					            System.out.println("Invalid choice!");
					            headerDiameter = HeaderDiameter.three_fourth;
					            break;
					
					    }
					} while (hdiameterSelect < 1 || hdiameterSelect > 7);
					    if (hdiameterSelect == 1)
					    {
					        headerCost = headers * hOutput;
					    }
					    else if (hdiameterSelect == 2)
					    {
					        headerCost = headers * h2Output;
					    }
					    else if (hdiameterSelect == 3)
					    {
					        headerCost = headers * h3Output;
					    }
					    else if (hdiameterSelect == 4)
					    {
					        headerCost = headers * h4Output;
					    }
					    else if (hdiameterSelect == 5)
					    {
					        headerCost = headers * h5Output;
					    }
					    else if (hdiameterSelect == 6)
					    {
					        headerCost = headers * h6Output;
					    }
					    else if (hdiameterSelect == 7)
					    {
					        headerCost = headers * h7Output;
					    }
					
					   
					    System.out.println();
					    System.out.println();
					    totalPrice = finCost + tubingPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + connectionPrice;
					
					    String strDouble19 = String.format("%.2f",  totalPrice);
					    laborCost = lOutput;
					    finalPrice = (totalPrice * laborCost);
					    String strDouble35 = String.format("%.2f", finalPrice);
					
					    GUI.totalmaterialsCost.setText(strDouble19 + "");
					
					    GUI.totalCost.setText(strDouble35 + "");
					    System.out.println(); 
					    FileInputStream fis = new FileInputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
						XSSFWorkbook workbook = new XSSFWorkbook (fis);
						XSSFSheet sheet = workbook.getSheetAt(0);
						XSSFRow row1 = sheet.getRow(1);
						XSSFCell cell1 = row1.getCell(1);
						cell1.setCellValue("ST");
						XSSFCell cell2 = row1.getCell(2);
						cell2.setCellValue(finHeight);
						XSSFCell cell3 = row1.getCell(3);
						cell3.setCellValue(rowNumber);
						XSSFCell cell4 = row1.getCell(4);
						cell4.setCellValue(finperInch);
						XSSFCell cell6 = row1.getCell(6);
						cell6.setCellValue(finLength);      
						XSSFCell cell7 = row1.getCell(7);
						cell7.setCellValue(strDouble19);
						XSSFCell cell8 = row1.getCell(8);
						cell8.setCellValue(strDouble35);
						fis.close();
						FileOutputStream fos =new FileOutputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
					       workbook.write(fos);
					       fos.close(); 
					    System.out.println(); 
			}
			
	public static void evaporaterCoil (GUI inFrame) throws IOException {
						main rc=new main();   //object of the class  
						//reading the value of 45th row and 3rd column  
						double vOutput=rc.ReadCellData(44, 3);  //reading price of aluminum fin .006
						double v2Output=rc.ReadCellData(45,3); //reading price of aluminum fin .008
						double v3Output=rc.ReadCellData(46, 3); //reading price of aluminum fin .010
						double v4Output=rc.ReadCellData(47, 3); //reading price of copper fin .008
						double v5Output=rc.ReadCellData(48, 3); //reading price of copper fin .010
						double v6Output=rc.ReadCellData(49, 3); //reading price of copper fin .015
						double v7Output=rc.ReadCellData(51, 3); //reading price of stainless steel .006
						double v8Output=rc.ReadCellData(52, 3); //reading price of stainless steel fin .008
						double v9Output=rc.ReadCellData(53, 3); //reading price of stainless steel .010\
						double v10Output=rc.ReadCellData(99, 3); //reading price of alum 3in x .010
						double rOutput=rc.ReadCellData(81,3); //reading price of tubing 1/2 x 0.035 cu
						double r2Output=rc.ReadCellData(82,3); 
						double r3Output=rc.ReadCellData(83,3); 
						double r4Output=rc.ReadCellData(84,3); 
						double r5Output=rc.ReadCellData(85,3); 
						double r6Output=rc.ReadCellData(86,3);
						double r7Output=rc.ReadCellData(87,3); 
						double r8Output=rc.ReadCellData(88,3); 
						double r9Output=rc.ReadCellData(89,3);
						double r10Output=rc.ReadCellData(90,3); 
						double r11Output=rc.ReadCellData(95,3); 
						double r12Output=rc.ReadCellData(91,3); 
						double r13Output=rc.ReadCellData(92,3);
						double r14Output=rc.ReadCellData(93,3); 
						double r16Output=rc.ReadCellData(98, 3);
						double r15Output=rc.ReadCellData(78, 3); //reading price of return Bends
						double fOutput=rc.ReadCellData(56, 3); //ss frame
						double f1Output=rc.ReadCellData(57, 3); //galvanneal frame
						double f2Output=rc.ReadCellData(58, 3); //galvanize frame
						double sOutput = rc.ReadCellData (79,3); //solder 5% silver
						double s1Output = rc.ReadCellData (80,3); //solder 15% silver
						double s2Output = rc.ReadCellData (94,3); //vents
					    double hOutput = rc.ReadCellData(59,3);
					    double h2Output = rc.ReadCellData(60,3);
					    double h3Output = rc.ReadCellData(61,3);
					    double h4Output = rc.ReadCellData(62,3);
					    double h5Output = rc.ReadCellData(63,3);
					    double h6Output = rc.ReadCellData(64,3);
					    double h7Output = rc.ReadCellData (65,3);
					    double dOuput = rc.ReadCellData(19,3);
					    double tOutput = rc.ReadCellData(20, 3);
					    double t1Output = rc.ReadCellData(21, 3);
					    double t2Output = rc.ReadCellData(22, 3);
					    double t3Output = rc.ReadCellData(23, 3);
					    double t4Output = rc.ReadCellData(24, 3);
					    double t5Output = rc.ReadCellData(25, 3);
					    double t6Output = rc.ReadCellData(26, 3);
					    double t7Output = rc.ReadCellData(27, 3);
					    double t8Output = rc.ReadCellData(28, 3);
					    double t9Output = rc.ReadCellData(29, 3);
					    double t10Output = rc.ReadCellData(30, 3);
					    double t11Output = rc.ReadCellData(31, 3);
					    double t12Output = rc.ReadCellData(32, 3);
					    double t13Output = rc.ReadCellData(33, 3);
					    double t14Output = rc.ReadCellData(34, 3);
					    double t15Output = rc.ReadCellData(35, 3);
					    double t16Output = rc.ReadCellData(36, 3);
					    double t17Output = rc.ReadCellData(37, 3);
					    double t18Output = rc.ReadCellData(38, 3);
					    double t19Output = rc.ReadCellData(39, 3);
					    double t20Output = rc.ReadCellData(40, 3);
					    double t21Output = rc.ReadCellData(41, 3);
					    double t22Output = rc.ReadCellData(42, 3);
					    double szOutput = rc.ReadCellData(75, 3);
					    double sz2Output = rc.ReadCellData(76, 3);
					    double sz3Output = rc.ReadCellData(77, 3);
					    double cOutput = rc.ReadCellData(2, 3);
					    double c1Output = rc.ReadCellData(3, 3);
					    double c2Output = rc.ReadCellData(4, 3);
					    double c3Output = rc.ReadCellData(5, 3);
					    double c4Output = rc.ReadCellData(15,3);
					    double c5Output = rc.ReadCellData(6, 3);
					    double c6Output = rc.ReadCellData(7,3);
					    double c7Output = rc.ReadCellData(8, 3);
					    double c8Output = rc.ReadCellData(9, 3);
					    double c9Output = rc.ReadCellData(10, 3);
					    double c10Output = rc.ReadCellData(12, 3);
					    double c11Output = rc.ReadCellData(11, 3);
					    double c12Output = rc.ReadCellData(13, 3);
					    double c13Output = rc.ReadCellData(14, 3);
					    double c14Output = rc.ReadCellData(17, 3);
					    double c15Output = rc.ReadCellData(16, 3);
					    double lOutput = rc.ReadCellData (97,3);
						Scanner scan = new Scanner(System.in); //declaring scan as an object of Scanner class.
						int type; //declaring variable type
					    int rowNumber; //declaring variable rowNumber
					    int finmaterialSelection; //declaring variable finmaterialselection
					    int hdiameterSelect; //declares variable hdiameterSelect
					    int distributorSelect; //declares variable distributorSelect
					    int typeSelect; //declares variable typeSelect
					    int sizeSelect; //declares variable sizeSelect
					    int amountSelect; //declares variable amountSelect
					    int tmaterialSelect; //declares variable tmaterialSelect
					    int priceSelect; 
					    int smaterialSelect;
					    int fmaterialSelect;
					    int categorySelect;
					    int connectionsSelect;
					    int connectionS;
					    double headerCost = 0;
					    double newPrice=0;
					    double finCost = 0;
					    double tubingPrice = 0;
					    double tubingPrice1=0;
					    double frameCost = 0;
					    double solderCost = 0;
					    double discCost=0;
					    double totaldCost = 0;
					    double totalPrice=0;
					    double rbendsPrice = 0;
					    double ventsPrice = 0;
					    double connectionPrice = 0;
					    double capCost = 0;
					    double laborCost = 0;
					    double finalPrice = 0;
					    ConnectionSelection connectionSelection = null;
					    CategorySelection categorySelection = null;
					    SolderMaterial solderMaterial = null;
					    FrameMaterial frameMaterial = null;
					    CoilType coilType = null; //setting coilType from enum class CoilType to null
					    FinMaterial finMaterial = null; //setting finMaterial from enum class FinMaterial to null
					    HeaderDiameter headerDiameter = null; //setting headerDiameter from enum HeaderDiameter to null
					    DistributorType distributorType = null; //setting distributorType from enum DistributorType to null
					    TypeSelector typeSelector = null; //setting typeSelector from enum TypeSelector to null
					    SizeSelector sizeSelector = null; //setting sizeSelector from enum SizeSelector to null
					    AmountSelector amountSelector = null; //setting amountSelector from enum AmountSelector to null
					    TubingMaterialSelect tubingMaterialSelect = null; //setting tubingMaterialSelect from enum TubingMaterialSelect to nu
					  //declares variable finHeight and is used to input an integer variable 'finheight' from users
			            double finHeight = inFrame.fin_height_Inp();
			            //prompts users to enter in fin length
			            double finLength = inFrame.fin_length_Inp();
			            //prompts users to enter in fins per inch
			            double finperInch = inFrame.fin_pinch_Inp();
			
			            double finWeight; //declares double variable finWeight
			
			            //sets value of fin weight by taking the fin height times fin length times fins per inch and divides it by 12
			            finWeight = (finHeight * finLength * finperInch) / 12;
			
			            //prompts user to enter in the number of rows
			            rowNumber = inFrame.row_num_Inp();
			            
			
			            //prints out empty line (to make output in terminal look neater)
			            System.out.println();
			
			            do {
			                //this prints out the menu choices for fin material for the user to choose from
			                System.out.println("1. Aluminum .006\n" + "2. Aluminum .008\n" + "3. Aluminum .010\n" + "4. Copper .008\n"
			                        + "5. Copper .010\n" + "6. Copper .015\n" + "7. Stainless Steel .006\n"
			                        + "8. Stainless Steel .008\n" + "9. Stainless Steel .010\n" + "10. Aluminum 3 x .010/n");
			                // used to input value of an integer variable 'finmaterialSelection' from user.
			                finmaterialSelection = inFrame.mat_of_fin_Inp();
			                switch (finmaterialSelection) {
			                    case 1:
			                        finMaterial = FinMaterial.Aluminum_Six;
			                        break;
			                    case 2:
			                        finMaterial = FinMaterial.Aluminum_Eight;
			                        break;
			                    case 3:
			                        finMaterial = FinMaterial.Aluminum_Ten;
			                        break;
			                    case 4:
			                        finMaterial = FinMaterial.Copper_Eight;
			                        break;
			                    case 5:
			                        finMaterial = FinMaterial.Copper_Ten;
			                        break;
			                    case 6:
			                        finMaterial = FinMaterial.Copper_Fifthteen;
			                        break;
			                    case 7:
			                        finMaterial = FinMaterial.Stainless_Steel_Six;
			                        break;
			                    case 8:
			                        finMaterial = FinMaterial.Stainless_Steel_Eight;
			                        break;
			                    case 9:
			                        finMaterial = FinMaterial.Stainless_Steel_Ten;
			                        break;
			                    case 10:
					            	finMaterial = FinMaterial.three_ten_alum;
			
			                    default:
			                        System.out.println("Invalid choice!");
			                        finMaterial = FinMaterial.Aluminum_Six;
			                        break;
			
			                }
			            } while (finmaterialSelection < 1 || finmaterialSelection > 10);
			            if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 1) {
			                finWeight = finWeight * .010;
			                finCost = finWeight * vOutput;
			             } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 1) {
			                 finWeight = finWeight * .013;
			                 finCost = finWeight * v2Output;
			             } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 1) {
			                 finWeight = finWeight * .016;
			                 finCost = finWeight * v3Output;
			             } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 1) {
			                 finWeight = finWeight * .043;
			                 finCost = finWeight * v4Output;
			             } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 1) {
			                 finWeight = finWeight * .054;
			                 finCost = finWeight * v5Output;
			             } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 1) {
			                 finWeight = finWeight * .0756;
			                 finCost = finWeight * v6Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 1) {
			                 finWeight = finWeight * .028;
			                 finCost = finWeight * v7Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 1) {
			                 finWeight = finWeight * .038;
			                 finCost = finWeight * v8Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 1) {
			                 finWeight = finWeight * .047;
			                 finCost = finWeight * v9Output;
			             } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 1) {
					    	 finWeight = finWeight * .049;
					    	 finCost = finWeight * v10Output;
					     } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 2) {
					    	 finWeight = finWeight * .097;
					    	 finCost = finWeight * v10Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 2) {
			                 finWeight = finWeight * .020;
			                 finCost = finWeight * vOutput;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 2) {
			                 finWeight = finWeight * .026;
			                 finCost = finWeight * v2Output;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 2) {
			                 finWeight = finWeight * .032;
			                 finCost = finWeight * v3Output;
			                 
			
			             } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 2) {
			                 finWeight = finWeight * .086;
			                 finCost = finWeight * v4Output;
			
			             } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 2) {
			                 finWeight = finWeight * .107;
			                 finCost = finWeight * v5Output;
			             } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 2) {
			                 finWeight = finWeight * .1522;
			                 finCost = finWeight * v6Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 2) {
			                 finWeight = finWeight * .056;
			                 finCost = finWeight * v7Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 2) {
			                 finWeight = finWeight * .075;
			                 finCost = finWeight * v8Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 2) {
			                 finWeight = finWeight * .093;
			                 finCost = finWeight * v9Output;
			             } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 3) {
			                 finWeight = finWeight * .029;
			                 finCost = finWeight * vOutput;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 3) {
			                 finWeight = finWeight * .039;
			                 finCost = finWeight * v2Output;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 3) {
			                 finWeight = finWeight * .049;
			                 finCost = finWeight * v3Output;
			
			             } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 3) {
			                 finWeight = finWeight * .129;
			                 finCost = finWeight * v4Output;
			             } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 3) {
			                 finWeight = finWeight * .161;
			                 finCost = finWeight * v5Output;
			             } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 3) {
			                 finWeight = finWeight * .2268;
			                 finCost = finWeight * v6Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 3) {
			                 finWeight = finWeight * .084;
			                 finCost = finWeight * v7Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 3) {
			                 finWeight = finWeight * .112;
			                 finCost = finWeight * v8Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 3) {
			                 finWeight = finWeight * .140;
			                 finCost = finWeight * v9Output;
			             } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 4) {
			                 finWeight = finWeight * .039;
			                 finCost = finWeight * vOutput;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 4) {
			                 finWeight = finWeight * .052;
			                 finCost = finWeight * v2Output;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 4) {
			                 finWeight = finWeight * .065;
			                 finCost = finWeight * v3Output;
			
			             } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 4) {
			                 finWeight = finWeight * .172;
			                 finCost = finWeight * v4Output;
			             } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 4) {
			                 finWeight = finWeight * .215;
			                 finCost = finWeight * v5Output;
			             } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 4) {
			                 finWeight = finWeight * .3023;
			                 finCost = finWeight * v6Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 4) {
			                 finWeight = finWeight * .112;
			                 finCost = finWeight * v7Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 4) {
			                 finWeight = finWeight * .149;
			                 finCost = finWeight * v8Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 4) {
			                 finWeight = finWeight * .187;
			                 finCost = finWeight * v9Output;
			             } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 5) {
			                 finWeight = finWeight * .049;
			                 finCost = finWeight * vOutput;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 5) {
			                 finWeight = finWeight * .065;
			                 finCost = finWeight * v2Output;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 5) {
			                 finWeight = finWeight * .081;
			                 finCost = finWeight * v3Output;
			
			             } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 5) {
			                 finWeight = finWeight * .215;
			                 finCost = finWeight * v4Output;
			             } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 5) {
			                 finWeight = finWeight * .269;
			                 finCost = finWeight * v5Output;
			             } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 5) {
			                 finWeight = finWeight * .378;
			                 finCost = finWeight * v6Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 5) {
			                 finWeight = finWeight * .140;
			                 finCost = finWeight * v7Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 5) {
			                 finWeight = finWeight * .187;
			                 finCost = finWeight * v8Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 5) {
			                 finWeight = finWeight * .233;
			                 finCost = finWeight * v9Output;
			             } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 6) {
			                 finWeight = finWeight * .058;
			                 finCost = finWeight * vOutput;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 6) {
			                 finWeight = finWeight * .078;
			                 finCost = finWeight * v2Output;
			
			             } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 6) {
			                 finWeight = finWeight * .081;
			                 finCost = finWeight * v3Output;
			
			             } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 6) {
			                 finWeight = finWeight * .258;
			                 finCost = finWeight * v4Output;
			             } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 6) {
			                 finWeight = finWeight * .322;
			                 finCost = finWeight * v5Output;
			             } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 6) {
			                 finWeight = finWeight * .4515;
			                 finCost = finWeight * v6Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 6) {
			                 finWeight = finWeight * .168;
			                 finCost = finWeight * v7Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 6) {
			                 finWeight = finWeight * .224;
			                 finCost = finWeight * v8Output;
			             } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 6) {
			                 finWeight = finWeight * .280;
			                 finCost = finWeight * v9Output;
			             } 
			            
			          //number of rows equaling 7
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 7) {
					    	 finWeight = (finWeight * .039) + (finWeight * .029);
					         finCost = finWeight * vOutput;
					     }  else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 7) {
					    	 finWeight = (finWeight * .052) + (finWeight * .039);
					         finCost = finWeight * v2Output;
					    } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 7) {
					    	 finWeight = (finWeight * .065) + (finWeight * .049);
					         finCost = finWeight * v3Output;
					    } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 7) {
					    	 finWeight = (finWeight * .172) + (finWeight * .129);
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 7) {
					    	 finWeight = (finWeight * .215) + (finWeight * .161);
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 7) {
					    	 finWeight = (finWeight * .3023) + (finWeight * .2268);
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 7) {
					    	  finWeight = (finWeight * .112) + (finWeight * .084);
						      finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 7) {
					    	 finWeight = (finWeight * .149) + (finWeight * .112);
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 7) {
					    	 finWeight = (finWeight * .187) + (finWeight * .140);
					         finCost = finWeight * v9Output;
					         
					    }
					      //number of rows equaling 8
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 8)
					     {
					    	 finWeight = (finWeight * .039) +  (finWeight * .039);
					         finCost = finWeight * vOutput;
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 8)
					     {
					     finWeight = (finWeight * .052) + (finWeight * .052);
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 8) {
					         finWeight = finWeight * .129;
					         finCost = finWeight * v3Output; 
					      
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 8)
					     {
					    	 finWeight = (finWeight * .172) + (finWeight * .172);
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 8)
					     {
					     finWeight = (finWeight * .215) + (finWeight * .215);
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 8) {
					         finWeight = (finWeight * .3023) + (finWeight * .3023);
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 8)
					     {
					    	  finWeight = (finWeight * .112) + (finWeight * .112);
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 8)
					     {
					         finWeight = (finWeight * .149) + (finWeight * .149);
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 8) {
					         finWeight = (finWeight * .187) + (finWeight * .187);
					         finCost = finWeight * v9Output;

					     }
					     
					      //number of rows equaling 9
					      
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 9)
					     {
					    	 finWeight = (finWeight * .039) + (finWeight * .049);
					         finCost = finWeight * vOutput;
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 9)
					     {
					     finWeight = (finWeight * .052) + (finWeight * .065);
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 9) {
					         
					      finWeight = (finWeight * .065) + (finWeight * .081);
					         finCost = finWeight * v3Output;
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 9)
					     {
					    	 finWeight = (finWeight * .172) + (finWeight * .215);
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 9)
					     {
					     finWeight = (finWeight * .215) + (finWeight * .269);
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 9) {
					         finWeight = (finWeight * .3023) + (finWeight * .378);
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 9)
					     {
					    	  finWeight = (finWeight * .112) + (finWeight * .140);
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 9)
					     {
					     finWeight = (finWeight * .149) + (finWeight * .187);
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 9) {
					         
					         finWeight = (finWeight * .187) + (finWeight * .233);
					         finCost = finWeight * v9Output;
					     }
					      
					     //number of rows equaling 10
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 10)
					     {
					    	finWeight = (finWeight * .039) + (finWeight * .058);
					         finCost = finWeight * vOutput; 
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 10)
					     {
					     finWeight = (finWeight * .052) + (finWeight * .078);
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 10) {
					         
					      finWeight = (finWeight * .065) + (finWeight * .081);
					         finCost = finWeight * v3Output;
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 10)
					     {
					    	 finWeight = (finWeight * .172) + (finWeight * .258);
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 10)
					     {
					     finWeight = (finWeight * .215) + (finWeight * .322);
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 10) {
					      finWeight = (finWeight * .3023) + (finWeight * .4515);
					         finCost = finWeight * v6Output;   
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 10)
					     {
					    	  finWeight = (finWeight * .112) + (finWeight * .168);
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 10)
					     {
					     finWeight = (finWeight * .149) + (finWeight * .224);
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 10) {
					         
					         finWeight = (finWeight * .187) + (finWeight * .280);
					         finCost = finWeight * v9Output;
					     } 
					     
					     //number of rows equaling 11
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 11)
					     {
					    	 finWeight = (finWeight * .039) + ((finWeight * .039) + (finWeight * .029));
					         finCost = finWeight * vOutput;
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 11)
					     {
					         finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .039));
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 11) {
					         finWeight = (finWeight * .065) + ((finWeight * .065) + (finWeight * .049));
					         finCost = finWeight * v3Output;
					      
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 11)
					     {
					    	 finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .129));
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 11)
					     {
					         finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .161));
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 11) {
					         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .2268));
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 11)
					     {
					    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .084));
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 11)
					     {
					     finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .112));
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 11) {
					         finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .140));
					         finCost = finWeight * v9Output;
					     }
					     //number of rows equaling 12
					     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 12)
					     {
					    	 finWeight = (finWeight * .039) + ((finWeight * .039) +  finWeight * .039);
					         finCost = finWeight * vOutput;
					     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 12)
					     {
					     finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .052));
					         finCost = finWeight * v2Output;
					     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 12) {
					         
					      finWeight = (finWeight * .065) + (finWeight * .129);
					         finCost = finWeight * v3Output;
					     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 12)
					     {
					    	finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .172));
					         finCost = finWeight * v4Output;
					     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 12)
					     {
					     finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .215));
					         finCost = finWeight * v5Output;
					     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 12) {
					         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .3023));
					         finCost = finWeight * v6Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 12)
					     {
					    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .112));
					         finCost = finWeight * v7Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 12)
					     {
					       finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .149));
					         finCost = finWeight * v8Output;
					     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 12) {
					        finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .187));
					         finCost = finWeight * v9Output; 
					         
					     } 
			            //prints out the value of Fin Weight
			
			            GUI.finWeight.setText(finWeight + "");
			
			            //declares double variable named tubeFeet
			            double tubeFeet;
			            //calculates feet of tubing by taking the fin length + 4 inches times fin height divided by 1.5
			            //times the number of rows and divided by 12. Math.round is to round the answer
			            tubeFeet = Math.round(((finLength + 4) * ((finHeight / 1.5) * rowNumber)) / 12);
			            
			
			            //prints out the value of feet of tubing
			
			            GUI.tubingFeet.setText(tubeFeet + "");
			
			            do {
			                //this prints out the menu choices for tubing material for the user to choose from
			                System.out.println("1. 1/2 x 0.035 cu\n" + "2. 5/8 x 0.030 cu\n" + "3. 5/8 x 0.035 cu\n"
			                        + "4. 5/8 x 0.038 cu\n" + "5. 1-1/8 in x .050 cu\n" + "6. 1/4 in x .020 Stnls\n" +
			                        "7. 5/8 in x .035 Stnls\n" + "8. 5/8 in. x .038 Stnls\n" + "9. 5/8 in. x .049 Stnls\n"
			                        + "10. 1-1/8 in. x .049 Stnls\n" + "11. 5/8 x .035 CuNi\n" + "12. 1/4 in. Ref.Cu\n"
			                        + "13. 5/16 in. Ref.Cu\n" + "14.  1/2 in. Ref.Cu\n" + "15. 1-1/8 in. x .049 Cu\n");
			                
			                // used to input value of an integer variable 'tmaterialSelect' from user.
			                tmaterialSelect = inFrame.mat_of_Tubing_Inp();
			                switch (tmaterialSelect) {
			                    case 1:
			                        tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
			                        break;
			                    case 2:
			                        tubingMaterialSelect = TubingMaterialSelect.five_eight_0_30_cu;
			                        break;
			                    case 3:
			                        tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Cu;
			                        break;
			                    case 4:
			                        tubingMaterialSelect = TubingMaterialSelect.five_eight_0_38_cu;
			                        break;
			                    case 5:
			                        tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_50_cu;
			                        break;
			                    case 6:
			                        tubingMaterialSelect = TubingMaterialSelect.one_fourth_0_20_stnls;
			                        break;
			                    case 7:
			                        tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Stnls;
			                        break;
			                    case 8:
			                        tubingMaterialSelect = TubingMaterialSelect.five_eight_o_38_stnls;
			                        break;
			                    case 9:
			                        tubingMaterialSelect = TubingMaterialSelect.five_eight_0_49_stnls;
			                        break;
			                    case 10:
			                        tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_stnls;
			                        break;
			                    case 11:
			                        tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_cuni;
			                        break;
			                    case 12:
			                        tubingMaterialSelect = TubingMaterialSelect.one_four_ref;
			                        break;
			                    case 13:
			                        tubingMaterialSelect = TubingMaterialSelect.five_sixteen_ref;
			                        break;
			                    case 14:
			                        tubingMaterialSelect = TubingMaterialSelect.one_half_ref;
			                        break;
			                    case 15:
			                        tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_cu;
			                        break;
			                    default:
			                        System.out.println("Invalid choice!");
			                        tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
			                        break;
			
			                }
			            } while (tmaterialSelect < 1 || tmaterialSelect > 15);
			            if (tmaterialSelect == 1)
			            {
			            	 tubingPrice = tubeFeet * rOutput;
			            }
			            else if (tmaterialSelect == 2)
			            {
			            	 tubingPrice = tubeFeet * r2Output;
			            }
			            else if (tmaterialSelect == 3)
			            {
			                 tubingPrice = tubeFeet * r3Output;
			            }
			            else if (tmaterialSelect == 4)
			            {
			            	 tubingPrice = tubeFeet * r4Output;
			            }
			            else if(tmaterialSelect == 5)
			            {
			            	 tubingPrice = tubeFeet * r5Output;
			            }
			            else if (tmaterialSelect == 6)
			            {
			            	 tubingPrice = tubeFeet * r6Output;
			            }
			            else if (tmaterialSelect == 7)
			            {
			                 tubingPrice = tubeFeet * r7Output;
			            }
			            else if (tmaterialSelect == 8)
			            {
			            	 tubingPrice = tubeFeet * r8Output;
			            }
			            else if (tmaterialSelect == 9)
			            {
			            	 tubingPrice = tubeFeet * r9Output;
			            }
			            else if(tmaterialSelect == 10)
			            {
			            	 tubingPrice = tubeFeet * r10Output;
			            }
			            else if (tmaterialSelect == 11)
			            {
			                 tubingPrice = tubeFeet * r11Output;
			            }
			            else if (tmaterialSelect == 12)
			            {
			              tubingPrice = tubeFeet * r12Output;
			            }
			            else if(tmaterialSelect == 13)
			            {
			              tubingPrice = tubeFeet * r13Output;
			            }
			            else if (tmaterialSelect == 14)
			            {
			             tubingPrice = tubeFeet * r14Output;
			            }
			            else if (tmaterialSelect == 15)
			            {
			             tubingPrice = tubeFeet * r16Output;
			            }
			            //declares double variable returnBends and sets it equal to 0
			            double returnBends = 0;
			
			            //declares double variable num2
			            double num2;
			            if (rowNumber == 3 || rowNumber == 4 || rowNumber == 5 || rowNumber == 6 || rowNumber == 8) {
			                returnBends = finHeight / 1.5 * rowNumber / 2.0 * 0.5 + finHeight / 1.5 * rowNumber / 2.0;
			            } else {
			                num2 = finHeight / 1.5 * rowNumber / 2.0;
			                returnBends = Math.round(num2);
			            }
			            //prints out number of return bends
			           
			            GUI.returnBends.setText(returnBends + "");
			            
			            rbendsPrice = (returnBends * r15Output);
			            
			
			           
			            connectionS = inFrame.connections_num_Inp();
			            do {
			                //this prints out the menu choices for distributors for the user to choose from
			                System.out.println("1. 1/2 in FPT\n" + "2. 3/4 in FPT\n" + "3. 1 in. FPT\n" + "4. 1 in MPT\n"
			                        + "5. 1-1/4 in MPT\n" + "6. 1-1/2 in MPTM\n" + "7. 1-1/2 in FPT\n" + "8. 2 in FPT\n"
			                        + "9. 2 in MPT\n" + "10. 2.5 in FPT\n" + "11. 2.5 in MPT\n" + "12. 3 in MPT\n" + "13. 4 in MPT\n" + "14. 1-1/2 in Brass\n" + "15. 2-3/8 in Brass\n");
			               
			                // used to input value of an integer variable 'distributorSelect' from user.
			                connectionsSelect = inFrame.size_of_connection_Inp();
			                switch (connectionsSelect) {
			                    case 1:
			                        connectionSelection = ConnectionSelection.one_half_fpt;
			                        break;
			                    case 2:
			                   	 connectionSelection = ConnectionSelection.three_fourth_fpt;
			                        break;
			                    case 3:
			                   	 connectionSelection = ConnectionSelection.one_fpt;
			                        break;
			                    case 4:
			                   	 connectionSelection = ConnectionSelection.one_mpt;
			                        break;
			                    case 5:
			                   	 connectionSelection = ConnectionSelection.one_one_fourth_mpt;
			                        break;
			                    case 6:
			                   	 connectionSelection = ConnectionSelection.one_one_half_mpt;
			                        break;
			                    case 7:
			                   	 connectionSelection = ConnectionSelection.one_one_half_fpt;
			                        break;
			                    case 8:
			                   	 connectionSelection = ConnectionSelection.two_fpt;
			                        break;
			                    case 9:
			                   	 connectionSelection = ConnectionSelection.two_mpt;
			                        break;
			                    case 10:
			                   	 connectionSelection = ConnectionSelection.two_five_fpt;
			                        break;
			                    case 11:
			                   	 connectionSelection = ConnectionSelection.two_five_mpt;
			                        break;
			                    case 12:
			                   	 connectionSelection = ConnectionSelection.three_mpt;
			                        break;
			                    case 13:
			                   	 connectionSelection = ConnectionSelection.four_mpt;
			                        break;
			                    case 14:
			                   	 connectionSelection = ConnectionSelection.one_one_half_brass;
			                        break;
			                    case 15:
			                   	 connectionSelection = ConnectionSelection.two_three_eighths_brass;
			                        break;
			                   
			
			                    default:
			                        System.out.println("Invalid choice!");
			                        connectionSelection = ConnectionSelection.one_half_fpt;
			                        break;
			
			                }
			            } while (connectionsSelect < 1 || connectionsSelect > 15);
			             
			             if (connectionsSelect == 1)
			             {
			            	 connectionPrice = connectionS * c1Output;
			            	 
			            	
			             }
			             else if (connectionsSelect == 2)
			             {
			            	 connectionPrice = connectionS * c2Output;
			            	 
			            	
			             }
			             else if (connectionsSelect == 3)
			             {
			            	 connectionPrice = connectionS * c3Output;
			            	 
			            	 
			             }
			             else if (connectionsSelect == 4)
			             {
			            	connectionPrice = connectionS * c4Output;
			            	 
			            	
			             }
			             else if (connectionsSelect == 5)
			             {
			            	 connectionPrice = connectionS * c5Output;
			            	 
			            	 
			             }
			             else if (connectionsSelect == 6)
			             {
			            	 connectionPrice = connectionS * c6Output;
			            	 
			            	 
			           	  
			             }
			             else if (connectionsSelect == 7)
			             {
			            	 connectionPrice = connectionS * c7Output;
			            	 
			            	
			             }
			            		 else if (connectionsSelect == 8)
			             {
			            			 connectionPrice = connectionS * c8Output;
			                    	 
			                  
			         
			             }
			             else if (connectionsSelect == 9)
			             {
			            	 connectionPrice = connectionS * c9Output;
			            	 
			            	
			             }
			             else if (connectionsSelect == 10)
			             {
			            	 connectionPrice = connectionS * c10Output;
			            	 
			            	 
			             }
			             else if (connectionsSelect == 11)
			             {
			            	 connectionPrice = connectionS * c11Output;
			            	 
			            	
			             }
			             else if (connectionsSelect == 12)
			             {
			            	 connectionPrice = connectionS * c12Output;
			            	 
			            	
			             }
			             else if (connectionsSelect == 13)
			             {
			            	 connectionPrice = connectionS * c13Output;
			           
			             }
			             else if (connectionsSelect == 14)
			             {
			            	 connectionPrice = connectionS * c14Output;
			            	 
			            
			             }
			             else if (connectionsSelect == 15)
			             {
			            	 connectionPrice = connectionS * c15Output;
			            	 
			            	
			             }
			            //declares double variable frameWeight
			            double frameWeight;
			            	
			            //sets frame weight equal to the fin length times number of rows times 2 plus the fin height times
			            // number of rows times 2 and divides it by 12
			            frameWeight = ((finLength * rowNumber * 2.0) + (finHeight * rowNumber * 2.0)) / 12.0;
			            
			            do {
			                //this prints out the menu choices for frame material for the user to choose from
			                System.out.println("1. SS\n" + "2. Galvnl\n" + "3. Galvns\n");
			                
			                // used to input value of an integer variable 'fmaterialSelect' from user.
			                fmaterialSelect = inFrame.mat_of_frame_Inp();
			                switch (fmaterialSelect) {
			                    case 1:
			                       frameMaterial = FrameMaterial.stainless_steel;
			                        break;
			                    case 2:
			                        frameMaterial = FrameMaterial.galvanneal;
			                        break;
			                    case 3:
			                        frameMaterial = FrameMaterial.galvanized;
			                        break;
			                  
			
			                    default:
			                        System.out.println("Invalid choice!");
			                        frameMaterial = FrameMaterial.stainless_steel;
			                        break;
			
			                }
			            } while (fmaterialSelect < 1 || fmaterialSelect > 3);
			            if (fmaterialSelect == 1)
			            {
			            	frameCost = frameWeight * fOutput;
			            }
			            else if (fmaterialSelect == 2)
			            {
			            	frameCost = frameWeight * f1Output;
			            }
			            else if (fmaterialSelect == 3)
			            {
			            	frameCost = frameWeight * f2Output;
			            }
			
			            //this declares a string variable called strDouble and formats it as the frame weight rounded to two decimal places
			            String strDouble = String.format("%.2f", frameWeight);
			            String strDouble3 = String.format("%.2f", frameCost);
			
			            //this prints out the value of the frame weight
			 
			             GUI.frameWeight.setText(strDouble + "");
			            
			
			            //this declares a double variable called solderNum
			            double solderNum;
			
			            //this sets the value of the number of solders to frameWeight times .138
			            solderNum = frameWeight * .138;
			            
			
			            do {
			                //this prints out the menu choices for solder material for the user to choose from
			                System.out.println("1. 5% silver\n" + "2. 15% silver\n");
			               
			                // used to input value of an integer variable 'fmaterialSelect' from user.
			                smaterialSelect = inFrame.sil_per_solder_Inp();
			                switch (smaterialSelect) {
			                    case 1:
			                       solderMaterial = SolderMaterial.five_silver;
			                        break;
			                    case 2:
			                        solderMaterial = SolderMaterial.fifteen_silver;
			                        break;
			
			                    default:
			                        System.out.println("Invalid choice!");
			                        solderMaterial = SolderMaterial.five_silver;;
			                        break;
			
			                }
			            } while (smaterialSelect < 1 || smaterialSelect > 2);
			            if (smaterialSelect == 1)
			            {
			            	solderCost = solderNum * sOutput;
			            }
			            else if (smaterialSelect == 2)
			            {
			            	solderCost = solderNum * s1Output;
			            }
			
			            //this declares a string variable called strDouble1 and formats it as the number of solders rounded to two decimal places
			            String strDouble1 = String.format("%.2f", solderNum);
			            
			            String strDouble4 = String.format("%.2f", solderCost);
			
			            //this prints out the number of solders
			  
			            GUI.solderNum.setText(strDouble1 + "");
			           
			
			            //this declares a double variable called vents and sets it equal to 4
			            double vents = 4;
			
			            //this prints out the number of vents
			          
			            GUI.ventNum.setText(vents + "");
			            
			            ventsPrice = (vents * s2Output);
			            String strDouble10 = String.format("%.2f",  ventsPrice);
			           
			
			
			            //this declares a double variable called headerNum
			            double headerNum = 2;
			
			            //this prints out the number of headers
			
			            GUI.headerNum.setText(headerNum + "");
			
			            //this declares a double variable called headerLength and sets it equal to the finHeight
			            double headerLength = finHeight;
			
			            //this prints out the header length
			         
			            GUI.headerLength.setText(headerLength + "");
			            //this declares a double variable called disc
			            double disc;
			
			            //this sets the value of disc to number of headers times 2
			            disc = headerNum * 2;
			
			            discCost = disc * dOuput;
			
			            String strDouble12 = String.format("%.2f",  discCost);
			  
			
			
			            //this prints out the number of discs
			           
			            GUI.discNum.setText(disc + "");
			            double headers;
			            headers = ((finHeight + 3) * 2) / 12;
			
			            System.out.println();
			
			            do {
			                //this prints out the menu choices for header diameter for the user to choose from
			                System.out.println("1. 3/4 in. cu\n" + "2. 1 in. cu\n" + "3. 1-1/2 in. cu\n" + "4. 2 in. cu\n"
			                        + "5. 2-1/2 in. cu\n" + "6. 3 in. cu\n" + "7. 4 in. cu\n");
			                
			                // used to input value of an integer variable 'hdiameterSelect' from user.
			                hdiameterSelect = inFrame.dia_of_header_Inp();
			                switch (hdiameterSelect) {
			                    case 1:
			                        headerDiameter = HeaderDiameter.three_fourth;
			                        break;
			                    case 2:
			                        headerDiameter = HeaderDiameter.one;
			                        break;
			                    case 3:
			                        headerDiameter = HeaderDiameter.one_and_one_half;
			                        break;
			                    case 4:
			                        headerDiameter = HeaderDiameter.two;
			                        break;
			                    case 5:
			                        headerDiameter = HeaderDiameter.two_and_one_half;
			                        break;
			                    case 6:
			                        headerDiameter = HeaderDiameter.three;
			                        break;
			                    case 7:
			                        headerDiameter = HeaderDiameter.four;
			                        break;
			
			                    default:
			                        System.out.println("Invalid choice!");
			                        headerDiameter = HeaderDiameter.three_fourth;
			                        break;
			
			                }
			            } while (hdiameterSelect < 1 || hdiameterSelect > 7);
			                if (hdiameterSelect == 1)
			                {
			                    headerCost = headers * hOutput;
			                }
			                else if (hdiameterSelect == 2)
			                {
			                    headerCost = headers * h2Output;
			                }
			                else if (hdiameterSelect == 3)
			                {
			                    headerCost = headers * h3Output;
			                }
			                else if (hdiameterSelect == 4)
			                {
			                    headerCost = headers * h4Output;
			                }
			                else if (hdiameterSelect == 5)
			                {
			                    headerCost = headers * h5Output;
			                }
			                else if (hdiameterSelect == 6)
			                {
			                    headerCost = headers * h6Output;
			                }
			                else if (hdiameterSelect == 7)
			                {
			                    headerCost = headers * h7Output;
			                }
			
			                String strDouble15 = String.format("%.2f",  headerCost);
			             
			
			            System.out.println();
			
			            do {
			                //this prints out the menu choices for distributors for the user to choose from
			                System.out.println("1. 1/2 SAE\n" + "2. 5/8 SAE\n" + "3. 1/2 ODM\n" + "4. 5/8 ODM\n"
			                        + "5. 7/8 ODM\n" + "6. 1-1/8 ODM\n" + "7. 1-3/8 ODM\n" + "8. 1-5/8 ODM\n"
			                        + "9. Type H Vavel\n" + "10. Type M/V Vavel\n");
			                
			                // used to input value of an integer variable 'distributorSelect' from user.
			                distributorSelect = inFrame.distributor_Inp();
			                switch (distributorSelect) {
			                    case 1:
			                        distributorType = DistributorType.one_half_SAE;
			                        break;
			                    case 2:
			                        distributorType = DistributorType.five_eighths_SAE;
			                        break;
			                    case 3:
			                        distributorType = DistributorType.one_half_ODM;
			                        break;
			                    case 4:
			                        distributorType = DistributorType.five_eighths_ODM;
			                        break;
			                    case 5:
			                        distributorType = DistributorType.seven_eighths_ODM;
			                        break;
			                    case 6:
			                        distributorType = DistributorType.one_to_one_eighth_ODM;
			                        break;
			                    case 7:
			                        distributorType = DistributorType.one_to_three_eighth_ODM;
			                        break;
			                    case 8:
			                        distributorType = DistributorType.one_to_five_eighth_ODM;
			                        break;
			                    case 9:
			                        distributorType = DistributorType.Type_h_valve;
			                        break;
			                    case 10:
			                        distributorType = DistributorType.Type_m_slash_v_valve;
			                        break;
			
			                    default:
			                        System.out.println("Invalid choice!");
			                        distributorType = DistributorType.one_half_SAE;
			                        break;
			
			                }
			            } while (distributorSelect < 1 || distributorSelect > 10);
			
			            if (distributorSelect == 1) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. 1605\n" + "2. 1608\n");
			                   
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();;
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.sixteen_o_five;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.sixteen_o_eight;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.sixteen_o_five;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 2);
			                
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			                   
			                   
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			              
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			
			                double length;
			
			                length = finLength + 18;
			
			
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (tOutput) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (tOutput) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (tOutput) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (tOutput * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (tOutput * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (tOutput * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (tOutput * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (tOutput * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (tOutput * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (tOutput * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (tOutput * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (tOutput * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t1Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t1Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t1Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t1Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t1Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t1Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t1Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t1Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t1Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t1Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t1Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t1Output * 4) + (length * sz3Output);
			                }
			               
			             
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			               
			                GUI.totalCost.setText(strDouble19 + "" );
			               
			            } else if (distributorSelect == 2) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. 1104\n" + "2. 1147\n");
			                    
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.one_one_o_four;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.one_one_four_seven;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.one_one_o_four;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 2);
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			                    
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			                
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			
			                double length;
			
			                length = finLength + 18;
			
			
			                
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t2Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t2Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t2Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t2Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t2Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t2Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t2Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t2Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t2Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t2Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t2Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t2Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t3Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t3Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t3Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t3Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t3Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t3Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t3Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t3Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t3Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t3Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t3Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t3Output * 4) + (length * sz3Output);
			                }
			               
			               
			
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			   
			                
			            } else if (distributorSelect == 3) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. D260\n" + "2. D262\n");
			                   
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.d_two_six;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.d_two_six_two;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.d_two_six;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 2);
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			                    
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			                    
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			
			                double length;
			
			                length = finLength + 18;
			
			           
			
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t4Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t4Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t4Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t4Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t4Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t4Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t4Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t4Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t4Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t4Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t4Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t4Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t5Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t5Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t5Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t5Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t5Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t5Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t5Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t5Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t5Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t5Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t5Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t5Output * 4) + (length * sz3Output);
			                }
			               
			                
			               
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			   
			                
			                
			            } else if (distributorSelect == 4) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. 1602\n" + "2. 1622\n");
			                   
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.sixteen_o_two;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.sixteen_twenty_two;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.sixteen_o_two;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 2);
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			                    
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			            
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			
			                double length;
			
			                length = finLength + 18;
			
			
			                
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t6Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t6Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t6Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t6Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t6Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t6Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t6Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t6Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t6Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t6Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t6Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t6Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t7Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t7Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t7Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t7Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t7Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t7Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t7Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t7Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t7Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t7Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t7Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t7Output * 4) + (length * sz3Output);
			                }
			               
			                
			
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			
			
			                   
			
			
			            } else if (distributorSelect == 5) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. 1602\n" + "2. 1622\n");
			               
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.sixteen_o_two;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.sixteen_twenty_two;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.sixteen_o_two;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 2);
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			                   
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			                    
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			
			                double length;
			
			                length = finLength + 18;
			
			                
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t6Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t6Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t6Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t6Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t6Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t6Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t6Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t6Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t6Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t6Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t6Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t6Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t7Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t7Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t7Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t7Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t7Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t7Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t7Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t7Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t7Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t7Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t7Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t7Output * 4) + (length * sz3Output);
			                }
			               
			                
			                
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			              
			                
			
			            } else if (distributorSelect == 6) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. 1112\n" + "2. 1113\n");
			                 
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.one_one_one_two;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.one_one_one_three;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.one_one_one_two;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 2);
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			                   
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			                  
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			
			                double length;
			
			                length = finLength + 18;
			
			     
			                
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t8Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t8Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t8Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t8Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t8Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t8Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t8Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t8Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t8Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t8Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t8Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t8Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t9Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t9Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t9Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t9Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t9Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t9Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t9Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t9Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t9Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t9Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t9Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t9Output * 4) + (length * sz3Output);
			                }
			               
			                
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			
			                
			            } else if (distributorSelect == 7) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. 1115\n" + "2. 1116\n");
			          
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.one_one_one_five;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.one_one_one_six;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.one_one_one_five;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 2);
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			                  
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			                  
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			
			                double length;
			
			                length = finLength + 18;
			
			
			                
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t10Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t10Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t10Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t10Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t10Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t10Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t10Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t10Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t10Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t10Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t10Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t10Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t11Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t11Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t11Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t11Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t11Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t11Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t11Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t11Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t11Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t11Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t11Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t11Output * 4) + (length * sz3Output);
			                }
			               
			                
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			
			
			                
			            } else if (distributorSelect == 8) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. 1117\n" + "2. 1126\n" + "3. 1128\n");
			               
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.one_one_one_seven;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.one_one_two_six;
			                            break;
			                        case 3:
			                            typeSelector = TypeSelector.one_one_two_eight;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.one_one_one_seven;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 3);
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			        
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			              
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			
			                double length;
			
			                length = finLength + 18;
			
			
			                
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t12Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t12Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t12Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t12Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t12Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t12Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t12Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t12Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t12Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t12Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t12Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t12Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t14Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t14Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t14Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t14Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t14Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t14Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t14Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t14Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t14Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t14Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t14Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t14Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 3 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t16Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 3 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t16Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t16Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 3 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t16Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 3 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t16Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t16Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t16Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 3 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t16Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t16Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t16Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 3 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t16Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t16Output * 4) + (length * sz3Output);
			                }
			                
			
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			         
			                
			            } else if (distributorSelect == 9) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. 1125\n" + "2. 1127\n" + "3. 1143\n");
			                   
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.one_one_two_five;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.one_one_two_seven;
			                            break;
			                        case 3:
			                            typeSelector = TypeSelector.one_one_four_three;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.one_one_two_five;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 3);
			                
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			                   
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			                    
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			               
			                double length;
			
			                length = finLength + 18;
			
			
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t13Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t13Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t13Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t13Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t13Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t13Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t13Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t13Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t13Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t13Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t13Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t13Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t15Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t15Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t15Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t15Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t15Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t15Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t15Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t15Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t15Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t15Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t15Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t15Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 3 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t17Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 3 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t17Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t17Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 3 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t17Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 3 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t17Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t17Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t17Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 3 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t17Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t17Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t17Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 3 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t17Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t17Output * 4) + (length * sz3Output);
			                }
			
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			           
			                
			            } else if (distributorSelect == 10) {
			                do {
			                    //this prints out the menu choices for type for the user to choose from
			                    System.out.println("1. 1109\n" + "2. 1124\n" + "3. 1192\n");
			                   
			                    // used to input value of an integer variable 'typeSelect' from user.
			                    typeSelect = inFrame.distributor_type_Inp();
			                    switch (typeSelect) {
			                        case 1:
			                            typeSelector = TypeSelector.one_one_o_nine;
			                            break;
			                        case 2:
			                            typeSelector = TypeSelector.one_one_two_four;
			                            break;
			                        case 3:
			                            typeSelector = TypeSelector.one_one_nine_two;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            typeSelector = TypeSelector.one_one_o_nine;
			                            break;
			
			                    }
			                }
			                while (typeSelect < 1 || typeSelect > 3);
			                do {
			                    //this prints out the menu choices for the size for the user to choose from
			                    System.out.println("1. 1/4 in. ref\n" + "2. 5/16 in. ref\n" + "3. 1/2 in. ref\n");
			                  
			                    // used to input value of an integer variable 'sizeSelect' from user.
			                    sizeSelect = inFrame.distributor_size_Inp();
			                    switch (sizeSelect) {
			                        case 1:
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			                        case 2:
			                            sizeSelector = SizeSelector.five_sixteen;
			                            break;
			                        case 3:
			                            sizeSelector = SizeSelector.one_half;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            sizeSelector = SizeSelector.one_fourth;
			                            break;
			
			                    }
			                }
			                while (sizeSelect < 1 || sizeSelect > 3);
			                do {
			                    //this prints out the menu choices for the amount for the user to choose from
			                    System.out.println("1. 1\n" + "2. 2\n" + "3. 3\n" + "4. 4\n");
			
			                    // used to input value of an integer variable 'amountSelect' from user.
			                    amountSelect = inFrame.distributor_amount_Inp();
			                    switch (amountSelect) {
			                        case 1:
			                            amountSelector = AmountSelector.one;
			                            break;
			                        case 2:
			                            amountSelector = AmountSelector.two;
			                            break;
			                        case 3:
			                            amountSelector = AmountSelector.three;
			                            break;
			                        case 4:
			                            amountSelector = AmountSelector.four;
			                            break;
			
			                        default:
			                            System.out.println("Invalid choice!");
			                            amountSelector = AmountSelector.one;
			                            break;
			
			                    }
			                }
			                while (amountSelect < 1 || amountSelect > 4);
			
			                double length;
			
			                length = finLength + 18;
			
			
			                
			                if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t18Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t18Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t18Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t18Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t18Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t18Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t18Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t18Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t18Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t18Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t18Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 1 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t18Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t19Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t19Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t19Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t19Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t19Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t19Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t19Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t19Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t19Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t19Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t19Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 2 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t19Output * 4) + (length * sz3Output);
			                }
			                if (typeSelect == 3 && amountSelect == 1 && sizeSelect == 1)
			                {
			                totaldCost = (t20Output) + (length * szOutput);
			                }
			
			                else if (typeSelect == 3 && amountSelect == 1 && sizeSelect == 2)
			                {
			                 totaldCost = (t20Output) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 1 && sizeSelect == 3)
			                {
			                	totaldCost = (t20Output) + (length * sz3Output);  
			                }
			                else if (typeSelect == 3 && amountSelect == 2 && sizeSelect == 1)
			                {
			                	totaldCost = (t20Output * 2) + (length * szOutput);
			                }
			                else if (typeSelect == 3 && amountSelect == 2 && sizeSelect == 2)
			                {
			                	totaldCost = (t20Output * 2) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 2 && sizeSelect == 3)
			                {
			                	totaldCost = (t20Output * 2) + (length * sz3Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 3 && sizeSelect == 1)
			                {
			                	totaldCost = (t20Output * 3) + (length * szOutput);
			                }
			                else if (typeSelect == 3 && amountSelect == 3 && sizeSelect == 2)
			                {
			                	totaldCost = (t20Output * 3) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 3 && sizeSelect == 3)
			                {
			                	totaldCost = (t20Output * 3) + (length * sz3Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 4 && sizeSelect == 1)
			                {
			                	totaldCost = (t20Output * 4) + (length * szOutput);
			                }
			                else if (typeSelect == 3 && amountSelect == 4 && sizeSelect == 2)
			                {
			                	totaldCost = (t20Output * 4) + (length * sz2Output);
			                }
			                else if (typeSelect == 3 && amountSelect == 4 && sizeSelect == 3)
			                {
			                	totaldCost = (t20Output * 4) + (length * sz3Output);
			                }
			                
			
			
			                totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + totaldCost + connectionPrice;
			
			                String strDouble19 = String.format("%.2f",  totalPrice);
			                laborCost = lOutput;
			                finalPrice = (totalPrice * laborCost);
			                String strDouble35 = String.format("%.2f", finalPrice);
			              
			                GUI.totalmaterialsCost.setText(strDouble19 + "");
			
			                GUI.totalCost.setText(strDouble35 + "");
			                System.out.println(); 
			                FileInputStream fis = new FileInputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
			        		XSSFWorkbook workbook = new XSSFWorkbook (fis);
			        		XSSFSheet sheet = workbook.getSheetAt(0);
			        		XSSFRow row1 = sheet.getRow(1);
			        		XSSFCell cell1 = row1.getCell(1);
			        		cell1.setCellValue("DX");
			        		XSSFCell cell2 = row1.getCell(2);
			        		cell2.setCellValue(finHeight);
			        		XSSFCell cell3 = row1.getCell(3);
			        		cell3.setCellValue(rowNumber);
			        		XSSFCell cell4 = row1.getCell(4);
			        		cell4.setCellValue(finperInch);
			        		XSSFCell cell6 = row1.getCell(6);
			        		cell6.setCellValue(finLength);      
			        		XSSFCell cell7 = row1.getCell(7);
			        		cell7.setCellValue(strDouble19);
			        		XSSFCell cell8 = row1.getCell(8);
			        		cell8.setCellValue(strDouble35);
			        		fis.close();
			       		FileOutputStream fos =new FileOutputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
			       	        workbook.write(fos);
			       	        fos.close(); 
			                System.out.println(); 
			                }
			
			}
			
	public static void condensingCoil (GUI inFrame) throws IOException 
			{
					main rc=new main();   //object of the class  
					//reading the value of 45th row and 3rd column  
					double vOutput=rc.ReadCellData(44, 3);  //reading price of aluminum fin .006
					double v2Output=rc.ReadCellData(45,3); //reading price of aluminum fin .008
					double v3Output=rc.ReadCellData(46, 3); //reading price of aluminum fin .010
					double v4Output=rc.ReadCellData(47, 3); //reading price of copper fin .008
					double v5Output=rc.ReadCellData(48, 3); //reading price of copper fin .010
					double v6Output=rc.ReadCellData(49, 3); //reading price of copper fin .015
					double v7Output=rc.ReadCellData(51, 3); //reading price of stainless steel .006
					double v8Output=rc.ReadCellData(52, 3); //reading price of stainless steel fin .008
					double v9Output=rc.ReadCellData(53, 3); //reading price of stainless steel .010
					double v10Output=rc.ReadCellData(99, 3); //reading price of alum 3in x .010
					double rOutput=rc.ReadCellData(81,3); //reading price of tubing 1/2 x 0.035 cu
					double r2Output=rc.ReadCellData(82,3); 
					double r3Output=rc.ReadCellData(83,3); 
					double r4Output=rc.ReadCellData(84,3); 
					double r5Output=rc.ReadCellData(85,3); 
					double r6Output=rc.ReadCellData(86,3);
					double r7Output=rc.ReadCellData(87,3); 
					double r8Output=rc.ReadCellData(88,3); 
					double r9Output=rc.ReadCellData(89,3);
					double r10Output=rc.ReadCellData(90,3); 
					double r11Output=rc.ReadCellData(95,3); 
					double r12Output=rc.ReadCellData(91,3); 
					double r13Output=rc.ReadCellData(92,3);
					double r14Output=rc.ReadCellData(93,3); 
					double r16Output=rc.ReadCellData(98, 3);
					double r15Output=rc.ReadCellData(78, 3); //reading price of return Bends
					double fOutput=rc.ReadCellData(56, 3); //ss frame
					double f1Output=rc.ReadCellData(57, 3); //galvanneal frame
					double f2Output=rc.ReadCellData(58, 3); //galvanize frame
					double sOutput = rc.ReadCellData (79,3); //solder 5% silver
					double s1Output = rc.ReadCellData (80,3); //solder 15% silver
					double s2Output = rc.ReadCellData (94,3); //vents
				    double hOutput = rc.ReadCellData(59,3);
				    double h2Output = rc.ReadCellData(60,3);
				    double h3Output = rc.ReadCellData(61,3);
				    double h4Output = rc.ReadCellData(62,3);
				    double h5Output = rc.ReadCellData(63,3);
				    double h6Output = rc.ReadCellData(64,3);
				    double h7Output = rc.ReadCellData (65,3);
				    double dOuput = rc.ReadCellData(19,3);
				    double tOutput = rc.ReadCellData(20, 3);
				    double t1Output = rc.ReadCellData(21, 3);
				    double t2Output = rc.ReadCellData(22, 3);
				    double t3Output = rc.ReadCellData(23, 3);
				    double t4Output = rc.ReadCellData(24, 3);
				    double t5Output = rc.ReadCellData(25, 3);
				    double t6Output = rc.ReadCellData(26, 3);
				    double t7Output = rc.ReadCellData(27, 3);
				    double t8Output = rc.ReadCellData(28, 3);
				    double t9Output = rc.ReadCellData(29, 3);
				    double t10Output = rc.ReadCellData(30, 3);
				    double t11Output = rc.ReadCellData(31, 3);
				    double t12Output = rc.ReadCellData(32, 3);
				    double t13Output = rc.ReadCellData(33, 3);
				    double t14Output = rc.ReadCellData(34, 3);
				    double t15Output = rc.ReadCellData(35, 3);
				    double t16Output = rc.ReadCellData(36, 3);
				    double t17Output = rc.ReadCellData(37, 3);
				    double t18Output = rc.ReadCellData(38, 3);
				    double t19Output = rc.ReadCellData(39, 3);
				    double t20Output = rc.ReadCellData(40, 3);
				    double t21Output = rc.ReadCellData(41, 3);
				    double t22Output = rc.ReadCellData(42, 3);
				    double szOutput = rc.ReadCellData(75, 3);
				    double sz2Output = rc.ReadCellData(76, 3);
				    double sz3Output = rc.ReadCellData(77, 3);
				    double cOutput = rc.ReadCellData(2, 3);
				    double c1Output = rc.ReadCellData(3, 3);
				    double c2Output = rc.ReadCellData(4, 3);
				    double c3Output = rc.ReadCellData(5, 3);
				    double c4Output = rc.ReadCellData(15,3);
				    double c5Output = rc.ReadCellData(6, 3);
				    double c6Output = rc.ReadCellData(7,3);
				    double c7Output = rc.ReadCellData(8, 3);
				    double c8Output = rc.ReadCellData(9, 3);
				    double c9Output = rc.ReadCellData(10, 3);
				    double c10Output = rc.ReadCellData(12, 3);
				    double c11Output = rc.ReadCellData(11, 3);
				    double c12Output = rc.ReadCellData(13, 3);
				    double c13Output = rc.ReadCellData(14, 3);
				    double c14Output = rc.ReadCellData(17, 3);
				    double c15Output = rc.ReadCellData(16, 3);
				    double lOutput = rc.ReadCellData (97,3);
					Scanner scan = new Scanner(System.in); //declaring scan as an object of Scanner class.
					int type; //declaring variable type
				    int rowNumber; //declaring variable rowNumber
				    int finmaterialSelection; //declaring variable finmaterialselection
				    int hdiameterSelect; //declares variable hdiameterSelect
				    int distributorSelect; //declares variable distributorSelect
				    int typeSelect; //declares variable typeSelect
				    int sizeSelect; //declares variable sizeSelect
				    int amountSelect; //declares variable amountSelect
				    int tmaterialSelect; //declares variable tmaterialSelect
				    int priceSelect; 
				    int smaterialSelect;
				    int fmaterialSelect;
				    int categorySelect;
				    int connectionsSelect;
				    int connectionS;
				    double headerCost = 0;
				    double newPrice=0;
				    double finCost = 0;
				    double tubingPrice = 0;
				    double tubingPrice1=0;
				    double frameCost = 0;
				    double solderCost = 0;
				    double discCost=0;
				    double totaldCost = 0;
				    double totalPrice=0;
				    double rbendsPrice = 0;
				    double ventsPrice = 0;
				    double connectionPrice = 0;
				    double capCost = 0;
				    double laborCost = 0;
				    double finalPrice = 0;
				    ConnectionSelection connectionSelection = null;
				    CategorySelection categorySelection = null;
				    SolderMaterial solderMaterial = null;
				    FrameMaterial frameMaterial = null;
				    CoilType coilType = null; //setting coilType from enum class CoilType to null
				    FinMaterial finMaterial = null; //setting finMaterial from enum class FinMaterial to null
				    HeaderDiameter headerDiameter = null; //setting headerDiameter from enum HeaderDiameter to null
				    DistributorType distributorType = null; //setting distributorType from enum DistributorType to null
				    TypeSelector typeSelector = null; //setting typeSelector from enum TypeSelector to null
				    SizeSelector sizeSelector = null; //setting sizeSelector from enum SizeSelector to null
				    AmountSelector amountSelector = null; //setting amountSelector from enum AmountSelector to null
				    TubingMaterialSelect tubingMaterialSelect = null; //setting tubingMaterialSelect from enum TubingMaterialSelect to nu
				    //declares variable finHeight and is used to input an integer variable 'finheight' from users
			        double finHeight = inFrame.fin_height_Inp();
			        //prompts users to enter in fin length
			        double finLength = inFrame.fin_length_Inp();
			        //prompts users to enter in fins per inch
			        double finperInch = inFrame.fin_pinch_Inp();
			
			        double finWeight; //declares double variable finWeight
			
			        //sets value of fin weight by taking the fin height times fin length times fins per inch and divides it by 12
			        finWeight = (finHeight * finLength * finperInch) / 12;
			
			        //prompts user to enter in the number of rows
			        rowNumber = inFrame.row_num_Inp();
			        
			
			        //prints out empty line (to make output in terminal look neater)
			        System.out.println();
			
			        do {
			            //this prints out the menu choices for fin material for the user to choose from
			            System.out.println("1. Aluminum .006\n" + "2. Aluminum .008\n" + "3. Aluminum .010\n" + "4. Copper .008\n"
			                    + "5. Copper .010\n" + "6. Copper .015\n" + "7. Stainless Steel .006\n"
			                    + "8. Stainless Steel .008\n" + "9. Stainless Steel .010\n" + "10. Aluminum 3 x .010/n");
			            // used to input value of an integer variable 'finmaterialSelection' from user.
			            finmaterialSelection = inFrame.mat_of_fin_Inp();
			            switch (finmaterialSelection) {
			                case 1:
			                    finMaterial = FinMaterial.Aluminum_Six;
			                    break;
			                case 2:
			                    finMaterial = FinMaterial.Aluminum_Eight;
			                    break;
			                case 3:
			                    finMaterial = FinMaterial.Aluminum_Ten;
			                    break;
			                case 4:
			                    finMaterial = FinMaterial.Copper_Eight;
			                    break;
			                case 5:
			                    finMaterial = FinMaterial.Copper_Ten;
			                    break;
			                case 6:
			                    finMaterial = FinMaterial.Copper_Fifthteen;
			                    break;
			                case 7:
			                    finMaterial = FinMaterial.Stainless_Steel_Six;
			                    break;
			                case 8:
			                    finMaterial = FinMaterial.Stainless_Steel_Eight;
			                    break;
			                case 9:
			                    finMaterial = FinMaterial.Stainless_Steel_Ten;
			                    break;
			                case 10:
				            	finMaterial = FinMaterial.three_ten_alum;
			
			                default:
			                    System.out.println("Invalid choice!");
			                    finMaterial = FinMaterial.Aluminum_Six;
			                    break;
			
			            }
			        } while (finmaterialSelection < 1 || finmaterialSelection > 10);
			        if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 1) {
			            finWeight = finWeight * .010;
			            finCost = finWeight * vOutput;
			         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 1) {
			             finWeight = finWeight * .013;
			             finCost = finWeight * v2Output;
			         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 1) {
			             finWeight = finWeight * .016;
			             finCost = finWeight * v3Output;
			         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 1) {
			             finWeight = finWeight * .043;
			             finCost = finWeight * v4Output;
			         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 1) {
			             finWeight = finWeight * .054;
			             finCost = finWeight * v5Output;
			         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 1) {
			             finWeight = finWeight * .0756;
			             finCost = finWeight * v6Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 1) {
			             finWeight = finWeight * .028;
			             finCost = finWeight * v7Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 1) {
			             finWeight = finWeight * .038;
			             finCost = finWeight * v8Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 1) {
			             finWeight = finWeight * .047;
			             finCost = finWeight * v9Output;
			         } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 1) {
				    	 finWeight = finWeight * .049;
				    	 finCost = finWeight * v10Output;
				     } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 2) {
				    	 finWeight = finWeight * .097;
				    	 finCost = finWeight * v10Output;
				     } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 2) {
			             finWeight = finWeight * .020;
			             finCost = finWeight * vOutput;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 2) {
			             finWeight = finWeight * .026;
			             finCost = finWeight * v2Output;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 2) {
			             finWeight = finWeight * .032;
			             finCost = finWeight * v3Output;
			             
			
			         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 2) {
			             finWeight = finWeight * .086;
			             finCost = finWeight * v4Output;
			
			         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 2) {
			             finWeight = finWeight * .107;
			             finCost = finWeight * v5Output;
			         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 2) {
			             finWeight = finWeight * .1522;
			             finCost = finWeight * v6Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 2) {
			             finWeight = finWeight * .056;
			             finCost = finWeight * v7Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 2) {
			             finWeight = finWeight * .075;
			             finCost = finWeight * v8Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 2) {
			             finWeight = finWeight * .093;
			             finCost = finWeight * v9Output;
			         } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 3) {
			             finWeight = finWeight * .029;
			             finCost = finWeight * vOutput;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 3) {
			             finWeight = finWeight * .039;
			             finCost = finWeight * v2Output;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 3) {
			             finWeight = finWeight * .049;
			             finCost = finWeight * v3Output;
			
			         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 3) {
			             finWeight = finWeight * .129;
			             finCost = finWeight * v4Output;
			         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 3) {
			             finWeight = finWeight * .161;
			             finCost = finWeight * v5Output;
			         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 3) {
			             finWeight = finWeight * .2268;
			             finCost = finWeight * v6Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 3) {
			             finWeight = finWeight * .084;
			             finCost = finWeight * v7Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 3) {
			             finWeight = finWeight * .112;
			             finCost = finWeight * v8Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 3) {
			             finWeight = finWeight * .140;
			             finCost = finWeight * v9Output;
			         } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 4) {
			             finWeight = finWeight * .039;
			             finCost = finWeight * vOutput;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 4) {
			             finWeight = finWeight * .052;
			             finCost = finWeight * v2Output;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 4) {
			             finWeight = finWeight * .065;
			             finCost = finWeight * v3Output;
			
			         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 4) {
			             finWeight = finWeight * .172;
			             finCost = finWeight * v4Output;
			         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 4) {
			             finWeight = finWeight * .215;
			             finCost = finWeight * v5Output;
			         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 4) {
			             finWeight = finWeight * .3023;
			             finCost = finWeight * v6Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 4) {
			             finWeight = finWeight * .112;
			             finCost = finWeight * v7Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 4) {
			             finWeight = finWeight * .149;
			             finCost = finWeight * v8Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 4) {
			             finWeight = finWeight * .187;
			             finCost = finWeight * v9Output;
			         } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 5) {
			             finWeight = finWeight * .049;
			             finCost = finWeight * vOutput;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 5) {
			             finWeight = finWeight * .065;
			             finCost = finWeight * v2Output;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 5) {
			             finWeight = finWeight * .081;
			             finCost = finWeight * v3Output;
			
			         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 5) {
			             finWeight = finWeight * .215;
			             finCost = finWeight * v4Output;
			         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 5) {
			             finWeight = finWeight * .269;
			             finCost = finWeight * v5Output;
			         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 5) {
			             finWeight = finWeight * .378;
			             finCost = finWeight * v6Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 5) {
			             finWeight = finWeight * .140;
			             finCost = finWeight * v7Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 5) {
			             finWeight = finWeight * .187;
			             finCost = finWeight * v8Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 5) {
			             finWeight = finWeight * .233;
			             finCost = finWeight * v9Output;
			         } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 6) {
			             finWeight = finWeight * .058;
			             finCost = finWeight * vOutput;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 6) {
			             finWeight = finWeight * .078;
			             finCost = finWeight * v2Output;
			
			         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 6) {
			             finWeight = finWeight * .081;
			             finCost = finWeight * v3Output;
			
			         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 6) {
			             finWeight = finWeight * .258;
			             finCost = finWeight * v4Output;
			         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 6) {
			             finWeight = finWeight * .322;
			             finCost = finWeight * v5Output;
			         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 6) {
			             finWeight = finWeight * .4515;
			             finCost = finWeight * v6Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 6) {
			             finWeight = finWeight * .168;
			             finCost = finWeight * v7Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 6) {
			             finWeight = finWeight * .224;
			             finCost = finWeight * v8Output;
			         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 6) {
			             finWeight = finWeight * .280;
			             finCost = finWeight * v9Output;
			         } 
			      //number of rows equaling 7
				     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 7) {
				    	 finWeight = (finWeight * .039) + (finWeight * .029);
				         finCost = finWeight * vOutput;
				     }  else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 7) {
				    	 finWeight = (finWeight * .052) + (finWeight * .039);
				         finCost = finWeight * v2Output;
				    } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 7) {
				    	 finWeight = (finWeight * .065) + (finWeight * .049);
				         finCost = finWeight * v3Output;
				    } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 7) {
				    	 finWeight = (finWeight * .172) + (finWeight * .129);
				         finCost = finWeight * v4Output;
				     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 7) {
				    	 finWeight = (finWeight * .215) + (finWeight * .161);
				         finCost = finWeight * v5Output;
				     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 7) {
				    	 finWeight = (finWeight * .3023) + (finWeight * .2268);
				         finCost = finWeight * v6Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 7) {
				    	  finWeight = (finWeight * .112) + (finWeight * .084);
					      finCost = finWeight * v7Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 7) {
				    	 finWeight = (finWeight * .149) + (finWeight * .112);
				         finCost = finWeight * v8Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 7) {
				    	 finWeight = (finWeight * .187) + (finWeight * .140);
				         finCost = finWeight * v9Output;
				         
				    }
				      //number of rows equaling 8
				     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 8)
				     {
				    	 finWeight = (finWeight * .039) +  (finWeight * .039);
				         finCost = finWeight * vOutput;
				     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 8)
				     {
				     finWeight = (finWeight * .052) + (finWeight * .052);
				         finCost = finWeight * v2Output;
				     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 8) {
				         finWeight = finWeight * .129;
				         finCost = finWeight * v3Output; 
				      
				     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 8)
				     {
				    	 finWeight = (finWeight * .172) + (finWeight * .172);
				         finCost = finWeight * v4Output;
				     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 8)
				     {
				     finWeight = (finWeight * .215) + (finWeight * .215);
				         finCost = finWeight * v5Output;
				     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 8) {
				         finWeight = (finWeight * .3023) + (finWeight * .3023);
				         finCost = finWeight * v6Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 8)
				     {
				    	  finWeight = (finWeight * .112) + (finWeight * .112);
				         finCost = finWeight * v7Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 8)
				     {
				         finWeight = (finWeight * .149) + (finWeight * .149);
				         finCost = finWeight * v8Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 8) {
				         finWeight = (finWeight * .187) + (finWeight * .187);
				         finCost = finWeight * v9Output;

				     }
				     
				      //number of rows equaling 9
				      
				     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 9)
				     {
				    	 finWeight = (finWeight * .039) + (finWeight * .049);
				         finCost = finWeight * vOutput;
				     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 9)
				     {
				     finWeight = (finWeight * .052) + (finWeight * .065);
				         finCost = finWeight * v2Output;
				     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 9) {
				         
				      finWeight = (finWeight * .065) + (finWeight * .081);
				         finCost = finWeight * v3Output;
				     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 9)
				     {
				    	 finWeight = (finWeight * .172) + (finWeight * .215);
				         finCost = finWeight * v4Output;
				     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 9)
				     {
				     finWeight = (finWeight * .215) + (finWeight * .269);
				         finCost = finWeight * v5Output;
				     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 9) {
				         finWeight = (finWeight * .3023) + (finWeight * .378);
				         finCost = finWeight * v6Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 9)
				     {
				    	  finWeight = (finWeight * .112) + (finWeight * .140);
				         finCost = finWeight * v7Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 9)
				     {
				     finWeight = (finWeight * .149) + (finWeight * .187);
				         finCost = finWeight * v8Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 9) {
				         
				         finWeight = (finWeight * .187) + (finWeight * .233);
				         finCost = finWeight * v9Output;
				     }
				      
				     //number of rows equaling 10
				     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 10)
				     {
				    	finWeight = (finWeight * .039) + (finWeight * .058);
				         finCost = finWeight * vOutput; 
				     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 10)
				     {
				     finWeight = (finWeight * .052) + (finWeight * .078);
				         finCost = finWeight * v2Output;
				     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 10) {
				         
				      finWeight = (finWeight * .065) + (finWeight * .081);
				         finCost = finWeight * v3Output;
				     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 10)
				     {
				    	 finWeight = (finWeight * .172) + (finWeight * .258);
				         finCost = finWeight * v4Output;
				     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 10)
				     {
				     finWeight = (finWeight * .215) + (finWeight * .322);
				         finCost = finWeight * v5Output;
				     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 10) {
				      finWeight = (finWeight * .3023) + (finWeight * .4515);
				         finCost = finWeight * v6Output;   
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 10)
				     {
				    	  finWeight = (finWeight * .112) + (finWeight * .168);
				         finCost = finWeight * v7Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 10)
				     {
				     finWeight = (finWeight * .149) + (finWeight * .224);
				         finCost = finWeight * v8Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 10) {
				         
				         finWeight = (finWeight * .187) + (finWeight * .280);
				         finCost = finWeight * v9Output;
				     } 
				     
				     //number of rows equaling 11
				     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 11)
				     {
				    	 finWeight = (finWeight * .039) + ((finWeight * .039) + (finWeight * .029));
				         finCost = finWeight * vOutput;
				     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 11)
				     {
				         finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .039));
				         finCost = finWeight * v2Output;
				     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 11) {
				         finWeight = (finWeight * .065) + ((finWeight * .065) + (finWeight * .049));
				         finCost = finWeight * v3Output;
				      
				     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 11)
				     {
				    	 finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .129));
				         finCost = finWeight * v4Output;
				     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 11)
				     {
				         finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .161));
				         finCost = finWeight * v5Output;
				     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 11) {
				         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .2268));
				         finCost = finWeight * v6Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 11)
				     {
				    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .084));
				         finCost = finWeight * v7Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 11)
				     {
				     finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .112));
				         finCost = finWeight * v8Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 11) {
				         finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .140));
				         finCost = finWeight * v9Output;
				     }
				     //number of rows equaling 12
				     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 12)
				     {
				    	 finWeight = (finWeight * .039) + ((finWeight * .039) +  finWeight * .039);
				         finCost = finWeight * vOutput;
				     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 12)
				     {
				     finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .052));
				         finCost = finWeight * v2Output;
				     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 12) {
				         
				      finWeight = (finWeight * .065) + (finWeight * .129);
				         finCost = finWeight * v3Output;
				     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 12)
				     {
				    	finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .172));
				         finCost = finWeight * v4Output;
				     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 12)
				     {
				     finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .215));
				         finCost = finWeight * v5Output;
				     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 12) {
				         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .3023));
				         finCost = finWeight * v6Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 12)
				     {
				    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .112));
				         finCost = finWeight * v7Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 12)
				     {
				       finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .149));
				         finCost = finWeight * v8Output;
				     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 12) {
				        finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .187));
				         finCost = finWeight * v9Output; 
				         
				     } 
			
			       
			        //prints out the value of Fin Weight
			
			        GUI.finWeight.setText(finWeight + "");
			
			        //declares double variable named tubeFeet
			        double tubeFeet;
			        //calculates feet of tubing by taking the fin length + 4 inches times fin height divided by 1.5
			        //times the number of rows and divided by 12. Math.round is to round the answer
			        tubeFeet = Math.round(((finLength + 4) * ((finHeight / 1.5) * rowNumber)) / 12);
			        
			
			        //prints out the value of feet of tubing
			
			        GUI.tubingFeet.setText(tubeFeet + "");
			
			        do {
			            //this prints out the menu choices for tubing material for the user to choose from
			            System.out.println("1. 1/2 x 0.035 cu\n" + "2. 5/8 x 0.030 cu\n" + "3. 5/8 x 0.035 cu\n"
			                    + "4. 5/8 x 0.038 cu\n" + "5. 1-1/8 in x .050 cu\n" + "6. 1/4 in x .020 Stnls\n" +
			                    "7. 5/8 in x .035 Stnls\n" + "8. 5/8 in. x .038 Stnls\n" + "9. 5/8 in. x .049 Stnls\n"
			                    + "10. 1-1/8 in. x .049 Stnls\n" + "11. 5/8 x .035 CuNi\n" + "12. 1/4 in. Ref.Cu\n"
			                    + "13. 5/16 in. Ref.Cu\n" + "14.  1/2 in. Ref.Cu\n" + "15. 1-1/8 in. x .049 Cu\n");
			        ;
			            // used to input value of an integer variable 'tmaterialSelect' from user.
			            tmaterialSelect = inFrame.mat_of_Tubing_Inp();
			            switch (tmaterialSelect) {
			                case 1:
			                    tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
			                    break;
			                case 2:
			                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_30_cu;
			                    break;
			                case 3:
			                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Cu;
			                    break;
			                case 4:
			                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_38_cu;
			                    break;
			                case 5:
			                    tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_50_cu;
			                    break;
			                case 6:
			                    tubingMaterialSelect = TubingMaterialSelect.one_fourth_0_20_stnls;
			                    break;
			                case 7:
			                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Stnls;
			                    break;
			                case 8:
			                    tubingMaterialSelect = TubingMaterialSelect.five_eight_o_38_stnls;
			                    break;
			                case 9:
			                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_49_stnls;
			                    break;
			                case 10:
			                    tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_stnls;
			                    break;
			                case 11:
			                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_cuni;
			                    break;
			                case 12:
			                    tubingMaterialSelect = TubingMaterialSelect.one_four_ref;
			                    break;
			                case 13:
			                    tubingMaterialSelect = TubingMaterialSelect.five_sixteen_ref;
			                    break;
			                case 14:
			                    tubingMaterialSelect = TubingMaterialSelect.one_half_ref;
			                    break;
			                case 15:
			                    tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_cu;
			                    break;
			                    
			                default:
			                    System.out.println("Invalid choice!");
			                    tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
			                    break;
			
			            }
			        } while (tmaterialSelect < 1 || tmaterialSelect > 15);
			        if (tmaterialSelect == 1)
			        {
			        	 tubingPrice = tubeFeet * rOutput;
			        }
			        else if (tmaterialSelect == 2)
			        {
			        	 tubingPrice = tubeFeet * r2Output;
			        }
			        else if (tmaterialSelect == 3)
			        {
			             tubingPrice = tubeFeet * r3Output;
			        }
			        else if (tmaterialSelect == 4)
			        {
			        	 tubingPrice = tubeFeet * r4Output;
			        }
			        else if(tmaterialSelect == 5)
			        {
			        	 tubingPrice = tubeFeet * r5Output;
			        }
			        else if (tmaterialSelect == 6)
			        {
			        	 tubingPrice = tubeFeet * r6Output;
			        }
			        else if (tmaterialSelect == 7)
			        {
			             tubingPrice = tubeFeet * r7Output;
			        }
			        else if (tmaterialSelect == 8)
			        {
			        	 tubingPrice = tubeFeet * r8Output;
			        }
			        else if (tmaterialSelect == 9)
			        {
			        	 tubingPrice = tubeFeet * r9Output;
			        }
			        else if(tmaterialSelect == 10)
			        {
			        	 tubingPrice = tubeFeet * r10Output;
			        }
			        else if (tmaterialSelect == 11)
			        {
			             tubingPrice = tubeFeet * r11Output;
			        }
			        else if (tmaterialSelect == 12)
			        {
			          tubingPrice = tubeFeet * r12Output;
			        }
			        else if(tmaterialSelect == 13)
			        {
			          tubingPrice = tubeFeet * r13Output;
			        }
			        else if (tmaterialSelect == 14)
			        {
			         tubingPrice = tubeFeet * r14Output;
			        }
			        else if (tmaterialSelect == 15)
			        {
			         tubingPrice = tubeFeet * r16Output;
			        }
			        
			        //declares double variable returnBends and sets it equal to 0
			        double returnBends = 0;
			
			        //declares double variable num2
			        double num2;
			        if (rowNumber == 3 || rowNumber == 4 || rowNumber == 5 || rowNumber == 6 || rowNumber == 8) {
			            returnBends = finHeight / 1.5 * rowNumber / 2.0 * 0.5 + finHeight / 1.5 * rowNumber / 2.0;
			        } else {
			            num2 = finHeight / 1.5 * rowNumber / 2.0;
			            returnBends = Math.round(num2);
			        }
			        //prints out number of return bends
			 
			        GUI.returnBends.setText(returnBends + "");
			        
			        rbendsPrice = (returnBends * r15Output);
			       
			
			       
			        connectionS = inFrame.connections_num_Inp();
			        do {
			            //this prints out the menu choices for distributors for the user to choose from
			            System.out.println("1. 1/2 in FPT\n" + "2. 3/4 in FPT\n" + "3. 1 in. FPT\n" + "4. 1 in MPT\n"
			                    + "5. 1-1/4 in MPT\n" + "6. 1-1/2 in MPTM\n" + "7. 1-1/2 in FPT\n" + "8. 2 in FPT\n"
			                    + "9. 2 in MPT\n" + "10. 2.5 in FPT\n" + "11. 2.5 in MPT\n" + "12. 3 in MPT\n" + "13. 4 in MPT\n" + "14. 1-1/2 in Brass\n" + "15. 2-3/8 in Brass\n");
			
			            // used to input value of an integer variable 'distributorSelect' from user.
			            connectionsSelect = inFrame.size_of_connection_Inp();
			            switch (connectionsSelect) {
			                case 1:
			                    connectionSelection = ConnectionSelection.one_half_fpt;
			                    break;
			                case 2:
			               	 connectionSelection = ConnectionSelection.three_fourth_fpt;
			                    break;
			                case 3:
			               	 connectionSelection = ConnectionSelection.one_fpt;
			                    break;
			                case 4:
			               	 connectionSelection = ConnectionSelection.one_mpt;
			                    break;
			                case 5:
			               	 connectionSelection = ConnectionSelection.one_one_fourth_mpt;
			                    break;
			                case 6:
			               	 connectionSelection = ConnectionSelection.one_one_half_mpt;
			                    break;
			                case 7:
			               	 connectionSelection = ConnectionSelection.one_one_half_fpt;
			                    break;
			                case 8:
			               	 connectionSelection = ConnectionSelection.two_fpt;
			                    break;
			                case 9:
			               	 connectionSelection = ConnectionSelection.two_mpt;
			                    break;
			                case 10:
			               	 connectionSelection = ConnectionSelection.two_five_fpt;
			                    break;
			                case 11:
			               	 connectionSelection = ConnectionSelection.two_five_mpt;
			                    break;
			                case 12:
			               	 connectionSelection = ConnectionSelection.three_mpt;
			                    break;
			                case 13:
			               	 connectionSelection = ConnectionSelection.four_mpt;
			                    break;
			                case 14:
			               	 connectionSelection = ConnectionSelection.one_one_half_brass;
			                    break;
			                case 15:
			               	 connectionSelection = ConnectionSelection.two_three_eighths_brass;
			                    break;
			               
			
			                default:
			                    System.out.println("Invalid choice!");
			                    connectionSelection = ConnectionSelection.one_half_fpt;
			                    break;
			
			            }
			        } while (connectionsSelect < 1 || connectionsSelect > 15);
			         
			         if (connectionsSelect == 1)
			         {
			        	 connectionPrice = connectionS * c1Output;
			        	 
			        	
			         }
			         else if (connectionsSelect == 2)
			         {
			        	 connectionPrice = connectionS * c2Output;
			        	 
			        	 
			         }
			         else if (connectionsSelect == 3)
			         {
			        	 connectionPrice = connectionS * c3Output;
			        	 
			        	
			        	
			         }
			         else if (connectionsSelect == 4)
			         {
			        	connectionPrice = connectionS * c4Output;
			        	 
			        	
			         }
			         else if (connectionsSelect == 5)
			         {
			        	 connectionPrice = connectionS * c5Output;
			        	 
			         }
			         else if (connectionsSelect == 6)
			         {
			        	 connectionPrice = connectionS * c6Output;
			        	
			       	  
			         }
			         else if (connectionsSelect == 7)
			         {
			        	 connectionPrice = connectionS * c7Output;
			        	 
			        	
			         }
			        		 else if (connectionsSelect == 8)
			         {
			        			 connectionPrice = connectionS * c8Output;
			                	 
			                	
			     
			         }
			         else if (connectionsSelect == 9)
			         {
			        	 connectionPrice = connectionS * c9Output;
			        ;
			         }
			         else if (connectionsSelect == 10)
			         {
			        	 connectionPrice = connectionS * c10Output;
			        	 
			        	
			         }
			         else if (connectionsSelect == 11)
			         {
			        	 connectionPrice = connectionS * c11Output;
			        	 
			        	 
			         }
			         else if (connectionsSelect == 12)
			         {
			        	 connectionPrice = connectionS * c12Output;
			         }
			        	
			         else if (connectionsSelect == 13)
			         {
			        	 connectionPrice = connectionS * c13Output;
			        	 
			        	 
			         }
			         else if (connectionsSelect == 14)
			         {
			        	 connectionPrice = connectionS * c14Output;
			        	 
			        
			         }
			         else if (connectionsSelect == 15)
			         {
			        	 connectionPrice = connectionS * c15Output;
			        	
			         }
			        //declares double variable frameWeight
			        double frameWeight;
			        	
			        //sets frame weight equal to the fin length times number of rows times 2 plus the fin height times
			        // number of rows times 2 and divides it by 12
			        frameWeight = ((finLength * rowNumber * 2.0) + (finHeight * rowNumber * 2.0)) / 12.0;
			        
			        do {
			            //this prints out the menu choices for frame material for the user to choose from
			            System.out.println("1. SS\n" + "2. Galvnl\n" + "3. Galvns\n");
			           
			            // used to input value of an integer variable 'fmaterialSelect' from user.
			            fmaterialSelect = inFrame.mat_of_frame_Inp();
			            switch (fmaterialSelect) {
			                case 1:
			                   frameMaterial = FrameMaterial.stainless_steel;
			                    break;
			                case 2:
			                    frameMaterial = FrameMaterial.galvanneal;
			                    break;
			                case 3:
			                    frameMaterial = FrameMaterial.galvanized;
			                    break;
			              
			
			                default:
			                    System.out.println("Invalid choice!");
			                    frameMaterial = FrameMaterial.stainless_steel;
			                    break;
			
			            }
			        } while (fmaterialSelect < 1 || fmaterialSelect > 3);
			        if (fmaterialSelect == 1)
			        {
			        	frameCost = frameWeight * fOutput;
			        }
			        else if (fmaterialSelect == 2)
			        {
			        	frameCost = frameWeight * f1Output;
			        }
			        else if (fmaterialSelect == 3)
			        {
			        	frameCost = frameWeight * f2Output;
			        }
			
			        //this declares a string variable called strDouble and formats it as the frame weight rounded to two decimal places
			        String strDouble = String.format("%.2f", frameWeight);
			       
			
			        //this prints out the value of the frame weight
			
			         GUI.frameWeight.setText(strDouble + "");
			       
			
			        //this declares a double variable called solderNum
			        double solderNum;
			
			        //this sets the value of the number of solders to frameWeight times .138
			        solderNum = frameWeight * .138;
			        
			
			        do {
			            //this prints out the menu choices for solder material for the user to choose from
			            System.out.println("1. 5% silver\n" + "2. 15% silver\n");
			          
			            // used to input value of an integer variable 'fmaterialSelect' from user.
			            smaterialSelect = inFrame.sil_per_solder_Inp();
			            switch (smaterialSelect) {
			                case 1:
			                   solderMaterial = SolderMaterial.five_silver;
			                    break;
			                case 2:
			                    solderMaterial = SolderMaterial.fifteen_silver;
			                    break;
			
			                default:
			                    System.out.println("Invalid choice!");
			                    solderMaterial = SolderMaterial.five_silver;;
			                    break;
			
			            }
			        } while (smaterialSelect < 1 || smaterialSelect > 2);
			        if (smaterialSelect == 1)
			        {
			        	solderCost = solderNum * sOutput;
			        }
			        else if (smaterialSelect == 2)
			        {
			        	solderCost = solderNum * s1Output;
			        }
			
			        //this declares a string variable called strDouble1 and formats it as the number of solders rounded to two decimal places
			        String strDouble1 = String.format("%.2f", solderNum);
			        
			      
			
			        //this prints out the number of solders
			      
			        GUI.solderNum.setText(strDouble1 + "");
			       
			
			        //this declares a double variable called vents and sets it equal to 4
			        double vents = 4;
			
			        //this prints out the number of vents
			        
			        GUI.ventNum.setText(vents + "");
			        
			        ventsPrice = (vents * s2Output);
			        
			
			        
			
			        //this declares a double variable called headerNum
			        double headerNum = 2;
			
			        //this prints out the number of headers
			
			        GUI.headerNum.setText(headerNum + "");
			
			        //this declares a double variable called headerLength and sets it equal to the finHeight
			        double headerLength = finHeight;
			
			        //this prints out the header length
			 
			        GUI.headerLength.setText(headerLength + "");
			
			        //this declares a double variable called disc
			        double disc;
			
			        //this sets the value of disc to number of headers times 2
			        disc = headerNum * 2;
			
			        discCost = disc * dOuput;
			
			    
			
			
			        //this prints out the number of discs
			
			        GUI.discNum.setText(disc + "");
			
			        double headers;
			        headers = ((finHeight + 3) * 2) / 12;
			
			        System.out.println();
			
			        do {
			            //this prints out the menu choices for header diameter for the user to choose from
			            System.out.println("1. 3/4 in. cu\n" + "2. 1 in. cu\n" + "3. 1-1/2 in. cu\n" + "4. 2 in. cu\n"
			                    + "5. 2-1/2 in. cu\n" + "6. 3 in. cu\n" + "7. 4 in. cu\n");
			          
			            // used to input value of an integer variable 'hdiameterSelect' from user.
			            hdiameterSelect = inFrame.dia_of_header_Inp();
			            switch (hdiameterSelect) {
			                case 1:
			                    headerDiameter = HeaderDiameter.three_fourth;
			                    break;
			                case 2:
			                    headerDiameter = HeaderDiameter.one;
			                    break;
			                case 3:
			                    headerDiameter = HeaderDiameter.one_and_one_half;
			                    break;
			                case 4:
			                    headerDiameter = HeaderDiameter.two;
			                    break;
			                case 5:
			                    headerDiameter = HeaderDiameter.two_and_one_half;
			                    break;
			                case 6:
			                    headerDiameter = HeaderDiameter.three;
			                    break;
			                case 7:
			                    headerDiameter = HeaderDiameter.four;
			                    break;
			
			                default:
			                    System.out.println("Invalid choice!");
			                    headerDiameter = HeaderDiameter.three_fourth;
			                    break;
			
			            }
			        } while (hdiameterSelect < 1 || hdiameterSelect > 7);
			            if (hdiameterSelect == 1)
			            {
			                headerCost = headers * hOutput;
			            }
			            else if (hdiameterSelect == 2)
			            {
			                headerCost = headers * h2Output;
			            }
			            else if (hdiameterSelect == 3)
			            {
			                headerCost = headers * h3Output;
			            }
			            else if (hdiameterSelect == 4)
			            {
			                headerCost = headers * h4Output;
			            }
			            else if (hdiameterSelect == 5)
			            {
			                headerCost = headers * h5Output;
			            }
			            else if (hdiameterSelect == 6)
			            {
			                headerCost = headers * h6Output;
			            }
			            else if (hdiameterSelect == 7)
			            {
			                headerCost = headers * h7Output;
			            }
			
			       
			        System.out.println();
			        System.out.println();
			        totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + connectionPrice;
			
			        String strDouble19 = String.format("%.2f",  totalPrice);
			        laborCost = lOutput;
			        finalPrice = (totalPrice * laborCost);
			        String strDouble35 = String.format("%.2f", finalPrice);
			
			        GUI.totalmaterialsCost.setText(strDouble19 + "");
			
			        GUI.totalCost.setText(strDouble35 + "");
			        System.out.println(); 
			        FileInputStream fis = new FileInputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
					XSSFWorkbook workbook = new XSSFWorkbook (fis);
					XSSFSheet sheet = workbook.getSheetAt(0);
					XSSFRow row1 = sheet.getRow(1);
					XSSFCell cell1 = row1.getCell(1);
					cell1.setCellValue("CC");
					XSSFCell cell2 = row1.getCell(2);
					cell2.setCellValue(finHeight);
					XSSFCell cell3 = row1.getCell(3);
					cell3.setCellValue(rowNumber);
					XSSFCell cell4 = row1.getCell(4);
					cell4.setCellValue(finperInch);
					XSSFCell cell6 = row1.getCell(6);
					cell6.setCellValue(finLength);      
					XSSFCell cell7 = row1.getCell(7);
					cell7.setCellValue(strDouble19);
					XSSFCell cell8 = row1.getCell(8);
					cell8.setCellValue(strDouble35);
					fis.close();
					FileOutputStream fos =new FileOutputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
				        workbook.write(fos);
				        fos.close(); 
			        System.out.println(); 
			}
			
	public static void steamdistributionCoil(GUI inFrame) throws IOException
	{
			main rc=new main();   //object of the class  
			//reading the value of 45th row and 3rd column  
			double vOutput=rc.ReadCellData(44, 3);  //reading price of aluminum fin .006
			double v2Output=rc.ReadCellData(45,3); //reading price of aluminum fin .008
			double v3Output=rc.ReadCellData(46, 3); //reading price of aluminum fin .010
			double v4Output=rc.ReadCellData(47, 3); //reading price of copper fin .008
			double v5Output=rc.ReadCellData(48, 3); //reading price of copper fin .010
			double v6Output=rc.ReadCellData(49, 3); //reading price of copper fin .015
			double v7Output=rc.ReadCellData(51, 3); //reading price of stainless steel .006
			double v8Output=rc.ReadCellData(52, 3); //reading price of stainless steel fin .008
			double v9Output=rc.ReadCellData(53, 3); //reading price of stainless steel .010
			double v10Output=rc.ReadCellData(99, 3); //reading price of alum 3in x .010
			double rOutput=rc.ReadCellData(81,3); //reading price of tubing 1/2 x 0.035 cu
			double r2Output=rc.ReadCellData(82,3); 
			double r3Output=rc.ReadCellData(83,3); 
			double r4Output=rc.ReadCellData(84,3); 
			double r5Output=rc.ReadCellData(85,3); 
			double r6Output=rc.ReadCellData(86,3);
			double r7Output=rc.ReadCellData(87,3); 
			double r8Output=rc.ReadCellData(88,3); 
			double r9Output=rc.ReadCellData(89,3);
			double r10Output=rc.ReadCellData(90,3); 
			double r11Output=rc.ReadCellData(95,3); 
			double r12Output=rc.ReadCellData(91,3); 
			double r13Output=rc.ReadCellData(92,3);
			double r14Output=rc.ReadCellData(93,3);
			double r16Output=rc.ReadCellData(98,3);
			double r15Output=rc.ReadCellData(78, 3); //reading price of return Bends
			double fOutput=rc.ReadCellData(56, 3); //ss frame
			double f1Output=rc.ReadCellData(57, 3); //galvanneal frame
			double f2Output=rc.ReadCellData(58, 3); //galvanize frame
			double sOutput = rc.ReadCellData (79,3); //solder 5% silver
			double s1Output = rc.ReadCellData (80,3); //solder 15% silver
			double s2Output = rc.ReadCellData (94,3); //vents
		    double hOutput = rc.ReadCellData(59,3);
		    double h2Output = rc.ReadCellData(60,3);
		    double h3Output = rc.ReadCellData(61,3);
		    double h4Output = rc.ReadCellData(62,3);
		    double h5Output = rc.ReadCellData(63,3);
		    double h6Output = rc.ReadCellData(64,3);
		    double h7Output = rc.ReadCellData (65,3);
		    double dOuput = rc.ReadCellData(19,3);
		    double tOutput = rc.ReadCellData(20, 3);
		    double t1Output = rc.ReadCellData(21, 3);
		    double t2Output = rc.ReadCellData(22, 3);
		    double t3Output = rc.ReadCellData(23, 3);
		    double t4Output = rc.ReadCellData(24, 3);
		    double t5Output = rc.ReadCellData(25, 3);
		    double t6Output = rc.ReadCellData(26, 3);
		    double t7Output = rc.ReadCellData(27, 3);
		    double t8Output = rc.ReadCellData(28, 3);
		    double t9Output = rc.ReadCellData(29, 3);
		    double t10Output = rc.ReadCellData(30, 3);
		    double t11Output = rc.ReadCellData(31, 3);
		    double t12Output = rc.ReadCellData(32, 3);
		    double t13Output = rc.ReadCellData(33, 3);
		    double t14Output = rc.ReadCellData(34, 3);
		    double t15Output = rc.ReadCellData(35, 3);
		    double t16Output = rc.ReadCellData(36, 3);
		    double t17Output = rc.ReadCellData(37, 3);
		    double t18Output = rc.ReadCellData(38, 3);
		    double t19Output = rc.ReadCellData(39, 3);
		    double t20Output = rc.ReadCellData(40, 3);
		    double t21Output = rc.ReadCellData(41, 3);
		    double t22Output = rc.ReadCellData(42, 3);
		    double szOutput = rc.ReadCellData(75, 3);
		    double sz2Output = rc.ReadCellData(76, 3);
		    double sz3Output = rc.ReadCellData(77, 3);
		    double cOutput = rc.ReadCellData(2, 3);
		    double c1Output = rc.ReadCellData(3, 3);
		    double c2Output = rc.ReadCellData(4, 3);
		    double c3Output = rc.ReadCellData(5, 3);
		    double c4Output = rc.ReadCellData(15,3);
		    double c5Output = rc.ReadCellData(6, 3);
		    double c6Output = rc.ReadCellData(7,3);
		    double c7Output = rc.ReadCellData(8, 3);
		    double c8Output = rc.ReadCellData(9, 3);
		    double c9Output = rc.ReadCellData(10, 3);
		    double c10Output = rc.ReadCellData(12, 3);
		    double c11Output = rc.ReadCellData(11, 3);
		    double c12Output = rc.ReadCellData(13, 3);
		    double c13Output = rc.ReadCellData(14, 3);
		    double c14Output = rc.ReadCellData(17, 3);
		    double c15Output = rc.ReadCellData(16, 3);
		    double lOutput = rc.ReadCellData (97,3);
			Scanner scan = new Scanner(System.in); //declaring scan as an object of Scanner class.
			int type; //declaring variable type
		    int rowNumber; //declaring variable rowNumber
		    int finmaterialSelection; //declaring variable finmaterialselection
		    int hdiameterSelect; //declares variable hdiameterSelect
		    int distributorSelect; //declares variable distributorSelect
		    int typeSelect; //declares variable typeSelect
		    int sizeSelect; //declares variable sizeSelect
		    int amountSelect; //declares variable amountSelect
		    int tmaterialSelect; //declares variable tmaterialSelect
		    int priceSelect; 
		    int smaterialSelect;
		    int fmaterialSelect;
		    int categorySelect;
		    int connectionsSelect;
		    int connectionS;
		    double headerCost = 0;
		    double newPrice=0;
		    double finCost = 0;
		    double tubingPrice = 0;
		    double tubingPrice1=0;
		    double frameCost = 0;
		    double solderCost = 0;
		    double discCost=0;
		    double totaldCost = 0;
		    double totalPrice=0;
		    double rbendsPrice = 0;
		    double ventsPrice = 0;
		    double connectionPrice = 0;
		    double capCost = 0;
		    double laborCost = 0;
		    double finalPrice = 0;
		    ConnectionSelection connectionSelection = null;
		    CategorySelection categorySelection = null;
		    SolderMaterial solderMaterial = null;
		    FrameMaterial frameMaterial = null;
		    CoilType coilType = null; //setting coilType from enum class CoilType to null
		    FinMaterial finMaterial = null; //setting finMaterial from enum class FinMaterial to null
		    HeaderDiameter headerDiameter = null; //setting headerDiameter from enum HeaderDiameter to null
		    DistributorType distributorType = null; //setting distributorType from enum DistributorType to null
		    TypeSelector typeSelector = null; //setting typeSelector from enum TypeSelector to null
		    SizeSelector sizeSelector = null; //setting sizeSelector from enum SizeSelector to null
		    AmountSelector amountSelector = null; //setting amountSelector from enum AmountSelector to null
		    TubingMaterialSelect tubingMaterialSelect = null; //setting tubingMaterialSelect from enum TubingMaterialSelect to nu
		    //declares variable finHeight and is used to input an integer variable 'finheight' from users
		    double finHeight = inFrame.fin_height_Inp();
		    //prompts users to enter in fin length
		    double finLength = inFrame.fin_length_Inp();
		    //prompts users to enter in fins per inch
		    double finperInch = inFrame.fin_pinch_Inp();
		
		    double finWeight; //declares double variable finWeight
		
		    //sets value of fin weight by taking the fin height times fin length times fins per inch and divides it by 12
		    finWeight = (finHeight * finLength * finperInch) / 12;
		
		    //prompts user to enter in the number of rows
		    rowNumber = inFrame.row_num_Inp();
		    
		  
		    //prints out empty line (to make output in terminal look neater)
		    System.out.println();
		
		    do {
		        //this prints out the menu choices for fin material for the user to choose from
		        System.out.println("1. Aluminum .006\n" + "2. Aluminum .008\n" + "3. Aluminum .010\n" + "4. Copper .008\n"
		                + "5. Copper .010\n" + "6. Copper .015\n" + "7. Stainless Steel .006\n"
		                + "8. Stainless Steel .008\n" + "9. Stainless Steel .010\n" + "10. Alumnium 3 x .010/n");
		        // used to input value of an integer variable 'finmaterialSelection' from user.
		        finmaterialSelection = inFrame.mat_of_fin_Inp();
		        switch (finmaterialSelection) {
		            case 1:
		                finMaterial = FinMaterial.Aluminum_Six;
		                break;
		            case 2:
		                finMaterial = FinMaterial.Aluminum_Eight;
		                break;
		            case 3:
		                finMaterial = FinMaterial.Aluminum_Ten;
		                break;
		            case 4:
		                finMaterial = FinMaterial.Copper_Eight;
		                break;
		            case 5:
		                finMaterial = FinMaterial.Copper_Ten;
		                break;
		            case 6:
		                finMaterial = FinMaterial.Copper_Fifthteen;
		                break;
		            case 7:
		                finMaterial = FinMaterial.Stainless_Steel_Six;
		                break;
		            case 8:
		                finMaterial = FinMaterial.Stainless_Steel_Eight;
		                break;
		            case 9:
		                finMaterial = FinMaterial.Stainless_Steel_Ten;
		                break;
		            case 10:
		            	finMaterial = FinMaterial.three_ten_alum;
		
		            default:
		                System.out.println("Invalid choice!");
		                finMaterial = FinMaterial.Aluminum_Six;
		                break;
		
		        }
		    } while (finmaterialSelection < 1 || finmaterialSelection > 10);
		    if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 1) {
		        finWeight = finWeight * .010;
		        finCost = finWeight * vOutput;
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 1) {
		         finWeight = finWeight * .013;
		         finCost = finWeight * v2Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 1) {
		         finWeight = finWeight * .016;
		         finCost = finWeight * v3Output;
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 1) {
		         finWeight = finWeight * .043;
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 1) {
		         finWeight = finWeight * .054;
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 1) {
		         finWeight = finWeight * .0756;
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 1) {
		         finWeight = finWeight * .028;
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 1) {
		         finWeight = finWeight * .038;
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 1) {
		         finWeight = finWeight * .047;
		         finCost = finWeight * v9Output;
		     } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 1) {
		    	 finWeight = finWeight * .049;
		    	 finCost = finWeight * v10Output;
		     } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 2) {
		    	 finWeight = finWeight * .097;
		    	 finCost = finWeight * v10Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 2) {
		         finWeight = finWeight * .020;
		         finCost = finWeight * vOutput;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 2) {
		         finWeight = finWeight * .026;
		         finCost = finWeight * v2Output;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 2) {
		         finWeight = finWeight * .032;
		         finCost = finWeight * v3Output;
		         
		
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 2) {
		         finWeight = finWeight * .086;
		         finCost = finWeight * v4Output;
		
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 2) {
		         finWeight = finWeight * .107;
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 2) {
		         finWeight = finWeight * .1522;
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 2) {
		         finWeight = finWeight * .056;
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 2) {
		         finWeight = finWeight * .075;
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 2) {
		         finWeight = finWeight * .093;
		         finCost = finWeight * v9Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 3) {
		         finWeight = finWeight * .029;
		         finCost = finWeight * vOutput;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 3) {
		         finWeight = finWeight * .039;
		         finCost = finWeight * v2Output;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 3) {
		         finWeight = finWeight * .049;
		         finCost = finWeight * v3Output;
		
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 3) {
		         finWeight = finWeight * .129;
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 3) {
		         finWeight = finWeight * .161;
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 3) {
		         finWeight = finWeight * .2268;
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 3) {
		         finWeight = finWeight * .084;
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 3) {
		         finWeight = finWeight * .112;
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 3) {
		         finWeight = finWeight * .140;
		         finCost = finWeight * v9Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 4) {
		         finWeight = finWeight * .039;
		         finCost = finWeight * vOutput;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 4) {
		         finWeight = finWeight * .052;
		         finCost = finWeight * v2Output;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 4) {
		         finWeight = finWeight * .065;
		         finCost = finWeight * v3Output;
		
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 4) {
		         finWeight = finWeight * .172;
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 4) {
		         finWeight = finWeight * .215;
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 4) {
		         finWeight = finWeight * .3023;
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 4) {
		         finWeight = finWeight * .112;
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 4) {
		         finWeight = finWeight * .149;
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 4) {
		         finWeight = finWeight * .187;
		         finCost = finWeight * v9Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 5) {
		         finWeight = finWeight * .049;
		         finCost = finWeight * vOutput;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 5) {
		         finWeight = finWeight * .065;
		         finCost = finWeight * v2Output;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 5) {
		         finWeight = finWeight * .081;
		         finCost = finWeight * v3Output;
		
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 5) {
		         finWeight = finWeight * .215;
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 5) {
		         finWeight = finWeight * .269;
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 5) {
		         finWeight = finWeight * .378;
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 5) {
		         finWeight = finWeight * .140;
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 5) {
		         finWeight = finWeight * .187;
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 5) {
		         finWeight = finWeight * .233;
		         finCost = finWeight * v9Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 6) {
		         finWeight = finWeight * .058;
		         finCost = finWeight * vOutput;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 6) {
		         finWeight = finWeight * .078;
		         finCost = finWeight * v2Output;
		
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 6) {
		         finWeight = finWeight * .081;
		         finCost = finWeight * v3Output;
		
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 6) {
		         finWeight = finWeight * .258;
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 6) {
		         finWeight = finWeight * .322;
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 6) {
		         finWeight = finWeight * .4515;
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 6) {
		         finWeight = finWeight * .168;
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 6) {
		         finWeight = finWeight * .224;
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 6) {
		         finWeight = finWeight * .280;
		         finCost = finWeight * v9Output;
		     } 
		  //number of rows equaling 7
		     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 7) {
		    	 finWeight = (finWeight * .039) + (finWeight * .029);
		         finCost = finWeight * vOutput;
		     }  else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 7) {
		    	 finWeight = (finWeight * .052) + (finWeight * .039);
		         finCost = finWeight * v2Output;
		    } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 7) {
		    	 finWeight = (finWeight * .065) + (finWeight * .049);
		         finCost = finWeight * v3Output;
		    } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 7) {
		    	 finWeight = (finWeight * .172) + (finWeight * .129);
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 7) {
		    	 finWeight = (finWeight * .215) + (finWeight * .161);
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 7) {
		    	 finWeight = (finWeight * .3023) + (finWeight * .2268);
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 7) {
		    	  finWeight = (finWeight * .112) + (finWeight * .084);
			      finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 7) {
		    	 finWeight = (finWeight * .149) + (finWeight * .112);
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 7) {
		    	 finWeight = (finWeight * .187) + (finWeight * .140);
		         finCost = finWeight * v9Output;
		         
		    }
		      //number of rows equaling 8
		     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 8)
		     {
		    	 finWeight = (finWeight * .039) +  (finWeight * .039);
		         finCost = finWeight * vOutput;
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 8)
		     {
		     finWeight = (finWeight * .052) + (finWeight * .052);
		         finCost = finWeight * v2Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 8) {
		         finWeight = finWeight * .129;
		         finCost = finWeight * v3Output; 
		      
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 8)
		     {
		    	 finWeight = (finWeight * .172) + (finWeight * .172);
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 8)
		     {
		     finWeight = (finWeight * .215) + (finWeight * .215);
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 8) {
		         finWeight = (finWeight * .3023) + (finWeight * .3023);
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 8)
		     {
		    	  finWeight = (finWeight * .112) + (finWeight * .112);
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 8)
		     {
		         finWeight = (finWeight * .149) + (finWeight * .149);
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 8) {
		         finWeight = (finWeight * .187) + (finWeight * .187);
		         finCost = finWeight * v9Output;

		     }
		     
		      //number of rows equaling 9
		      
		     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 9)
		     {
		    	 finWeight = (finWeight * .039) + (finWeight * .049);
		         finCost = finWeight * vOutput;
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 9)
		     {
		     finWeight = (finWeight * .052) + (finWeight * .065);
		         finCost = finWeight * v2Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 9) {
		         
		      finWeight = (finWeight * .065) + (finWeight * .081);
		         finCost = finWeight * v3Output;
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 9)
		     {
		    	 finWeight = (finWeight * .172) + (finWeight * .215);
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 9)
		     {
		     finWeight = (finWeight * .215) + (finWeight * .269);
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 9) {
		         finWeight = (finWeight * .3023) + (finWeight * .378);
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 9)
		     {
		    	  finWeight = (finWeight * .112) + (finWeight * .140);
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 9)
		     {
		     finWeight = (finWeight * .149) + (finWeight * .187);
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 9) {
		         
		         finWeight = (finWeight * .187) + (finWeight * .233);
		         finCost = finWeight * v9Output;
		     }
		      
		     //number of rows equaling 10
		     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 10)
		     {
		    	finWeight = (finWeight * .039) + (finWeight * .058);
		         finCost = finWeight * vOutput; 
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 10)
		     {
		     finWeight = (finWeight * .052) + (finWeight * .078);
		         finCost = finWeight * v2Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 10) {
		         
		      finWeight = (finWeight * .065) + (finWeight * .081);
		         finCost = finWeight * v3Output;
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 10)
		     {
		    	 finWeight = (finWeight * .172) + (finWeight * .258);
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 10)
		     {
		     finWeight = (finWeight * .215) + (finWeight * .322);
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 10) {
		      finWeight = (finWeight * .3023) + (finWeight * .4515);
		         finCost = finWeight * v6Output;   
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 10)
		     {
		    	  finWeight = (finWeight * .112) + (finWeight * .168);
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 10)
		     {
		     finWeight = (finWeight * .149) + (finWeight * .224);
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 10) {
		         
		         finWeight = (finWeight * .187) + (finWeight * .280);
		         finCost = finWeight * v9Output;
		     } 
		     
		     //number of rows equaling 11
		     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 11)
		     {
		    	 finWeight = (finWeight * .039) + ((finWeight * .039) + (finWeight * .029));
		         finCost = finWeight * vOutput;
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 11)
		     {
		         finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .039));
		         finCost = finWeight * v2Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 11) {
		         finWeight = (finWeight * .065) + ((finWeight * .065) + (finWeight * .049));
		         finCost = finWeight * v3Output;
		      
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 11)
		     {
		    	 finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .129));
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 11)
		     {
		         finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .161));
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 11) {
		         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .2268));
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 11)
		     {
		    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .084));
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 11)
		     {
		     finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .112));
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 11) {
		         finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .140));
		         finCost = finWeight * v9Output;
		     }
		     //number of rows equaling 12
		     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 12)
		     {
		    	 finWeight = (finWeight * .039) + ((finWeight * .039) +  finWeight * .039);
		         finCost = finWeight * vOutput;
		     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 12)
		     {
		     finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .052));
		         finCost = finWeight * v2Output;
		     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 12) {
		         
		      finWeight = (finWeight * .065) + (finWeight * .129);
		         finCost = finWeight * v3Output;
		     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 12)
		     {
		    	finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .172));
		         finCost = finWeight * v4Output;
		     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 12)
		     {
		     finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .215));
		         finCost = finWeight * v5Output;
		     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 12) {
		         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .3023));
		         finCost = finWeight * v6Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 12)
		     {
		    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .112));
		         finCost = finWeight * v7Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 12)
		     {
		       finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .149));
		         finCost = finWeight * v8Output;
		     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 12) {
		        finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .187));
		         finCost = finWeight * v9Output; 
		         
		     } 
		
		   
		
		    //prints out the value of Fin Weight
		    GUI.finWeight.setText(finWeight + "");
		
		    //declares double variable named tubeFeet
		    double tubeFeet;
		
		    //declares variable tubesFace
		    double tubesFace;
		
		    //calculates faces of tubes
		    tubesFace = finHeight / 1.5;
		    
		    double caps = tubesFace * 2;
		    double caps1 = tubesFace * 2;
		
		    capCost = (caps + caps1) * cOutput;
		    
		    
		    
		
		    //calculates feet of tubing by taking the fin length + 4 inches times fin height divided by 1.5
		    //times the number of rows and divided by 12. Math.round is to round the answer
		    tubeFeet = Math.round(((finLength + 4) * ((finHeight / 1.5) * rowNumber)) / 12);
		
		
		    //prints out the value of feet of tubing
		
		
		    //prints out the value of feet of tubing
		
		
		    //prints out the value of feet of tubing
		
		    GUI.tubingFeet.setText((tubeFeet * 2) + "");
		
		
		    do {
		        //this prints out the menu choices for tubing material for the user to choose from
		        System.out.println("1. 1/2 x 0.035 cu\n" + "2. 5/8 x 0.030 cu\n" + "3. 5/8 x 0.035 cu\n"
		                + "4. 5/8 x 0.038 cu\n" + "5. 1-1/8 in x .050 cu\n" + "6. 1/4 in x .020 Stnls\n" +
		                "7. 5/8 in x .035 Stnls\n" + "8. 5/8 in. x .038 Stnls\n" + "9. 5/8 in. x .049 Stnls\n"
		                + "10. 1-1/8 in. x .049 Stnls\n" + "11. 5/8 x .035 CuNi\n" + "12. 1/4 in. Ref.Cu\n"
		                + "13. 5/16 in. Ref.Cu\n" + "14.  1/2 in. Ref.Cu\n" + "15. 1-1/8 x .049 Cu\n");
		        
		        // used to input value of an integer variable 'tmaterialSelect' from user.
		        tmaterialSelect = inFrame.mat_of_Tubing_Inp();
		        switch (tmaterialSelect) {
		            case 1:
		                tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
		                break;
		            case 2:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_30_cu;
		                break;
		            case 3:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Cu;
		                break;
		            case 4:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_38_cu;
		                break;
		            case 5:
		                tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_50_cu;
		                break;
		            case 6:
		                tubingMaterialSelect = TubingMaterialSelect.one_fourth_0_20_stnls;
		                break;
		            case 7:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Stnls;
		                break;
		            case 8:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_o_38_stnls;
		                break;
		            case 9:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_49_stnls;
		                break;
		            case 10:
		                tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_stnls;
		                break;
		            case 11:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_cuni;
		                break;
		            case 12:
		                tubingMaterialSelect = TubingMaterialSelect.one_four_ref;
		                break;
		            case 13:
		                tubingMaterialSelect = TubingMaterialSelect.five_sixteen_ref;
		                break;
		            case 14:
		                tubingMaterialSelect = TubingMaterialSelect.one_half_ref;
		                break;
		            case 15:
		                tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_cu;
		                break;
		
		            default:
		                System.out.println("Invalid choice!");
		                tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
		                break;
		
		        }
		    } while (tmaterialSelect < 1 || tmaterialSelect > 15);
		    if (tmaterialSelect == 1)
		    {
		    	 tubingPrice = tubeFeet * rOutput;
		    }
		    else if (tmaterialSelect == 2)
		    {
		    	 tubingPrice = tubeFeet * r2Output;
		    }
		    else if (tmaterialSelect == 3)
		    {
		         tubingPrice = tubeFeet * r3Output;
		    }
		    else if (tmaterialSelect == 4)
		    {
		    	 tubingPrice = tubeFeet * r4Output;
		    }
		    else if(tmaterialSelect == 5)
		    {
		    	 tubingPrice1 = tubeFeet * r5Output;
		    }
		    else if (tmaterialSelect == 6)
		    {
		    	 tubingPrice = tubeFeet * r6Output;
		    }
		    else if (tmaterialSelect == 7)
		    {
		         tubingPrice = tubeFeet * r7Output;
		    }
		    else if (tmaterialSelect == 8)
		    {
		    	 tubingPrice = tubeFeet * r8Output;
		    }
		    else if (tmaterialSelect == 9)
		    {
		    	 tubingPrice = tubeFeet * r9Output;
		    }
		    else if(tmaterialSelect == 10)
		    {
		    	 tubingPrice = tubeFeet * r10Output;
		    }
		    else if (tmaterialSelect == 11)
		    {
		         tubingPrice = tubeFeet * r11Output;
		    }
		    else if (tmaterialSelect == 12)
		    {
		      tubingPrice = tubeFeet * r12Output;
		    }
		    else if(tmaterialSelect == 13)
		    {
		      tubingPrice = tubeFeet * r13Output;
		    }
		    else if (tmaterialSelect == 14)
		    {
		     tubingPrice = tubeFeet * r14Output;
		    }
		    else if (tmaterialSelect == 15)
		    {
		    	tubingPrice = tubeFeet * r16Output;
		    }
		    
		
		    do {
		        //this prints out the menu choices for tubing material for the user to choose from
		        System.out.println("1. 1/2 x 0.035 cu\n" + "2. 5/8 x 0.030 cu\n" + "3. 5/8 x 0.035 cu\n"
		                + "4. 5/8 x 0.038 cu\n" + "5. 1-1/8 in x .050 cu\n" + "6. 1/4 in x .020 Stnls\n" +
		                "7. 5/8 in x .035 Stnls\n" + "8. 5/8 in. x .038 Stnls\n" + "9. 5/8 in. x .049 Stnls\n"
		                + "10. 1-1/8 in. x .049 Stnls\n" + "11. 5/8 x .035 CuNi\n" + "12. 1/4 in. Ref.Cu\n"
		                + "13. 5/16 in. Ref.Cu\n" + "14.  1/2 in. Ref.Cu\n" + "15. 1-1/8 in. x .049 Cu\n");
		   
		        // used to input value of an integer variable 'tmaterialSelect' from user.
		        tmaterialSelect = inFrame.mat_of_Tubing_Inp();
		        switch (tmaterialSelect) {
		            case 1:
		                tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
		                break;
		            case 2:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_30_cu;
		                break;
		            case 3:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Cu;
		                break;
		            case 4:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_38_cu;
		                break;
		            case 5:
		                tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_50_cu;
		                break;
		            case 6:
		                tubingMaterialSelect = TubingMaterialSelect.one_fourth_0_20_stnls;
		                break;
		            case 7:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Stnls;
		                break;
		            case 8:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_o_38_stnls;
		                break;
		            case 9:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_49_stnls;
		                break;
		            case 10:
		                tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_stnls;
		                break;
		            case 11:
		                tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_cuni;
		                break;
		            case 12:
		                tubingMaterialSelect = TubingMaterialSelect.one_four_ref;
		                break;
		            case 13:
		                tubingMaterialSelect = TubingMaterialSelect.five_sixteen_ref;
		                break;
		            case 14:
		                tubingMaterialSelect = TubingMaterialSelect.one_half_ref;
		                break;
		            case 15:
		                tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_cu;
		                break;   
		
		            default:
		                System.out.println("Invalid choice!");
		                tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
		                break;
		
		        }
		    } while (tmaterialSelect < 1 || tmaterialSelect > 15);
		    if (tmaterialSelect == 1)
		    {
		    	 tubingPrice1 = tubeFeet * rOutput;
		    }
		    else if (tmaterialSelect == 2)
		    {
		    	 tubingPrice1 = tubeFeet * r2Output;
		    }
		    else if (tmaterialSelect == 3)
		    {
		         tubingPrice1 = tubeFeet * r3Output;
		    }
		    else if (tmaterialSelect == 4)
		    {
		    	 tubingPrice1 = tubeFeet * r4Output;
		    }
		    else if(tmaterialSelect == 5)
		    {
		    	 tubingPrice1 = tubeFeet * r5Output;
		    }
		    else if (tmaterialSelect == 6)
		    {
		    	 tubingPrice1 = tubeFeet * r6Output;
		    }
		    else if (tmaterialSelect == 7)
		    {
		         tubingPrice1 = tubeFeet * r7Output;
		    }
		    else if (tmaterialSelect == 8)
		    {
		    	 tubingPrice1 = tubeFeet * r8Output;
		    }
		    else if (tmaterialSelect == 9)
		    {
		    	 tubingPrice1 = tubeFeet * r9Output;
		    }
		    else if(tmaterialSelect == 10)
		    {
		    	 tubingPrice1 = tubeFeet * r10Output;
		    }
		    else if (tmaterialSelect == 11)
		    {
		         tubingPrice1 = tubeFeet * r11Output;
		    }
		    else if (tmaterialSelect == 12)
		    {
		      tubingPrice1 = tubeFeet * r12Output;
		    }
		    else if(tmaterialSelect == 13)
		    {
		      tubingPrice1 = tubeFeet * r13Output;
		    }
		    else if (tmaterialSelect == 14)
		    {
		     tubingPrice1 = tubeFeet * r14Output;
		    }
		    else if (tmaterialSelect == 15)
		    {
		    	tubingPrice1 = tubeFeet * r16Output;
		    }
		  
			//declares double variable returnBends and sets it equal to 0
		    double returnBends = 0;
		
		    //declares double variable num2
		    double num2;
		    if (rowNumber == 3 || rowNumber == 4 || rowNumber == 5 || rowNumber == 6 || rowNumber == 8) {
		        returnBends = finHeight / 1.5 * rowNumber / 2.0 * 0.5 + finHeight / 1.5 * rowNumber / 2.0;
		    } else {
		        num2 = finHeight / 1.5 * rowNumber / 2.0;
		        returnBends = Math.round(num2);
		    }
		    //prints out number of return bends
		
		    GUI.returnBends.setText(returnBends + "");
		    
		    rbendsPrice = (returnBends * r15Output);
		    
		    
		    connectionS = inFrame.connections_num_Inp();
		    do {
		        //this prints out the menu choices for distributors for the user to choose from
		        System.out.println("1. 1/2 in FPT\n" + "2. 3/4 in FPT\n" + "3. 1 in. FPT\n" + "4. 1 in MPT\n"
		                + "5. 1-1/4 in MPT\n" + "6. 1-1/2 in MPTM\n" + "7. 1-1/2 in FPT\n" + "8. 2 in FPT\n"
		                + "9. 2 in MPT\n" + "10. 2.5 in FPT\n" + "11. 2.5 in MPT\n" + "12. 3 in MPT\n" + "13. 4 in MPT\n" + "14. 1-1/2 in Brass\n" + "15. 2-3/8 in Brass\n");
		       
		        // used to input value of an integer variable 'distributorSelect' from user.
		        connectionsSelect = inFrame.size_of_connection_Inp();
		        switch (connectionsSelect) {
		            case 1:
		                connectionSelection = ConnectionSelection.one_half_fpt;
		                break;
		            case 2:
		           	 connectionSelection = ConnectionSelection.three_fourth_fpt;
		                break;
		            case 3:
		           	 connectionSelection = ConnectionSelection.one_fpt;
		                break;
		            case 4:
		           	 connectionSelection = ConnectionSelection.one_mpt;
		                break;
		            case 5:
		           	 connectionSelection = ConnectionSelection.one_one_fourth_mpt;
		                break;
		            case 6:
		           	 connectionSelection = ConnectionSelection.one_one_half_mpt;
		                break;
		            case 7:
		           	 connectionSelection = ConnectionSelection.one_one_half_fpt;
		                break;
		            case 8:
		           	 connectionSelection = ConnectionSelection.two_fpt;
		                break;
		            case 9:
		           	 connectionSelection = ConnectionSelection.two_mpt;
		                break;
		            case 10:
		           	 connectionSelection = ConnectionSelection.two_five_fpt;
		                break;
		            case 11:
		           	 connectionSelection = ConnectionSelection.two_five_mpt;
		                break;
		            case 12:
		           	 connectionSelection = ConnectionSelection.three_mpt;
		                break;
		            case 13:
		           	 connectionSelection = ConnectionSelection.four_mpt;
		                break;
		            case 14:
		           	 connectionSelection = ConnectionSelection.one_one_half_brass;
		                break;
		            case 15:
		           	 connectionSelection = ConnectionSelection.two_three_eighths_brass;
		                break;
		           
		
		            default:
		                System.out.println("Invalid choice!");
		                connectionSelection = ConnectionSelection.one_half_fpt;
		                break;
		
		        }
		    } while (connectionsSelect < 1 || connectionsSelect > 15);
		     
		     if (connectionsSelect == 1)
		     {
		    	 connectionPrice = connectionS * c1Output;
		    	 
		    	
		     }
		     else if (connectionsSelect == 2)
		     {
		    	 connectionPrice = connectionS * c2Output;
		    	 
		   
		     }
		     else if (connectionsSelect == 3)
		     {
		    	 connectionPrice = connectionS * c3Output;
		     }
		    	 
		     else if (connectionsSelect == 4)
		     {
		    	connectionPrice = connectionS * c4Output;
		
		     }
		     else if (connectionsSelect == 5)
		     {
		    	 connectionPrice = connectionS * c5Output;
		    	 
		     }
		     else if (connectionsSelect == 6)
		     {
		    	 connectionPrice = connectionS * c6Output;
		
		   	  
		     }
		     else if (connectionsSelect == 7)
		     {
		    	 connectionPrice = connectionS * c7Output;
		    	
		     }
		    		 else if (connectionsSelect == 8)
		     {
		    			 connectionPrice = connectionS * c8Output;
		            	 
		      
		 
		     }
		     else if (connectionsSelect == 9)
		     {
		    	 connectionPrice = connectionS * c9Output;
		    	 
		    	 
		     }
		     else if (connectionsSelect == 10)
		     {
		    	 connectionPrice = connectionS * c10Output;
		    	 
		    	
		     }
		     else if (connectionsSelect == 11)
		     {
		    	 connectionPrice = connectionS * c11Output;
		    	 
		    	
		     }
		     else if (connectionsSelect == 12)
		     {
		    	 connectionPrice = connectionS * c12Output;
		    	 
		
		     }
		     else if (connectionsSelect == 13)
		     {
		    	 connectionPrice = connectionS * c13Output;
		    	 
		    
		     }
		     else if (connectionsSelect == 14)
		     {
		    	 connectionPrice = connectionS * c14Output;
		    	 
		    
		     }
		     else if (connectionsSelect == 15)
		     {
		    	 connectionPrice = connectionS * c15Output;
		    	 
		    
		     }
		
			 //declares double variable frameWeight
		    double frameWeight;
		    	
		    //sets frame weight equal to the fin length times number of rows times 2 plus the fin height times
		    // number of rows times 2 and divides it by 12
		    frameWeight = ((finLength * rowNumber * 2.0) + (finHeight * rowNumber * 2.0)) / 12.0;
		    
		    do {
		        //this prints out the menu choices for frame material for the user to choose from
		        System.out.println("1. SS\n" + "2. Galvnl\n" + "3. Galvns\n");
		        
		        // used to input value of an integer variable 'fmaterialSelect' from user.
		        fmaterialSelect = inFrame.mat_of_frame_Inp();
		        switch (fmaterialSelect) {
		            case 1:
		               frameMaterial = FrameMaterial.stainless_steel;
		                break;
		            case 2:
		                frameMaterial = FrameMaterial.galvanneal;
		                break;
		            case 3:
		                frameMaterial = FrameMaterial.galvanized;
		                break;
		          
		
		            default:
		                System.out.println("Invalid choice!");
		                frameMaterial = FrameMaterial.stainless_steel;
		                break;
		
		        }
		    } while (fmaterialSelect < 1 || fmaterialSelect > 3);
		    if (fmaterialSelect == 1)
		    {
		    	frameCost = frameWeight * fOutput;
		    }
		    else if (fmaterialSelect == 2)
		    {
		    	frameCost = frameWeight * f1Output;
		    }
		    else if (fmaterialSelect == 3)
		    {
		    	frameCost = frameWeight * f2Output;
		    }
		
		    //this declares a string variable called strDouble and formats it as the frame weight rounded to two decimal places
		    String strDouble = String.format("%.2f", frameWeight);
		
		
		    //this prints out the value of the frame weight
		
		    GUI.frameWeight.setText(strDouble + "");
		    //this declares a double variable called solderNum
		    double solderNum;
		
		    //this sets the value of the number of solders to frameWeight times .138
		    solderNum = frameWeight * .138;
		    
		
		    do {
		        //this prints out the menu choices for solder material for the user to choose from
		        System.out.println("1. 5% silver\n" + "2. 15% silver\n");
		        
		        // used to input value of an integer variable 'fmaterialSelect' from user.
		        smaterialSelect = inFrame.sil_per_solder_Inp();
		        switch (smaterialSelect) {
		            case 1:
		               solderMaterial = SolderMaterial.five_silver;
		                break;
		            case 2:
		                solderMaterial = SolderMaterial.fifteen_silver;
		                break;
		
		            default:
		                System.out.println("Invalid choice!");
		                solderMaterial = SolderMaterial.five_silver;;
		                break;
		
		        }
		    } while (smaterialSelect < 1 || smaterialSelect > 2);
		    if (smaterialSelect == 1)
		    {
		    	solderCost = solderNum * sOutput;
		    }
		    else if (smaterialSelect == 2)
		    {
		    	solderCost = solderNum * s1Output;
		    }
		
		    //this declares a string variable called strDouble1 and formats it as the number of solders rounded to two decimal places
		    String strDouble1 = String.format("%.2f", solderNum);
		    
		 
		
		    //this prints out the number of solders
		
		    GUI.solderNum.setText(strDouble1 + "");
		   
		
		    //this declares a double variable called vents and sets it equal to 4
		    double vents = 4;
		
		    //this prints out the number of vents
		   
		    GUI.ventNum.setText(vents + "");
		    
		    ventsPrice = (vents * s2Output);
		
		
		    
		
		    //this declares a double variable called headerNum
		    double headerNum = 2;
		
		    //this prints out the number of headers
		 
		    GUI.headerNum.setText(headerNum + "");
		
		    //this declares a double variable called headerLength and sets it equal to the finHeight
		    double headerLength = finHeight;
		
		    //this prints out the header length
		   
		    GUI.headerLength.setText(headerLength + "");
		    //this declares a double variable called disc
		    double disc;
		
		    //this sets the value of disc to number of headers times 2
		    disc = headerNum * 2;
		
		    discCost = disc * dOuput;
		
		  
		
		    
		
		
		    //this prints out the number of discs
		
		    GUI.discNum.setText(disc + "");
		    double headers;
		    headers = ((finHeight + 3) * 2) / 12;
		
		    System.out.println();
		
		    do {
		        //this prints out the menu choices for header diameter for the user to choose from
		        System.out.println("1. 3/4 in. cu\n" + "2. 1 in. cu\n" + "3. 1-1/2 in. cu\n" + "4. 2 in. cu\n"
		                + "5. 2-1/2 in. cu\n" + "6. 3 in. cu\n" + "7. 4 in. cu\n");
		
		        // used to input value of an integer variable 'hdiameterSelect' from user.
		        hdiameterSelect = inFrame.dia_of_header_Inp();
		        switch (hdiameterSelect) {
		            case 1:
		                headerDiameter = HeaderDiameter.three_fourth;
		                break;
		            case 2:
		                headerDiameter = HeaderDiameter.one;
		                break;
		            case 3:
		                headerDiameter = HeaderDiameter.one_and_one_half;
		                break;
		            case 4:
		                headerDiameter = HeaderDiameter.two;
		                break;
		            case 5:
		                headerDiameter = HeaderDiameter.two_and_one_half;
		                break;
		            case 6:
		                headerDiameter = HeaderDiameter.three;
		                break;
		            case 7:
		                headerDiameter = HeaderDiameter.four;
		                break;
		
		            default:
		                System.out.println("Invalid choice!");
		                headerDiameter = HeaderDiameter.three_fourth;
		                break;
		
		        }
		    } while (hdiameterSelect < 1 || hdiameterSelect > 7);
		        if (hdiameterSelect == 1)
		        {
		            headerCost = headers * hOutput;
		        }
		        else if (hdiameterSelect == 2)
		        {
		            headerCost = headers * h2Output;
		        }
		        else if (hdiameterSelect == 3)
		        {
		            headerCost = headers * h3Output;
		        }
		        else if (hdiameterSelect == 4)
		        {
		            headerCost = headers * h4Output;
		        }
		        else if (hdiameterSelect == 5)
		        {
		            headerCost = headers * h5Output;
		        }
		        else if (hdiameterSelect == 6)
		        {
		            headerCost = headers * h6Output;
		        }
		        else if (hdiameterSelect == 7)
		        {
		            headerCost = headers * h7Output;
		        }
		
		  
		    System.out.println();
		    System.out.println();
		    totalPrice = finCost + tubingPrice + tubingPrice1 + rbendsPrice + frameCost + solderCost + ventsPrice + discCost + headerCost + capCost + connectionPrice;
		
		    String strDouble19 = String.format("%.2f",  totalPrice);
		    laborCost = lOutput;
		    finalPrice = (totalPrice * laborCost);
		    String strDouble35 = String.format("%.2f", finalPrice);
		
		    GUI.totalmaterialsCost.setText(strDouble19 + "");
		   
		    GUI.totalCost.setText(strDouble35 + "");
		    System.out.println();
		    FileInputStream fis = new FileInputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook (fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			XSSFRow row1 = sheet.getRow(1);
			XSSFCell cell1 = row1.getCell(1);
			cell1.setCellValue("NF");
			XSSFCell cell2 = row1.getCell(2);
			cell2.setCellValue(finHeight);
			XSSFCell cell3 = row1.getCell(3);
			cell3.setCellValue(rowNumber);
			XSSFCell cell4 = row1.getCell(4);
			cell4.setCellValue(finperInch);
			XSSFCell cell6 = row1.getCell(6);
			cell6.setCellValue(finLength);      
			XSSFCell cell7 = row1.getCell(7);
			cell7.setCellValue(strDouble19);
			XSSFCell cell8 = row1.getCell(8);
			cell8.setCellValue(strDouble35);
			fis.close();
			FileOutputStream fos =new FileOutputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
		       workbook.write(fos);
		       fos.close(); 
		    System.out.println(); 
	}
			
	public static void boosterCoil(GUI inFrame) throws IOException
	{
		main rc=new main();   //object of the class  
    	//reading the value of 45th row and 3rd column  
    	double vOutput=rc.ReadCellData(44, 3);  //reading price of aluminum fin .006
    	double v2Output=rc.ReadCellData(45,3); //reading price of aluminum fin .008
    	double v3Output=rc.ReadCellData(46, 3); //reading price of aluminum fin .010
    	double v4Output=rc.ReadCellData(47, 3); //reading price of copper fin .008
    	double v5Output=rc.ReadCellData(48, 3); //reading price of copper fin .010
    	double v6Output=rc.ReadCellData(49, 3); //reading price of copper fin .015
    	double v7Output=rc.ReadCellData(51, 3); //reading price of stainless steel .006
    	double v8Output=rc.ReadCellData(52, 3); //reading price of stainless steel fin .008
    	double v9Output=rc.ReadCellData(53, 3); //reading price of stainless steel .010
    	double v10Output=rc.ReadCellData(99, 3); //reading price of alum 3in x .010
    	double rOutput=rc.ReadCellData(81,3); //reading price of tubing 1/2 x 0.035 cu
    	double r2Output=rc.ReadCellData(82,3); 
    	double r3Output=rc.ReadCellData(83,3); 
    	double r4Output=rc.ReadCellData(84,3); 
    	double r5Output=rc.ReadCellData(85,3); 
    	double r6Output=rc.ReadCellData(86,3);
    	double r7Output=rc.ReadCellData(87,3); 
    	double r8Output=rc.ReadCellData(88,3); 
    	double r9Output=rc.ReadCellData(89,3);
    	double r10Output=rc.ReadCellData(90,3); 
    	double r11Output=rc.ReadCellData(95,3); 
    	double r12Output=rc.ReadCellData(91,3); 
    	double r13Output=rc.ReadCellData(92,3);
    	double r14Output=rc.ReadCellData(93,3); 
    	double r16Output=rc.ReadCellData(98, 3);
    	double r15Output=rc.ReadCellData(78, 3); //reading price of return Bends
    	double fOutput=rc.ReadCellData(56, 3); //ss frame
    	double f1Output=rc.ReadCellData(57, 3); //galvanneal frame
    	double f2Output=rc.ReadCellData(58, 3); //galvanize frame
    	double sOutput = rc.ReadCellData (79,3); //solder 5% silver
    	double s1Output = rc.ReadCellData (80,3); //solder 15% silver
    	double s2Output = rc.ReadCellData (94,3); //vents
        double hOutput = rc.ReadCellData(59,3);
        double h2Output = rc.ReadCellData(60,3);
        double h3Output = rc.ReadCellData(61,3);
        double h4Output = rc.ReadCellData(62,3);
        double h5Output = rc.ReadCellData(63,3);
        double h6Output = rc.ReadCellData(64,3);
        double h7Output = rc.ReadCellData (65,3);
        double dOuput = rc.ReadCellData(19,3);
        double tOutput = rc.ReadCellData(20, 3);
        double t1Output = rc.ReadCellData(21, 3);
        double t2Output = rc.ReadCellData(22, 3);
        double t3Output = rc.ReadCellData(23, 3);
        double t4Output = rc.ReadCellData(24, 3);
        double t5Output = rc.ReadCellData(25, 3);
        double t6Output = rc.ReadCellData(26, 3);
        double t7Output = rc.ReadCellData(27, 3);
        double t8Output = rc.ReadCellData(28, 3);
        double t9Output = rc.ReadCellData(29, 3);
        double t10Output = rc.ReadCellData(30, 3);
        double t11Output = rc.ReadCellData(31, 3);
        double t12Output = rc.ReadCellData(32, 3);
        double t13Output = rc.ReadCellData(33, 3);
        double t14Output = rc.ReadCellData(34, 3);
        double t15Output = rc.ReadCellData(35, 3);
        double t16Output = rc.ReadCellData(36, 3);
        double t17Output = rc.ReadCellData(37, 3);
        double t18Output = rc.ReadCellData(38, 3);
        double t19Output = rc.ReadCellData(39, 3);
        double t20Output = rc.ReadCellData(40, 3);
        double t21Output = rc.ReadCellData(41, 3);
        double t22Output = rc.ReadCellData(42, 3);
        double szOutput = rc.ReadCellData(75, 3);
        double sz2Output = rc.ReadCellData(76, 3);
        double sz3Output = rc.ReadCellData(77, 3);
        double cOutput = rc.ReadCellData(2, 3);
        double c1Output = rc.ReadCellData(3, 3);
        double c2Output = rc.ReadCellData(4, 3);
        double c3Output = rc.ReadCellData(5, 3);
        double c4Output = rc.ReadCellData(15,3);
        double c5Output = rc.ReadCellData(6, 3);
        double c6Output = rc.ReadCellData(7,3);
        double c7Output = rc.ReadCellData(8, 3);
        double c8Output = rc.ReadCellData(9, 3);
        double c9Output = rc.ReadCellData(10, 3);
        double c10Output = rc.ReadCellData(12, 3);
        double c11Output = rc.ReadCellData(11, 3);
        double c12Output = rc.ReadCellData(13, 3);
        double c13Output = rc.ReadCellData(14, 3);
        double c14Output = rc.ReadCellData(17, 3);
        double c15Output = rc.ReadCellData(16, 3);
        double lOutput = rc.ReadCellData (97,3);
		Scanner scan = new Scanner(System.in); //declaring scan as an object of Scanner class.
    	int type; //declaring variable type
        int rowNumber; //declaring variable rowNumber
        int finmaterialSelection; //declaring variable finmaterialselection
        int hdiameterSelect; //declares variable hdiameterSelect
        int distributorSelect; //declares variable distributorSelect
        int typeSelect; //declares variable typeSelect
        int sizeSelect; //declares variable sizeSelect
        int amountSelect; //declares variable amountSelect
        int tmaterialSelect; //declares variable tmaterialSelect
        int priceSelect; 
        int smaterialSelect;
        int fmaterialSelect;
        int categorySelect;
        int connectionsSelect;
        int connectionS;
        double headerCost = 0;
        double newPrice=0;
        double finCost = 0;
        double tubingPrice = 0;
        double tubingPrice1=0;
        double frameCost = 0;
        double solderCost = 0;
        double discCost=0;
        double totaldCost = 0;
        double totalPrice=0;
        double rbendsPrice = 0;
        double ventsPrice = 0;
        double connectionPrice = 0;
        double capCost = 0;
        double laborCost = 0;
        double finalPrice = 0;
        ConnectionSelection connectionSelection = null;
        CategorySelection categorySelection = null;
        SolderMaterial solderMaterial = null;
        FrameMaterial frameMaterial = null;
        CoilType coilType = null; //setting coilType from enum class CoilType to null
        FinMaterial finMaterial = null; //setting finMaterial from enum class FinMaterial to null
        HeaderDiameter headerDiameter = null; //setting headerDiameter from enum HeaderDiameter to null
        DistributorType distributorType = null; //setting distributorType from enum DistributorType to null
        TypeSelector typeSelector = null; //setting typeSelector from enum TypeSelector to null
        SizeSelector sizeSelector = null; //setting sizeSelector from enum SizeSelector to null
        AmountSelector amountSelector = null; //setting amountSelector from enum AmountSelector to null
        TubingMaterialSelect tubingMaterialSelect = null; //setting tubingMaterialSelect from enum TubingMaterialSelect to nu
        //declares variable finHeight and is used to input an integer variable 'finheight' from users
        double finHeight = inFrame.fin_height_Inp();

        double finLength = inFrame.fin_length_Inp();
        //prompts users to enter in fins per inch
        double finperInch = inFrame.fin_pinch_Inp();

        double finWeight; //declares double variable finWeight

        //sets value of fin weight by taking the fin height times fin length times fins per inch and divides it by 12
        finWeight = (finHeight * finLength * finperInch) / 12;

        //prompts user to enter in the number of rows
        rowNumber = inFrame.row_num_Inp();
        
      
        //prints out empty line (to make output in terminal look neater)
        System.out.println();

        do {
            //this prints out the menu choices for fin material for the user to choose from
            System.out.println("1. Aluminum .006\n" + "2. Aluminum .008\n" + "3. Aluminum .010\n" + "4. Copper .008\n"
                    + "5. Copper .010\n" + "6. Copper .015\n" + "7. Stainless Steel .006\n"
                    + "8. Stainless Steel .008\n" + "9. Stainless Steel .010\n" + "10. Alumnium 3 x .010\n");
            // used to input value of an integer variable 'finmaterialSelection' from user.
            finmaterialSelection = inFrame.mat_of_fin_Inp();
            switch (finmaterialSelection) {
                case 1:
                    finMaterial = FinMaterial.Aluminum_Six;
                    break;
                case 2:
                    finMaterial = FinMaterial.Aluminum_Eight;
                    break;
                case 3:
                    finMaterial = FinMaterial.Aluminum_Ten;
                    break;
                case 4:
                    finMaterial = FinMaterial.Copper_Eight;
                    break;
                case 5:
                    finMaterial = FinMaterial.Copper_Ten;
                    break;
                case 6:
                    finMaterial = FinMaterial.Copper_Fifthteen;
                    break;
                case 7:
                    finMaterial = FinMaterial.Stainless_Steel_Six;
                    break;
                case 8:
                    finMaterial = FinMaterial.Stainless_Steel_Eight;
                    break;
                case 9:
                    finMaterial = FinMaterial.Stainless_Steel_Ten;
                    break;
                case 10:
	            	finMaterial = FinMaterial.three_ten_alum;

                default:
                    System.out.println("Invalid choice!");
                    finMaterial = FinMaterial.Aluminum_Six;
                    break;

            }
        } while (finmaterialSelection < 1 || finmaterialSelection > 10);
        if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 1) {
            finWeight = finWeight * .010;
            finCost = finWeight * vOutput;
         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 1) {
             finWeight = finWeight * .013;
             finCost = finWeight * v2Output;
         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 1) {
             finWeight = finWeight * .016;
             finCost = finWeight * v3Output;
         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 1) {
             finWeight = finWeight * .043;
             finCost = finWeight * v4Output;
         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 1) {
             finWeight = finWeight * .054;
             finCost = finWeight * v5Output;
         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 1) {
             finWeight = finWeight * .0756;
             finCost = finWeight * v6Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 1) {
             finWeight = finWeight * .028;
             finCost = finWeight * v7Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 1) {
             finWeight = finWeight * .038;
             finCost = finWeight * v8Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 1) {
             finWeight = finWeight * .047;
             finCost = finWeight * v9Output;
         } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 1) {
	    	 finWeight = finWeight * .049;
	    	 finCost = finWeight * v10Output;
	     } else if (finMaterial == FinMaterial.three_ten_alum && rowNumber == 2) {
	    	 finWeight = finWeight * .097;
	    	 finCost = finWeight * v10Output;
	     }else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 2) {
             finWeight = finWeight * .020;
             finCost = finWeight * vOutput;

         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 2) {
             finWeight = finWeight * .026;
             finCost = finWeight * v2Output;

         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 2) {
             finWeight = finWeight * .032;
             finCost = finWeight * v3Output;
             

         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 2) {
             finWeight = finWeight * .086;
             finCost = finWeight * v4Output;

         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 2) {
             finWeight = finWeight * .107;
             finCost = finWeight * v5Output;
         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 2) {
             finWeight = finWeight * .1522;
             finCost = finWeight * v6Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 2) {
             finWeight = finWeight * .056;
             finCost = finWeight * v7Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 2) {
             finWeight = finWeight * .075;
             finCost = finWeight * v8Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 2) {
             finWeight = finWeight * .093;
             finCost = finWeight * v9Output;
         } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 3) {
             finWeight = finWeight * .029;
             finCost = finWeight * vOutput;

         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 3) {
             finWeight = finWeight * .039;
             finCost = finWeight * v2Output;

         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 3) {
             finWeight = finWeight * .049;
             finCost = finWeight * v3Output;

         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 3) {
             finWeight = finWeight * .129;
             finCost = finWeight * v4Output;
         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 3) {
             finWeight = finWeight * .161;
             finCost = finWeight * v5Output;
         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 3) {
             finWeight = finWeight * .2268;
             finCost = finWeight * v6Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 3) {
             finWeight = finWeight * .084;
             finCost = finWeight * v7Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 3) {
             finWeight = finWeight * .112;
             finCost = finWeight * v8Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 3) {
             finWeight = finWeight * .140;
             finCost = finWeight * v9Output;
         } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 4) {
             finWeight = finWeight * .039;
             finCost = finWeight * vOutput;

         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 4) {
             finWeight = finWeight * .052;
             finCost = finWeight * v2Output;

         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 4) {
             finWeight = finWeight * .065;
             finCost = finWeight * v3Output;

         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 4) {
             finWeight = finWeight * .172;
             finCost = finWeight * v4Output;
         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 4) {
             finWeight = finWeight * .215;
             finCost = finWeight * v5Output;
         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 4) {
             finWeight = finWeight * .3023;
             finCost = finWeight * v6Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 4) {
             finWeight = finWeight * .112;
             finCost = finWeight * v7Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 4) {
             finWeight = finWeight * .149;
             finCost = finWeight * v8Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 4) {
             finWeight = finWeight * .187;
             finCost = finWeight * v9Output;
         } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 5) {
             finWeight = finWeight * .049;
             finCost = finWeight * vOutput;

         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 5) {
             finWeight = finWeight * .065;
             finCost = finWeight * v2Output;

         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 5) {
             finWeight = finWeight * .081;
             finCost = finWeight * v3Output;

         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 5) {
             finWeight = finWeight * .215;
             finCost = finWeight * v4Output;
         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 5) {
             finWeight = finWeight * .269;
             finCost = finWeight * v5Output;
         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 5) {
             finWeight = finWeight * .378;
             finCost = finWeight * v6Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 5) {
             finWeight = finWeight * .140;
             finCost = finWeight * v7Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 5) {
             finWeight = finWeight * .187;
             finCost = finWeight * v8Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 5) {
             finWeight = finWeight * .233;
             finCost = finWeight * v9Output;
         } else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 6) {
             finWeight = finWeight * .058;
             finCost = finWeight * vOutput;

         } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 6) {
             finWeight = finWeight * .078;
             finCost = finWeight * v2Output;

         } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 6) {
             finWeight = finWeight * .081;
             finCost = finWeight * v3Output;

         } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 6) {
             finWeight = finWeight * .258;
             finCost = finWeight * v4Output;
         } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 6) {
             finWeight = finWeight * .322;
             finCost = finWeight * v5Output;
         } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 6) {
             finWeight = finWeight * .4515;
             finCost = finWeight * v6Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 6) {
             finWeight = finWeight * .168;
             finCost = finWeight * v7Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 6) {
             finWeight = finWeight * .224;
             finCost = finWeight * v8Output;
         } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 6) {
             finWeight = finWeight * .280;
             finCost = finWeight * v9Output;
         } 
      //number of rows equaling 7
	     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 7) {
	    	 finWeight = (finWeight * .039) + (finWeight * .029);
	         finCost = finWeight * vOutput;
	     }  else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 7) {
	    	 finWeight = (finWeight * .052) + (finWeight * .039);
	         finCost = finWeight * v2Output;
	    } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 7) {
	    	 finWeight = (finWeight * .065) + (finWeight * .049);
	         finCost = finWeight * v3Output;
	    } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 7) {
	    	 finWeight = (finWeight * .172) + (finWeight * .129);
	         finCost = finWeight * v4Output;
	     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 7) {
	    	 finWeight = (finWeight * .215) + (finWeight * .161);
	         finCost = finWeight * v5Output;
	     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 7) {
	    	 finWeight = (finWeight * .3023) + (finWeight * .2268);
	         finCost = finWeight * v6Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 7) {
	    	  finWeight = (finWeight * .112) + (finWeight * .084);
		      finCost = finWeight * v7Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 7) {
	    	 finWeight = (finWeight * .149) + (finWeight * .112);
	         finCost = finWeight * v8Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 7) {
	    	 finWeight = (finWeight * .187) + (finWeight * .140);
	         finCost = finWeight * v9Output;
	         
	    }
	      //number of rows equaling 8
	     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 8)
	     {
	    	 finWeight = (finWeight * .039) +  (finWeight * .039);
	         finCost = finWeight * vOutput;
	     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 8)
	     {
	     finWeight = (finWeight * .052) + (finWeight * .052);
	         finCost = finWeight * v2Output;
	     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 8) {
	         finWeight = finWeight * .129;
	         finCost = finWeight * v3Output; 
	      
	     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 8)
	     {
	    	 finWeight = (finWeight * .172) + (finWeight * .172);
	         finCost = finWeight * v4Output;
	     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 8)
	     {
	     finWeight = (finWeight * .215) + (finWeight * .215);
	         finCost = finWeight * v5Output;
	     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 8) {
	         finWeight = (finWeight * .3023) + (finWeight * .3023);
	         finCost = finWeight * v6Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 8)
	     {
	    	  finWeight = (finWeight * .112) + (finWeight * .112);
	         finCost = finWeight * v7Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 8)
	     {
	         finWeight = (finWeight * .149) + (finWeight * .149);
	         finCost = finWeight * v8Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 8) {
	         finWeight = (finWeight * .187) + (finWeight * .187);
	         finCost = finWeight * v9Output;

	     }
	     
	      //number of rows equaling 9
	      
	     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 9)
	     {
	    	 finWeight = (finWeight * .039) + (finWeight * .049);
	         finCost = finWeight * vOutput;
	     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 9)
	     {
	     finWeight = (finWeight * .052) + (finWeight * .065);
	         finCost = finWeight * v2Output;
	     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 9) {
	         
	      finWeight = (finWeight * .065) + (finWeight * .081);
	         finCost = finWeight * v3Output;
	     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 9)
	     {
	    	 finWeight = (finWeight * .172) + (finWeight * .215);
	         finCost = finWeight * v4Output;
	     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 9)
	     {
	     finWeight = (finWeight * .215) + (finWeight * .269);
	         finCost = finWeight * v5Output;
	     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 9) {
	         finWeight = (finWeight * .3023) + (finWeight * .378);
	         finCost = finWeight * v6Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 9)
	     {
	    	  finWeight = (finWeight * .112) + (finWeight * .140);
	         finCost = finWeight * v7Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 9)
	     {
	     finWeight = (finWeight * .149) + (finWeight * .187);
	         finCost = finWeight * v8Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 9) {
	         
	         finWeight = (finWeight * .187) + (finWeight * .233);
	         finCost = finWeight * v9Output;
	     }
	      
	     //number of rows equaling 10
	     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 10)
	     {
	    	finWeight = (finWeight * .039) + (finWeight * .058);
	         finCost = finWeight * vOutput; 
	     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 10)
	     {
	     finWeight = (finWeight * .052) + (finWeight * .078);
	         finCost = finWeight * v2Output;
	     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 10) {
	         
	      finWeight = (finWeight * .065) + (finWeight * .081);
	         finCost = finWeight * v3Output;
	     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 10)
	     {
	    	 finWeight = (finWeight * .172) + (finWeight * .258);
	         finCost = finWeight * v4Output;
	     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 10)
	     {
	     finWeight = (finWeight * .215) + (finWeight * .322);
	         finCost = finWeight * v5Output;
	     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 10) {
	      finWeight = (finWeight * .3023) + (finWeight * .4515);
	         finCost = finWeight * v6Output;   
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 10)
	     {
	    	  finWeight = (finWeight * .112) + (finWeight * .168);
	         finCost = finWeight * v7Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 10)
	     {
	     finWeight = (finWeight * .149) + (finWeight * .224);
	         finCost = finWeight * v8Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 10) {
	         
	         finWeight = (finWeight * .187) + (finWeight * .280);
	         finCost = finWeight * v9Output;
	     } 
	     
	     //number of rows equaling 11
	     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 11)
	     {
	    	 finWeight = (finWeight * .039) + ((finWeight * .039) + (finWeight * .029));
	         finCost = finWeight * vOutput;
	     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 11)
	     {
	         finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .039));
	         finCost = finWeight * v2Output;
	     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 11) {
	         finWeight = (finWeight * .065) + ((finWeight * .065) + (finWeight * .049));
	         finCost = finWeight * v3Output;
	      
	     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 11)
	     {
	    	 finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .129));
	         finCost = finWeight * v4Output;
	     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 11)
	     {
	         finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .161));
	         finCost = finWeight * v5Output;
	     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 11) {
	         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .2268));
	         finCost = finWeight * v6Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 11)
	     {
	    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .084));
	         finCost = finWeight * v7Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 11)
	     {
	     finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .112));
	         finCost = finWeight * v8Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 11) {
	         finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .140));
	         finCost = finWeight * v9Output;
	     }
	     //number of rows equaling 12
	     else if (finMaterial == FinMaterial.Aluminum_Six && rowNumber == 12)
	     {
	    	 finWeight = (finWeight * .039) + ((finWeight * .039) +  finWeight * .039);
	         finCost = finWeight * vOutput;
	     } else if (finMaterial == FinMaterial.Aluminum_Eight && rowNumber == 12)
	     {
	     finWeight = (finWeight * .052) + ((finWeight * .052) + (finWeight * .052));
	         finCost = finWeight * v2Output;
	     } else if (finMaterial == FinMaterial.Aluminum_Ten && rowNumber == 12) {
	         
	      finWeight = (finWeight * .065) + (finWeight * .129);
	         finCost = finWeight * v3Output;
	     } else if (finMaterial == FinMaterial.Copper_Eight && rowNumber == 12)
	     {
	    	finWeight = (finWeight * .172) + ((finWeight * .172) + (finWeight * .172));
	         finCost = finWeight * v4Output;
	     } else if (finMaterial == FinMaterial.Copper_Ten && rowNumber == 12)
	     {
	     finWeight = (finWeight * .215) + ((finWeight * .215) + (finWeight * .215));
	         finCost = finWeight * v5Output;
	     } else if (finMaterial == FinMaterial.Copper_Fifthteen && rowNumber == 12) {
	         finWeight = (finWeight * .3023) + ((finWeight * .3023) + (finWeight * .3023));
	         finCost = finWeight * v6Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Six && rowNumber == 12)
	     {
	    	 finWeight = (finWeight * .112) + ((finWeight * .112) + (finWeight * .112));
	         finCost = finWeight * v7Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Eight && rowNumber == 12)
	     {
	       finWeight = (finWeight * .149) + ((finWeight * .149) + (finWeight * .149));
	         finCost = finWeight * v8Output;
	     } else if (finMaterial == FinMaterial.Stainless_Steel_Ten && rowNumber == 12) {
	        finWeight = (finWeight * .187) + ((finWeight * .187) + (finWeight * .187));
	         finCost = finWeight * v9Output; 
	         
	     } 
      
        //prints out the value of Fin Weight
       
        GUI.finWeight.setText(finWeight + "");

        //declares double variable named tubeFeet
        double tubeFeet;
        //calculates feet of tubing by taking the fin length + 4 inches times fin height divided by 1.5
        //times the number of rows and divided by 12. Math.round is to round the answer
        tubeFeet = Math.round(((finLength + 4) * ((finHeight / 1.5) * rowNumber)) / 12);
        

        //prints out the value of feet of tubing

        GUI.tubingFeet.setText(tubeFeet + "");

        do {
            //this prints out the menu choices for tubing material for the user to choose from
            System.out.println("1. 1/2 x 0.035 cu\n" + "2. 5/8 x 0.030 cu\n" + "3. 5/8 x 0.035 cu\n"
                    + "4. 5/8 x 0.038 cu\n" + "5. 1-1/8 in x .050 cu\n" + "6. 1/4 in x .020 Stnls\n" +
                    "7. 5/8 in x .035 Stnls\n" + "8. 5/8 in. x .038 Stnls\n" + "9. 5/8 in. x .049 Stnls\n"
                    + "10. 1-1/8 in. x .049 Stnls\n" + "11. 5/8 x .035 CuNi\n" + "12. 1/4 in. Ref.Cu\n"
                    + "13. 5/16 in. Ref.Cu\n" + "14.  1/2 in. Ref.Cu\n" + "15. 1-1/8 in. x .049 Cu\n");
         
            // used to input value of an integer variable 'tmaterialSelect' from user.
            tmaterialSelect = inFrame.mat_of_Tubing_Inp();
            switch (tmaterialSelect) {
                case 1:
                    tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
                    break;
                case 2:
                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_30_cu;
                    break;
                case 3:
                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Cu;
                    break;
                case 4:
                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_38_cu;
                    break;
                case 5:
                    tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_50_cu;
                    break;
                case 6:
                    tubingMaterialSelect = TubingMaterialSelect.one_fourth_0_20_stnls;
                    break;
                case 7:
                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_Stnls;
                    break;
                case 8:
                    tubingMaterialSelect = TubingMaterialSelect.five_eight_o_38_stnls;
                    break;
                case 9:
                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_49_stnls;
                    break;
                case 10:
                    tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_stnls;
                    break;
                case 11:
                    tubingMaterialSelect = TubingMaterialSelect.five_eight_0_35_cuni;
                    break;
                case 12:
                    tubingMaterialSelect = TubingMaterialSelect.one_four_ref;
                    break;
                case 13:
                    tubingMaterialSelect = TubingMaterialSelect.five_sixteen_ref;
                    break;
                case 14:
                    tubingMaterialSelect = TubingMaterialSelect.one_half_ref;
                    break;
                case 15:
                    tubingMaterialSelect = TubingMaterialSelect.one_one_eight_0_49_cu;
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
                    tubingMaterialSelect = TubingMaterialSelect.o_35_Cu_one_half;
                    break;

            }
        } while (tmaterialSelect < 1 || tmaterialSelect > 14);
        if (tmaterialSelect == 1)
        {
        	 tubingPrice = tubeFeet * rOutput;
        }
        else if (tmaterialSelect == 2)
        {
        	 tubingPrice = tubeFeet * r2Output;
        }
        else if (tmaterialSelect == 3)
        {
             tubingPrice = tubeFeet * r3Output;
        }
        else if (tmaterialSelect == 4)
        {
        	 tubingPrice = tubeFeet * r4Output;
        }
        else if(tmaterialSelect == 5)
        {
        	 tubingPrice = tubeFeet * r5Output;
        }
        else if (tmaterialSelect == 6)
        {
        	 tubingPrice = tubeFeet * r6Output;
        }
        else if (tmaterialSelect == 7)
        {
             tubingPrice = tubeFeet * r7Output;
        }
        else if (tmaterialSelect == 8)
        {
        	 tubingPrice = tubeFeet * r8Output;
        }
        else if (tmaterialSelect == 9)
        {
        	 tubingPrice = tubeFeet * r9Output;
        }
        else if(tmaterialSelect == 10)
        {
        	 tubingPrice = tubeFeet * r10Output;
        }
        else if (tmaterialSelect == 11)
        {
             tubingPrice = tubeFeet * r11Output;
        }
        else if (tmaterialSelect == 12)
        {
          tubingPrice = tubeFeet * r12Output;
        }
        else if(tmaterialSelect == 13)
        {
          tubingPrice = tubeFeet * r13Output;
        }
        else if (tmaterialSelect == 14)
        {
         tubingPrice = tubeFeet * r14Output;
        }
        else if (tmaterialSelect == 15)
        {
         tubingPrice = tubeFeet * r16Output;
        }
        //declares double variable returnBends and sets it equal to 0
        double returnBends = 0;

        //declares double variable num2
        double num2;
        if (rowNumber == 3 || rowNumber == 4 || rowNumber == 5 || rowNumber == 6 || rowNumber == 8) {
            returnBends = finHeight / 1.5 * rowNumber / 2.0 * 0.5 + finHeight / 1.5 * rowNumber / 2.0;
        } else {
            num2 = finHeight / 1.5 * rowNumber / 2.0;
            returnBends = Math.round(num2);
        }
        //prints out number of return bends
        GUI.returnBends.setText(returnBends + "");
        
        rbendsPrice = (returnBends * r15Output);
     
        
       
     
        connectionS = inFrame.connections_num_Inp();
        do {
            //this prints out the menu choices for distributors for the user to choose from
            System.out.println("1. 1/2 in FPT\n" + "2. 3/4 in FPT\n" + "3. 1 in. FPT\n" + "4. 1 in MPT\n"
                    + "5. 1-1/4 in MPT\n" + "6. 1-1/2 in MPTM\n" + "7. 1-1/2 in FPT\n" + "8. 2 in FPT\n"
                    + "9. 2 in MPT\n" + "10. 2.5 in FPT\n" + "11. 2.5 in MPT\n" + "12. 3 in MPT\n" + "13. 4 in MPT\n" + "14. 1-1/2 in Brass\n" + "15. 2-3/8 in Brass\n");
          
            // used to input value of an integer variable 'distributorSelect' from user.
            connectionsSelect = inFrame.size_of_connection_Inp();
            switch (connectionsSelect) {
                case 1:
                    connectionSelection = ConnectionSelection.one_half_fpt;
                    break;
                case 2:
               	 connectionSelection = ConnectionSelection.three_fourth_fpt;
                    break;
                case 3:
               	 connectionSelection = ConnectionSelection.one_fpt;
                    break;
                case 4:
               	 connectionSelection = ConnectionSelection.one_mpt;
                    break;
                case 5:
               	 connectionSelection = ConnectionSelection.one_one_fourth_mpt;
                    break;
                case 6:
               	 connectionSelection = ConnectionSelection.one_one_half_mpt;
                    break;
                case 7:
               	 connectionSelection = ConnectionSelection.one_one_half_fpt;
                    break;
                case 8:
               	 connectionSelection = ConnectionSelection.two_fpt;
                    break;
                case 9:
               	 connectionSelection = ConnectionSelection.two_mpt;
                    break;
                case 10:
               	 connectionSelection = ConnectionSelection.two_five_fpt;
                    break;
                case 11:
               	 connectionSelection = ConnectionSelection.two_five_mpt;
                    break;
                case 12:
               	 connectionSelection = ConnectionSelection.three_mpt;
                    break;
                case 13:
               	 connectionSelection = ConnectionSelection.four_mpt;
                    break;
                case 14:
               	 connectionSelection = ConnectionSelection.one_one_half_brass;
                    break;
                case 15:
               	 connectionSelection = ConnectionSelection.two_three_eighths_brass;
                    break;
               

                default:
                    System.out.println("Invalid choice!");
                    connectionSelection = ConnectionSelection.one_half_fpt;
                    break;

            }
        } while (connectionsSelect < 1 || connectionsSelect > 15);
         
         if (connectionsSelect == 1)
         {
        	 connectionPrice = connectionS * c1Output;
        	 
        	 
         }
         else if (connectionsSelect == 2)
         {
        	 connectionPrice = connectionS * c2Output;
        	 
   
         }
         else if (connectionsSelect == 3)
         {
        	 connectionPrice = connectionS * c3Output;
         }
        	 
        	
         else if (connectionsSelect == 4)
         {
        	connectionPrice = connectionS * c4Output;
        	
         }
         else if (connectionsSelect == 5)
         {
        	 connectionPrice = connectionS * c5Output;
        	 
        	
         }
         else if (connectionsSelect == 6)
         {
        	 connectionPrice = connectionS * c6Output;
        	 
    
       	  
         }
         else if (connectionsSelect == 7)
         {
        	 connectionPrice = connectionS * c7Output;
        	 
        
         }
        		 else if (connectionsSelect == 8)
         {
        			 connectionPrice = connectionS * c8Output;
                	 
                	
         }
         else if (connectionsSelect == 9)
         {
        	 connectionPrice = connectionS * c9Output;
        	 
        	
         }
         else if (connectionsSelect == 10)
         {
        	 connectionPrice = connectionS * c10Output;
        	 
        
         }
         else if (connectionsSelect == 11)
         {
        	 connectionPrice = connectionS * c11Output;
        	 
         }
         else if (connectionsSelect == 12)
         {
        	 connectionPrice = connectionS * c12Output;
        	 
        	
         }
         else if (connectionsSelect == 13)
         {
        	 connectionPrice = connectionS * c13Output;
        	 
        	
         }
         else if (connectionsSelect == 14)
         {
        	 connectionPrice = connectionS * c14Output;
        	 
        	
         }
         else if (connectionsSelect == 15)
         {
        	 connectionPrice = connectionS * c15Output;
        	 
        	 
         }
        //declares double variable frameWeight
        double frameWeight;
        	
        //sets frame weight equal to the fin length times number of rows times 2 plus the fin height times
        // number of rows times 2 and divides it by 12
        frameWeight = ((finLength * rowNumber * 2.0) + (finHeight * rowNumber * 2.0)) / 12.0;
        
        do {
            //this prints out the menu choices for frame material for the user to choose from
            System.out.println("1. SS\n" + "2. Galvnl\n" + "3. Galvns\n");
         
            // used to input value of an integer variable 'fmaterialSelect' from user.
            fmaterialSelect = inFrame.mat_of_frame_Inp();
            switch (fmaterialSelect) {
                case 1:
                   frameMaterial = FrameMaterial.stainless_steel;
                    break;
                case 2:
                    frameMaterial = FrameMaterial.galvanneal;
                    break;
                case 3:
                    frameMaterial = FrameMaterial.galvanized;
                    break;
              

                default:
                    System.out.println("Invalid choice!");
                    frameMaterial = FrameMaterial.stainless_steel;
                    break;

            }
        } while (fmaterialSelect < 1 || fmaterialSelect > 3);
        if (fmaterialSelect == 1)
        {
        	frameCost = frameWeight * fOutput;
        }
        else if (fmaterialSelect == 2)
        {
        	frameCost = frameWeight * f1Output;
        }
        else if (fmaterialSelect == 3)
        {
        	frameCost = frameWeight * f2Output;
        }

        //this declares a string variable called strDouble and formats it as the frame weight rounded to two decimal places
        String strDouble = String.format("%.2f", frameWeight);
        

        //this prints out the value of the frame weight
       
        
      
         GUI.frameWeight.setText(strDouble + "");
        //this declares a double variable called solderNum
        double solderNum;

        //this sets the value of the number of solders to frameWeight times .138
        solderNum = frameWeight * .138;
        

        do {
            //this prints out the menu choices for solder material for the user to choose from
            System.out.println("1. 5% silver\n" + "2. 15% silver\n");
           
            // used to input value of an integer variable 'fmaterialSelect' from user.
            smaterialSelect = inFrame.sil_per_solder_Inp();
            switch (smaterialSelect) {
                case 1:
                   solderMaterial = SolderMaterial.five_silver;
                    break;
                case 2:
                    solderMaterial = SolderMaterial.fifteen_silver;
                    break;

                default:
                    System.out.println("Invalid choice!");
                    solderMaterial = SolderMaterial.five_silver;;
                    break;

            }
        } while (smaterialSelect < 1 || smaterialSelect > 2);
        if (smaterialSelect == 1)
        {
        	solderCost = solderNum * sOutput;
        }
        else if (smaterialSelect == 2)
        {
        	solderCost = solderNum * s1Output;
        }

        //this declares a string variable called strDouble1 and formats it as the number of solders rounded to two decimal places
        String strDouble1 = String.format("%.2f", solderNum);
        
       

        //this prints out the number of solders
        
        GUI.solderNum.setText(strDouble1 + "");
       

        //this declares a double variable called vents and sets it equal to 4
        double vents = 4;

        //this prints out the number of vents
       
        GUI.ventNum.setText(vents + "");
        GUI.headerNum.setText("n/a");
        GUI.headerLength.setText( "n/a");
        GUI.discNum.setText("n/a");
        
        ventsPrice = (vents * s2Output);
      
        System.out.println();
        System.out.println();
        totalPrice = finCost + tubingPrice + rbendsPrice + frameCost + solderCost + ventsPrice + connectionPrice;

        String strDouble19 = String.format("%.2f",  totalPrice);
        laborCost = lOutput;
        finalPrice = (totalPrice * laborCost);
        String strDouble35 = String.format("%.2f", finalPrice);
       
        GUI.totalmaterialsCost.setText(strDouble19 + "");
      
        GUI.totalCost.setText(strDouble35 + "");
        System.out.println(); 
        FileInputStream fis = new FileInputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook (fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(1);
		cell1.setCellValue("BC");
		XSSFCell cell2 = row1.getCell(2);
		cell2.setCellValue(finHeight);
		XSSFCell cell3 = row1.getCell(3);
		cell3.setCellValue(rowNumber);
		XSSFCell cell4 = row1.getCell(4);
		cell4.setCellValue(finperInch);
		XSSFCell cell6 = row1.getCell(6);
		cell6.setCellValue(finLength);      
		XSSFCell cell7 = row1.getCell(7);
		cell7.setCellValue(strDouble19);
		XSSFCell cell8 = row1.getCell(8);
		cell8.setCellValue(strDouble35);
		fis.close();
		FileOutputStream fos =new FileOutputStream("C:\\Users\\gbell\\Desktop\\Surefin Mechanical Quote Program\\print.xlsx");
	        workbook.write(fos);
	        fos.close(); 
        System.out.println(); 
	}
	
}

