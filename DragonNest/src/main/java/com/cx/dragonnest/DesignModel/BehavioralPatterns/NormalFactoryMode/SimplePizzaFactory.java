package com.cx.dragonnest.DesignModel.BehavioralPatterns.NormalFactoryMode;

/**
 * @author chenxin
 * @date 2023/07/14 14:58
 */
public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;
		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;
	}
}
