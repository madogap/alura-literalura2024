package com.alura.literalura.Curso.model;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    private String idioma;
    private Integer quantidadeDownloads;
    @ManyToOne
    private Autor autor;

    public Livro(){}

    public Livro(DadosLivro data){
        this.nome = data.nomeLivro();
        this.idioma = String.join("," , data.idiomas());
        this.quantidadeDownloads = data.quantidadeDownloads();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDownloads() {
        return quantidadeDownloads;
    }

    public void setQuantidadeDownloads(Integer quantidadeDownloads) {
        this.quantidadeDownloads = quantidadeDownloads;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", idioma='" + idioma + '\'' +
                ", quantidadeDownloads=" + quantidadeDownloads +
                ", autor=" + autor +
                '}';
    }
}
