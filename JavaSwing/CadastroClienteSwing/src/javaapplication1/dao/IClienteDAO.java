/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.dao;

import javaapplication1.domain.Aluno;

/**
 *
 * @author Wosley Arruda
 */
public interface IClienteDAO {
    
    public Boolean cadastrar(Aluno cliente);
    
    public void excluir(Long cpf);
    
    public void alterar(Aluno cliente);
    
    public Aluno consultar(Long cpf);
}
