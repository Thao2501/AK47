package BaiTap.Day2;

import java.util.Random;

public class User2 {
    private String name;
    private int height;
    private int yearOld;
    private String gender;

    public User2(){
        this.name = randomName();
        this.height = randomNumber(150,180);
        this.yearOld = randomNumber(25,45);
        this.gender = randomGender();
    }
    private int randomNumber(int min,int max){
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    private String randomName(){
        Random rand = new Random();
        String[] name = {"Hien", "Huong", "Hung", "Linh", "Nga", "Thao", "Thy"};
        return name[rand.nextInt(name.length)];
    }

    private String randomGender(){
        Random rand = new Random();
        String[] name = {"male", "female"};
        return name[rand.nextInt(name.length)];
    }
}
