package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {



@Test

   public void DogTest(){


String name = "Goldie";
Date birthDate = new Date ();

Dog dog = AnimalFactory.createDog(name, birthDate);

String actualName = ((Dog) dog).getName();
Date actualBirthdate = dog.getBirthDate();


    Assert.assertEquals(name, actualName);

    Assert.assertEquals(birthDate, actualBirthdate);

    }




    @Test

    public void removeDogTest(){


        Dog dog = new Dog(null,null, null);

        DogHouse.add(dog);
        Integer dogFromCatHouse = DogHouse.getNumberOfDogs();
        Assert.assertNotNull(dogFromCatHouse);

        DogHouse.remove(dog);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertNull(actual);


    }



    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
