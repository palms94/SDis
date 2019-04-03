package com.forkexec.hub.ws;

import java.util.List;

import javax.jws.WebService;

import com.forkexec.pts.domain.User;
import com.forkexec.pts.domain.Points;
import

/**
 * This class implements the Web Service port type (interface). The annotations
 * below "map" the Java class to the WSDL definitions.
 */
@WebService(endpointInterface = "com.forkexec.pts.ws.HubPortType",
            wsdlLocation = "HubService.wsdl",
            name ="HubWebService",
            portName = "HubPort",
            targetNamespace="http://ws.hub.forkexec.com/",
            serviceName = "HubService")

public class HubPortImpl implements HubPortType {

	/**
	 * The Endpoint manager controls the Web Service instance during its whole
	 * lifecycle.
	 */
	private HubEndpointManager endpointManager;
    User user;
    Points points;
	/** Constructor receives a reference to the endpoint manager. */
	public HubPortImpl(HubEndpointManager endpointManager) {
		this.endpointManager = endpointManager;
	}
	
	// Main operations -------------------------------------------------------
	
	@Override
	public void activateAccount(String userId) throws InvalidUserIdFault_Exception {
        // TODO Auto-generated method stub
        for (User user : points.getUserList()) {
            if (!userId.equals(user.getUserId())) {
                throwInvalidUserIdFault_Exception("Formato incorrecto");
            }
            user = new User(userId);

        }
    }
	@Override
	public void loadAccount(String userId, int moneyToAdd, String creditCardNumber)
			throws InvalidCreditCardFault_Exception, InvalidMoneyFault_Exception, InvalidUserIdFault_Exception {
            // TODO Auto-generated method stub
            for (User user : points.getUserList()) {
                if (!userId.equals(user.getUserId())) {
                    throwInvalidUserIdFault_Exception("Formato incorrecto");
                }
                if (moneyToAdd != 10 || moneyToAdd != 20 || moneyToAdd != 30 || moneyToAdd != 50){
                    throwInvalidMoneyFault_Exception("Quantia invalida");
                }
            //TODO    if (CARTAOCREDITO EXCEPCAO
                if(userId.equals(user.getUserId()){
                    if(moneyToAdd == 10)
                        Points.getInstance().addPoints(user.getUserEmail(),1000);
                    if(moneyToAdd == 20)
                        Points.getInstance().addPoints(user.getUserEmail(),2100);
                    if(moneyToAdd == 30)
                        Points.getInstance().addPoints(user.getUserEmail(),3300);
                    if(moneyToAdd == 50)
                        Points.getInstance().addPoints(user.getUserEmail(),5500);

            }

        }
	
	
	@Override
	public List<Food> searchDeal(String description) throws InvalidTextFault_Exception {
		// TODO return lowest price menus first
		return null;
	}
	
	@Override
	public List<Food> searchHungry(String description) throws InvalidTextFault_Exception {
		// TODO return lowest preparation time first
		return null;
	}

	
	@Override
	public void addFoodToCart(String userId, FoodId foodId, int foodQuantity)
			throws InvalidFoodIdFault_Exception, InvalidFoodQuantityFault_Exception, InvalidUserIdFault_Exception {
		// TODO 
		
	}

	@Override
	public void clearCart(String userId) throws InvalidUserIdFault_Exception {
		// TODO 
		
	}

	@Override
	public FoodOrder orderCart(String userId)
			throws EmptyCartFault_Exception, InvalidUserIdFault_Exception, NotEnoughPointsFault_Exception {
		// TODO 
		return null;
	}

	@Override
	public int accountBalance(String userId) throws InvalidUserIdFault_Exception {
	    // TODO
		return 0;
	}

	@Override
	public Food getFood(FoodId foodId) throws InvalidFoodIdFault_Exception {
		// TODO
		return null;
	}

	@Override
	public List<FoodOrderItem> cartContents(String userId) throws InvalidUserIdFault_Exception {
		// TODO
		return null;
	}

	// Control operations ----------------------------------------------------

	/** Diagnostic operation to check if service is running. */
	@Override
	public String ctrlPing(String inputMessage) {
		// If no input is received, return a default name.
		if (inputMessage == null || inputMessage.trim().length() == 0)
			inputMessage = "friend";

		// If the service does not have a name, return a default.
		String wsName = endpointManager.getWsName();
		if (wsName == null || wsName.trim().length() == 0)
			wsName = "Hub";

		// Build a string with a message to return.
		StringBuilder builder = new StringBuilder();
		builder.append("Hello ").append(inputMessage);
		builder.append(" from ").append(wsName);
		return builder.toString();
	}

	/** Return all variables to default values. */
	@Override
	public void ctrlClear() {
	}

	/** Set variables with specific values. */
	@Override
	public void ctrlInitFood(List<FoodInit> initialFoods) throws InvalidInitFault_Exception {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void ctrlInitUserPoints(int startPoints) throws InvalidInitFault_Exception {
		// TODO Auto-generated method stub
		
	}
    }



	// View helpers ----------------------------------------------------------

	// /** Helper to convert a domain object to a view. */
	// private ParkInfo buildParkInfo(Park park) {
		// ParkInfo info = new ParkInfo();
		// info.setId(park.getId());
		// info.setCoords(buildCoordinatesView(park.getCoordinates()));
		// info.setCapacity(park.getMaxCapacity());
		// info.setFreeSpaces(park.getFreeDocks());
		// info.setAvailableCars(park.getAvailableCars());
		// return info;
	// }

	
	// Exception helpers -----------------------------------------------------

	/** Helper to throw a new BadInit exception. */
	private void throwBadInit(final String message) throws BadInitFault_Exception {
	BadInitFault faultInfo = new BadInitFault();
	faultInfo.message = message;
	throw new BadInitFault_Exception(message, faultInfo);
    }

    private void throwInvalidUserIdFault_Exception(final String message) throws InvalidUserIdFault_Exception {
        InvalidUserIdFault_Exception faultInfo = new InvalidUserIdFault_Exception();
        faultInfo.message = message;
        throw new InvalidUserIdFault_Exception(message, faultInfo);
    }

    private void throwInvalidMoneyFault_Exception(final String message) throws InvalidMoneyFault_Exception {
        InvalidMoneyFault_Exception faultInfo = new InvalidMoneyFault_Exception();
        faultInfo.message = message;
        throw new InvalidMoneyFault_Exception(message, faultInfo);
    }

    private void throwInvalidCreditCardFault_Exception(final String message) throws InvalidCreditCardFault_Exception {
        InvalidCreditCardFault_Exception faultInfo = new InvalidCreditCardFault_Exception();
        faultInfo.message = message;
        throw new InvalidCreditCardFault_Exception(message, faultInfo);
    }

}
