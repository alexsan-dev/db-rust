fn chinchulin(id:&str) -> &str {
  if id == "hola!" {
    println!("siuu");
  } else if id  == "hol"+"a" && !false {
    println!("alv2");
  } else {
    println!("alv");
  }

  return id;
}

fn main() {
  let text:&str = "hola";
  println!(chinchulin(text));
}