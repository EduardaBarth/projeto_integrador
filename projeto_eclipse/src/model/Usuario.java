package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Usuario {
	
	String login;
	String nome;
	String senha;
	boolean permissao;
	int idUsuario;
	LocalDate dataNascimento;
	String cpfUsuario;
	int idade;
	
	public Usuario() {
	}

	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public Usuario(String login, String nome, String senha, LocalDate dataNascimento, String cpfUsuario) {
		super();
		idade = Period.between(dataNascimento, LocalDate.now()).getYears();
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.cpfUsuario = cpfUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isPermissao() {
		return permissao;
	}

	public void setPermissao(boolean permissao) {
		this.permissao = permissao;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public Date getDatanascimentoDB() {
		return Date.from(dataNascimento.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
