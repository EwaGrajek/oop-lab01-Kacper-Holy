# Lab01 - krótkie odpowiedzi

- Login GitHub:
- Grupa:
- Środowisko (Windows / WSL / Linux / macOS):
- Wersja g++ i JDK:
- Link do PR:

## Wyniki
- Testy C++ (Failed): whitespace rejected. I forgot to add '\t' char to my list of elements that doesn-t count as a leter in name
- Testy Java (Failed):constructor make,  constructor model, constructor year
- Jeden przypadek FAIL, jego przyczyna i poprawka (2-3 zdania):constructor make. I forgot to distinguished function variable assign to constructor by function from this related to class

## Rozumienie kodu
1. Dlaczego pola są prywatne, skoro można odczytać je przez getter?
   it make program more stable when anybody can't directly changed the data in class.

3. Dlaczego nie udostępniamy setMileage(int)? Jaką regułę chroni drive(int)?
   becouse mileage cannot be deacrease. value specified in drive function cannot be smaller then one and total mileage cannot be greater then 1000000 km.

5. Co dzieje się ze stanem po drive(-50)? Dlaczego?
   it change nothing and function return false;

7. Jak pokazujesz, że dwa obiekty mają niezależny stan?
   just modify one object and check if it influence the other one 

