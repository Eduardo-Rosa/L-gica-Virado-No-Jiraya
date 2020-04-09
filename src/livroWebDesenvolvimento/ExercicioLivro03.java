package livroWebDesenvolvimento;

import javax.swing.JOptionPane;

public class ExercicioLivro03 {
    public static void main(String[] args) {
        String strIdade;
        int intIdade;
        strIdade = JOptionPane.showInputDialog("Digite sua Idade: ");
        intIdade = Integer.parseInt(strIdade);

        if (intIdade < 18)
            JOptionPane.showMessageDialog(null,
                    "Você é menor de idade! Não pode dirigir ", "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
        else {
            JOptionPane.showMessageDialog(null, "Você é maior de idade ! " +
                    "Se for habilitado pode dirigir ", "Atenção",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
