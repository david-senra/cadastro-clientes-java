/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsenra.dao;

import dsenra.domain.Cliente;

import java.util.*;

public class ClienteSetDao implements IClienteDAO {

    private final Set<Cliente> clienteSet;

    public ClienteSetDao () {
        this.clienteSet = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.clienteSet.contains(cliente)) {
            return false;
        }
        this.clienteSet.add(cliente);
        return true;
    }

    @Override
    public void excluir(String cpf) {
        clienteSet.removeIf(cliente -> cliente.getCpf().equals(cpf));
    }

    @Override
    public void alterar(Cliente cliente) {
        for (Cliente clienteAcessado : this.clienteSet) {
            if (clienteAcessado == cliente) {
                clienteAcessado.setNome(cliente.getNome());
                clienteAcessado.setTel(cliente.getTel());
                clienteAcessado.setNumero(cliente.getNumero());
                clienteAcessado.setCidade(cliente.getCidade());
                clienteAcessado.setEstado(cliente.getEstado());
                clienteAcessado.setEndereco(cliente.getEndereco());
            }
        }
    }

    @Override
    public Cliente consultar(String cpf) {
        for (Cliente cliente : this.clienteSet) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.clienteSet;
    }

    @Override
    public Integer consultarNumero() {
        return this.clienteSet.size();
    }
}
