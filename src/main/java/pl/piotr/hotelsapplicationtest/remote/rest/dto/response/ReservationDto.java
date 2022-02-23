package pl.piotr.hotelsapplicationtest.remote.rest.dto.response;

import pl.piotr.hotelsapplicationtest.domain.model.ReservationStatusType;
import pl.piotr.hotelsapplicationtest.remote.rest.dto.request.PersonDto;
import pl.piotr.hotelsapplicationtest.remote.rest.dto.request.RoomReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private List<RoomReservationDto> rooms;
    private PersonDto personDto;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatusType status, List<RoomReservationDto> roomsReservation, PersonDto personDto) {
        this.id = id;
        this.status = status;
        this.rooms = roomsReservation;
        this.personDto = personDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }
}
