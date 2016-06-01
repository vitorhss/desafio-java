package br.com.desafio.java.vo;

public class MessageVO {
	private String message;
	private String messageDetail;
	
	public MessageVO(String message) {
		super();
		this.message = message;
	}

	public MessageVO(String message, String messageDetail) {
		super();
		this.message = message;
		this.messageDetail = messageDetail;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageDetail() {
		return messageDetail;
	}

	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
	}

}
