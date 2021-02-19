/* Author: Calista Bell
    Company: Surefin Mechanical Equipment
    */
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JComboBox;
import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCoil;
	private JTextField txtFinHeight;
	private JTextField finHeight;
	private JTextField txtFinLength;
	private JTextField finLength;
	private JTextField txtFinsPerInch;
	private JTextField finsperInch;
	private JTextField txtFinWeight;
	private JTextField finWeight;
	private String finWeightStr;
	private JTextField txtOfRows;
	private JTextField rowNum;
	private JTextField txtFinMaterial;
	private JTextField txtFeetOfTubing;
	private JTextField txtTubingMaterial;
	private JTextField tubingFeet;
	private JTextField txtReturnBends;
	private JTextField returnBends;
	private JTextField txtFrameWeight;
	private JTextField frameWeight;
	private JTextField txtFrameMaterial;
	private JTextField txtSilverFor;
	private JTextField txtOfSolders;
	private JTextField txtOfVents;
	private JTextField txtOfHeaders;
	private JTextField txtHeaderLength;
	private JTextField txtOfDiscs;
	private JTextField txtHeaderDiameter;
	private JTextField solderNum;
	private JTextField ventNum;
	private JTextField headerNum;
	private JTextField headerLength;
	private JTextField discNum;
	private JTextField txtTotalMaterial;
	private JTextField totalmaterialsCost;
	private JTextField txtTotalCost;
	private JTextField totalCost;
	private JTextField txtOfConnections;
	private JTextField connectionsNum;
	private JTextField txtConnectionMaterial;
	private JTextField txtDistributor;
	private JTextField txtType;
	private JTextField txtSize;
	private JTextField txtAmount;
	private JComboBox typeofCoil;
	private JComboBox sizeofConnection;
	private JComboBox silverpercentSolder;
	private JComboBox materialofFin;
	private JComboBox materialofFrame;
	private JComboBox materialofTubing;
	private JComboBox diameterofHeader;
	private JComboBox distributors;
	private JComboBox distributorType;
	private JComboBox distributorSize;
	private JComboBox distributorAmount;
	private JTextField txtCaps;
	private JTextField caps;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public GUI() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//this is the choices for coil type dropdownbox labeled typeofCoil
		String[] option = { "Water Coil", "Steam Coil", "Evaporater/DX Coil",
				"Steam Distributing Coil", "Condensing Coil", "Booster Coil" };
		//this is the choices for fin material dropdownbox labeled materialofFin
		String[] finMaterial = { "Aluminum .006", "Aluminum .008", "Aluminum .010",
				"Copper .008", "Copper .010", "Copper .015", "Stainless Steel .006", "Stainless Steel .008", "Stainless Steel .010" };
		//this is the choices for tubingMaterial dropdownbox labeled materialofTubing
		String[] tubingMaterial = { "1/2 x 0.035 cu", "5/8 x 0.030", "5/8 x 0.035 cu", "4. 5/8 x 0.038 cu" + "1-1/8 in x .050 cu", "1/4 in x .020 Stnls" 
				,"5/8 in x .035 Stnls", "5/8 in. x .038 Stnls", "5/8 in. x .049 Stnls", "1-1/8 in. x .049 Stnls", 
				"5/8 x .035 CuNi", "1/4 in. Ref.Cu", "5/16 in. Ref.Cu","1/2 in. Ref.Cu" };
		//this is the choices for connection sizes dropdownbox labeled sizeofConnection
		String[] connectionSize = {"1/2 in FPT" , "3/4 in FPT" , "1 in. FPT" , "1 in MPT"
                , "1-1/4 in MPT" , "1-1/2 in MPTM" , "1-1/2 in FPT" , "2 in FPT"
                ,"2 in MPT" , "2.5 in FPT" , "2.5 in MPT" ,"3 in MPT" ,"4 in MPT","1-1/2 in Brass"
                ,"2-3/8 in Brass"};
		//this is the choices for frameMaterial dropdownbox labeled materialofFrame
		String[] frameMaterial = {"SS", "Gavnl", "Galvns"};
		//this is the choices for silverPercent dropdownbox labeled silverpercentSolder
		String[] silverPercent = {"5% silver", "15% silver"};
		//this is the choices for headerDiameter dropdownbox labeled diameterofHeader
		String[] headerDiameter = {"3/4 in. cu","1 in. cu","1-1/2 in. cu", "2 in. cu",
                "2-1/2 in. cu","3 in. cu","4 in. cu"};
		//this is the choices for distributor dropdownbox labeled distributors
		String [] distributorC = {"1/2 SAE", "5/8 SAE","1/2 ODM","5/8 ODM"
                                ," 7/8 ODM"," 1-1/8 ODM", " 1-3/8 ODM", " 1-5/8 ODM"
                                ,"Type H Vavel","Type M/V Vavel"};
		//this is the choices for distributorTypes dropdownbox labeled tyoeofDistributor
		String [] type = {"1605", "1608", "1104", "1147", "D260", "D262", "1602", "1622", "1112", "1113", "1115", "1116", "1117", "1126", "1128", "1125", "1127", "1143", "1109", "1124", "1192"};
		//this is the choices for disstributor sizes dropdownbox labeled sizeofDistributor
		String [] size = {"1/4 in. ref" , "5/16 in. ref" , "1/2 in. ref"};
		//this is the choices for distributor amounts dropdownbox labeled amountofDistributor
		String [] amount = {"1", "2", "3", "4"};
		
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("86px:grow"),
				ColumnSpec.decode("193px:grow"),
				ColumnSpec.decode("132px:grow"),
				ColumnSpec.decode("86px:grow"),
				ColumnSpec.decode("126px:grow"),
				ColumnSpec.decode("86px:grow"),},
			new RowSpec[] {
				FormSpecs.PARAGRAPH_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				RowSpec.decode("31px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),}));
		
		txtCoil = new JTextField();
		txtCoil.setEditable(false);
		txtCoil.setText("Coil Type");
		txtCoil.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(txtCoil, "2, 2, default, top");
		txtCoil.setColumns(10);	
		typeofCoil = new JComboBox(option);
					
						contentPane.add(typeofCoil, "3, 2, fill, top");
				
				txtConnectionMaterial = new JTextField();
				txtConnectionMaterial.setEditable(false);
				txtConnectionMaterial.setText("Conn. Size");
				contentPane.add(txtConnectionMaterial, "5, 2, fill, default");
				txtConnectionMaterial.setColumns(10);
				
				sizeofConnection = new JComboBox(connectionSize);
				contentPane.add(sizeofConnection, "6, 2, fill, default");
				
				txtFinHeight = new JTextField();
				txtFinHeight.setEditable(false);
				txtFinHeight.setText("Fin Height");
				contentPane.add(txtFinHeight, "2, 4, default, top");
				txtFinHeight.setColumns(10);
				
				finHeight = new JTextField();
				contentPane.add(finHeight, "3, 4, fill, fill");
				finHeight.setColumns(10);
				
				txtFrameWeight = new JTextField();
				txtFrameWeight.setEditable(false);
				txtFrameWeight.setText("Frame Weight");
				contentPane.add(txtFrameWeight, "5, 4, default, top");
				txtFrameWeight.setColumns(10);
				
				frameWeight = new JTextField();
				frameWeight.setEditable(false);
				contentPane.add(frameWeight, "6, 4, fill, top");
				frameWeight.setColumns(10);
				
				txtFinLength = new JTextField();
				txtFinLength.setEditable(false);
				txtFinLength.setText("Fin Length");
				contentPane.add(txtFinLength, "2, 6, default, top");
				txtFinLength.setColumns(10);
				
				finLength = new JTextField();
				contentPane.add(finLength, "3, 6, fill, top");
				finLength.setColumns(10);
				
				txtFrameMaterial = new JTextField();
				txtFrameMaterial.setEditable(false);
				txtFrameMaterial.setText("Frame Material");
				contentPane.add(txtFrameMaterial, "5, 6, fill, default");
				txtFrameMaterial.setColumns(10);
				
			    materialofFrame = new JComboBox(frameMaterial);
				contentPane.add(materialofFrame, "6, 6, fill, top");
				
				txtFinsPerInch = new JTextField();
				txtFinsPerInch.setEditable(false);
				txtFinsPerInch.setText("Fins Per Inch");
				contentPane.add(txtFinsPerInch, "2, 8, default, top");
				txtFinsPerInch.setColumns(10);
				
				finsperInch = new JTextField();
				contentPane.add(finsperInch, "3, 8, fill, top");
				finsperInch.setColumns(10);
				
				txtSilverFor = new JTextField();
				txtSilverFor.setEditable(false);
				txtSilverFor.setText("Solder Silver %");
				contentPane.add(txtSilverFor, "5, 8, fill, default");
				txtSilverFor.setColumns(10);
				
				silverpercentSolder = new JComboBox(silverPercent);
				contentPane.add(silverpercentSolder, "6, 8, fill, default");
				
				txtFinWeight = new JTextField();
				txtFinWeight.setEditable(false);
				txtFinWeight.setText("Fin Weight");
				contentPane.add(txtFinWeight, "2, 10, default, top");
				txtFinWeight.setColumns(10);
				
				finWeight = new JTextField();
				finWeight.setEditable(false);
				contentPane.add(finWeight, "3, 10, fill, top");
				finWeight.setColumns(10);
				finWeight.setText(finWeightStr);
			    
			    txtOfSolders = new JTextField();
			    txtOfSolders.setEditable(false);
			    txtOfSolders.setText("# of Solders");
			    contentPane.add(txtOfSolders, "5, 10, fill, default");
			    txtOfSolders.setColumns(10);
			    
			    solderNum = new JTextField();
			    solderNum.setEditable(false);
			    contentPane.add(solderNum, "6, 10, fill, default");
			    solderNum.setColumns(10);
			    
			    txtOfRows = new JTextField();
			    txtOfRows.setEditable(false);
			    txtOfRows.setText("# of Rows");
			    contentPane.add(txtOfRows, "2, 19, fill, top");
			    txtOfRows.setColumns(10);
			    
			    rowNum = new JTextField();
			    contentPane.add(rowNum, "3, 19, fill, top");
			    rowNum.setColumns(10);
			    
			    txtOfVents = new JTextField();
			    txtOfVents.setEditable(false);
			    txtOfVents.setText("# of Vents");
			    contentPane.add(txtOfVents, "5, 19, fill, default");
			    txtOfVents.setColumns(10);
			    
			    ventNum = new JTextField();
			    ventNum.setEditable(false);
			    contentPane.add(ventNum, "6, 19, fill, default");
			    ventNum.setColumns(10);
			    
			    txtFinMaterial = new JTextField();
			    txtFinMaterial.setEditable(false);
			    txtFinMaterial.setText("Fin Material");
			    contentPane.add(txtFinMaterial, "2, 21, fill, fill");
			    txtFinMaterial.setColumns(10);
			    
			    materialofFin = new JComboBox(finMaterial);
			    contentPane.add(materialofFin, "3, 21, fill, top");
			    
			    txtOfHeaders = new JTextField();
			    txtOfHeaders.setEditable(false);
			    txtOfHeaders.setText("# of Headers");
			    contentPane.add(txtOfHeaders, "5, 21, fill, default");
			    txtOfHeaders.setColumns(10);
			    
			    headerNum = new JTextField();
			    headerNum.setEditable(false);
			    contentPane.add(headerNum, "6, 21, fill, default");
			    headerNum.setColumns(10);
			    
			    txtFeetOfTubing = new JTextField();
			    txtFeetOfTubing.setEditable(false);
			    txtFeetOfTubing.setText("Feet of Tubing");
			    contentPane.add(txtFeetOfTubing, "2, 23");
			    txtFeetOfTubing.setColumns(10);
			    
			    tubingFeet = new JTextField();
			    tubingFeet.setEditable(false);
			    contentPane.add(tubingFeet, "3, 23, fill, top");
			    tubingFeet.setColumns(10);
			    
			    txtHeaderLength = new JTextField();
			    txtHeaderLength.setEditable(false);
			    txtHeaderLength.setText("Header Length");
			    contentPane.add(txtHeaderLength, "5, 23, fill, default");
			    txtHeaderLength.setColumns(10);
			    
			    headerLength = new JTextField();
			    headerLength.setEditable(false);
			    contentPane.add(headerLength, "6, 23, fill, default");
			    headerLength.setColumns(10);
			    
			    txtTubingMaterial = new JTextField();
			    txtTubingMaterial.setEditable(false);
			    txtTubingMaterial.setText("Tubing Material");
			    contentPane.add(txtTubingMaterial, "2, 25, fill, top");
			    txtTubingMaterial.setColumns(10);
				
				materialofTubing = new JComboBox(tubingMaterial);
				contentPane.add(materialofTubing, "3, 25");
				
				txtOfDiscs = new JTextField();
				txtOfDiscs.setEditable(false);
				txtOfDiscs.setText("# of Discs");
				contentPane.add(txtOfDiscs, "5, 25, fill, default");
				txtOfDiscs.setColumns(10);
				
				discNum = new JTextField();
				discNum.setEditable(false);
				contentPane.add(discNum, "6, 25, fill, default");
				discNum.setColumns(10);
				
				txtReturnBends = new JTextField();
				txtReturnBends.setEditable(false);
				txtReturnBends.setText("Return Bends");
				contentPane.add(txtReturnBends, "2, 27, fill, top");
				txtReturnBends.setColumns(10);
				
				returnBends = new JTextField();
				returnBends.setEditable(false);
				contentPane.add(returnBends, "3, 27, fill, top");
				returnBends.setColumns(10);
				
				txtHeaderDiameter = new JTextField();
				txtHeaderDiameter.setEditable(false);
				txtHeaderDiameter.setText("Header Dia");
				contentPane.add(txtHeaderDiameter, "5, 27, fill, default");
				txtHeaderDiameter.setColumns(10);
				
				diameterofHeader = new JComboBox(headerDiameter);
				contentPane.add(diameterofHeader, "6, 27, fill, default");
				
				txtOfConnections = new JTextField();
				txtOfConnections.setEditable(false);
				txtOfConnections.setText("# of Conn.");
				contentPane.add(txtOfConnections, "2, 28, fill, default");
				txtOfConnections.setColumns(10);
				
				connectionsNum = new JTextField();
				contentPane.add(connectionsNum, "3, 28, fill, default");
				connectionsNum.setColumns(10);
				
				txtCaps = new JTextField();
				txtCaps.setEditable(false);
				txtCaps.setText("Caps");
				contentPane.add(txtCaps, "5, 28, fill, default");
				txtCaps.setColumns(10);
				
				caps = new JTextField();
				caps.setEditable(false);
				contentPane.add(caps, "6, 28, fill, default");
				caps.setColumns(10);
				
				txtDistributor = new JTextField();
				txtDistributor.setEditable(false);
				txtDistributor.setText("Distributor");
				contentPane.add(txtDistributor, "2, 32, fill, default");
				txtDistributor.setColumns(10);
				
				distributors = new JComboBox(distributorC);
				contentPane.add(distributors, "3, 32, fill, default");
				
				txtType = new JTextField();
				txtType.setEditable(false);
				txtType.setText("Type");
				contentPane.add(txtType, "2, 34, fill, default");
				txtType.setColumns(10);
				
				distributorType = new JComboBox(type);
				contentPane.add(distributorType, "3, 34, fill, default");
				
				txtTotalMaterial = new JTextField();
				txtTotalMaterial.setEditable(false);
				txtTotalMaterial.setFont(new Font("Tahoma", Font.BOLD, 14));
				txtTotalMaterial.setText("Total Material $");
				contentPane.add(txtTotalMaterial, "5, 34, fill, default");
				txtTotalMaterial.setColumns(10);
				
				totalmaterialsCost = new JTextField();
				totalmaterialsCost.setEditable(false);
				contentPane.add(totalmaterialsCost, "6, 34, fill, default");
				totalmaterialsCost.setColumns(10);
				
				txtSize = new JTextField();
				txtSize.setEditable(false);
				txtSize.setText("Size");
				contentPane.add(txtSize, "2, 36, fill, default");
				txtSize.setColumns(10);
				
				distributorSize = new JComboBox(size);
				contentPane.add(distributorSize, "3, 36, fill, default");
				
				txtTotalCost = new JTextField();
				txtTotalCost.setEditable(false);
				txtTotalCost.setText("Total Cost");
				txtTotalCost.setFont(new Font("Tahoma", Font.BOLD, 14));
				contentPane.add(txtTotalCost, "5, 36, fill, default");
				txtTotalCost.setColumns(10);
				
				totalCost = new JTextField();
				totalCost.setEditable(false);
				contentPane.add(totalCost, "6, 36, fill, default");
				totalCost.setColumns(10);
				
				txtAmount = new JTextField();
				txtAmount.setText("Amount");
				txtAmount.setEditable(false);
				contentPane.add(txtAmount, "2, 38, fill, default");
				txtAmount.setColumns(10);
				
				distributorAmount = new JComboBox(amount);
				contentPane.add(distributorAmount, "3, 38, fill, default");

}

	public double fin_height_Inp() {
		return Double.parseDouble(finHeight.getText());
	}

	public double fin_length_Inp() {
		return Double.parseDouble(finLength.getText());
	}

	public double fin_pinch_Inp() {
		return Double.parseDouble(finsperInch.getText());
	}

	public int row_num_Inp() {
		return Integer.parseInt(rowNum.getText());
	}
	
	public int connections_num_Inp() {
		return Integer.parseInt(connectionsNum.getText());
	}
	
	public int mat_of_fin_Inp() {
		return materialofFin.getSelectedIndex() + 1;
	}

	public int sil_per_solder_Inp() {
		return silverpercentSolder.getSelectedIndex() + 1;
	}
	public int mat_of_frame_Inp() {
		return materialofFrame.getSelectedIndex() + 1;
	}
	
	public int size_of_connection_Inp() {
		return sizeofConnection.getSelectedIndex() + 1;
	}
	public int mat_of_Tubing_Inp() {
		return materialofTubing.getSelectedIndex() + 1;
	}
	public int type_of_coil_Inp() {
		return typeofCoil.getSelectedIndex() + 1;
	}
	
	public int dia_of_header_Inp() {
		return diameterofHeader.getSelectedIndex() + 1;
	}
	public int distributor_Inp() {
		return distributors.getSelectedIndex() + 1;
	}
	
	public int distributor_type_Inp() {
		return distributorType.getSelectedIndex() + 1;
	}
	public int distributor_size_Inp() {
		return distributorSize.getSelectedIndex() + 1;
	}
	public int distributor_amount_Inp() {
		return distributorAmount.getSelectedIndex() + 1;
	}
	

}

