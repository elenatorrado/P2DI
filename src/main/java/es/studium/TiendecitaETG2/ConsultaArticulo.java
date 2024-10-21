package es.studium.TiendecitaETG2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;

public class ConsultaArticulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaArticulo frame = new ConsultaArticulo();
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
	public ConsultaArticulo() {
		setTitle("Consulta Articulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Articulos");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Alta");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Baja");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Modificacion");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Consulta");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_1 = new JMenu("Tickets");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Alta");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consulta");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta Articulos");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 21));
		lblNewLabel.setBounds(10, 11, 177, 42);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 64, 347, 94);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 245, 238));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Arroz Basmati", "Brillante", "0.89\u20AC", "50"},
				{"Tomate Triturado", "Orlando", "1\u20AC", "40"},
				{"Patatas Fritas Ifa Eliges", "Grupo Ifa", "0.5\u20AC", "30"},
				{"Vaper de Fresa", "Amos", "6.85\u20AC", "20"},
			},
			new String[] {
				"Articulo", "Proveedor", "Precio", "Stock"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(149);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(173, 181, 89, 23);
		contentPane.add(btnNewButton);
	}

}
