package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import dao.UsuarioDao;
import model.Usuario;
import model.ValidaCPF;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class TelaCadastroFuncionario2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDataNascimento;
	private JTextField txtEmail;
	private static TelaCadastroFuncionario2 frame;
	
	private static Border bordaVermelha = BorderFactory.createLineBorder(Color.red);
	private static Border bordaNormal = BorderFactory.createLineBorder(Color.GRAY);
	private JTextField txtRua;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField Estado;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaCadastroFuncionario2();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public TelaCadastroFuncionario2() throws ParseException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(85, 107, 47));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel.setForeground(Color.WHITE);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setFont(new Font("Segoe Print", Font.PLAIN, 50));
		panel.add(lblCadastro);
		
		JPanel panel_lbl = new JPanel();
		contentPane.add(panel_lbl, BorderLayout.WEST);
		panel_lbl.setLayout(new GridLayout(9, 0, 0, 0));
		
		JPanel lbl1 = new JPanel();
		lbl1.setBackground(new Color(240, 255, 240));
		panel_lbl.add(lbl1);
		
		JPanel lbl3 = new JPanel();
		lbl3.setBackground(new Color(240, 255, 240));
		panel_lbl.add(lbl3);
		
		JPanel lbl4 = new JPanel();
		lbl4.setBackground(new Color(240, 255, 240));
		panel_lbl.add(lbl4);
		
		JPanel lbl5 = new JPanel();
		lbl5.setBackground(new Color(240, 255, 240));
		panel_lbl.add(lbl5);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lbl5.add(lblRua);
		
		JPanel lbl6 = new JPanel();
		lbl6.setBackground(new Color(240, 255, 240));
		panel_lbl.add(lbl6);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lbl6.add(lblBairro);
		
		JPanel lbl7 = new JPanel();
		lbl7.setBackground(new Color(240, 255, 240));
		panel_lbl.add(lbl7);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lbl7.add(lblCidade);
		
		JPanel lbl8 = new JPanel();
		lbl8.setBackground(new Color(240, 255, 240));
		panel_lbl.add(lbl8);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lbl8.add(lblNumero);
		
		JPanel lbl9 = new JPanel();
		lbl9.setBackground(new Color(240, 255, 240));
		panel_lbl.add(lbl9);
		
		JLabel lblNewLabel = new JLabel("Estado");
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lbl9.add(lblNewLabel);

		JPanel panel_txt = new JPanel();
		panel_txt.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_txt, BorderLayout.CENTER);
		
		JPanel t1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) t1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		t1.setBackground(new Color(240, 255, 240));
		panel_txt.add(t1);
		
		JPanel t3 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) t3.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		t3.setBackground(new Color(240, 255, 240));
		panel_txt.add(t3);
		
		JPanel t4 = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) t4.getLayout();
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		t4.setBackground(new Color(240, 255, 240));
		panel_txt.add(t4);
		
		JPanel t5 = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) t5.getLayout();
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		t5.setBackground(new Color(240, 255, 240));
		panel_txt.add(t5);
		
		txtRua = new JTextField();
		txtRua.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		t5.add(txtRua);
		txtRua.setColumns(10);
		
		JPanel t6 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) t6.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		t6.setBackground(new Color(240, 255, 240));
		panel_txt.add(t6);
		
		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		t6.add(txtBairro);
		txtBairro.setColumns(10);
		
		JPanel t7 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) t7.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		t7.setBackground(new Color(240, 255, 240));
		panel_txt.add(t7);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		t7.add(txtNumero);
		txtNumero.setColumns(10);
		
		JPanel t8 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) t8.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		t8.setBackground(new Color(240, 255, 240));
		panel_txt.add(t8);
		
		Estado = new JTextField();
		Estado.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		t8.add(Estado);
		Estado.setColumns(10);
		
		JPanel t9 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) t9.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		t9.setBackground(new Color(240, 255, 240));
		panel_txt.add(t9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		t9.add(comboBox);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(65, 10, 46, 29);
		lblNome.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lbl1.add(lblNome);

		txtNome = new JTextField();
		txtNome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtNome.setBorder(bordaNormal);
			}
		});
		panel_txt.setLayout(new GridLayout(9, 1, 0, 0));
		txtNome.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		t1.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblDataNascimento = new JLabel("Data de Nascimento");
		lblDataNascimento.setBounds(65, 139, 197, 26);
		lblDataNascimento.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lbl3.add(lblDataNascimento);

		txtDataNascimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtDataNascimento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtDataNascimento.setBorder(bordaNormal);
			}
		});
		txtDataNascimento.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		txtDataNascimento.setColumns(10);
		t3.add(txtDataNascimento);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(65, 200, 197, 29);
		lblEmail.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lbl4.add(lblEmail);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		panel_lbl.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("CEP");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_1);

		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtEmail.setBorder(bordaNormal);
				txtEmail.setForeground(Color.DARK_GRAY);
			}
		});
		txtEmail.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		t4.add(txtEmail);
		
		JPanel t10 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) t10.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		t10.setBackground(new Color(240, 255, 240));
		panel_txt.add(t10);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		t10.add(textField);
		textField.setColumns(10);
		
		JPanel panel_botoes = new JPanel();
		contentPane.add(panel_botoes, BorderLayout.SOUTH);
		panel_botoes.setLayout(new BoxLayout(panel_botoes, BoxLayout.X_AXIS));
		
		JPanel p_esquerda = new JPanel();
		FlowLayout flowLayout_10 = (FlowLayout) p_esquerda.getLayout();
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		p_esquerda.setBackground(new Color(240, 255, 240));
		panel_botoes.add(p_esquerda);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBackground(new Color(85, 107, 47));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		p_esquerda.add(btnNewButton);
		
		JPanel p_direita = new JPanel();
		FlowLayout flowLayout_11 = (FlowLayout) p_direita.getLayout();
		flowLayout_11.setAlignment(FlowLayout.RIGHT);
		p_direita.setBackground(new Color(240, 255, 240));
		panel_botoes.add(p_direita);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		btnCadastrar.setBackground(new Color(85, 107, 47));
		p_direita.add(btnCadastrar);
		
		
		
		
		

	}
}
