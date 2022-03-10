fn chinchulin(id:&str) -> &str {
  let n:i64 = 3;
  let mut s:&str = 
  if n == 1 { "texto1" } 
  else if n == 2 { "texto2" };

  let bs:bool = false;

  match bs {
    false => {
      println!("F");
    }
  }

  match s {
    "texto1" => {
      println!("case1");
    }

    "texto2" => {
      println!("case2");
    }

    "texto3" => {
      println!("case3");
    }

    _ => {
      s = "def";
      println!("def");
    }
  }

  return s;
}

fn main() {
  let text:&str = chinchulin("hola");
  println!(text);
}