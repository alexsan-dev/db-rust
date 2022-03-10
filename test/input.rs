fn chinchulin(id:&str) -> &str {
  let n:i64 = 3;
  let mut s:&str =  if n == 1 { "texto1" } else { "texto2" };
  let mut p:&str = match s {
    "texto1" => "case1",
    "texto2" => "case2",
    "texto3" => "case3",
    _ => "def",
  };
  println!(p);

  return s;
}

fn main() {
  let text:&str = chinchulin("hola");
  println!(text);
}