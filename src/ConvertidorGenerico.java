import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class ConvertidorGenerico extends JFrame {

	private JPanel contentPane;
	private JTextField entrada;
	private JComboBox unidadSalida,unidadEntrada;
	private JButton convertir;
	private JLabel salida;
	private String[] listaUnidades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertidorGenerico frame = new ConvertidorGenerico();
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
	public ConvertidorGenerico() {
		setTitle("CONVERSOR");
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(105, 105, 105));
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 239);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.unidadSalida = new JComboBox();
		unidadSalida.setFocusTraversalKeysEnabled(false);
		unidadSalida.setFocusable(false);
		unidadSalida.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		unidadSalida.setForeground(new Color(255, 255, 255));
		unidadSalida.setBackground(new Color(0, 0, 0));
		unidadSalida.setBounds(261, 56, 138, 22);
		contentPane.add(unidadSalida);
		
		this.unidadEntrada = new JComboBox();
		unidadEntrada.setFocusTraversalKeysEnabled(false);
		unidadEntrada.setFocusable(false);
		unidadEntrada.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		unidadEntrada.setForeground(new Color(255, 255, 255));
		unidadEntrada.setBackground(new Color(0, 0, 0));
		unidadEntrada.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				asignarListaAComboSalida(unidadEntrada.getSelectedIndex());
			}
		});
		unidadEntrada.setBounds(26, 56, 138, 22);
		contentPane.add(unidadEntrada);
		
		entrada = new JTextField();
		entrada.setBorder(new LineBorder(new Color(171, 173, 179)));
		entrada.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		entrada.setForeground(new Color(255, 255, 255));
		entrada.setBackground(new Color(105, 105, 105));
		entrada.setBounds(50, 100, 86, 20);
		contentPane.add(entrada);
		entrada.setColumns(10);
		
		salida = new JLabel("");
		salida.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		salida.setForeground(new Color(255, 255, 255));
		salida.setBackground(new Color(105, 105, 105));
		salida.setBounds(309, 106, 46, 14);
		contentPane.add(salida);
		
		this.convertir = new JButton("Convertir");
		convertir.setBorder(null);
		convertir.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		convertir.setForeground(new Color(255, 255, 255));
		convertir.setBackground(new Color(0, 0, 0));
		convertir.setBounds(172, 147, 89, 23);
		contentPane.add(convertir);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(51, 51, 51));
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setIcon(new ImageIcon("D:\\ProyectosConJava\\Conversor\\img\\Retroceder.png"));
		btnNewButton.setBounds(378, 149, 32, 32);
		contentPane.add(btnNewButton);
	}
	protected void contextoConversorMonedas() {
		 listaUnidades = Moneda.unidadesMonedas();
		asignarListaACombos();
		convertir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Moneda moneda = new Moneda(Float.parseFloat(entrada.getText()), String.valueOf(unidadEntrada.getSelectedItem()));
				Moneda monedaConvertida = moneda.convertir(String.valueOf(unidadSalida.getSelectedItem()));
				salida.setText(String.valueOf(monedaConvertida));;
			}
		});
	}
	protected void contextoConversorMasa() {
		listaUnidades = Masa.unidadesMasa();
		asignarListaACombos();
		convertir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Masa masa = new Masa(Float.parseFloat(entrada.getText()), String.valueOf(unidadEntrada.getSelectedItem()));
				Masa masaConvertida = masa.convertir(String.valueOf(unidadSalida.getSelectedItem()));
				salida.setText(String.valueOf(masaConvertida));;
			}
		});
	}
	protected void contextoConversorTemperaturas() {
		listaUnidades = Temperatura.unidadesTemperatura();
		asignarListaACombos();
		convertir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Temperatura temperatura = new Temperatura(Float.parseFloat(entrada.getText()), String.valueOf(unidadEntrada.getSelectedItem()));
				Temperatura temperaturaConvertida = temperatura.convertir(String.valueOf(unidadSalida.getSelectedItem()));
				salida.setText(String.valueOf(temperaturaConvertida));;
			}
		});
	}
	private void asignarListaACombos() {
		for(String element:listaUnidades) {
			this.unidadEntrada.addItem(element);
		}
	}
	private void asignarListaAComboSalida(int excepcion) {
		unidadSalida.removeAllItems();
		for(String element:listaUnidades) {
			if(listaUnidades[excepcion]!=element) {
				this.unidadSalida.addItem(element);
			}
		}
	}
}
