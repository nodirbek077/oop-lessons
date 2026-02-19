package abstractTheme.upcasting;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();

        //biz hozir bunda upcasting ya'ni tepaga qarab convert qildik
        //ya'ni bo'lasini otasi ko'rinishiga olib keldik
        Vehicle v = new Car();
        Vehicle track = new Track();

        //lekin teskarisiga qilib bo'lmaydi chunki otasi tipli obyektni
        //bolasi tipli obyektga joylashtirmoqchi bo'lyapmiz. Bunaqa qilishimiz mumkin emas
//        Car c = new Vehicle();

        //casting qilsak ham baribir oi'xshamaydi shuni
//        Car c = (Car) new Vehicle();

        System.out.println(v);
        System.out.println(track);
    }
}
