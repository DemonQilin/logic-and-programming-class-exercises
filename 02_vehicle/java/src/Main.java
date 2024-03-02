public class Main {
    public static void main(String[] args) {
        Vehicle taxi = new Vehicle();
        Vehicle moto = new Vehicle();
        Vehicle bus = new Vehicle();

        taxi.brand = "Nissan";
        taxi.plate = "RTXB101";
        taxi.color = "Amarillo";
        taxi.model = 2022;

        moto.brand = "Yamaha";
        moto.plate = "ABC42E";
        moto.color = "Negra";
        moto.model = 2021;

        bus.brand = "Chevrolet";
        bus.plate = "RFG123";
        bus.color = "De todos los colores";
        bus.model = 2005;

        System.out.println("\nDetalles taxi");
        System.out.println(taxi.details());

        System.out.println("\nDetalles moto");
        System.out.println(moto.details());

        System.out.println("\nDetalles bus");
        System.out.println(bus.details());
    }
}