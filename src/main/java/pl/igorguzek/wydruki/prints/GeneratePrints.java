package pl.igorguzek.wydruki.prints;

import pl.igorguzek.wydruki.model.Prints;

import java.time.LocalDateTime;

public class GeneratePrints {
    private Prints prints;

    public GeneratePrints(Prints prints) {
        this.prints = prints;
    }

    protected LocalDateTime setDateTimeFrom(){
        String dateTime = prints.getDateTimeRange();
        return LocalDateTime.parse((dateTime.substring(0,10)+"T"+dateTime.substring(11,16)));
    }

    protected LocalDateTime setDateTimeTo(){
        String dateTime = prints.getDateTimeRange();
        return LocalDateTime.parse((dateTime.substring(19,29)+"T"+dateTime.substring(30,35)));
    }
}
