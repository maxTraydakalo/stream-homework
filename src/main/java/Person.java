public class Person extends Human{
     private Integer height;
     private String city;

    public Person(Integer height, String city) {
        this.height = height;
        this.city = city;
    }

    public  Integer getHeight() {
        return height;
    }

     public String getCity() {
        return city;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setCity(String city) {
        this.city = city;
    }
}