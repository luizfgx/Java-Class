package br.com.senai;

public class Perfil extends Login {
    private String nome;
    private String email;
    private String senha;

    public Perfil(String nome, String email, String senha, String nome1, String email1, String senha1) {
        super(nome, email, senha);
        this.nome = nome1;
        this.email = email1;
        this.senha = senha1;



    }


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

