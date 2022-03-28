package entities;

public enum Type {

	RESERVED_WORD("Palavra Reservada"),
	ARITHMETIC_OPERATOR("Operador Aritimetico"),
	ASSIGNMENT_OPERATOR("Operador de Atribui��o"),
	RELATIONAL_OPERATOR("Operador Relacional"),
	SPECIAL_CHARACTER("Caracter Especial"),
	CHAR("Char"),
	FLOAT("Float"),
	INT("Inteiro"),
	END_CODE("Fim do c�digo"),
	IDENTIFIER("Identificador");

	private String type;
	
	Type(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
}
