package jv2_lab6;

public class PhoneNumber{
    public Integer phoneid;
    public String phonenumber;
    public String typephone;

    public PhoneNumber() {
    }

    public PhoneNumber(Integer phoneid, String phonenumber, String typephone) {
        this.phoneid = phoneid;
        this.phonenumber = phonenumber;
        this.typephone = typephone;
    }

    public Integer getId() {
        return phoneid;
    }

    public void setId(Integer id) {
        this.phoneid = phoneid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getTypephone() {
        return typephone;
    }

    public void setTypephone(String typephone) {
        this.typephone = typephone;
    }

    
    public String toString(){
        return this.getTypephone()+" : "+this.getPhonenumber();
    }
}
