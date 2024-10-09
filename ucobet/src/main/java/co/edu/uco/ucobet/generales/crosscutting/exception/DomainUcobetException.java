package co.edu.uco.ucobet.generales.crosscutting.exception;

import co.edu.uco.ucobet.generales.crosscutting.exception.enums.Layer;

public class DomainUcobetException extends UcoBetException{
	
	private static final long serialVersionUID = 1L;
	
	public DomainUcobetException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.DOMAIN, rootException);
	}

	public static final DomainUcobetException create(final String technicalMessage, final String userMessage, final Exception rootException) {
	 return new DomainUcobetException(technicalMessage, userMessage, rootException);
	}
}
