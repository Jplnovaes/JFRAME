import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

public class login {
    public static void main(String[] args) throws Exception {

        JFrame janela = new JFrame("Login");
        JPanel painel = new JPanel();
        JLabel labelLogin = new JLabel("Usuário: ");
        JLabel labelSenha = new JLabel("Senha: ");
        JTextField inputLogin = new JTextField();
        JTextField inputSenha = new JTextField();
        JButton btnEntrar = new JButton("Entrar");
        JButton btnCancelar = new JButton("Cancelar");
        janela.setLayout(new FlowLayout());

        inputLogin.setBounds(10, 10, 120, 20);

        painel.setLayout(new GridLayout(3, 3));
        painel.add(labelLogin);
        painel.add(inputLogin);
        painel.add(labelSenha);
        painel.add(inputSenha);
        painel.add(btnEntrar);
        painel.add(btnCancelar);

        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(350, 150);
        janela.setVisible(true);

    }
}