package web.springbootmvc.model;

import jakarta.persistence.*;
import java.util.List;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

@Entity
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String nome;
    private boolean ativo;

    @ManyToMany
    @JoinColumn(name = "mestre_id")
    private Mestre mestre;

    @OneToMany(mappedBy = "jogo", cascade = CascadeType.ALL)
    private List<Classe> classesDisponiveis;


    @OneToMany(mappedBy = "jogo", cascade = CascadeType.ALL)
    private List<Item> itensPermitidos;

    @OneToMany(mappedBy = "jogo", cascade = CascadeType.ALL)
    private List<Personagem> personagens;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Mestre getMestre() {
        return mestre;
    }

    public void setMestre(Mestre mestre) {
        this.mestre = mestre;
    }

    public List<Classe> getClassesDisponiveis() {
        return classesDisponiveis;
    }

    public void setClassesDisponiveis(List<Classe> classesDisponiveis) {
        this.classesDisponiveis = classesDisponiveis;
    }

    public List<Item> getItensPermitidos() {
        return itensPermitidos;
    }

    public void setItensPermitidos(List<Item> itensPermitidos) {
        this.itensPermitidos = itensPermitidos;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    
}
