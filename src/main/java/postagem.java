import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.generation.blogpessoal.model.Postagem;
import com.generation.farmacia.Tema;

import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

public class postagem {

@UpdateTimestamp
private LocalDateTime data;
@ManyToOne
@JsonIgnoreProperties("postagem")
private Tema tema;
private Long id;
@NotNull (message = "o Atributo Descrição é obrigatório")
private String descricao;
@JsonIgnoreProperties("tema")
private List<Postagem> postagem;
public Long getId() {
	return this.id;
}

public LocalDateTime getData() {
	return data;
}

public void setData(LocalDateTime data) {
	this.data = data;
}

public Tema getTema() {
	return tema;
}

public void setTema(Tema tema) {
	this.tema = tema;
}

public void setId(Long id) {
	this.id = id;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public List<Postagem> getPostagem() {
	return postagem;
}

public void setPostagem(List<Postagem> postagem) {
	this.postagem = postagem;
}

public String getDescricao() {
	return descricao;
}

}
