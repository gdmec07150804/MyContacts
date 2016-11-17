package cn.edu.gdmec.s07150804.mycontacts_step1;
public class User{
    public final static String NAME="name";
    public final static String MOBILE="mobile";
    public final static String DANWEI="danwei";
    public final static String QQ="qq";
    public final static String ADDRESS="address";
    private String name;
    private String mobile;
    private String danwei;
    private String qq;
    private String address;
    private int id_DB=-1;

    public String getAddress() {
        return address;
    }

    public String getDanwei() {
        return danwei;
    }

    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public String getQq() {
        return qq;
    }

    public int getId_DB() {
        return id_DB;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public void setId_DB(int id_DB) {
        this.id_DB = id_DB;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }


}
