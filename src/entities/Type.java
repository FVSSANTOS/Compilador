package entities;

public enum Type {

	RESERVED_WORD("Palavra Reservada"),
	ARITHMETIC_OPERATOR("Operador Aritimetico"),
	ASSIGNMENT_OPERATOR("Operador de Atribuição"),
	RELATIONAL_OPERATOR("Operador Relacional"),
	SPECIAL_CHARACTER("Caracter Especial"),
	CHAR("Char"),
	FLOAT("Float"),
	INT("Inteiro"),
	END_CODE("Fim do código"),
	IDENTIFIER("Identificador");

	private String type;
	
	Type(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
}
