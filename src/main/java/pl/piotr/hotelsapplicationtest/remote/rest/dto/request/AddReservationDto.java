package pl.piotr.hotelsapplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {
    private List<RoomReservationDto> rooms;
    private PersonDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<RoomReservationDto> roomsReservation, PersonDto person) {
        this.rooms = roomsReservation;
        this.person = person;
    }

    public List<RoomReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
