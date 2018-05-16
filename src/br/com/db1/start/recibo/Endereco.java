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
	
	public String getCepFormatado() {
			return cep.toString();	
	}
}

