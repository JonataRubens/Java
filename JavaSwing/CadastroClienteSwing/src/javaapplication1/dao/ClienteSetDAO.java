/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.dao;

import java.util.HashSet;
import java.util.Set;
import javaapplication1.domain.Aluno;

/**
 *
 * @author Wosley Arruda
 */
public class ClienteSetDAO implements IClienteDAO {
    
    private Set<Aluno> set;
    
    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Aluno cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Aluno clienteEncontrato = null;
        for (Aluno cliente : this.set) {
            if (cliente.getMatricula().equals(cpf)) {
                clienteEncontrato = cliente;
                break;
            }
        }
        
        if (clienteEncontrato != null) {
            this.set.remove(clienteEncontrato);
        }
    }

    @Override
    public void alterar(Aluno cliente) {
        if (this.set.contains(cliente)) {
            for (Aluno clienteCadastrado : this.set) {
                if (clienteCadastrado.equals(cliente)) {
                    clienteCadastrado.setNome(cliente.getNome());
                    clienteCadastrado.setTel(cliente.getTel());
                    clienteCadastrado.setNumero(cliente.getNumero());
                    clienteCadastrado.setEnd(cliente.getEnd());
                    clienteCadastrado.setCidade(cliente.getCidade());
                    clienteCadastrado.setEstado(cliente.getEstado());
                    break;
                }
            }
        }
    }

    @Override
    public Aluno consultar(Long cpf) {
        for (Aluno clienteCadastrado : this.set) {
             if (clienteCadastrado.getMatricula().equals(cpf)) {
                 return clienteCadastrado;
             }
        }
        return null;
    }
    
}
