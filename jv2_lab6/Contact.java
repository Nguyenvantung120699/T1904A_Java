package jv2_lab6;

public class Contact{
    public Integer id;
    public String user_name;
    public String company_name;
    public String address;

    public Contact() {
    }

    
    public Contact(Integer id, String user_name, String company_name, String address) {
        this.id = id;
        this.user_name = user_name;
        this.company_name = company_name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return this.getUser_name()+" - "+getCompany_name()+" - "+getAddress();
    }
    
}