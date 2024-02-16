fn input(message: &str) -> String {
    use std::io::{self, Write};

    let mut input = String::new();

    print!("{message}");
    io::stdout().flush().unwrap();
    io::stdin().read_line(&mut input).unwrap();

    input.trim().to_string()
}

fn main() {
    println!("--PROGRAMA PARA LA SUMA DE DOS NUMEROS--\n");

    let first_number: f32 = input("Ingrese el valor del primer número > ").parse().unwrap();
    let second_number: f32 = input("Ingrese el valor del segundo número > ").parse().unwrap();

    let total = first_number + second_number;

    println!("\nLa suma de {first_number} y {second_number} es: {total}");
}
