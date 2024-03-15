package org.example;

public class Staff {
    private int staffId;
    private String name;
    private String position;

    public Staff(int staffId, String name, String position){
        this.staffId = staffId;
        this.name = name;
        this.position = position;
    }
    public int getStaffId(){
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
