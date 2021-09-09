package se331.lab.rest.entity;

import lombok.*;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
    Long id;
    String category;
    String title;
    String description;
    String location;
    String date;
    String time;
    Boolean petAllowed;
    EventOrganizerDTO organizer;
    List<ParticipantIdNameTelDTO> participants;
}
