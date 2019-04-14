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
    private static ArrayList<Compra> listaCompras;
    
    private static ControladorCompra instancia;
    
    public static ControladorCompra getInstance()
    {
        if (instancia == null) {
            instancia = new ControladorCompra();
            listaCompras = new ArrayList<>();
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
    
    public boolean verificaSeOProdutoEstaNoCarrinho(int codigo)
    {
        return compra.getCarrinho().get(codigo) != null;
    }
    

    
    
    public void cancelarCompra()
    {
        this.compra = null;
    }
    
    public void concluirCompra()
    {
        listaCompras.add(compra);
    }
    
    public void efetuarPagamento()
    {
        
    }
    
    public String imprimeCupomFiscal(int codigo, int quantidade)
    {
        
        String cupom = compra.getCarrinho().get(codigo).getNome() + "\n"+
                "Preço: " + Double.toString(compra.getCarrinho().get(codigo).getPreco()) + "\n" +
                "Quantidade: " + Integer.toString(quantidade);
        
        /*for(Produto p : compra.getCarrinho().values())
        {
            cupom += (p.getNome() + "\n" + 
                    "Preço: " + Double.toString(p.getPreco()) + "\n" + 
                    "Quantidade: " + Integer.toString(quantidade) + "\n\n");
        }*/
        
        
        return cupom;
        
    }

    public Compra getCompra() {
        return compra;
    }

    public ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }
    
    public String percorreListaCompras()
    {
        String saida = "";
        int i = 1;
        for(Compra c : listaCompras)
        {
            saida += ("Compra " + Integer.toString(i) + " - " + "Valor venda: R$" + c.getPrecoTotal() + "\n");
            i++;
        }
        return saida;
    }
    
    public double calculaTotalArrecadado()
    {
        double total = 0;
        for(Compra c : listaCompras)
        {
            total += c.getPrecoTotal();
        }
        
        return total;
    }
    
}
