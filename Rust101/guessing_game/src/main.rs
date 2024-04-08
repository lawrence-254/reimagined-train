use std::io;


fn main() {
    println!("Guessed Number game");
    println!("Enter a guessed number");

    let mut guess = String::new();

    io::stdin().read_line(&mut guess).expect("Failed to read line");

    println!("You Guessed : {}", guess);
}
