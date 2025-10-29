package web.springbootmvc.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue("MESTRE")
@Table(name = "mestres")
public class Mestre extends Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private String login;
    private String senha;

    @OneToMany(mappedBy = "mestre", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Jogo> jogosCriados;

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
