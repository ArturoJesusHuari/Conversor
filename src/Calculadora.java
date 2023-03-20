import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Frame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.Dialog.ModalExclusionType;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField entry;
	private float numeroAOperar;
	private char operador;
	JButton sum, multiplier, dif, porcent, div,raiz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public void setText(String text) {
		if(entry.getText()!="ERROR" && entry.getText().length()<10) {
			entry.setText(entry.getText()+text);
		} else if(entry.getText()=="ERROR") {
			entry.setText(text);
		}
	}
	private float redondeoSignificativo(float numeroARedondear) {
		float auxiliar=numeroARedondear;
		int numeroCifras;
		for(numeroCifras=0; auxiliar>=1; numeroCifras++) {
			auxiliar/=10;
		}
		BigDecimal redondeo = new BigDecimal(numeroARedondear).setScale(10-numeroCifras, RoundingMode.HALF_UP);
		return redondeo.floatValue();
	}
	private void desactivarOperadores() {
		sum.disable();
		multiplier.disable();
		dif.disable();
		porcent.disable();
		div.disable();
		raiz.disable();
	}
	private void op(char operation) {
		try {
			numeroAOperar = Float.parseFloat(entry.getText());
			entry.setText("");
			operador=operation;
			desactivarOperadores();
		}catch (Exception exception) {
			entry.setText("ERROR");
		}
	}
	public Calculadora() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\ProyectosConJava\\Conversor\\img\\calculadora.png"));
		setBounds(100, 400, 222, 343);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		entry = new JTextField();
		entry.setSelectionColor(new Color(0, 0, 0));
		entry.setEditable(false);
		entry.setFocusTraversalKeysEnabled(false);
		entry.setFocusable(false);
		entry.setForeground(new Color(0, 0, 0));
		entry.setFont(new Font("Consolas", Font.PLAIN, 30));
		entry.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(102, 102, 102), new Color(102, 102, 102)));
		entry.setBackground(new Color(0, 255, 102));
		entry.setBounds(10, 11, 186, 56);
		contentPane.add(entry);
		entry.setColumns(10);
		
		JButton one = new JButton("1");
		one.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("1");
			}
		});
		one.setBackground(new Color(204, 204, 204));
		one.setBorder(null);
		one.setFocusPainted(false);
		one.setFocusTraversalKeysEnabled(false);
		one.setFocusable(false);
		one.setMargin(new Insets(0, 0, 0, 0));
		one.setFont(new Font("SansSerif", Font.PLAIN, 11));
		one.setBounds(10, 124, 39, 35);
		contentPane.add(one);
		
		JButton two = new JButton("2");
		two.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("2");
			}
		});
		two.setBackground(new Color(204, 204, 204));
		two.setBorder(null);
		two.setFocusPainted(false);
		two.setFocusTraversalKeysEnabled(false);
		two.setFocusable(false);
		two.setMargin(new Insets(0, 0, 0, 0));
		two.setFont(new Font("SansSerif", Font.PLAIN, 11));
		two.setBounds(59, 124, 39, 35);
		contentPane.add(two);
		
		JButton three = new JButton("3");
		three.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("3");
			}
		});
		three.setBackground(new Color(204, 204, 204));
		three.setBorder(null);
		three.setFocusPainted(false);
		three.setFocusTraversalKeysEnabled(false);
		three.setFocusable(false);
		three.setMargin(new Insets(0, 0, 0, 0));
		three.setFont(new Font("SansSerif", Font.PLAIN, 11));
		three.setBounds(108, 124, 39, 35);
		contentPane.add(three);
		
		JButton four = new JButton("4");
		four.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("4");
			}
		});
		four.setBackground(new Color(204, 204, 204));
		four.setBorder(null);
		four.setFocusPainted(false);
		four.setFocusTraversalKeysEnabled(false);
		four.setFocusable(false);
		four.setMargin(new Insets(0, 0, 0, 0));
		four.setFont(new Font("SansSerif", Font.PLAIN, 11));
		four.setBounds(10, 170, 39, 35);
		contentPane.add(four);
		
		JButton five = new JButton("5");
		five.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("5");
			}
		});
		five.setBackground(new Color(204, 204, 204));
		five.setBorder(null);
		five.setFocusPainted(false);
		five.setFocusTraversalKeysEnabled(false);
		five.setFocusable(false);
		five.setMargin(new Insets(0, 0, 0, 0));
		five.setFont(new Font("SansSerif", Font.PLAIN, 11));
		five.setBounds(59, 170, 39, 35);
		contentPane.add(five);
		
		JButton six = new JButton("6");
		six.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("6");
			}
		});
		six.setBackground(new Color(204, 204, 204));
		six.setBorder(null);
		six.setFocusPainted(false);
		six.setFocusTraversalKeysEnabled(false);
		six.setFocusable(false);
		six.setMargin(new Insets(0, 0, 0, 0));
		six.setFont(new Font("SansSerif", Font.PLAIN, 11));
		six.setBounds(108, 170, 39, 35);
		contentPane.add(six);
		
		JButton seven = new JButton("7");
		seven.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("7");
			}
		});
		seven.setBackground(new Color(204, 204, 204));
		seven.setBorder(null);
		seven.setFocusPainted(false);
		seven.setFocusTraversalKeysEnabled(false);
		seven.setFocusable(false);
		seven.setMargin(new Insets(0, 0, 0, 0));
		seven.setFont(new Font("SansSerif", Font.PLAIN, 11));
		seven.setBounds(10, 216, 39, 35);
		contentPane.add(seven);
		
		JButton eight = new JButton("8");
		eight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("8");
			}
		});
		eight.setBackground(new Color(204, 204, 204));
		eight.setBorder(null);
		eight.setFocusPainted(false);
		eight.setFocusTraversalKeysEnabled(false);
		eight.setFocusable(false);
		eight.setMargin(new Insets(0, 0, 0, 0));
		eight.setFont(new Font("SansSerif", Font.PLAIN, 11));
		eight.setBounds(59, 216, 39, 35);
		contentPane.add(eight);
		
		JButton nine = new JButton("9");
		nine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("9");
			}
		});
		nine.setBackground(new Color(204, 204, 204));
		nine.setBorder(null);
		nine.setFocusPainted(false);
		nine.setFocusTraversalKeysEnabled(false);
		nine.setFocusable(false);
		nine.setMargin(new Insets(0, 0, 0, 0));
		nine.setFont(new Font("SansSerif", Font.PLAIN, 11));
		nine.setBounds(108, 216, 39, 35);
		contentPane.add(nine);
		
		JButton our = new JButton("0");
		our.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText("0");
			}
		});
		our.setBackground(new Color(204, 204, 204));
		our.setBorder(null);
		our.setFocusPainted(false);
		our.setFocusTraversalKeysEnabled(false);
		our.setFocusable(false);
		our.setMargin(new Insets(0, 0, 0, 0));
		our.setFont(new Font("SansSerif", Font.PLAIN, 11));
		our.setBounds(59, 262, 39, 35);
		contentPane.add(our);
		
		JButton dat = new JButton(".");
		dat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setText(".");
			}
		});
		dat.setBackground(new Color(204, 204, 204));
		dat.setBorder(null);
		dat.setFocusPainted(false);
		dat.setFocusTraversalKeysEnabled(false);
		dat.setFocusable(false);
		dat.setMargin(new Insets(0, 0, 0, 0));
		dat.setFont(new Font("SansSerif", Font.PLAIN, 11));
		dat.setBounds(10, 262, 39, 35);
		contentPane.add(dat);
		
		JButton equal = new JButton("=");
		equal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String resultado;
					switch (operador) { 
				    case '+':
				    	if(numeroAOperar+Float.parseFloat(entry.getText())>999999999) {
				    		entry.setText("OUT RANGE");
				    	} else
				    		entry.setText(String.valueOf(redondeoSignificativo(numeroAOperar+Float.parseFloat(entry.getText()))));
				    	break;
				    case '-':
				    	if(numeroAOperar+Float.parseFloat(entry.getText())<-999999999) {
				    		entry.setText("OUT RANGE");
				    	} else
				    		entry.setText(String.valueOf(redondeoSignificativo(numeroAOperar-Float.parseFloat(entry.getText()))));
				    	break;
				    case 'x':
				    	if(numeroAOperar+Float.parseFloat(entry.getText())>999999999) {
				    		entry.setText("OUT RANGE");
				    	} else
				    		entry.setText(String.valueOf(redondeoSignificativo(numeroAOperar*Float.parseFloat(entry.getText()))));
				    	break;
				    case '/':
				    	entry.setText(String.valueOf(redondeoSignificativo(numeroAOperar/Float.parseFloat(entry.getText()))));
				    	break;
				    case '%':
				    	entry.setText(String.valueOf(redondeoSignificativo(numeroAOperar*Float.parseFloat(entry.getText())/100)));
				    	break;
				    default:
				    	break;}
				    sum.enable();
					multiplier.enable();
					dif.enable();
					porcent.enable();
					div.enable();
					raiz.enable();
				}catch (Exception exception) {
					entry.setText("ERROR");
				}
			}
		});
		equal.setBackground(new Color(204, 204, 204));
		equal.setBorder(null);
		equal.setFocusPainted(false);
		equal.setFocusTraversalKeysEnabled(false);
		equal.setFocusable(false);
		equal.setMargin(new Insets(0, 0, 0, 0));
		equal.setFont(new Font("SansSerif", Font.PLAIN, 11));
		equal.setBounds(108, 262, 39, 35);
		contentPane.add(equal);
		
		sum = new JButton("+");
		sum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op('+');
			}
		});
		sum.setBackground(new Color(204, 204, 204));
		sum.setBorder(null);
		sum.setFocusPainted(false);
		sum.setFocusTraversalKeysEnabled(false);
		sum.setFocusable(false);
		sum.setMargin(new Insets(0, 0, 0, 0));
		sum.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sum.setBounds(157, 262, 39, 35);
		contentPane.add(sum);
		
		multiplier = new JButton("x");
		multiplier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op('x');
			}
		});
		multiplier.setBackground(new Color(204, 204, 204));
		multiplier.setBorder(null);
		multiplier.setFocusPainted(false);
		multiplier.setFocusTraversalKeysEnabled(false);
		multiplier.setFocusable(false);
		multiplier.setMargin(new Insets(0, 0, 0, 0));
		multiplier.setFont(new Font("SansSerif", Font.PLAIN, 11));
		multiplier.setBounds(157, 170, 39, 35);
		contentPane.add(multiplier);
		
		dif = new JButton("-");
		dif.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op('-');
			}
		});
		dif.setBackground(new Color(204, 204, 204));
		dif.setBorder(null);
		dif.setFocusPainted(false);
		dif.setFocusTraversalKeysEnabled(false);
		dif.setFocusable(false);
		dif.setMargin(new Insets(0, 0, 0, 0));
		dif.setFont(new Font("SansSerif", Font.PLAIN, 11));
		dif.setBounds(157, 216, 39, 35);
		contentPane.add(dif);
		
		div = new JButton("/");
		div.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op('/');
			}
		});
		div.setBackground(new Color(204, 204, 204));
		div.setBorder(null);
		div.setFocusPainted(false);
		div.setFocusTraversalKeysEnabled(false);
		div.setFocusable(false);
		div.setMargin(new Insets(0, 0, 0, 0));
		div.setFont(new Font("SansSerif", Font.PLAIN, 11));
		div.setBounds(157, 124, 39, 35);
		contentPane.add(div);
		
		JButton deleteAll = new JButton("CA");
		deleteAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				entry.setText("");
				operador='.';
				sum.enable();
				multiplier.enable();
				dif.enable();
				porcent.enable();
				div.enable();
				raiz.enable();
			}
		});
		deleteAll.setBorder(null);
		deleteAll.setFocusPainted(false);
		deleteAll.setFocusTraversalKeysEnabled(false);
		deleteAll.setFocusable(false);
		deleteAll.setBackground(new Color(204, 51, 51));
		deleteAll.setMargin(new Insets(0, 0, 0, 0));
		deleteAll.setFont(new Font("SansSerif", Font.PLAIN, 11));
		deleteAll.setBounds(10, 78, 39, 35);
		contentPane.add(deleteAll);
		
		JButton delete = new JButton("C");
		delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				entry.setText(entry.getText().substring(0,entry.getText().length()-1));
			}
		});
		delete.setMargin(new Insets(0, 0, 0, 0));
		delete.setFont(new Font("SansSerif", Font.PLAIN, 11));
		delete.setFocusable(false);
		delete.setFocusTraversalKeysEnabled(false);
		delete.setFocusPainted(false);
		delete.setBorder(null);
		delete.setBackground(new Color(204, 204, 204));
		delete.setBounds(157, 78, 39, 35);
		contentPane.add(delete);
		
		porcent = new JButton("%");
		porcent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op('%');
			}
		});
		porcent.setMargin(new Insets(0, 0, 0, 0));
		porcent.setFont(new Font("SansSerif", Font.PLAIN, 11));
		porcent.setFocusable(false);
		porcent.setFocusTraversalKeysEnabled(false);
		porcent.setFocusPainted(false);
		porcent.setBorder(null);
		porcent.setBackground(new Color(204, 204, 204));
		porcent.setBounds(59, 78, 39, 35);
		contentPane.add(porcent);
		
		raiz = new JButton("√");
		raiz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					float numeroASacarRaiz = Float.parseFloat(entry.getText());
					entry.setText(String.valueOf(redondeoSignificativo((float)Math.pow(numeroASacarRaiz, 0.5))));
				}catch (Exception exception) {
					entry.setText("ERROR");
				}
			}
		});
		raiz.setMargin(new Insets(0, 0, 0, 0));
		raiz.setFont(new Font("SansSerif", Font.PLAIN, 11));
		raiz.setFocusable(false);
		raiz.setFocusTraversalKeysEnabled(false);
		raiz.setFocusPainted(false);
		raiz.setBorder(null);
		raiz.setBackground(new Color(204, 204, 204));
		raiz.setBounds(108, 78, 39, 35);
		contentPane.add(raiz);
	}
}
