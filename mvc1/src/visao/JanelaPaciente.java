package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class JanelaPaciente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textIdade;
	private JTextField textEndereco;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public JanelaPaciente() {
		setTitle("Cadastro de Pacientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][20px:n][][][][][35px:n][][][][]"));
		
		JLabel lblTitle = new JLabel("Cadastro de Pacientes");
		lblTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		contentPane.add(lblTitle, "cell 1 0");
		
		JLabel lblNome = new JLabel("Nome: ");
		contentPane.add(lblNome, "cell 0 2,alignx left");
		
		JLabel lblCPF = new JLabel("CPF:");
		contentPane.add(lblCPF, "cell 0 3,alignx left");
		
		JLabel lblIdade = new JLabel("Idade: ");
		contentPane.add(lblIdade, "cell 0 4,alignx left");
		 
		 JLabel lblEndereco = new JLabel("Endereço: ");
		 contentPane.add(lblEndereco, "cell 0 5,alignx left");
		
		 btnCadastrar = new JButton("Cadastrar");
		contentPane.add(btnCadastrar, "flowx,cell 1 10,alignx right,growy");
		
		textNome = new JTextField();
		contentPane.add(textNome, "cell 1 2,grow");
		textNome.setColumns(10);
		
		textCPF = new JTextField();
		contentPane.add(textCPF, "cell 1 3,grow");
		textCPF.setColumns(10);
		
		textIdade = new JTextField();
		contentPane.add(textIdade, "cell 1 4,grow");
		textIdade.setColumns(10);
		
		textEndereco = new JTextField();
		contentPane.add(textEndereco, "cell 1 5,grow");
		textEndereco.setColumns(10);
		
		btnLimpar = new JButton("Limpar");
		contentPane.add(btnLimpar, "cell 1 10,alignx right,growy");
		
		
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	public JButton getBtnlimpar() {
		return btnLimpar;
	}

	public void setBtnlimpar(JButton btnlimpar) {
		this.btnLimpar = btnlimpar;
	}

	public JTextField getTextNome() {
		return textNome;
	}

	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}

	public JTextField getTextCPF() {
		return textCPF;
	}

	public void setTextCPF(JTextField textCPF) {
		this.textCPF = textCPF;
	}

	public JTextField getTextIdade() {
		return textIdade;
	}

	public void setTextIdade(JTextField textIdade) {
		this.textIdade = textIdade;
	}

	public JTextField getTextEndereco() {
		return textEndereco;
	}

	public void setTextEndereco(JTextField textEndereco) {
		this.textEndereco = textEndereco;
	}
	
	public void limpaCampos() {
		
		textCPF.setText("");
		textNome.setText("");
		textEndereco.setText("");
		textIdade.setText("");
		
		
	}

}
