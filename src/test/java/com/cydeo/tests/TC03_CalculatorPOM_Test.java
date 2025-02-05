package com.cydeo.tests;

import com.cydeo.pages.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TC03_CalculatorPOM_Test {

    CalculatorPage page = new CalculatorPage();

    @Test
    public void multiplyTest(){
        // 4 * 5 equals 20

        page.clickSingleDigit(4);
        page.multiplyButton.click();
        page.clickSingleDigit(5);
        page.equalsButton.click();

        String resultText = page.result.getText();


        // verification
        Assertions.assertEquals(20,Integer.parseInt(resultText));



    }


}
