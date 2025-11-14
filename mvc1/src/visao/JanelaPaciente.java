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
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class JanelaPaciente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textIdade;
	private JTextField textEndereco;
	private JLabel labelImagem;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public JanelaPaciente() {
		setTitle("Cadastro de Pacientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][][][][][]", "[][20px:n][][][][][35px:n][][]"));
		
		JLabel lblTitle = new JLabel("Cadastro de Pacientes");
		lblTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		contentPane.add(lblTitle, "cell 0 0");
		
		JLabel lblCPF = new JLabel("CPF:");
		contentPane.add(lblCPF, "flowx,cell 0 2,alignx left");
		 
		 JLabel lblIdade = new JLabel("Idade: ");
		 contentPane.add(lblIdade, "flowx,cell 0 3,alignx left");
		 
		 JLabel lblEndereco = new JLabel("Endereço: ");
		 contentPane.add(lblEndereco, "cell 1 3 7 1");
		
		JLabel lblNome = new JLabel("Nome: ");
		contentPane.add(lblNome, "cell 1 2 7 1");
		 
		 labelImagem =  new JLabel("");
		 try {
			labelImagem.setIcon(new ImageIcon(ImageIO.read(JanelaPaciente.class.getResource("/figuras/login2.png")).getScaledInstance(50, 50, BufferedImage.TYPE_INT_RGB)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 contentPane.add(labelImagem, "cell 4 4 3 3");
		
		textCPF = new JTextField();
		contentPane.add(textCPF, "cell 0 2,grow");
		textCPF.setColumns(10);
		
		textIdade = new JTextField();
		contentPane.add(textIdade, "cell 0 3,grow");
		textIdade.setColumns(10);
		
		 btnCadastrar = new JButton("Cadastrar");
		 btnCadastrar.setIcon(new ImageIcon(JanelaPaciente.class.getResource("/figuras/salvar.png")));
		 contentPane.add(btnCadastrar, "flowx,cell 0 8,alignx right,growy");
		
		textNome = new JTextField();
		contentPane.add(textNome, "cell 1 2 6 1,growx");
		textNome.setColumns(10);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(JanelaPaciente.class.getResource("/figuras/limpar.png")));
		contentPane.add(btnLimpar, "cell 0 8,alignx right,growy");
		
		textEndereco = new JTextField();
		contentPane.add(textEndereco, "cell 1 3,growx");
		textEndereco.setColumns(10);
		
		
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
