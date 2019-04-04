	public List<Food> searchDeal(String description) throws InvalidTextFault_Exception {
		// TODO return lowest price menus first
		if(description == null)
			InvalidTextFault_Exception("Texto de pesquisa não pode ser vazio");

		description = description.trim();		//retira os espaços da palavra

		if(description.length() == 0)
			throwInvalidTextFault("Texto de pesquisa não pode ser só espaços");


		List<Food> menus = new ArraysList<Food>();
		//ATENçAO!!!! isto não bate certo porque temos de ir procurar

		List<Food> menuDeal = new ArraysList<Food>();

		for(Food food: menus) {
			if(food.getEntree().contains(description))
				menuDeal.add(food);
			if(food.getPlate().contains(description))
				menuDeal.add(food);
			if(food.getDessert().contains(description))
				menuDeal.add(food);
		}

		//envia Lista ordenada - será que dá?
		return Collections.sort(menuDeal.getPrice());
	}

	/*devolve entrada, prato principal ou sobremesa com a descrição
		sort crescente tempo
	 */
	
	
	
	
	public List<Food> searchHungry(String description) throws InvalidTextFault_Exception {
		// TODO return lowest preparation time first
		if (description == null)
			InvalidTextFault_Exception("Texto de pesquisa não pode ser vazio");

		description = description.trim();        //retira os espaços da palavra

		if (description.length() == 0)
			throwInvalidTextFault("Texto de pesquisa não pode ser só espaços");

		List<Food> menus = new ArraysList<Food>();
		//ATENÇAO!!!! isto não bate certo porque temos de ir procurar

		List<Food> menuHungry = new ArraysList<Food>();

		for (Food food : menus) {
			if (food.getEntree().contains(description))
				menuHungry.add(food);
			if (food.getPlate().contains(description))
				menuHungry.add(food);
			if (food.getDessert().contains(description))
				menuHungry.add(food);
		}
		//envia Lista ordenada - será que dá?
		return Collections.sort(menuDeal.getPreparationTime());
	}
