package arraylistTest;

import arrayList.ArrayList1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {
    ArrayList1 arrayList1;
    @BeforeEach
    void setUp(){
        arrayList1 = new ArrayList1();
    }
    @Test
    public void testThatAddWorks(){
        arrayList1.add1(6);
        arrayList1.add1(9);
        assertEquals(2,arrayList1.getSize());
    }
    @Test
    public void testThatGetWorks(){
        arrayList1.add1(8);
        arrayList1.add1(10);
        assertEquals(10,arrayList1.get1(1));
    }
    @Test
    public void testThatRemoveByIndexWorks(){
        arrayList1.add1(6);
        arrayList1.add1(12);
        arrayList1.add1(89);
        arrayList1.add1(34);
        arrayList1.add1(90);
        arrayList1.add1(100);
        arrayList1.add1(700);

        arrayList1.remove(1);
        assertEquals(89, arrayList1.get1(1));
        assertEquals(6,arrayList1.getSize());
    }
    @Test
    public void testThatRemoveByElementWorks(){
        arrayList1.add1("apple");
        arrayList1.add1("mango");
        arrayList1.add1("pawpaw");
        arrayList1.add1("guava");


        arrayList1.remove("mango");

        assertEquals(3,arrayList1.getSize());
        assertEquals("pawpaw", arrayList1.get1(1));
        System.out.println(arrayList1);
    }
    @Test
    public void testThatContainsWorks(){
        arrayList1.add1(6);
        arrayList1.add1(9);
        assertTrue(arrayList1.contains(6));
    }
}
