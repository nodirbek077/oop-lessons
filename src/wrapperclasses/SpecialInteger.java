package wrapperclasses;

public class SpecialInteger {
    int MIN = 1;
    int MAX = 1000;
    int value;

    public SpecialInteger() {
        this.value = 0;
    }

    public SpecialInteger(int value) {
        checkValue(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        checkValue(value);
        this.value = value;
    }

    public void add(int n) {
        checkValue(this.value + n);
        this.value += n;
    }

    public void subtract(int n) {
        checkValue(this.value - n);
        this.value -= n;
    }

    public static SpecialInteger valueOf(int value) {
        return new SpecialInteger(value);
    }

    public void checkValue(int value) {
        if (value < MIN || value > MAX) {
            throw new IllegalArgumentException("Value must be between 1 and 1000");
        }
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {
        SpecialInteger specialInteger = new SpecialInteger();
        specialInteger.add(50);
        System.out.println(specialInteger);

        specialInteger.add(1001111);
        System.out.println(specialInteger);
    }
}
