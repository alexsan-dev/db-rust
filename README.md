# DB-RUST

## Declaraciones

Las declaraciones de variables empiezan por la palabra reservada "let"

```rust
let mut ID: Type = <expression>;
```

- **mut**: Define una variable mutable
- **Type**: La definicion de tipo es opcional

---

## Asignaciones

Solo es posible asignar variables con "mut"

```rust
ID = <expression>;
```

---

## Tipos de datos

RUST no maneja Null, ya que busca garantizar la seguridad e integridad en todo momento.

**i64**: valores numéricos enteros.

```rust
 id:i64 = 3;
```

**f64**: valores numéricos con punto flotante.

```rust
 id:f64 = 2.5;
```

**bool**: valores booleanos, true o false.

```rust
 id:bool = true;
```

**char**: Literales de caracteres, se definen con comillas simples.

```rust
 id:char = 'a';
```

**&str** o **String**: Cadenas de texto definidas con comillas dobles.

```rust
 id:&str = "Hello";
 id2:String = "World".to_string();
```
