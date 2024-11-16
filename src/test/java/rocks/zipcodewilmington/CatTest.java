package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

        Cat cat = new Cat(null,null, null);





        @Test

        public void speakTest(){

            String expected = "meow!";

            String actual= cat.speak();

            Assert.assertEquals(expected, actual);

        }

        
        @Test
        
        public void getIdTest(){
            
            Integer expected = 10;

            cat.setid(expected);

            Integer actual = cat.getId();

            Assert.assertEquals(expected, actual);
        }
    
    
    
    






    @Test



    public void getnameTest(){

        String expected = "Scrappy";

        cat.setName(expected);

        String actual = cat.getName();

        Assert.assertEquals(expected, actual);

    }


    @Test

    public void getBirthDate(){


        Date expected = new Date(2024,1,1);


        cat.setBirthDate(expected);

        Date actual = cat.getBirthDate();

        Assert.assertEquals(expected,actual);

    }


    @Test

    public void eatTest(){

        int firstMealCount = cat.getNumberOfMealsEaten();
        int secondMealcount = firstMealCount;
        int expeted = firstMealCount;


        Food food = new Food();
        cat.eat(food);

        Assert.assertEquals(expeted,secondMealcount);



    }

    @Test


    public void getNumberOfMealsEaten(){

    }

    @Test


    public void testAnimalInherance(){

            boolean expected = true;

            boolean actual = cat instanceof Animal;
            
            Assert.assertEquals(expected, actual);
    }

        @Test
    public void testMamamlInherance(){

        boolean expected = true;

        boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
