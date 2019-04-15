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
        listaProdutos.put(0, new Produto(0, "Papel Higienico Personal Vip", 15.90));
        listaProdutos.put(1, new Produto(1, "Cerveja Antarctica 350ml", 1.89));
        listaProdutos.put(2, new Produto(2, "Chocolate Milka 90g", 6.99));
        listaProdutos.put(3, new Produto(3, "Café Melitta Tradicicional", 9.29));
        listaProdutos.put(4, new Produto(4, "Óleo de Soja Liza 900 ml", 2.79));
        listaProdutos.put(5, new Produto(4, "Achocolatado Nescau 400g", 4.99));
        
    }
    
    
    
}
