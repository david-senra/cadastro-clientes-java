/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsenra.domain;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String cpf;
    private String tel;
    private String endereco;
    private Long numero;
    private String estado;
    private String cidade;

    public Cliente (String nome, String cpf, String tel, String cidade, String estado, String endereco, String numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.cidade = cidade;
        this. estado = estado;
        this. endereco = endereco;
        this.numero = Long.valueOf(numero.trim());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente otherCliente = (Cliente) obj;
        return Objects.equals(cpf, otherCliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return """
               Cliente:
               
               Nome: """ + nome +
                "\nCpf: " + cpf +
                "\n";
    }
}
