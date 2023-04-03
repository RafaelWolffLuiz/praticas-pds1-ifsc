package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField textNum;
	private JTextField textMenor;
	private JTextField textMaior;
	 ArrayList<String> par = new ArrayList();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(119, 38, 220, 20);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		textMenor = new JTextField();
		textMenor.setEnabled(false);
		textMenor.setEditable(false);
		textMenor.setColumns(10);
		textMenor.setBounds(119, 101, 220, 20);
		contentPane.add(textMenor);
		
		textMaior = new JTextField();
		textMaior.setEnabled(false);
		textMaior.setEditable(false);
		textMaior.setColumns(10);
		textMaior.setBounds(119, 148, 220, 20);
		contentPane.add(textMaior);
		
		JLabel lblMaior = new JLabel("Maior:");
		lblMaior.setBounds(63, 151, 46, 14);
		contentPane.add(lblMaior);
		
		JLabel lblMenor = new JLabel("Menor: ");
		lblMenor.setBounds(63, 104, 46, 14);
		contentPane.add(lblMenor);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String numstr = textNum.getText();
				Double num = Double.valueOf(numstr);
				Double maior = Double.MAX_VALUE;
				Double menor = Double.MIN_VALUE;
				par.add(numstr);
				textNum.setText(null);
				for (String string : par) {
					if(num < maior) {
						textMaior.setText(string);
						maior = num;
					}else if(num > menor) {
						textMenor.setText(string);
						menor = num;
					}
				}
			}
		});
		btnCadastrar.setBounds(93, 204, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textMenor.getText();
				textMaior.getText();
			}
		});
		btnExibir.setBounds(229, 204, 89, 23);
		contentPane.add(btnExibir);
		
		JLabel lblNum = new JLabel("Num:");
		lblNum.setBounds(63, 41, 46, 14);
		contentPane.add(lblNum);
	}
}
