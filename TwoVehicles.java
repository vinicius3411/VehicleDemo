// Este programa cria dois objetos Vehicle.
class Vehicle {
 int passengers; // número de passageiros
 int fuelcap; // capacidade de armazenamento de combustível em galões
  int mpg; // consumo de combustível em milhas por galão
}
// Essa classe declara um objeto de tipo Vehicle.
class TwoVehicles {
 public static void main(String args[]) {
 Vehicle minivan = new Vehicle();
 Vehicle sportscar = new Vehicle();
int range1, range2;
 // atribui valores a campos de minivan
 minivan.passengers = 7;
 minivan.fuelcap = 16;
 minivan.mpg = 21;
 // atribui valores a campos de sportscar
 sportscar.passengers = 2;
 sportscar.fuelcap = 14;
 sportscar.mpg = 12;
 // calcula a autonomia presumindo um tanque cheio de gasolina
 range1 = minivan.fuelcap * minivan.mpg;
 range2 = sportscar.fuelcap * sportscar.mpg;
 System.out.println("Minivan can carry " + minivan.passengers +
 " with a range of " + range1);
 System.out.println("Sportscar can carry " + sportscar.passengers +
 " with a range of " + range2);
 }
}