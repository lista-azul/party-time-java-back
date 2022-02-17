package ar.com.eventrust.listaazul.partytimejavaback.model.EventResponse;

import lombok.Data;

@Data
public class EventResponse {
    String name;
    String title;
    String description;
    String type;
    String date;
    String location;
    String minPrice;
}
