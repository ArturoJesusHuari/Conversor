import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public MenuPrincipal() {
		setForeground(new Color(102, 51, 102));
		setType(Type.POPUP);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\artur\\Downloads\\regla-triangular.png"));
		setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		setResizable(false);
		setTitle("CONVERSOR DE MAGNITUDES");
		setBackground(new Color(51, 51, 51));
		String[] conversores = {"Conversor de monedas", "Conversor de temperatura", "Conversor de masa"};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 299);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textSeleccionar = new JLabel("Seleccionar conversor");
		textSeleccionar.setHorizontalAlignment(SwingConstants.CENTER);
		textSeleccionar.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		textSeleccionar.setForeground(Color.WHITE);
		textSeleccionar.setBounds(198, 75, 163, 14);
		contentPane.add(textSeleccionar);
		
		JComboBox comboConversores = new JComboBox();
		comboConversores.setToolTipText("Selecciona un modo de conversión.");
		comboConversores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboConversores.setFocusable(false);
		comboConversores.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		comboConversores.setForeground(Color.WHITE);
		comboConversores.setBackground(Color.BLACK);
		comboConversores.setBounds(198, 110, 163, 22);
		contentPane.add(comboConversores);
		
		JButton botonAceptar = new JButton("");
		botonAceptar.setFocusTraversalKeysEnabled(false);
		botonAceptar.setFocusPainted(false);
		botonAceptar.setFocusable(false);
		botonAceptar.setIcon(new ImageIcon("D:\\ProyectosConJava\\Conversor\\img\\Continuar.png"));
		botonAceptar.setForeground(new Color(255, 255, 255));
		botonAceptar.setBorder(null);
		botonAceptar.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		botonAceptar.setBackground(new Color(51, 51, 51));
		botonAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				ConvertidorGenerico convertidor = new ConvertidorGenerico();
				try {
					convertidor.setVisible(true);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
				switch (comboConversores.getSelectedIndex()) {
				case 0: {
					convertidor.contextoConversorMonedas();
					break;
				}
				case 1: {
					convertidor.contextoConversorTemperaturas();
					break;
				}
				case 2: {
					convertidor.contextoConversorMasa();
					break;
				}
				default:
					break;
				}
			}
		});
		botonAceptar.setBounds(364, 216, 33, 33);
		contentPane.add(botonAceptar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 139, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton calculadora = new JButton("Calculadora");
		calculadora.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Calculadora frame = new Calculadora();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		calculadora.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		calculadora.setFocusPainted(false);
		calculadora.setFocusTraversalKeysEnabled(false);
		calculadora.setFocusable(false);
		calculadora.setForeground(new Color(255, 255, 255));
		calculadora.setIcon(new ImageIcon("D:\\ProyectosConJava\\Conversor\\img\\calculadora.png"));
		calculadora.setBorder(null);
		calculadora.setBackground(new Color(0, 0, 0));
		calculadora.setBounds(10, 38, 119, 38);
		panel.add(calculadora);
		
		JLabel lblNewLabel = new JLabel("Herramientas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 102, 16);
		panel.add(lblNewLabel);
		
		JButton prefijosInternacionales = new JButton("Prefijos decimales");
		prefijosInternacionales.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Prefijos frame = new Prefijos();
					frame.setVisible(true);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		prefijosInternacionales.setIcon(new ImageIcon("D:\\ProyectosConJava\\Conversor\\img\\SI.png"));
		prefijosInternacionales.setForeground(Color.WHITE);
		prefijosInternacionales.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		prefijosInternacionales.setFocusable(false);
		prefijosInternacionales.setFocusTraversalKeysEnabled(false);
		prefijosInternacionales.setFocusPainted(false);
		prefijosInternacionales.setBorder(null);
		prefijosInternacionales.setBackground(Color.BLACK);
		prefijosInternacionales.setBounds(10, 83, 119, 38);
		panel.add(prefijosInternacionales);
		//Conversores en comboConversores
		for(String conversor:conversores) {
			comboConversores.addItem(conversor);
		}
		
	}
}
