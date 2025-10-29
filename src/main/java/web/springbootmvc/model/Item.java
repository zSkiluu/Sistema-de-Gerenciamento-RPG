package web.springbootmvc.model;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo; // Ex: "Equipamento", "Consumível"

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;

    // Caso o item pertença ao inventário de um personagem
    @ManyToOne
    @JoinColumn(name = "personagem_id")
    private Personagem personagem;

    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo; // para saber em qual jogo ele é permitido

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

}

