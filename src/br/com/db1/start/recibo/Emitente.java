package br.com.db1.start.recibo;

public class Emitente {

	private String nome;
	private String documento;

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	private byte[] assinatura;

	public String getDocumentoFormatado() {

		String documentoFormatado = documento;

		if (documentoFormatado.length() == 11) {

			documentoFormatado = documentoFormatado.substring(0, 3) + "." + documentoFormatado.substring(3, 6) + "."
					+ documentoFormatado.substring(6, 9) + "-" + documentoFormatado.substring(9);
			return documentoFormatado;
		}

		return "Documento nao e um CPF";
	}

}
