/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.HashMap;

/**
 *
 * @author 55489
 */
public class Compra {
    
    private HashMap<Integer, Produto> carrinho;
    private double precoTotal;
    
    public Compra()
    {
        this.carrinho = new HashMap<>();
    }


    public HashMap<Integer, Produto> getCarrinho() {
        return carrinho;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }


    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    public void exibeCarrinho()
    {
        int i = 0;
        for(Produto p : carrinho.values())
        {
            System.out.println(i + " - " + p.getNome());
            i++;
        }
    }
    
    
}
