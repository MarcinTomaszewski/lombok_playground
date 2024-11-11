# Projekt: Przebudowa klasy Car z użyciem Lombok

## Opis
Projekt przebudowuje klasę `Car`, która pierwotnie zawierała ręcznie napisane gettery, settery, konstruktory oraz metody `equals`, `hashCode` i `toString`, aby używała biblioteki **Lombok**. Lombok redukuje kod i poprawia jego czytelność.

## Konfiguracja Lombok

### Maven
Dodaj do `pom.xml`:
```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.34</version>
    <scope>provided</scope>
</dependency>
