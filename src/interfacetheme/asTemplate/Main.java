package interfacetheme.asTemplate;

public class Main {

    //1. interface ni class shabloni sifatida ishlatsa bo'ladi
    public static void main(String[] args) {
        /*Teacher teacher = new Teacher();
        teacher.work();
        teacher.detail();

        Driver driver = new Driver();
        driver.work();
        driver.detail();

        SuperMan superMan = new SuperMan();
        superMan.work();
        superMan.detail();
*/
        //shu yerda upcasting degan narsa ham bor ya'ni ota class o'zgaruvchisiga
        //bola class obyektini joylashtirishimizga upcasting deyiladi
        //teskarisini qilib bo'lmaydi
        Worker worker1 = new Teacher();
//        worker1.work();

        Worker worker2 = new Driver();
//        worker2.work();

        Worker worker3 = new SuperMan();
//        worker3.work();

        //endi nevarasini ham yaratsak buni ham upcasting qilaversak bo'ladi
        // bemalol
        /*SpiderMan spiderMan1 = new SpiderMan();
        SuperMan spiderMan2 = new SpiderMan();
        Worker spiderMan3 = new SpiderMan();*/

        Worker worker4 = new SpiderMan();
        printDetail(worker1);
        printDetail(worker2);
        printDetail(worker3);
        printDetail(worker4);
    }

    //2. abstractionga erishish
    public static void printDetail(Worker worker){
        worker.detail();
    }

    //3. ko'p merosxo'rlik
    //interfacelar orqali ko'p merosxo'rlikka erishishimiz mumkin

}
