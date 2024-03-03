use std::io;
use std::io::Write;

const INCREMENT_PERCENTAGE: f32 = 0.1;

fn main() {
    let mut input = String::new();

    println!("\n--- PROGRAMA PARA AUMENTAR EL SALARIO ---\n");

    print!("Ingresa tu salario actual > ");
    io::stdout().flush().unwrap();
    io::stdin().read_line(&mut input).unwrap();
    let salary = input.trim().parse::<f32>().expect("El salario debe ser un número");

    print!("Ingresa el salario base > ");
    io::stdout().flush().unwrap();
    input.clear();
    io::stdin().read_line(&mut input).unwrap();
    let base = input.trim().parse::<f32>().expect("El salario debe ser un número");

    if salary < 2.0 * base {
        let increase = salary * INCREMENT_PERCENTAGE;
        let new_salary = salary + increase;

        println!("\nTu aumento será de: $ {increase}");
        println!("Tu nuevo salario será de: $ {new_salary}");
    } else {
        println!("\nNo tienes derecho a un aumento");
    }
}
