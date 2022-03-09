package appStore;

import java.util.UUID;

public abstract class Utilizador {
	
	private UUID id;
	
	private String nome;
	
	private int idade;

	/**
	 * @param id
	 * @param nomeString
	 * @param idade
	 */
	public Utilizador(UUID id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/**
	 * @return the nomeString
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nomeString the nomeString to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}

