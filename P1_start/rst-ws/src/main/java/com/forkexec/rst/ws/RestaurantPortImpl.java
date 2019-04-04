package com.forkexec.rst.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.forkexec.rst.domain.Meal;
import com.forkexec.rst.domain.Menu;
import com.forkexec.rst.domain.Restaurant;

/**
 * This class implements the Web Service port type (interface). The annotations
 * below "map" the Java class to the WSDL definitions.
 */
@WebService(endpointInterface = "com.forkexec.rst.ws.RestaurantPortType",
            wsdlLocation = "RestaurantService.wsdl",
            name ="RestaurantWebService",
            portName = "RestaurantPort",
            targetNamespace="http://ws.rst.forkexec.com/",
            serviceName = "RestaurantService"
)
public class RestaurantPortImpl implements RestaurantPortType {

	/**
	 * The Endpoint manager controls the Web Service instance during its whole
	 * lifecycle.
	 */
	private RestaurantEndpointManager endpointManager;

	/** Constructor receives a reference to the endpoint manager. */
	public RestaurantPortImpl(RestaurantEndpointManager endpointManager) {
		this.endpointManager = endpointManager;
	}
	
	// Main operations -------------------------------------------------------
	
	@Override
	public Menu getMenu(String menuId) throws BadMenuIdFault_Exception {
		//check menu id
		if(menuId == null) 
			throwBadMenuIdFault("Menu identifier cannot be null!");
		menuId = menuId.trim();
		if(menuId.length() == 0)
			throwBadMenuIdFault("Menu identifier cannot be empty or whitespace!");
					
		//retrieve menu
		Restaurant rest = Restaurant.getInstance();
		Menu m = rest.getMenu(menuId);
		if (m != null) {
			return m;
		}		
		return null;
	}
	
	@Override
	public List<Menu> searchMenus(String descriptionText) throws BadTextFault_Exception {
		// check menu id
		if (descriptionText == null)
			throwBadTextFault("Menu description cannot be null!");
		descriptionText = descriptionText.trim();
		if (descriptionText.length() == 0)
			throwBadTextFault("Menu description cannot be empty or whitespace!");
		
		List<Menu> list = new ArrayList<Menu>();
		
		for(Menu m: list){
			if(m.getDescription().contains(descriptionText)) {
				list.add(m);
			}
		}
		return list;
	}

	@Override
	public MenuOrder orderMenu(String menuId, int quantity)
			throws BadMenuIdFault_Exception, BadQuantityFault_Exception, InsufficientQuantityFault_Exception {
		//check menu id
		if(menuId == null) 
			throwBadMenuIdFault("Menu identifier cannot be null!");
		menuId = menuId.trim();
		if(menuId.length() == 0)
			throwBadMenuIdFault("Menu identifier cannot be empty or whitespace!");
		if(quantity <= 0)
			throwBadQuantityFault("Quantity cannot be 0 or less!");
		
		Restaurant rest = Restaurant.getInstance();
		Menu m = rest.getMenu(menuId);
		if (m != null) {
			if(quantity > m.getQuantity())
				throwInsufficientQuantityFault("Quantity cannot be more than Menu's quantity!");
			m.changeQuantity(quantity);
			MenuOrder order = new MenuOrder(m, quantity, m.getCost()*quantity);
			return order;
		}
		return null;
	}
		
	// Control operations ----------------------------------------------------

	/** Diagnostic operation to check if service is running. */
	@Override
	public String ctrlPing(String inputMessage) {
		// If no input is received, return a default name.
		if (inputMessage == null || inputMessage.trim().length() == 0)
			inputMessage = "friend";

		// If the park does not have a name, return a default.
		String wsName = endpointManager.getWsName();
		if (wsName == null || wsName.trim().length() == 0)
			wsName = "Restaurant";

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
	public void ctrlInit(List<MenuInit> initialMenus) throws BadInitFault_Exception {
		// TODO Auto-generated method stub
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
	
	private void throwBadMenuIdFault(final String message) throws BadMenuIdFault_Exception {
		BadMenuIdFault_Exception faultInfo = new BadMenuIdFault_Exception();
		faultInfo.message = message;
		throw new BadMenuIdFault_Exception(message, faultInfo);
	}



}