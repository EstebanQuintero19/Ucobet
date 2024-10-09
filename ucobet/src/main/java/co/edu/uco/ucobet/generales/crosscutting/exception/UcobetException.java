package co.edu.uco.ucobet.generales.crosscutting.exception;

import co.edu.uco.ucobet.generales.crosscutting.exception.helpers.ObjectHelper;

public class UcobetException extends RunTimeException {
 
	private static final long serialVersionUUID;
	private userMessage;
	private Layer layer;
	
	public UcobetException (final String technicalMessage, final String userMessage, final Layer)
	
	super(ObjectJHelper.getdefault(technicalMessage, TextHelper.applyTrim(userMessage)),
			ObjectHelper.getDefault(rootException, new Exception));
	
	setUserMessage(userMessage);
	setLayer(layer);
}
