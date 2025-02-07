package BaiTap.Day2;

import java.util.Random;

public class Bai1 {
    public static void main(String[] args) {
        User[] listUser1 = {
                new User(randomAgeFrom15to25(), "A", randomHeightFrom150to180()),
                new User(randomAgeFrom15to25(), "B", randomHeightFrom150to180()),
                new User(randomAgeFrom15to25(), "C", randomHeightFrom150to180()),
        };

        User a = new User(randomAgeFrom15to25(), "A", randomHeightFrom150to180());
        User b = new User(randomAgeFrom15to25(), "B", randomHeightFrom150to180());
        User c = new User(randomAgeFrom15to25(), "C", randomHeightFrom150to180());
        User[] listUser2 = {
                a,
                b,
                c,
        };
        User[] listUser3 = new User[3];
        listUser3[0] = a;
        listUser3[1] = b;
        listUser3[2] = c;

        for (User user : listUser3) {
            System.out.println(user.name + " " + user.age + " " + user.height);
        }


        String[] names = {"Hien", "Huong", "Hung", "Linh", "Nga", "Thao", "Thy"};
        int randomNamIndex = randomNum(0, names.length-1);
        String randomName = names[randomNamIndex];
        System.out.println("Random name " + randomName);

    }

    public static int randomNum(int start, int end) {
        Random random = new Random();
        int s = random.nextInt(start, end + 1);
        return s;
    }

    public static int randomHeightFrom150to180() {
        Random random = new Random();
        int randomHeigth = random.nextInt(150, 180 + 1);
        return randomHeigth;
    }

    public static int randomAgeFrom15to25() {
        Random random = new Random();
        int randomAge = random.nextInt(15, 25 + 1);
        return randomAge;
    }

}
