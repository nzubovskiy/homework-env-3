package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4)
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };

        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        ServiceStation station = new ServiceStation();

        serviceReport(station, cars, trucks, bicycles);

    }

    private static void serviceReport(ServiceInterface serviceInterface, Car[] cars, Truck[] trucks, Bicycle[] bicycles) {
        serviceInterface.service(cars);
        serviceInterface.service(trucks);
        serviceInterface.service(bicycles);
    }
}

