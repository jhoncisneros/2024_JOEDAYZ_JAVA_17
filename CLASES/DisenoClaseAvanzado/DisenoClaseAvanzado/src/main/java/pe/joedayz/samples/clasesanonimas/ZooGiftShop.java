package pe.joedayz.samples.clasesanonimas;

public class ZooGiftShop {

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };

        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        var zoo = new ZooGiftShop();
        System.out.println(zoo.admission(100));
    }
}