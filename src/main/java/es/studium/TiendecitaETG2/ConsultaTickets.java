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
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class ConsultaTickets extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable consultaTickets;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaTickets frame = new ConsultaTickets();
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
	public ConsultaTickets() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 277);
		
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
		
		JLabel lblNewLabel = new JLabel("Consulta Tickets");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 21));
		lblNewLabel.setBounds(20, 11, 146, 28);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 50, 383, 94);
		contentPane.add(scrollPane);
		
		consultaTickets = new JTable();
		consultaTickets.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		consultaTickets.setBackground(new Color(240, 255, 240));
		consultaTickets.setModel(new DefaultTableModel(
			new Object[][] {
				{"Arroz Basmati", "2", "0.89\u20AC", "1.78\u20AC"},
				{"Tomate Triturado", "3", "1\u20AC", "3\u20AC"},
				{"Patata Fritas Ifa Eliges", "4", "0.50\u20AC", "2\u20AC"},
				{"Vaper de Fresa", "5", "6.85\u20AC", "34.25\u20AC"},
			},
			new String[] {
				"Articulo", "Cantidad", "Precio", "Total"
			}
		));
		consultaTickets.getColumnModel().getColumn(0).setPreferredWidth(136);
		scrollPane.setViewportView(consultaTickets);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(166, 166, 89, 23);
		contentPane.add(btnNewButton);
	}
}
