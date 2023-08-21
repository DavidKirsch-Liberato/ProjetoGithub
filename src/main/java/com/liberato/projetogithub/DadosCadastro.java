package com.liberato.projetogithub;
import java.util.ArrayList;
import java.util.List;

public class DadosCadastro {
    String nome;
    String email;
    String endereco;
    String cidade;
    String telefone;
    public static List<DadosCadastro> lista = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static List<DadosCadastro> getLista() {
        return lista;
    }

    public static void setLista(List<DadosCadastro> lista) {
        DadosCadastro.lista = lista;
    }
}



