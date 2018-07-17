package com.mission.control.missioncontrolflighrecorder.model;

public class Cliente {

	private Integer id;
	private String nome;
	private String email;
	private String endereco;
	private String cidade;
	private String uf;
	private String cartaocredito;
	private String bandeira;
	private String macAddress;
	private String ip;

	public Cliente() {
	}

	public Cliente(Integer id, String nome, String email, String endereco, String cidade, String uf, String cartaocredito,
			String bandeira, String macAddress, String ip) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
		this.cartaocredito = cartaocredito;
		this.bandeira = bandeira;
		this.macAddress = macAddress;
		this.ip = ip;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCartaocredito() {
		return cartaocredito;
	}

	public void setCartaocredito(String cartaocredito) {
		this.cartaocredito = cartaocredito;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", cidade="
				+ cidade + ", uf=" + uf + ", cartaocredito=" + cartaocredito + ", bandeira=" + bandeira
				+ ", macAddress=" + macAddress + ", ip=" + ip + "]";
	}

}
