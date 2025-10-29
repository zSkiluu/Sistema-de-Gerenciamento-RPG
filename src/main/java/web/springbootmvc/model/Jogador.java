package web.springbootmvc.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Jogador extends Usuario {

    @OneToMany(mappedBy = "jogador", cascade = CascadeType.ALL)
    private List<Personagem> personagens;

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    
}

