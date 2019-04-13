/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Compra;
import Models.Produto;
import java.util.ArrayList;

/**
 *
 * @author 55489
 */
public class ControladorCompra {
    
    private Compra compra;
    private ArrayList<Compra> listaCompras;
    
    private static ControladorCompra instancia;
    
    public static ControladorCompra getInstance()
    {
        if (instancia == null) {
            instancia = new ControladorCompra();
        }

        return instancia;
    }
    
    public void iniciaCompra()
    {
        this.compra = new Compra();
    }
    
    public void adicionaProdutoNoCarrinho(int codigo, int quantidade)
    {
        Produto p = ControladorProduto.getInstance().getListaProdutos().get(codigo);
        compra.getCarrinho().put(p.getCodigo(), p);
        compra.setPrecoTotal(getCompra().getPrecoTotal() + (p.getPreco() * quantidade));
    }
    
    public void removeProdutoDoCarrinho(int codigo, double precoExibidoNaTabela)
    {
        Produto p = ControladorProduto.getInstance().getListaProdutos().get(codigo);
        System.out.println(compra.getCarrinho().remove(codigo));
        compra.setPrecoTotal(getCompra().getPrecoTotal() - precoExibidoNaTabela);
    }
    

    
    
    public void cancelarCompra()
    {
        this.compra = null;
    }
    
    public void concluirCompra()
    {
        getListaCompras().add(getCompra());
    }
    
    public void efetuarPagamento()
    {
        
    }
    
    /*public void imprimeCupomFiscal()
    {
        for(Produto p : getCompra().getCarrinho())
        {
            System.out.println("Produto: " + p.getNome() + "Preço: " + p.getPreco());
        }
        
        System.out.println("Preço total: " + getCompra().getPrecoTotal());
        
    }*/

    public Compra getCompra() {
        return compra;
    }

    public ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }
    
    
}