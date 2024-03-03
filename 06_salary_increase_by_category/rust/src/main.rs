use std::io;
use std::io::Write;

fn main() {
    let mut input = String::new();

    println!("\n--- PROGRAMA DE AUMENTO DE SALARIO POR CATEGORIAS ---\n");

    print!("Ingresa la categoria a la que perteneces (A, B, C) > ");
    io::stdout().flush().unwrap();
    io::stdin().read_line(&mut input).unwrap();
    let category = input.trim().to_string();

    if category.to_lowercase() != "a" && category.to_lowercase() != "b" && category.to_lowercase() != "c" {
        println!("La categoria \"{category}\" ingresada no existe")
    } else {
        print!("Ingresa tu salario actual > ");
        io::stdout().flush().unwrap();
        input.clear();
        io::stdin().read_line(&mut input).unwrap();
        let salary = input.trim().parse::<f32>().expect("El salario debe ser un número");

        let increment_percentage = if category.to_lowercase() == "a" {
            0.15_f32
        } else if category.to_lowercase() == "b" {
            0.1
        } else {
            0.07
        };

        let increment = salary * increment_percentage;
        let new_salary = salary + increment;

        println!("\nTu aumento será de: $ {increment}");
        println!("Tu nuevo salario será de: $ {new_salary}");
    }
}
