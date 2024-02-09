import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class VentanaMenú extends JFrame {
	
	/**
	 * @author Profesor
	 * @version 1.0
	 * @title Menu Restaurante
	 */
	/** 1 Diseño **/
	/** 2 logica del programa **/
	/** 3 fichero Menú **/

	private static final long serialVersionUID = 1L;
	private JPanel PanelMenu;
	
	public static String Ruta = new String ( "C:\\Users\\Profesor\\Desktop\\FP Grado Superior\\01 Programación\\02 Ejercicios Java\\Java_Menú\\");
	
	// Array del Menu del restaurante
	
	ImageIcon [] PrimeroMenu;
	ImageIcon [] SegundoMenu;
	ImageIcon [] PostreMenu;
	ImageIcon [] BebidasMenu;
	
	JComboBox<Panel> comboBoxPrimero = new JComboBox<Panel>();
	JComboBox<Panel> comboBoxSegundo = new JComboBox<Panel>();
	JComboBox<Panel> comboBoxPostres = new JComboBox<Panel>();
	JComboBox<Panel> comboBoxBebidas = new JComboBox<Panel>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenú frame = new VentanaMenú();
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
	public VentanaMenú() {
		setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		setBackground(new Color(255, 128, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		PanelMenu = new JPanel();
		PanelMenu.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelMenu);
		PanelMenu.setLayout(null);
		
		
		comboBoxPrimero.setModel(new DefaultComboBoxModel(new String[] {"1) Orella ", "2) Tripon", "3) Pulpo de carballiño", "4) Callos", "5) Lacón con grelos", "6) Cachelos"}));
		comboBoxPrimero.setBounds(30, 50, 110, 22);
		PanelMenu.add(comboBoxPrimero);
		comboBoxPrimero.addActionListener(new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				if (comboBoxPrimero.getSelectedIndex() != 0) {
					verMensaje(comboBoxPrimero.getSelectedItem().toString());
				}
			}
		});
		
		
		comboBoxSegundo.setModel(new DefaultComboBoxModel(new String[] {"1) Cocidos ", "2) Zorza con patatas", "3) Chourizos al vino ", "4) Carne o Caldeiro"}));
		comboBoxSegundo.setBounds(155, 50, 110, 22);
		PanelMenu.add(comboBoxSegundo);
		
		/** JButton**/
		
		JButton bottonMenú = new JButton("Generar Menú");
		bottonMenú.setBounds(207, 227, 126, 23);
		PanelMenu.add(bottonMenú);
		
		
		comboBoxPostres.setModel(new DefaultComboBoxModel(new String[] {"1) Tarta de whisqui", "2) Tarta Helada con ron ", "3) Brazo de gitano", "4) Cuña Sevillana"}));
		comboBoxPostres.setBounds(275, 50, 110, 22);
		PanelMenu.add(comboBoxPostres);
		
		
		comboBoxBebidas.setModel(new DefaultComboBoxModel(new String[] {"1) Licor de hierbas ", "2) Licor Café", "3) Agua Ardiente", "4) Vino Via Romana", "5) Agua ", "6) Cerveza ", "7) Refrescos"}));
		comboBoxBebidas.setBounds(395, 50, 110, 22);
		PanelMenu.add(comboBoxBebidas);
		
		/** Jlabel **/
		
		JLabel labelTexto02 = new JLabel("Segundos");
		labelTexto02.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		labelTexto02.setBounds(155, 15, 113, 20);
		PanelMenu.add(labelTexto02);
		
		JLabel labelTexto01 = new JLabel("Primeros");
		labelTexto01.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		labelTexto01.setBounds(31, 15, 113, 20);
		PanelMenu.add(labelTexto01);
		
		JLabel labelTexto03 = new JLabel("Postres");
		labelTexto03.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		labelTexto03.setBounds(275, 15, 113, 20);
		PanelMenu.add(labelTexto03);
		
		JLabel labelTexto04 = new JLabel("Primeros");
		labelTexto04.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		labelTexto04.setBounds(395, 15, 113, 20);
		PanelMenu.add(labelTexto04);
		
		//public void actionPerformed(ActionEvent event) {
			
		//}
		
		
	
		
		/** Llamar a los metodos **/
		fondo();
		
	}
	String rutaFondo = new String (Ruta+"FondoRestaurante.jpg");
	public void fondo () {
		ImageIcon ImagenFondo;
		JLabel labelFondo = null;
		ImagenFondo = new ImageIcon(rutaFondo);
		labelFondo.setIcon(ImagenFondo);
		// 1920 x 1080 Fondo de patalla original 
		labelFondo.setSize(1000,1000);
		PanelMenu.add(labelFondo);
		
	}

	

	


	public static void verMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
