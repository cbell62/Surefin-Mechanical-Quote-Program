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
	private JTextField textField;
	private JTextField txtFinLength;
	private JTextField textField_2;
	private JTextField txtFinsPerInch;
	private JTextField textField_3;
	private JTextField txtFinWeight;
	private JTextField textField_4;
	private JTextField txtOfRows;
	private JTextField textField_5;
	private JTextField txtFinMaterial;
	private JTextField txtFeetOfTubing;
	private JTextField txtTubingMaterial;
	private JTextField textField_1;
	private JComboBox comboBox_2;
	private JTextField txtReturnBends;
	private JTextField txtConnections;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtFrameWeight;
	private JTextField textField_8;
	private JComboBox comboBox_3;
	private Component comboBox_3_1;
	private JTextField txtFrameMaterial;
	private JTextField txtSilverFor;
	private JComboBox comboBox_4;
	private JTextField txtOfSolders;
	private JTextField txtOfVents;
	private JTextField txtOfHeaders;
	private JTextField txtHeaderLength;
	private JTextField txtOfDiscs;
	private JTextField txtHeaderDiameter;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JComboBox comboBox_5;
	private Component comboBox_4_1;
	private Component comboBox_2_1;
	private JTextField txtTotalMaterial;
	private JTextField textField_15;
	private JTextField txtTotalCost;
	private JTextField textField_16;
	private JTextField txtOfConnections;
	private JTextField textField_17;
	private Component comboBox_5_1;
	private JComboBox comboBox_6;
	private JTextField txtConnectionMaterial;

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
		setBounds(100, 100, 745, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		String[] option = { "Water Coil", "Steam Coil", "Evaporater/DX Coil",
				"Steam Distributing Coil", "Condensing Coil", "Booster Coil" };
		String[] finMaterial = { "Aluminum .006", "Aluminum .008", "Aluminum .010",
				"Copper .008", "Copper .010", "Copper .015", "Stainless Steel .006", "Stainless Steel .008", "Stainless Steel .010" };
		String[] tubingMaterial = { "1/2 x 0.035 cu", "5/8 x 0.030", "5/8 x 0.035 cu", "4. 5/8 x 0.038 cu" + "1-1/8 in x .050 cu", "1/4 in x .020 Stnls" 
				,"5/8 in x .035 Stnls", "5/8 in. x .038 Stnls", "5/8 in. x .049 Stnls", "1-1/8 in. x .049 Stnls", 
				"5/8 x .035 CuNi", "1/4 in. Ref.Cu", "5/16 in. Ref.Cu","1/2 in. Ref.Cu" };
		String[] connectionSize = {"1/2 in FPT" , "3/4 in FPT" , "1 in. FPT" , "1 in MPT"
                , "1-1/4 in MPT" , "1-1/2 in MPTM" , "1-1/2 in FPT" , "2 in FPT"
                ,"2 in MPT" , "2.5 in FPT" , "2.5 in MPT" ,"3 in MPT" ,"4 in MPT","1-1/2 in Brass"
                ,"2-3/8 in Brass"};
		String[] frameMaterial = {"SS", "Gavnl", "Galvns"};
		String[] silverPercent = {"5% silver", "15% silver"};
		String[] headerDiameter = {"3/4 in. cu","1 in. cu","1-1/2 in. cu", "2 in. cu",
                "2-1/2 in. cu","3 in. cu","4 in. cu"};
		Component comboBox = null;
		Component comboBox_1=null;
		Component comboBox_2=null;
		Component comboBox_3 = null;
		Component comboBox_4 = null;
		Component comboBox_5 = null;
		Component comboBox_6=null;
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("86px:grow"),
				ColumnSpec.decode("193px:grow"),
				ColumnSpec.decode("132px"),
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
				FormSpecs.DEFAULT_ROWSPEC,
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
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),}));
		
		txtCoil = new JTextField();
		txtCoil.setEditable(false);
		txtCoil.setText("Coil Type");
		txtCoil.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(txtCoil, "2, 2, left, top");
		txtCoil.setColumns(10);
				
					comboBox = new JComboBox(option);
					
						contentPane.add(comboBox, "3, 2, fill, top");
				
				txtConnectionMaterial = new JTextField();
				txtConnectionMaterial.setEditable(false);
				txtConnectionMaterial.setText("Conn. Size");
				contentPane.add(txtConnectionMaterial, "5, 2, fill, default");
				txtConnectionMaterial.setColumns(10);
				
				comboBox_6 = new JComboBox(connectionSize);
				contentPane.add(comboBox_6, "6, 2, fill, default");
				
				txtFinHeight = new JTextField();
				txtFinHeight.setEditable(false);
				txtFinHeight.setText("Fin Height");
				contentPane.add(txtFinHeight, "2, 4, left, top");
				txtFinHeight.setColumns(10);
				
				textField = new JTextField();
				contentPane.add(textField, "3, 4, fill, fill");
				textField.setColumns(10);
				
				txtFrameWeight = new JTextField();
				txtFrameWeight.setEditable(false);
				txtFrameWeight.setText("Frame Weight");
				contentPane.add(txtFrameWeight, "5, 4, left, top");
				txtFrameWeight.setColumns(10);
				
				textField_8 = new JTextField();
				textField_8.setEditable(false);
				contentPane.add(textField_8, "6, 4, fill, top");
				textField_8.setColumns(10);
				
				txtFinLength = new JTextField();
				txtFinLength.setEditable(false);
				txtFinLength.setText("Fin Length");
				contentPane.add(txtFinLength, "2, 6, left, top");
				txtFinLength.setColumns(10);
				
				textField_2 = new JTextField();
				contentPane.add(textField_2, "3, 6, fill, top");
				textField_2.setColumns(10);
				
				txtFrameMaterial = new JTextField();
				txtFrameMaterial.setEditable(false);
				txtFrameMaterial.setText("Frame Material");
				contentPane.add(txtFrameMaterial, "5, 6, fill, default");
				txtFrameMaterial.setColumns(10);
				
				comboBox_3_1 = new JComboBox(frameMaterial);
				contentPane.add(comboBox_3_1, "6, 6, fill, top");
				
				txtFinsPerInch = new JTextField();
				txtFinsPerInch.setEditable(false);
				txtFinsPerInch.setText("Fins Per Inch");
				contentPane.add(txtFinsPerInch, "2, 8, fill, top");
				txtFinsPerInch.setColumns(10);
				
				textField_3 = new JTextField();
				contentPane.add(textField_3, "3, 8, fill, top");
				textField_3.setColumns(10);
				
				txtSilverFor = new JTextField();
				txtSilverFor.setEditable(false);
				txtSilverFor.setText("Solder Silver %");
				contentPane.add(txtSilverFor, "5, 8, fill, default");
				txtSilverFor.setColumns(10);
				
				comboBox_4_1 = new JComboBox(silverPercent);
				contentPane.add(comboBox_4_1, "6, 8, fill, default");
				
				txtFinWeight = new JTextField();
				txtFinWeight.setEditable(false);
				txtFinWeight.setText("Fin Weight");
				contentPane.add(txtFinWeight, "2, 10, fill, top");
				txtFinWeight.setColumns(10);
				
				textField_4 = new JTextField();
				textField_4.setEditable(false);
				contentPane.add(textField_4, "3, 10, fill, top");
				textField_4.setColumns(10);
			    
			    txtOfSolders = new JTextField();
			    txtOfSolders.setEditable(false);
			    txtOfSolders.setText("# of Solders");
			    contentPane.add(txtOfSolders, "5, 10, fill, default");
			    txtOfSolders.setColumns(10);
			    
			    textField_9 = new JTextField();
			    textField_9.setEditable(false);
			    contentPane.add(textField_9, "6, 10, fill, default");
			    textField_9.setColumns(10);
			    
			    txtOfRows = new JTextField();
			    txtOfRows.setEditable(false);
			    txtOfRows.setText("# of Rows");
			    contentPane.add(txtOfRows, "2, 19, fill, top");
			    txtOfRows.setColumns(10);
			    
			    textField_5 = new JTextField();
			    contentPane.add(textField_5, "3, 19, fill, top");
			    textField_5.setColumns(10);
			    
			    txtOfVents = new JTextField();
			    txtOfVents.setEditable(false);
			    txtOfVents.setText("# of Vents");
			    contentPane.add(txtOfVents, "5, 19, fill, default");
			    txtOfVents.setColumns(10);
			    
			    textField_10 = new JTextField();
			    textField_10.setEditable(false);
			    contentPane.add(textField_10, "6, 19, fill, default");
			    textField_10.setColumns(10);
			    
			    txtFinMaterial = new JTextField();
			    txtFinMaterial.setEditable(false);
			    txtFinMaterial.setText("Fin Material");
			    contentPane.add(txtFinMaterial, "2, 21, fill, fill");
			    txtFinMaterial.setColumns(10);
			    
			    comboBox_1 = new JComboBox(finMaterial);
			    contentPane.add(comboBox_1, "3, 21, fill, top");
			    
			    txtOfHeaders = new JTextField();
			    txtOfHeaders.setEditable(false);
			    txtOfHeaders.setText("# of Headers");
			    contentPane.add(txtOfHeaders, "5, 21, fill, default");
			    txtOfHeaders.setColumns(10);
			    
			    textField_11 = new JTextField();
			    textField_11.setEditable(false);
			    contentPane.add(textField_11, "6, 21, fill, default");
			    textField_11.setColumns(10);
			    
			    txtFeetOfTubing = new JTextField();
			    txtFeetOfTubing.setEditable(false);
			    txtFeetOfTubing.setText("Feet of Tubing");
			    contentPane.add(txtFeetOfTubing, "2, 23, left, default");
			    txtFeetOfTubing.setColumns(10);
			    
			    textField_1 = new JTextField();
			    textField_1.setEditable(false);
			    contentPane.add(textField_1, "3, 23, fill, top");
			    textField_1.setColumns(10);
			    
			    txtHeaderLength = new JTextField();
			    txtHeaderLength.setEditable(false);
			    txtHeaderLength.setText("Header Length");
			    contentPane.add(txtHeaderLength, "5, 23, fill, default");
			    txtHeaderLength.setColumns(10);
			    
			    textField_12 = new JTextField();
			    textField_12.setEditable(false);
			    contentPane.add(textField_12, "6, 23, fill, default");
			    textField_12.setColumns(10);
			    
			    txtTubingMaterial = new JTextField();
			    txtTubingMaterial.setEditable(false);
			    txtTubingMaterial.setText("Tubing Material");
			    contentPane.add(txtTubingMaterial, "2, 25, fill, top");
			    txtTubingMaterial.setColumns(10);
				
				comboBox_2_1 = new JComboBox(tubingMaterial);
				contentPane.add(comboBox_2_1, "3, 25, left, top");
				
				txtOfDiscs = new JTextField();
				txtOfDiscs.setEditable(false);
				txtOfDiscs.setText("# of Discs");
				contentPane.add(txtOfDiscs, "5, 25, fill, default");
				txtOfDiscs.setColumns(10);
				
				textField_13 = new JTextField();
				textField_13.setEditable(false);
				contentPane.add(textField_13, "6, 25, fill, default");
				textField_13.setColumns(10);
				
				txtReturnBends = new JTextField();
				txtReturnBends.setEditable(false);
				txtReturnBends.setText("Return Bends");
				contentPane.add(txtReturnBends, "2, 27, fill, top");
				txtReturnBends.setColumns(10);
				
				textField_6 = new JTextField();
				textField_6.setEditable(false);
				contentPane.add(textField_6, "3, 27, fill, top");
				textField_6.setColumns(10);
				
				txtHeaderDiameter = new JTextField();
				txtHeaderDiameter.setEditable(false);
				txtHeaderDiameter.setText("Header Dia");
				contentPane.add(txtHeaderDiameter, "5, 27, fill, default");
				txtHeaderDiameter.setColumns(10);
				
				comboBox_5_1 = new JComboBox(headerDiameter);
				contentPane.add(comboBox_5_1, "6, 27, fill, default");
				
				txtOfConnections = new JTextField();
				txtOfConnections.setEditable(false);
				txtOfConnections.setText("# of Conn.");
				contentPane.add(txtOfConnections, "2, 28, fill, default");
				txtOfConnections.setColumns(10);
				
				textField_17 = new JTextField();
				contentPane.add(textField_17, "3, 28, fill, default");
				textField_17.setColumns(10);
				
				txtTotalMaterial = new JTextField();
				txtTotalMaterial.setEditable(false);
				txtTotalMaterial.setFont(new Font("Tahoma", Font.BOLD, 14));
				txtTotalMaterial.setText("Total Material $");
				contentPane.add(txtTotalMaterial, "6, 30, fill, default");
				txtTotalMaterial.setColumns(10);
				
				textField_15 = new JTextField();
				textField_15.setEditable(false);
				contentPane.add(textField_15, "7, 30, fill, default");
				textField_15.setColumns(10);
				
				txtTotalCost = new JTextField();
				txtTotalCost.setEditable(false);
				txtTotalCost.setText("Total Cost");
				txtTotalCost.setFont(new Font("Tahoma", Font.BOLD, 14));
				contentPane.add(txtTotalCost, "6, 32, fill, default");
				txtTotalCost.setColumns(10);
				
				textField_16 = new JTextField();
				textField_16.setEditable(false);
				contentPane.add(textField_16, "7, 32, fill, default");
				textField_16.setColumns(10);
				
				txtConnections = new JTextField();
				txtConnections.setEditable(false);
				txtConnections.setText("Connections");
				contentPane.add(txtConnections, "2, 36, fill, top");
				txtConnections.setColumns(10);
				
				textField_7 = new JTextField();
				contentPane.add(textField_7, "3, 36, fill, top");
				textField_7.setColumns(10);
				
				
		
}
}

