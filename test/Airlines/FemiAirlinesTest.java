package Airlines;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FemiAirlinesTest {
    Airlines airlines;

    @BeforeEach
    void setUp() {
        airlines = new Airlines();
    }

    @Test
    public void testNedAirHasTenSeats() {
//        When
        boolean[] seats = airlines.getSeats();
//        assert
        assertEquals(10, seats.length);
    }

    @Test
    public void testThatPlaneSeatsAreUnoccupiedByDefault() {
        boolean[] seats = airlines.getSeats();
//        for(boolean seat  :seats){
//            assertFalse(seat);
        boolean[] expected = {false, false, false, false, false, false, false, false, false, false};
        assertArrayEquals(expected, seats);
    }

    @Test
    public void testThatCustomersCanBookFirstClassPlaneTicket() {
//        when
        int firstClassTicketBooking = 1;
        airlines.bookTicket(firstClassTicketBooking);
        boolean[] expected = {true, false, false, false, false, false, false, false, false, false};
        assertArrayEquals(expected, airlines.getSeats());
    }
    @Test
    public void testThatCustomerCanBookEconomyClassTicket(){
     int economyClassTicketBookingRequest = 2;
     airlines.bookTicket(economyClassTicketBookingRequest);
     assertTrue(airlines.getSeats()[5]);
    }
}