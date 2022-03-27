package entities;

public class Token {

	private String content;
	private Type type;
	
	public Token(String content, Type type) {
		this.content = content;
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Conteúdo -> " + content + ", Type -> " + type.getType();
	}
	
	
}
