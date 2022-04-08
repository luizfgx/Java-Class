package br.com.senai;

public class RecSenha {
    private String nome;
    private String email;
    private String senha;
    private String confirmsenha;

    public RecSenha(String nome, String email, String senha, String confirmsenha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.confirmsenha = confirmsenha;


    }

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmsenha() {
        return confirmsenha;
    }

    public void setConfirmsenha(String confirmsenha) {
        this.confirmsenha = confirmsenha;
    }
}

