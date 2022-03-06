fn chinchulin(id:&str) -> &str {
  let n:i64 = 1;
  let s:&str = 
  if n == 1 { println!("extra"); "texto1" } 
  else if n == 2 { "texto2" } 
  else { "texto3" };

  return s;
}

fn main() {
  let text:&str = "hola";
  println!(chinchulin(text));
}