package exam_adf2;

public class Student{
    public String student_id;
    public String student_name;
    public String address;
    public String phone;

    public Student() {

    }

    public Student(String student_id, String student_name, String address, String phone) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.address = address;
        this.phone = phone;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}