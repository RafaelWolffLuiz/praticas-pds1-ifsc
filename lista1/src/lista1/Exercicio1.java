package lista1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
   // Utilizei, CHATGPT para poder compreender como fazer e aprender, YT e alguns sites e também ajuda de amigos,
   // tenho muita dificuldade mas estou sendo sincero. Caio me ajudando entrando call discord.
public class CalctotulPag {
public static void main(String[] args) {
       
  double PrecoLitro = Double.parseDouble(JOptionPane.showInputDialog("Preço por litro:"));
    int quantLitros = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de litros:"));
        
        
  double totalPag = calctotulPag(PrecoLitro, quantLitros);
        JOptionPane.showMessageDialog(null, "O total a ser pagu é R$:" + totalPag);
    
public static double calctotulPag(double PrecoLitro, int quantLitros) {
return PrecoLitro * quantLitros;
    }
    }
}

//
//
//

public class StringsList {
public static void main(String[] args) {
   ArrayList<String> lista = new ArrayList<String>();
        
for (int i = 0; i < 10; i++) {
     String elemento = JOptionPane.showInputDialog("Digite um elemento:");
   lista.add(elemento);
       
   JOptionPane.showMessageDialog(null, "A lista é: " + lista);
	 }
    }
}

//
//
//

public class Calmedia {
public static void main(String[] args) {
      double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota:"));
      double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota:" ));
      double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota:"));
        
        // Calculo da média
      double LaMediaFinale = (nota1 + nota2 + nota3) / 3;
        
        //      Resultado 
    if (LaMediaFinale >= 6) {
       JOptionPane.showMessageDialog(null, "Aprovado(a)");
  } else if (LaMediaFinale >= 4) {
       JOptionPane.showMessageDialog(null, "Recuperação");
  } else {
       JOptionPane.showMessageDialog(null, "Reprovado(a)");
        }
    }
}
