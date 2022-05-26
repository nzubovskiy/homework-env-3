package ru.skypro;

public class ServiceStation implements ServiceInterface {

    @Override
    public void service(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Обслуживаем " + car.getModelName() + ". Меняем " + car.getWheelsCount() + " покрышки. Проверяем двигатель.");
        }
        System.out.println();
    }

    @Override
    public void service(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            System.out.println("Обслуживаем " + truck.getModelName() + ". Меняем " + truck.getWheelsCount() + " покрышки. Проверяем двигатель. Проверяем прицеп.");
        }
        System.out.println();
    }

    @Override
    public void service(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            Bicycle bicycle = bicycles[i];
            System.out.println("Обслуживаем " + bicycle.getModelName() + ". Меняем " + bicycle.getWheelsCount() + " покрышки.");
        }
        System.out.println();
    }
}