package com.sb.designpatterns.builder.first;

public class TestBuilder {

	public static void main(String[] args) {
		NutritionFacts facts = new NutritionFacts.Builder().setCalories(10).setCarbohydrate(100).setFat(1)
				.setServings(20).setServingSize(25).setSodium(9).build();
		System.out.println(facts.getSodium());

	}

}
