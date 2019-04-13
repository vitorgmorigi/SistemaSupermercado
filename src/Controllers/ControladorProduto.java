/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Produto;
//import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 55489
 */
public class ControladorProduto {
    
    private HashMap<Integer,Produto> listaProdutos;
    
    private static ControladorProduto instancia;
    public static ControladorProduto getInstance()
    {
        if (instancia == null) {
            instancia = new ControladorProduto();
        }

        return instancia;
    }
    
    public Produto adicionaProduto(int codigo, String nome, double preco)
    {
        Produto p = new Produto(codigo, nome, preco);
        listaProdutos.put(listaProdutos.size(), p);
        return p;
    }

    public HashMap<Integer, Produto> getListaProdutos() {
        return listaProdutos;
    }
    
    public void criaListaProdutos(){
        listaProdutos = new HashMap<>();
        listaProdutos.put(0, new Produto(0, "Papel Higienico", 17.5));
        listaProdutos.put(1, new Produto(1, "Arroz", 5.5));
        listaProdutos.put(2, new Produto(2, "Macarrão", 2.9));
        listaProdutos.put(3, new Produto(3, "Feijão", 3.3));
        
    }
    
    
    
}
