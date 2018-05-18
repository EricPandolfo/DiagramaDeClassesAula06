package br.com.db1.start.recibo;

import br.com.db1.start.enums.TipoLogradouro;

public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private Integer cep;
	private TipoLogradouro tipoLogradouro;
	private Cidade cidade;

	public Integer getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getCepFormatado() {

		String cepFormatado = cep.toString();
		cepFormatado = cepFormatado.substring(0, 5) + "-" + cepFormatado.substring(5);

		return cepFormatado.toString();

	}

}
