package bo.edu.ucb.credito.Dto;

public class Cliente {
    private Integer client_id;
    private String first_name;
    private String last_name;
    private String gender;
    private Integer age;
    private String address;
    private Integer Card_card_id;

    public Cliente(){

    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCard_card_id() {
        return Card_card_id;
    }

    public void setCard_card_id(Integer card_card_id) {
        Card_card_id = card_card_id;
    }
}
