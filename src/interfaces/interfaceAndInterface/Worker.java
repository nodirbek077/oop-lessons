package interfaces.interfaceAndInterface;

/**
 * Agar abstract methodni interfaceda override qilsak u default methodga aylanadi. compilyator uni avtomatik tarzda default methodga aylantirib qo'yadi
 */
public interface Worker extends Job{
    void test();

    @Override
    default void looking() {

    }

    @Override
    default void searching() {

    }
}
