use std::io;
use std::io::{Write};

const POINTS_FOR_WIN: u8 = 3;
const POINTS_FOR_LOSS: u8 = 0;
const POINTS_FOR_TIE: u8 = 1;

fn main() {
    let mut input = String::new();
    
    println!("\n-- PROGRAMA PARA CALCULAR PUNTOS DE UN EQUIPO DE FUTBOL --\n");
    
    print!("Ingrese el nombre del equipo > ");
    io::stdout().flush().unwrap();
    io::stdin().read_line(&mut input).unwrap();
    let team_name = input.trim().to_string();

    print!("Ingrese la cantidad de partidos ganados por el equipo {team_name} > ");
    io::stdout().flush().unwrap();
    input.clear();
    io::stdin().read_line(&mut input).unwrap();
    let wins = input.trim().parse::<u8>().expect("Se esperaba un número entero positivo");
    
    print!("Ingrese la cantidad de partidos perdidos por el equipo {team_name} > ");
    io::stdout().flush().unwrap();
    input.clear();
    io::stdin().read_line(&mut input).unwrap();
    let losses = input.trim().parse::<u8>().expect("Se esperaba un número entero positivo");
    
    print!("Ingrese la cantidad de partidos empatados por el equipo {team_name} > ");
    io::stdout().flush().unwrap();
    input.clear();
    io::stdin().read_line(&mut input).unwrap();
    let ties = input.trim().parse::<u8>().expect("Se esperaba un número entero positivo");
    
    let points = wins * POINTS_FOR_WIN + losses * POINTS_FOR_LOSS + ties * POINTS_FOR_TIE;
    
    println!("\nEl equipo {team_name} tiene un total de {points} puntos");
}
