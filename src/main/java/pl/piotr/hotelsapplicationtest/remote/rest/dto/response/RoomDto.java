package pl.piotr.hotelsapplicationtest.remote.rest.dto.response;

public class RoomDto {
    private Integer id;
    private String beds;
    private float price;

    public RoomDto() {
    }

    public RoomDto(Integer id, String beds, float price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
