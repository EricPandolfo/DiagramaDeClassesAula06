package br.com.db1.start.recibo;

public class Executadora {

	public static void main(String[] args) {

		exibirCepFormatado(78850000);
		exibirCepFormatado(45212235);

		exibirCpfFormatado("11111111111");
		exibirCpfFormatado("111111111112");
	}

	private static void exibirCpfFormatado(String documento) {

		Emitente emitente = new Emitente();
		emitente.setDocumento(documento);
		System.out.println(emitente.getDocumentoFormatado());
	}

	private static void exibirCepFormatado(Integer cep) {

		Endereco endereco = new Endereco();
		endereco.setCep(cep);
		System.out.println(endereco.getCepFormatado());

	}

}
