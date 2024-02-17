package pe.joedayz.samples.clasesanonimas;

public class ZooGiftShop2 {

    interface SaleTodayOnly {
        int dollarsOff();
    }

    interface Climb{};

    public int admission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 5;
            }
        };

        return basePrice - sale.dollarsOff();
    }

    Climb climbing = new Climb() {}; //CLASE ANONIMA FUERA DE UN METODO

    public static void main(String[] args) {
        System.out.println(new ZooGiftShop2().admission(100));
    }
}
