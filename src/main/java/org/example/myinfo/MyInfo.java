package org.example.myinfo;

public class MyInfo {
    private String name;
    private int age;
    private String homeDistrict;
    private MyAssets myAssets;

    public MyInfo(){
        super();
        System.out.println("Start my info class");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age =age;
    }

    public void setHomeDistrict(String homeDistrict){
        this.homeDistrict = homeDistrict;
    }

    public void setMyAssets(MyAssets assets){
        this.myAssets = assets;
    }

   public MyAssets getMyAssets(){
        return myAssets;
    }

    public String getName() {
        return name;
    }


   public int getAge(){
        return age;
    }

   public String getHomeDistrictHomeDistrict(){
        return homeDistrict;
    }
}
