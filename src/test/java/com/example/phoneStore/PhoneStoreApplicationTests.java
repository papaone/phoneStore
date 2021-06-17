package com.example.phoneStore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class PhoneStoreApplicationTests {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

	@Test
	void checkLowCostPhone() {
		Phone actualPhoneLowCost = context.getBean("lowCostPhone", Phone.class);
		String result = actualPhoneLowCost.readyForSale();

		Assert.isTrue(result.equals("Phone ready for sale: LowCost"));
		System.out.println(result);
	}

	@Test
	void checkMidCostPhone() {
		Phone actualPhoneLowCost = context.getBean("midCostPhone", Phone.class);
		String result = actualPhoneLowCost.readyForSale();

		Assert.isTrue(result.equals("Phone ready for sale: MidCost"));
		System.out.println(result);
	}

}
