package ar.com.eventrust.listaazul.partytimejavaback.model.EventRequest;

import lombok.Data;

@Data
public class EventRequest {
    String name;
    String title;
    String description;
    String type;
    String date;
    String location;
    String minPrice;

}
