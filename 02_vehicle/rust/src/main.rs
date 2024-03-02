struct Vehicle {
    brand: String,
    plate: String,
    color: String,
    model: u16,
}

impl Vehicle {
    fn details(&self) -> String {
        format!(
            "Brand: {}\nPlate: {}\nColor: {}\nModel: {}",
            self.brand, self.plate, self.color, self.model
        )
    }
}

fn main() {
    let taxi = Vehicle {
        brand: String::from("Nissan"),
        plate: String::from("RTXB101"),
        color: String::from("Amarillo"),
        model: 2022,
    };
    let moto = Vehicle {
        brand: String::from("Yamanha"),
        plate: String::from("ABC42E"),
        color: String::from("Negra"),
        model: 2021,
    };
    let bus = Vehicle {
        brand: String::from("Chevrolet"),
        plate: String::from("RGD123"),
        color: String::from("De todos los colores"),
        model: 2005,
    };

    println!("\nDetalles taxi");
    println!("{}", taxi.details());

    println!("\nDetalles moto");
    println!("{}", moto.details());

    println!("\nDetalles bus");
    println!("{}", bus.details());
}
