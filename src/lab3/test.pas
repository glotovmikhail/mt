var
   x, y, z, i: integer;
   a, b, c: string;
begin
   y := (1 + 2 * 3);
   z := -228;
   x := (z * y + 23930 mod 5 + 14 div 2);
   a := 'abc';
   read(b, c);
   i := 10;
   while i > 0 do
   begin
      i := i - 1;
      write(i);
   end;
   if x > z then
      write('abc')
   else
      write(a);
end.