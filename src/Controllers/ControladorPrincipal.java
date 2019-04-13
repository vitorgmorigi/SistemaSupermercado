/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.TelaCompra;
import Views.TelaInicial;

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
    
    
}
