/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodesktop;

import java.util.ArrayList;

/**
 *
 * @author Windows
 */
public class Controller {
    private static Controller instancia;
    
    private ArrayList<Cliente>listaCliente;
    private ArrayList<Carro>listaCarro;
    private ArrayList<Relatorio>listaRelatorio;
    private ArrayList<Servico>listaServico;
    private ArrayList<Pecas>listaPeca;
    
    public static Controller getInstance(){
        if(instancia == null) {
            return instancia = new Controller();
        }else {
            return instancia;
        }
    }
    
    private Controller(){
        listaCliente = new ArrayList<>();
        listaCarro = new ArrayList<>();
        listaRelatorio = new ArrayList<>();
        listaServico = new ArrayList<>();
        listaPeca = new ArrayList<>();
    }
    
    public void salvarPecas(Pecas peca){
        listaPeca.add(peca);
    }
    
    public ArrayList<Pecas> retornarPeca(){
        return listaPeca;
    }
    
    public void salvarServico(Servico servico){
        listaServico.add(servico);
    }
    
    public ArrayList<Servico> retornarServico(){
        return listaServico;
    }
    
    public void salvarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }
    
    public ArrayList<Cliente> retornarCliente() {
        return listaCliente;
    }
    
    public void salvarCarro(Carro carro){
        listaCarro.add(carro);
    }
    
    public ArrayList<Carro> retornarCarro() {
        return listaCarro;
    }
    
    public void salvarRelatorio(Relatorio relatorio){
        listaRelatorio.add(relatorio);
    }
    
    public ArrayList<Relatorio> retornarRelatorio() {
        return listaRelatorio;
    }
}
