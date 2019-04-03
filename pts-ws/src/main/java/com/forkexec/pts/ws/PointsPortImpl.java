package com.forkexec.pts.ws;


import com.forkexec.pts.domain.User;
import com.forkexec.pts.domain.Points;

import javax.jws.WebService;

/**
 * This class implements the Web Service port type (interface). The annotations
 * below "map" the Java class to the WSDL definitions.
 */
@WebService(endpointInterface = "com.forkexec.pts.ws.PointsPortType",
            wsdlLocation = "PointsService.wsdl",
            name = "PointsWebService",
            portName = "PointsPort",
            targetNamespace = "http://ws.pts.forkexec.com/",
            serviceName = "PointsService")

public class PointsPortImpl implements PointsPortType {

    /**
     * The Endpoint manager controls the Web Service instance during its whole
     * lifecycle.
     */
    private final PointsEndpointManager endpointManager;
    private Points points;
    /** Constructor receives a reference to the endpoint manager. */
    public PointsPortImpl(final PointsEndpointManager endpointManager) {
	this.endpointManager = endpointManager;
    }

    // Main operations -------------------------------------------------------

    @Override
	public void activateUser(final String userEmail) throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {

        for (User user : points.getUserList()){
            if (userEmail.equals(user.getUserEmail())) {
                throwEmailAlreadyExistsFault_Exception("Email ja existe");
            }
            if (!user.checkEmail(userEmail)){
                throwInvalidEmailFault_Exception("Formato incorrecto");
            }
            user = new User(userEmail);
        }
    }


    @Override
    public int pointsBalance(final String userEmail) throws InvalidEmailFault_Exception {
        for (User user : points.getUserList()) {
            if (!user.checkEmail(userEmail)) {
                throwInvalidEmailFault_Exception("Formato incorrecto");

                return user.getUserPoints();
            }
            return -1;
        }
    }

    @Override
    public int addPoints(final String userEmail, final int pointsToAdd)
	    throws InvalidEmailFault_Exception, InvalidPointsFault_Exception {

        for (User user : points.getUserList()) {
            if (!user.checkEmail(userEmail)) {
                throwInvalidEmailFault_Exception("Formato incorrecto");
            }
            if(pointsToAdd < 0) {
                throwInvalidPointsFault_Exception("Pontos negativos");
            }
                points.addPoints(userEmail,pointsToAdd);

            }
        return -1;
    }

    @Override
    public int spendPoints(final String userEmail, final int pointsToSpend)
	    throws InvalidEmailFault_Exception, InvalidPointsFault_Exception, NotEnoughBalanceFault_Exception {

            for (User user : points.getUserList()) {
                if (!user.checkEmail(userEmail)) {
                    throwInvalidEmailFault_Exception("Formato incorrecto");
                }
                if(pointsToSpend < 0) {
                    throwInvalidPointsFault_Exception("Pontos negativos");
                }
                if(pointsToSpend > user.getUserPoints()) {
                    throwNotEnoughBalanceFault_Exception("Pontos negativos");
                }
                   points.spendPoints(pointsToSpend);

                }
                return -1;
            }


    // Control operations ----------------------------------------------------
    // TODO
    /** Diagnostic operation to check if service is running. */
    @Override
    public String ctrlPing(String inputMessage) {
	// If no input is received, return a default name.
	if (inputMessage == null || inputMessage.trim().length() == 0)
	    inputMessage = "friend";

	// If the park does not have a name, return a default.
	String wsName = endpointManager.getWsName();
	if (wsName == null || wsName.trim().length() == 0)
	    wsName = "Park";

	// Build a string with a message to return.
	final StringBuilder builder = new StringBuilder();
	builder.append("Hello ").append(inputMessage);
	builder.append(" from ").append(wsName);
	return builder.toString();
    }

    /** Return all variables to default values. */
    @Override
    public void ctrlClear() {
        //TODO
    }

    /** Set variables with specific values. */
    @Override
    public void ctrlInit(final int startPoints) throws BadInitFault_Exception {

    }

    // Exception helpers -----------------------------------------------------

    /** Helper to throw a new BadInit exception. */
    private void throwBadInit(final String message) throws BadInitFault_Exception {
        final BadInitFault faultInfo = new BadInitFault();
        faultInfo.message = message;
        throw new BadInitFault_Exception(message, faultInfo);
    }
    private void throwInvalidEmailFault_Exception(final String message) throws InvalidEmailFault_Exception {
        InvalidEmailFault_Exception faultInfo = new InvalidEmailFault_Exception();
        faultInfo.message = message;
        throw new InvalidEmailFault_Exception(message, faultInfo);
    }
    private void throwInvalidPointsFault_Exception(final String message) throws InvalidPointsFault_Exception {
        InvalidPointsFault_Exception faultInfo = new InvalidPointsFault_Exception();
        faultInfo.message = message;
        throw new InvalidPointsFault_Exception(message, faultInfo);
    }
    private void throwNotEnoughBalanceFault_Exception(final String message) throws NotEnoughBalanceFault_Exception {
        NotEnoughBalanceFault_Exception faultInfo = new NotEnoughBalanceFault_Exception();
        faultInfo.message = message;
        throw new NotEnoughBalanceFault_Exception(message, faultInfo);
    }
    private void throwEmailAlreadyExistsFault_Exception(final String message) throws EmailAlreadyExistsFault_Exception {
        EmailAlreadyExistsFault_Exception faultInfo = new EmailAlreadyExistsFault_Exception();
        faultInfo.message = message;
        throw new EmailAlreadyExistsFault_Exception(message, faultInfo);
    }
}
