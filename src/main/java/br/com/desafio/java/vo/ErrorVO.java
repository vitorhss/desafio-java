package br.com.desafio.java.vo;

public class ErrorVO {
	private String message;
	private String detalhe;

	public ErrorVO() {
		super();
	}

	public ErrorVO(String message) {
		super();
		this.message = message;
	}

	public ErrorVO(String message, String detalhe) {
		super();
		this.message = message;
		this.detalhe = detalhe;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}

}
