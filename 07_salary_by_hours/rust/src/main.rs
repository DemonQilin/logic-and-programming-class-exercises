use std::io;

fn main() {
    let mut input = String::new();
    println!("\n--- PROGRAMA PARA CALCULAR SALARIO POR HORAS SEMANALES ---\n");

    println!("Ingrese las horas trabajadas durante la semana:");
    io::stdin().read_line(&mut input).unwrap();
    let hours = input.trim().parse::<u32>().expect("Las horas deben ser un número entero positivo");

    let salary = if hours <= 48 {
        hours * 15000
    } else if hours <= 70  {
        48 * 15000 + (hours - 48) * 18000
    } else {
        48 * 15000 + (hours - 48) * 22000
    };

    println!("\nTu salario para esta semana es de: ${salary}");
}
