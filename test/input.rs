fn chinchulin(id:&str) -> &str {
  let n:i64 = 1;
  let mut s:&str = 
  if n == 1 { 
    if !false { 
      println!("prueba2");
    }

    println!("prueba");
    "texto1"
  } 

  else if n == 2 { "texto2" };

  if true {
    println!("prueba true");
  }

  return s;
}

fn main() {
  let text:&str = chinchulin("hola");
  println!(text);
}