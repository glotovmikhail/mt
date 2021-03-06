## Логические формулы в стиле Паскаля (операции and, or, xor, not)

### Построение грамматики
```
Ex -> Ex xor Eo
Ex -> Eo
Eo -> Eo or Ea
Eo -> Ea
Ea -> Ea and T
Ea -> T
T  -> not T
T  -> Var
T  -> ( Ex )
________________
Ex -- Выражение со сложением по модулю двух дизъюнкций (XOR)
Eo -- Выражение с дизъюнкцией двух конъюнкций (OR)
Ea -- Выражение с конъюнкцией двух термов (AND)
T  -- Унарное выражение, которое может быть: переменной, отрицанием T, выражением в скобках
```

### Устранение левой рекурсии
```
Ex  -> Eo Ex'
Ex' -> xor Eo Ex'
Ex' -> _
-
Eo  -> Ea Eo'
Eo' -> or Ea Eo'
Eo' -> _
-
Ea  -> T Ea'
Ea' -> and T Ea'
Ea' -> _
-
T   -> not T
T   -> Var
T   -> ( Ex )
________________
Ex  -- Сложение дизъюнкций
Ex' -- Продолжение сложения дизъюнкций
Eo  -- Дизъюнкция конъюнкций
Eo' -- Продолжение дизъюнкции конъюнкций
Ea  -- Конъюнкция термов
Ea' -- Продолжение конъюнкции термов
T   -- Унарное выражение
```

### Построение множеств FIRST и FOLLOW

##### FIRST:
```
Ex       var not (
Ex'      _ xor
Eo       var not (
Eo'      _ or
Ea       var not (
Ea'      _ and
T        var not (
```

##### FOLLOW
```
Ex       $ )
Ex'      $ )
Eo       $ ) xor
Eo'      $ ) xor
Ea       $ ) xor or
Ea'      $ ) xor or
T        $ ) xor and
```

### Тесты
#### Проверка порядка разбора
`a or b or c` \
`a or b and c` \
`a xor b or c`
 
#### Проверка скобок и пробелов
`a and (b or c)` \
`(((a or (((b)) and c))))` \
`  b    or (  a    and   (    not                geez)        and \na and c \t)      `

#### Проверка унарных операций
`not not a and not (not b or c and (not not e)))`
