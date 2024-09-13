/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.domain;

import java.util.Objects;

/**
 *
 * @author Wosley Arruda
 */
public class Aluno {
    
    private String nome;
    private Long Matricula;
    private Double nota1;
    private Double nota2;
    private Double situacao;
    private Long tel;
    private String end;
    private Integer numero;
    private String cidade;
    private String estado;

    public Aluno(String nome, String matricula, double nota1, double nota2, String tel, String end, String num, String cidade, String estado) {
        this.nome = nome;
        this.Matricula = Long.valueOf(matricula);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.situacao = (nota1+ nota2)/2;
        this.tel = Long.valueOf(tel);
        this.end = end;
        this.numero = Integer.valueOf(num);
        this.cidade = cidade;
        this.estado = estado;
        
    }
    public double getNota1(){
        return nota1;
    }
    
     public double getNota2(){
        return nota2;
    }
    
     public String getSituacao(){
         if(situacao >= 7){
             String resu = "Aprovado";
         return resu;
         }else  {
             String resu = "Reprovado";
             return resu;
         }
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return Matricula;
    }

    public void setMatricula(Long Matricula) {
        this.Matricula = Matricula;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.Matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.Matricula, other.Matricula)) {
            return false;
        }
        return true;
    }

//    @Override
//    public int compareTo(Aluno cliente) {
//        return Long.compare(this.Matricula, cliente.getCpf());
//    }

    
}
