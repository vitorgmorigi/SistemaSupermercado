/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.TelaCompra;
import Views.TelaInicial;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author 55489
 */
public class ControladorPrincipal {
    
    private int tela;
    
    private static ControladorPrincipal instancia;
    public static ControladorPrincipal getInstance()
    {
        if (instancia == null) {
            instancia = new ControladorPrincipal();
        }

        return instancia;
    }

    public int getTela() {
        return tela;
    }

    public void setTela(int tela) {
        this.tela = tela;
        
        switch(this.tela)
        {
            case 0:
                new TelaInicial().setVisible(true);
                break;
                
            case 1:
                new TelaCompra().setVisible(true);
                break;
            
        }
    }
    
    public String verificadorSenhaFuncionario()
    {
            // Cria campo onde o usuario entra com a senha   
            JPasswordField password = new JPasswordField(10);   
            password.setEchoChar('*');   
            // Cria um rótulo para o campo   
            JLabel rotulo = new JLabel("Digite a senha do funcionário:");   
            // Coloca o rótulo e a caixa de entrada numa JPanel:   
            JPanel entUsuario = new JPanel();   
            entUsuario.add(rotulo);   
            entUsuario.add(password);   
            // Mostra o rótulo e a caixa de entrada de password para o usuario fornecer a senha:   
            JOptionPane.showMessageDialog(null, entUsuario, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);   
            // O programa só prossegue quando o usuário clicar o botao de OK do showMessageDialog.   
            // Captura a senha:   
            return password.getText();         
    }
    
    public String verificadorSenhaCartao()
    {
            // Cria campo onde o usuario entra com a senha   
            JPasswordField password = new JPasswordField(10);   
            password.setEchoChar('*');   
            // Cria um rótulo para o campo   
            JLabel rotulo = new JLabel("Digite a senha do cartão:");   
            // Coloca o rótulo e a caixa de entrada numa JPanel:   
            JPanel entUsuario = new JPanel();   
            entUsuario.add(rotulo);   
            entUsuario.add(password);   
            // Mostra o rótulo e a caixa de entrada de password para o usuario fornecer a senha:   
            JOptionPane.showMessageDialog(null, entUsuario, "Pagamento", JOptionPane.PLAIN_MESSAGE);   
            // O programa só prossegue quando o usuário clicar o botao de OK do showMessageDialog.   
            // Captura a senha:   
            return password.getText();         
    }

}
