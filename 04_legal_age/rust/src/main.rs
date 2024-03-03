use std::io;
use std::io::Write;

fn main() {
    let mut input = String::new();

    println!("\n--- PROGRAMA PARA DETERMINAR MAYORIA DE EDAD ---\n");

    print!("Ingrese una edad > ");
    io::stdout().flush().unwrap();
    io::stdin().read_line(&mut input).unwrap();
    let age = input.trim().parse::<u8>().expect("La edad debe ser un número entero positivo");

    if age >= 18 {
        println!("\nLa persona es MAYOR de edad");
    } else {
        println!("\nLa persona es MENOR de edad");
    }
}
