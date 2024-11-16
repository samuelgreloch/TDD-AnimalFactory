package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {


    @Test

    public void addCat(){

        Cat expected = new  Cat(null,null,3);
        Integer id = expected.getId();

        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(id);

        Assert.assertEquals(expected, actual);

    }


    @Test

    public void removeIdTest(){

        int id = 3;
        Cat cat = new Cat(null,null, id);

        CatHouse.add(cat);
        Cat catFromCatHouse = CatHouse.getCatById(id);
        Assert.assertNotNull(catFromCatHouse);

        CatHouse.remove(id);
        Cat actual = CatHouse.getCatById(id);

        Assert.assertNull(actual);


    }


    @Test

    public void removeCatTest(){


        Cat cat = new Cat(null,null, null);

        CatHouse.add(cat);
        Integer catFromCatHouse = CatHouse.getNumberOfCats();
        Assert.assertNotNull(catFromCatHouse);

        CatHouse.remove(cat);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertNull(actual);


    }

    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
