import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Dialog.ModalExclusionType;

public class Prefijos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prefijos frame = new Prefijos();
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
	public Prefijos() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Prefijos");
		setBackground(new Color(0, 0, 0));
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 100, 450, 585);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prefijos del Sistema Internacional");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBorder(null);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Equivalencia decimal");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(227, 27, 207, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("1 000 000 000 000 000 000 000 000");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(227, 51, 207, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Factor");
		lblNewLabel_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_2.setBackground(Color.GRAY);
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(144, 27, 87, 18);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Símbolo");
		lblNewLabel_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_2_1.setBackground(Color.GRAY);
		lblNewLabel_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1.setOpaque(true);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(73, 27, 73, 18);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Prefijo   ");
		lblNewLabel_1_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_1_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1.setOpaque(true);
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setBounds(0, 27, 87, 18);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("yotta");
		lblNewLabel_1_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1.setBounds(0, 51, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Y");
		lblNewLabel_1_2_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2.setBounds(73, 51, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("10");
		lblNewLabel_1_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setBounds(144, 51, 73, 14);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("24");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2.setBounds(185, 43, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("1 000 000 000 000 000 000 000");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(227, 74, 207, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("zetta");
		lblNewLabel_1_2_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_1.setBounds(0, 74, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("Z");
		lblNewLabel_1_2_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_1.setBounds(73, 74, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("10");
		lblNewLabel_1_2_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setBounds(144, 74, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("21");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_1.setBounds(185, 66, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("1 000 000 000 000 000 000");
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(227, 99, 207, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_1_1_1_2 = new JLabel("exa");
		lblNewLabel_1_2_1_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_2.setBounds(0, 99, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_2);
		
		JLabel lblNewLabel_1_2_1_2_2 = new JLabel("E");
		lblNewLabel_1_2_1_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_2.setBounds(73, 99, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_2);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("10");
		lblNewLabel_1_2_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_2.setBounds(144, 99, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("18");
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_2.setBounds(185, 91, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("1 000 000 000 000 000");
		lblNewLabel_1_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setBounds(227, 124, 207, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_2_1_1_1_3 = new JLabel("peta");
		lblNewLabel_1_2_1_1_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_3.setBounds(0, 124, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_3);
		
		JLabel lblNewLabel_1_2_1_2_3 = new JLabel("P");
		lblNewLabel_1_2_1_2_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_3.setBounds(73, 124, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_3);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("10");
		lblNewLabel_1_2_2_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_3.setBounds(144, 124, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("15");
		lblNewLabel_2_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_3.setBounds(185, 116, 46, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("1 000 000 000 000");
		lblNewLabel_1_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4.setBounds(227, 149, 207, 14);
		contentPane.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_2_1_1_1_4 = new JLabel("tera");
		lblNewLabel_1_2_1_1_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_4.setBounds(0, 149, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_4);
		
		JLabel lblNewLabel_1_2_1_2_4 = new JLabel("T");
		lblNewLabel_1_2_1_2_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_4.setBounds(73, 149, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_4);
		
		JLabel lblNewLabel_1_2_2_4 = new JLabel("10");
		lblNewLabel_1_2_2_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_4.setBounds(144, 149, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("12");
		lblNewLabel_2_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_4.setBounds(185, 141, 46, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("1 000 000 000");
		lblNewLabel_1_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_5.setBounds(227, 174, 207, 14);
		contentPane.add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_2_1_1_1_5 = new JLabel("giga");
		lblNewLabel_1_2_1_1_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_5.setBounds(0, 174, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_5);
		
		JLabel lblNewLabel_1_2_1_2_5 = new JLabel("G");
		lblNewLabel_1_2_1_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_5.setBounds(73, 174, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_5);
		
		JLabel lblNewLabel_1_2_2_5 = new JLabel("10");
		lblNewLabel_1_2_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_5.setBounds(144, 174, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("9");
		lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_5.setBounds(185, 166, 46, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("1 000 000");
		lblNewLabel_1_1_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_6.setBounds(227, 199, 207, 14);
		contentPane.add(lblNewLabel_1_1_6);
		
		JLabel lblNewLabel_1_2_1_1_1_6 = new JLabel("mega");
		lblNewLabel_1_2_1_1_1_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_6.setBounds(0, 199, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_6);
		
		JLabel lblNewLabel_1_2_1_2_6 = new JLabel("M");
		lblNewLabel_1_2_1_2_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_6.setBounds(73, 199, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_6);
		
		JLabel lblNewLabel_1_2_2_6 = new JLabel("10");
		lblNewLabel_1_2_2_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_6.setBounds(144, 199, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("6");
		lblNewLabel_2_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_6.setBounds(185, 191, 46, 14);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_1_1_7 = new JLabel("1 000");
		lblNewLabel_1_1_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_7.setBounds(227, 224, 207, 14);
		contentPane.add(lblNewLabel_1_1_7);
		
		JLabel lblNewLabel_1_2_1_1_1_7 = new JLabel("kilo");
		lblNewLabel_1_2_1_1_1_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_7.setBounds(0, 224, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_7);
		
		JLabel lblNewLabel_1_2_1_2_7 = new JLabel("k");
		lblNewLabel_1_2_1_2_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_7.setBounds(73, 224, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_7);
		
		JLabel lblNewLabel_1_2_2_7 = new JLabel("10");
		lblNewLabel_1_2_2_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_7.setBounds(144, 224, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_7);
		
		JLabel lblNewLabel_2_7 = new JLabel("3");
		lblNewLabel_2_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_7.setBounds(185, 216, 46, 14);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_1_1_8 = new JLabel("100");
		lblNewLabel_1_1_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_8.setBounds(227, 249, 207, 14);
		contentPane.add(lblNewLabel_1_1_8);
		
		JLabel lblNewLabel_1_2_1_1_1_8 = new JLabel("hecto");
		lblNewLabel_1_2_1_1_1_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_8.setBounds(0, 249, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_8);
		
		JLabel lblNewLabel_1_2_1_2_8 = new JLabel("h");
		lblNewLabel_1_2_1_2_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_8.setBounds(73, 249, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_8);
		
		JLabel lblNewLabel_1_2_2_8 = new JLabel("10");
		lblNewLabel_1_2_2_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_8.setBounds(144, 249, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_8);
		
		JLabel lblNewLabel_2_8 = new JLabel("2");
		lblNewLabel_2_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_8.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_8.setBounds(185, 241, 46, 14);
		contentPane.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_1_1_9 = new JLabel("10");
		lblNewLabel_1_1_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_9.setBounds(227, 274, 207, 14);
		contentPane.add(lblNewLabel_1_1_9);
		
		JLabel lblNewLabel_1_2_1_1_1_9 = new JLabel("deca");
		lblNewLabel_1_2_1_1_1_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_9.setBounds(0, 274, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_9);
		
		JLabel lblNewLabel_1_2_1_2_9 = new JLabel("da");
		lblNewLabel_1_2_1_2_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_9.setBounds(73, 274, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_9);
		
		JLabel lblNewLabel_1_2_2_9 = new JLabel("10");
		lblNewLabel_1_2_2_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_9.setBounds(144, 274, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_9);
		
		JLabel lblNewLabel_2_9 = new JLabel("1");
		lblNewLabel_2_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_9.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_9.setBounds(185, 266, 46, 14);
		contentPane.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_1_1_10 = new JLabel("0.1");
		lblNewLabel_1_1_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_10.setBounds(227, 299, 207, 14);
		contentPane.add(lblNewLabel_1_1_10);
		
		JLabel lblNewLabel_1_2_1_1_1_10 = new JLabel("deci");
		lblNewLabel_1_2_1_1_1_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_10.setBounds(0, 299, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_10);
		
		JLabel lblNewLabel_1_2_1_2_10 = new JLabel("d");
		lblNewLabel_1_2_1_2_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_10.setBounds(73, 299, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_10);
		
		JLabel lblNewLabel_1_2_2_10 = new JLabel("10");
		lblNewLabel_1_2_2_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_10.setBounds(144, 299, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_10);
		
		JLabel lblNewLabel_2_10 = new JLabel("-1");
		lblNewLabel_2_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_10.setBounds(185, 291, 46, 14);
		contentPane.add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("0.01");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(227, 322, 207, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_1_1 = new JLabel("centi");
		lblNewLabel_1_2_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_1_1.setBounds(0, 322, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_2_1_1 = new JLabel("c");
		lblNewLabel_1_2_1_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_1_1.setBounds(73, 322, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("10");
		lblNewLabel_1_2_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1.setBounds(144, 322, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("-2");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_1_1.setBounds(185, 314, 46, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("0.001");
		lblNewLabel_1_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setBounds(227, 347, 207, 14);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1 = new JLabel("mili");
		lblNewLabel_1_2_1_1_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_2_1.setBounds(0, 347, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_2_1);
		
		JLabel lblNewLabel_1_2_1_2_2_1 = new JLabel("m");
		lblNewLabel_1_2_1_2_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_2_1.setBounds(73, 347, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_2_1 = new JLabel("10");
		lblNewLabel_1_2_2_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_2_1.setBounds(144, 347, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("-3");
		lblNewLabel_2_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_2_1.setBounds(185, 339, 46, 14);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("0.000 001");
		lblNewLabel_1_1_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1.setBounds(227, 372, 207, 14);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_2_1_1_1_3_1 = new JLabel("micro");
		lblNewLabel_1_2_1_1_1_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_3_1.setBounds(0, 372, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_3_1);
		
		JLabel lblNewLabel_1_2_1_2_3_1 = new JLabel("μ");
		lblNewLabel_1_2_1_2_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_3_1.setBounds(73, 372, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_3_1);
		
		JLabel lblNewLabel_1_2_2_3_1 = new JLabel("10");
		lblNewLabel_1_2_2_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_3_1.setBounds(144, 372, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_3_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("-6");
		lblNewLabel_2_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_3_1.setBounds(185, 364, 46, 14);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_1_1_4_1 = new JLabel("0.000 000 001");
		lblNewLabel_1_1_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4_1.setBounds(227, 397, 207, 14);
		contentPane.add(lblNewLabel_1_1_4_1);
		
		JLabel lblNewLabel_1_2_1_1_1_4_1 = new JLabel("nano");
		lblNewLabel_1_2_1_1_1_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_4_1.setBounds(0, 397, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_4_1);
		
		JLabel lblNewLabel_1_2_1_2_4_1 = new JLabel("n");
		lblNewLabel_1_2_1_2_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_4_1.setBounds(73, 397, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_4_1);
		
		JLabel lblNewLabel_1_2_2_4_1 = new JLabel("10");
		lblNewLabel_1_2_2_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_4_1.setBounds(144, 397, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_4_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("-9");
		lblNewLabel_2_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_4_1.setBounds(185, 389, 46, 14);
		contentPane.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_1_1_5_1 = new JLabel("0.000 000 000 001");
		lblNewLabel_1_1_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_5_1.setBounds(227, 422, 207, 14);
		contentPane.add(lblNewLabel_1_1_5_1);
		
		JLabel lblNewLabel_1_2_1_1_1_5_1 = new JLabel("pico");
		lblNewLabel_1_2_1_1_1_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_5_1.setBounds(0, 422, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_5_1);
		
		JLabel lblNewLabel_1_2_1_2_5_1 = new JLabel("p");
		lblNewLabel_1_2_1_2_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_5_1.setBounds(73, 422, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_5_1);
		
		JLabel lblNewLabel_1_2_2_5_1 = new JLabel("10");
		lblNewLabel_1_2_2_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_5_1.setBounds(144, 422, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_5_1);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("-12");
		lblNewLabel_2_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_5_1.setBounds(185, 414, 46, 14);
		contentPane.add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_1_1_6_1 = new JLabel("0.000 000 000 000 001");
		lblNewLabel_1_1_6_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_6_1.setBounds(227, 447, 207, 14);
		contentPane.add(lblNewLabel_1_1_6_1);
		
		JLabel lblNewLabel_1_2_1_1_1_6_1 = new JLabel("femto");
		lblNewLabel_1_2_1_1_1_6_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_6_1.setBounds(0, 447, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_6_1);
		
		JLabel lblNewLabel_1_2_1_2_6_1 = new JLabel("f");
		lblNewLabel_1_2_1_2_6_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_6_1.setBounds(73, 447, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_6_1);
		
		JLabel lblNewLabel_1_2_2_6_1 = new JLabel("10");
		lblNewLabel_1_2_2_6_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_6_1.setBounds(144, 447, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_6_1);
		
		JLabel lblNewLabel_2_6_1 = new JLabel("-15");
		lblNewLabel_2_6_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_6_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_6_1.setBounds(185, 439, 46, 14);
		contentPane.add(lblNewLabel_2_6_1);
		
		JLabel lblNewLabel_1_1_7_1 = new JLabel("0.000 000 000 000 000 001");
		lblNewLabel_1_1_7_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_7_1.setBounds(227, 472, 207, 14);
		contentPane.add(lblNewLabel_1_1_7_1);
		
		JLabel lblNewLabel_1_2_1_1_1_7_1 = new JLabel("atto");
		lblNewLabel_1_2_1_1_1_7_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_7_1.setBounds(0, 472, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_7_1);
		
		JLabel lblNewLabel_1_2_1_2_7_1 = new JLabel("a");
		lblNewLabel_1_2_1_2_7_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_7_1.setBounds(73, 472, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_7_1);
		
		JLabel lblNewLabel_1_2_2_7_1 = new JLabel("10");
		lblNewLabel_1_2_2_7_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_7_1.setBounds(144, 472, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_7_1);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("-18");
		lblNewLabel_2_7_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_7_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_7_1.setBounds(185, 464, 46, 14);
		contentPane.add(lblNewLabel_2_7_1);
		
		JLabel lblNewLabel_1_1_8_1 = new JLabel("0.000 000 000 000 000 000 001");
		lblNewLabel_1_1_8_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_8_1.setBounds(227, 497, 207, 14);
		contentPane.add(lblNewLabel_1_1_8_1);
		
		JLabel lblNewLabel_1_2_1_1_1_8_1 = new JLabel("zepto");
		lblNewLabel_1_2_1_1_1_8_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_8_1.setBounds(0, 497, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_8_1);
		
		JLabel lblNewLabel_1_2_1_2_8_1 = new JLabel("z");
		lblNewLabel_1_2_1_2_8_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_8_1.setBounds(73, 497, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_8_1);
		
		JLabel lblNewLabel_1_2_2_8_1 = new JLabel("10");
		lblNewLabel_1_2_2_8_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_8_1.setBounds(144, 497, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_8_1);
		
		JLabel lblNewLabel_2_8_1 = new JLabel("-21");
		lblNewLabel_2_8_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_8_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_8_1.setBounds(185, 489, 46, 14);
		contentPane.add(lblNewLabel_2_8_1);
		
		JLabel lblNewLabel_1_1_9_1 = new JLabel("0.000 000 000 000 000 000 000 001");
		lblNewLabel_1_1_9_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_9_1.setBounds(227, 522, 207, 14);
		contentPane.add(lblNewLabel_1_1_9_1);
		
		JLabel lblNewLabel_1_2_1_1_1_9_1 = new JLabel("yocto");
		lblNewLabel_1_2_1_1_1_9_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_9_1.setBounds(0, 522, 73, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_9_1);
		
		JLabel lblNewLabel_1_2_1_2_9_1 = new JLabel("y");
		lblNewLabel_1_2_1_2_9_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_2_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_9_1.setBounds(73, 522, 60, 14);
		contentPane.add(lblNewLabel_1_2_1_2_9_1);
		
		JLabel lblNewLabel_1_2_2_9_1 = new JLabel("10");
		lblNewLabel_1_2_2_9_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_2_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_9_1.setBounds(144, 522, 73, 14);
		contentPane.add(lblNewLabel_1_2_2_9_1);
		
		JLabel lblNewLabel_2_9_1 = new JLabel("-24");
		lblNewLabel_2_9_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_9_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_2_9_1.setBounds(185, 514, 46, 14);
		contentPane.add(lblNewLabel_2_9_1);
	}
}
