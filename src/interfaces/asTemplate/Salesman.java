package interfaces.asTemplate;
//oddiy class bn ko'p merosxo'rlikka erishib bo'lmaydi
//public class Salesman extends Employee, SuperMan{
//}

//bir nechta interfacedan esa implement olsa bo'ladi ya'ni interfacelar bn ko'p merosxo'rlikk
//erishsa bo'ladi
public class Salesman implements Worker, DoAction {

    //bu esa DoAction classidan kelgan
    @Override
    public void action() {

    }

    //bular Worker interfaceidan kelgan
    @Override
    public void work() {

    }

    @Override
    public void detail() {

    }
}