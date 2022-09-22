package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;

public class TelaCadastroVenda extends JFrame {

	private JPanel contentPane;
	private JTextField txtData;
	private JTextField txtCliente;
	private JTextField txtVendedor;
	
	private static Border bordaVermelha = BorderFactory.createLineBorder(Color.red);
	private static Border bordaNormal = BorderFactory.createLineBorder(Color.GRAY);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroVenda frame = new TelaCadastroVenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaCadastroVenda() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(85, 107, 47));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Cadastro das vendas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 50));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(5, 2, 0, 0));
		
		JPanel panel_14 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_14.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_14);
		
		txtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		panel_14.add(txtData);
		txtData.setColumns(50);
		
		JPanel panel_17 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_17.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_17);
		
		txtCliente = new JTextField();
		panel_17.add(txtCliente);
		txtCliente.setColumns(50);
		
		JPanel panel_20 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_20.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_20);
		
		txtVendedor = new JTextField();
		txtVendedor.setText("");
		panel_20.add(txtVendedor);
		txtVendedor.setColumns(50);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		
		JPanel panel_23 = new JPanel();
		panel_1.add(panel_23);
		panel_23.setLayout(new MigLayout("", "[10px][][][][][][][][][][][][][][][][][][][][][][][]", "[29px]"));
		
		JLabel lblLucroResul = new JLabel("-\r\n");
		lblLucroResul.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		panel_23.add(lblLucroResul, "cell 1 0,alignx left,aligny top");
		
		JLabel lblComissao = new JLabel("Comissão:");
		panel_23.add(lblComissao, "cell 10 0");
		lblComissao.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		
		JLabel lblComissaoResul = new JLabel("-");
		panel_23.add(lblComissaoResul, "cell 13 0");
		lblComissaoResul.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		
		JButton btnNewButton_2 = new JButton("Calcular");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(85, 107, 47));
		btnNewButton_2.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		panel_23.add(btnNewButton_2, "cell 22 0");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEstoque telaEstoque = new TelaEstoque();
				telaEstoque.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(85, 107, 47));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = txtData.getText();
				String cliente = txtCliente.getText();
				String vendedor = txtVendedor.getText();
				
				if (data.isEmpty() || cliente.isEmpty() || vendedor.isEmpty()) {
					if(data.isEmpty()) {
						txtData.setBorder(bordaVermelha);
					}
					if(cliente.isEmpty()) {
						txtCliente.setBorder(bordaVermelha);
					}
					if(vendedor.isEmpty()) {
						txtVendedor.setBorder(bordaVermelha);
					}
				}else {
					TelaEstoque telaEstoque = new TelaEstoque();
					telaEstoque.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBackground(new Color(85, 107, 47));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new GridLayout(5, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		
		JLabel lblData = new JLabel("Data:");
		panel_6.add(lblData);
		lblData.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		
		JPanel panel_8 = new JPanel();
		panel_3.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9);
		
		JLabel lblCliente = new JLabel("Cliente:");
		panel_9.add(lblCliente);
		lblCliente.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		
		JPanel panel_10 = new JPanel();
		panel_3.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_3.add(panel_11);
		
		JLabel lblVendedor = new JLabel("Vendedor:");
		panel_11.add(lblVendedor);
		lblVendedor.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		
		JPanel panel_12 = new JPanel();
		panel_3.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_3.add(panel_13);
		
		JLabel lblNewLabel_1 = new JLabel("Produtos:");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		panel_13.add(lblNewLabel_1);
		
		JPanel panel_15 = new JPanel();
		panel_3.add(panel_15);
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		
		JLabel lblLucro = new JLabel("Lucro:");
		panel_5.add(lblLucro);
		lblLucro.setFont(new Font("Segoe Print", Font.PLAIN, 16));
	}

}
