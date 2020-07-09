package com.codedifferently.stayready.lab04;

import org.junit.Assert;
import org.junit.Test;

public class NumbersTest {

    @Test
    public void oneToTenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
    	Numbers numbers = new Numbers();
    	String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When

    	String actual = numbers.oddNumbers();
        //: Then
    	
    	Assert.assertEquals("The two strings are equal",expected,actual);
    }

    @Test
    public void squaresTest(){
        //: Given
        Numbers aNumbers = new Numbers();
        String expected= "**Output**\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
        String actual = aNumbers.squares();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void random4Test(){
        //: Given
        Numbers aNumbers = new Numbers();
        String expected = "**Output**\n3\n5\n2\n8";

        //: When
        String actual = aNumbers.random4();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evenTest(){
        //: Given
        Numbers aNumbers = new Numbers();
        String expected = "**Output**\n2\n4\n6\n8\n10\n12\n14\n16\n18";

        //: When
        String actual = aNumbers.even(20);

        //: Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void powersTest(){
        //: Given
        Numbers powerNumbers = new Numbers();
        String expected = "**Output**\n2\n4\n8\n16\n32\n64\n128\n256";

        //: When
        String actual = powerNumbers.powers(8);

        //: Then
        Assert.assertEquals(expected,actual);
    }

}
