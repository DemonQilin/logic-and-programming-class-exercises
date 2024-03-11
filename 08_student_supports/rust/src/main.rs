use std::io;

fn main() {
    let mut input = String::new();

    println!("\n-- PROGRAMA PARA ENTREGAR SUBSIDIOS A ESTUDIANTES --\n");

    println!("Ingrese el estrato del estudiante:");
    io::stdin().read_line(&mut input).unwrap();
    let social_class: u8 = input.trim().parse().expect("El estrato debe ser un número entero válido");
    input.clear();

    if social_class >= 1 && social_class <= 6 {
        println!("Ingrese el promedio del estudiante:");
        io::stdin().read_line(&mut input).unwrap();
        let grade: f32 = input.trim().parse().expect("El promedio debe ser un número válido");
        input.clear();

        if grade >= 0_f32 && grade <= 5_f32 {
            let support = if (social_class == 1 || social_class == 2) && grade >= 4_f32 {
                100000_u32
            } else if social_class == 3 && grade > 4_f32 {
                80000
            } else if social_class > 3 && grade > 4.5 {
                50000
            } else {
                0
            };

            if support > 0 {
                println!("\nEl subsidio para el estudiante es: $ {support}");
            } else {
                println!("\nEl estudiante no cumple con las condiciones para recibir un subsidio");
            }
            
        } else {
            eprintln!("\nEl promedio debe ser un número entre 0 y 5");
        }
    } else {
        eprintln!("\nEl estrato debe ser un número entre 1 y 6");
    }
}
