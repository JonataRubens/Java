/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javaapplication1.domain.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author Wosley Arruda
 */
public class ClienteMapDAO implements IClienteDAO {
    
    private Map<Long, Aluno> map;
    
    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Aluno cliente) {
        if (map.containsKey(cliente.getMatricula())) {
            return false;
        }
        
        map.put(cliente.getMatricula(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Aluno clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getMatricula(), clienteCadastrado);
    }

    @Override
    public void alterar(Aluno cliente) {
        Aluno clienteCadastrado = map.get(cliente.getMatricula());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTel(cliente.getTel());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setEnd(cliente.getEnd());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEstado(cliente.getEstado());
    }

    @Override
    public Aluno consultar(Long Matricula) {
        return this.map.get(Matricula);
    }
    
}
