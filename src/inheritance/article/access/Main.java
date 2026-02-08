package inheritance.article.access;

import inheritance.article.access.protecteds.Item;
import inheritance.article.access.protecteds.Manager;
import inheritance.article.access.protecteds.test.Car;
import inheritance.article.access.test.Test;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ali";
        student.level = 10;

//        student.walk();//bu yerda compile time error beradi chunki walk() methodi private qilingan
        Test test = new Test();
//        test.testName;--bunda ham Test classidagi testName degan o'zgaruvchini chaqira olmaymiz chunki defaul acces modifier
//        qo'yilgan o'zgaruvchining oldiga

        /// //////////////////////////////////////////////
        //protected o'zgaruvchi methodlarni tekshirib ko'rish uchun shu yerga Manager classidan object olib ishlatib ko'ramiz
        Manager alish = new Manager();
        alish.name = "Alish";
//        alish.surname = "Aliyev";//xatolik bo'ladi, chunki managaer clasiga boshqa packagedan turib murojaat qilyapmiz
//
//        alish.detail();//xatolik bo'ladi, chunki managaer clasiga boshqa packagedan turib murojaat qilyapmiz
        Car car = new Car("LIla");
        car.startByVoice();

        //otasi yani Vehicle bilan bitta packageda yotgan classlardan ham bemalol protected o'zgaruvchi va methodlarga murojaat qilishimiz mumkin
        Item item = new Item();
        item.getItem();
    }
}
