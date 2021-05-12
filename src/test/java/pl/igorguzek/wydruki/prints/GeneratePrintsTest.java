package pl.igorguzek.wydruki.prints;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.springframework.context.annotation.Description;
import pl.igorguzek.wydruki.model.Prints;

import static org.junit.jupiter.api.Assertions.*;

class GeneratePrintsTest {
    Prints prints;
    GeneratePrints generatePrints;

    @BeforeEach
    void setUp(){
        prints = new Prints();
        prints.setDateTimeRange("2021-05-12 07:00 - 2021-05-14 03:00");
        generatePrints = new GeneratePrints(prints);
    }

    @Nested
    @DisplayName("Should change String from HTML FORM to LocalDataTime")
    class settingDateTime{

        @Test
        @DisplayName("Should be not null")
        void shouldBeNotNull(){
            assertNotNull(generatePrints.setDateTimeFrom());
            assertNotNull(generatePrints.setDateTimeTo());
        }

        @Test
        @DisplayName("Method \"From\" Should return: 2021-05-15 07:00")
        void shouldReturnCorrectFromDate(){
            assertEquals("2021-05-12T07:00",generatePrints.setDateTimeFrom().toString());
        }

        @Test
        @DisplayName("Method \"To\" Should return:  2021-05-15 03:00")
        void shouldReturnCorrectToDate(){
            assertEquals("2021-05-14T03:00",generatePrints.setDateTimeTo().toString());
        }
    }


}