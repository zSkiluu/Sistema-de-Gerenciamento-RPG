package web.springbootmvc.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "jogos")
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne(optional = false)
    @JoinColumn(name = "mestre_id")
    private Usuario mestre; // o criador do jogo (role=MESTRE)

    @ManyToMany
    @JoinTable(name = "jogo_classes",
        joinColumns = @JoinColumn(name = "jogo_id"),
        inverseJoinColumns = @JoinColumn(name = "classe_id"))
    private Set<Classe> allowedClasses;

    @ManyToMany
    @JoinTable(name = "jogo_itens",
        joinColumns = @JoinColumn(name = "jogo_id"),
        inverseJoinColumns = @JoinColumn(name = "item_id"))
    private Set<Item> allowedItems;

    private String descricao;

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

    public Usuario getMestre() {
        return mestre;
    }

    public void setMestre(Usuario mestre) {
        this.mestre = mestre;
    }

    public Set<Classe> getAllowedClasses() {
        return allowedClasses;
    }

    public void setAllowedClasses(Set<Classe> allowedClasses) {
        this.allowedClasses = allowedClasses;
    }

    public Set<Item> getAllowedItems() {
        return allowedItems;
    }

    public void setAllowedItems(Set<Item> allowedItems) {
        this.allowedItems = allowedItems;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
