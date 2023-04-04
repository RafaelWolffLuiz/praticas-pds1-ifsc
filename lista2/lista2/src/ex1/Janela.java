package exe1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Janela extends JFrame {

private JPanel contentPane;
private JTextField textNum;
private JTextField textResultado;
	ArrayList<String> par = new ArrayList();
	
	//
	// Aplicação
	//
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
		} );
	}

	// 
	// Criando Frame
	//
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(170, 68, 160, 20);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		textResultado = new JTextField();
		textResultado.setEnabled(false);
		textResultado.setEditable(false);
		textResultado.setColumns(10);
		textResultado.setBounds(170, 137, 160, 20);
		contentPane.add(textResultado);
		
		JLabel lblNum = new JLabel("Cadastrar número: ");
		lblNum.setBounds(32, 68, 128, 17);
		contentPane.add(lblNum);
		
		JLabel lblTotalNmeroPares = new JLabel("Total número pares: ");
		lblTotalNmeroPares.setBounds(32, 140, 126, 14);
		contentPane.add(lblTotalNmeroPares);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String numstr = textNum.getText();
				Double num = Double.valueOf(numstr);
				if(num % 2 == 0) {
					 par.add(numstr);
				}
				textNum.setText(null);
			}
		});
		btnCadastrar.setBounds(32, 195, 105, 36);
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int n = par.size();
				String numPares = "";
				for (int i = 0; i<n; i++) {
			    	if(i == 0) {
			    		numPares += par.get(i);
			    	}else {
			    		numPares += " - "+par.get(i);
			    	}
					
				}
				textResultado.setText(numPares); 
			
			}
		});
		btnExibir.setBounds(279, 195, 105, 36);
		contentPane.add(btnExibir);
	}
}
