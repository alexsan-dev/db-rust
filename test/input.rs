fn chinchulin(id:&str) -> &str {

  fn chinchulin2(id2:&str) -> &str {
    return id2;
  }

  return id + chinchulin2(" mundo");
}

fn main() {
  let id:&str = "hola";
  println!(chinchulin(id));
}