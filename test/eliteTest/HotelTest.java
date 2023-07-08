package eliteTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    Hotel hotel;
    @BeforeEach
            void startAllTestWith(){
        hotel = new Hotel(10);
        assertNotNull(hotel);
    }
    @Test
    void testThatRoomCanBeBooked(){
        assertEquals("room Booked Successfully",hotel.bookRoom("Goodness",9));
    }
    @Test
    void testUserCanCheckOut(){
        hotel.bookRoom("Goodness",4);
        assertTrue(hotel.Checkout(4));

    }
    @Test
    void getAllRoomsTest() {
      assertEquals(10,hotel.getRooms());
    }
    @Test
    void getAvailableRooms(){
        hotel.bookRoom("Chinedu",3);
        hotel.bookRoom("Remigious",7);
        hotel.bookRoom("kinzy",8);
        assertEquals(7,hotel.getfreeRooms());
    }
    @Test
    void getTheRoomThatWereBooked(){
        hotel.bookRoom("Chinedu",3);
        hotel.bookRoom("Remigious",6);
        hotel.bookRoom("kinzy",2);

    }
    @Test
    void getguestname() {
        hotel.bookRoom("Goodness",8);
        assertEquals("Goodness", hotel.getguest(8));
    }
    @Test
    void testThatWhenARoomIsCheckedTheRoomReturnsNull(){
        hotel.bookRoom("Goodness",8);
        hotel.Checkout(8);
        assertEquals(null, hotel.getguest(8));

    }
}
