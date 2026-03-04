package interfaces.interfaceAndAbstractclass;

/**
 * Class abstract classdan voris olsa undagi barcha abstract methodlarni override qilishi kerak bo'ladi
 */
public class Policeman extends Employee {

    /*

    */
/**
     * Bu 3 ta methodni override qilishi kerak
     *//*

    @Override
    public void stop() {

    }

    @Override
    public void work() {

    }

    @Override
    public void detail() {

    }

    */
/**
     * bu methodni override qilsa ham bo'ladi qilmasa ham bo'ladi majburiy emas
     *//*

    @Override
    public void start() {
        super.start();
    }
*/


    /**
     * Bu holatda endi bu class faqatgina 1 ta methodni override qiladi chunki 1 ta abstractr method qolgandi Employee classida. Qolganlarini esa workerdan
     * kelganlarini u override qilib bo'lgandi
     */
    @Override
    public void stop() {

    }

}
