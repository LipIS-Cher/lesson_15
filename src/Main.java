import java.text.DecimalFormat;
import transport.Car;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human humanMaks = new Human("Максим", "Минск", 1988);
        System.out.println("Привет! Меня зовут " + humanMaks.name + ". Я из города " + humanMaks.getTown() + ". Я родился в " + humanMaks.getYearOfBirth() + " году. Будем знакомы!");

        Human humanAnna = new Human("Анна", " Москва", 1993);
        System.out.println("Привет! Меня зовут " + humanAnna.name + ". Я из города " + humanAnna.getTown() + ". Я родился в " + humanAnna.getYearOfBirth() + " году. Будем знакомы!");

        Human humanKate = new Human("Катя", " Калининград", 1992);
        System.out.println("Привет! Меня зовут " + humanKate.name + ". Я из города " + humanKate.getTown() + ". Я родился в " + humanKate.getYearOfBirth() + " году. Будем знакомы!");

        Human humanArtem = new Human("Артем", " Москва", 1995);
        System.out.println("Привет! Меня зовут " + humanArtem.name + ". Я из города " + humanArtem.getTown() + ". Я родился в " + humanArtem.getYearOfBirth() + " году. Будем знакомы!");

        System.out.println(" ");

        Human humanMaksJob = new Human("бренд-менеджером");
        System.out.println("Привет! Меня зовут " + humanMaks.name + ". Я из города " + humanMaks.getTown() + ". Я родился в " + humanMaks.getYearOfBirth() + " году. Я работаю на должности " + humanMaksJob.jobTitle + ". Будем знакомы!");

        Human humanAnnaJob = new Human("методистом образовательных программ");
        System.out.println("Привет! Меня зовут " + humanAnna.name + ". Я из города " + humanAnna.getTown() + ". Я родился в " + humanAnna.getYearOfBirth() + " году. Я работаю на должности " + humanAnnaJob.jobTitle + ". Будем знакомы!");

        Human humanKateJob = new Human("продакт-менеджером");
        System.out.println("Привет! Меня зовут " + humanKate.name + ". Я из города " + humanKate.getTown() + ". Я родился в " + humanKate.getYearOfBirth() + " году. Я работаю на должности " + humanKateJob.jobTitle + ". Будем знакомы!");

        Human humanArtemJob = new Human("директором по развитию бизнеса");
        System.out.println("Привет! Меня зовут " + humanArtem.name + ". Я из города " + humanArtem.getTown() + ". Я родился в " + humanArtem.getYearOfBirth() + " году. Я работаю на должности " + humanArtemJob.jobTitle + ". Будем знакомы!");

        Human humanVladim = new Human("Владимир", "Казань", 2001, "нигде не работает");
        System.out.println(humanVladim.name + ", который родился в " + humanVladim.getYearOfBirth() + " году, живет в городе " + humanVladim.getTown() + ", сейчас " + humanVladim.jobTitle + ".");
        System.out.println(" ");

        Flower bouquet[] = new Flower[]{
                new Flower("Роза", "Голландия", 35.59f),
                new Flower("Хризантема", 15.0f, 5),
                new Flower("Пион", "Англия", 69.9f, 1),
                new Flower("Гипсофила", "Турция", 19.5f, 10)
        };
        String bouquetName = bouquet[0].getFlowerName();
        float bouquetCost = bouquet[0].getCost();
        int bouquetLifeSpan = bouquet[0].lifeSpan;

        for (int i = 1; i < bouquet.length; i++) {
            bouquetName = bouquetName + ", " + bouquet[i].getFlowerName();
            bouquetCost = bouquetCost + bouquet[i].getCost();
            if (bouquet[i].lifeSpan < bouquetLifeSpan) {
                bouquetLifeSpan = bouquet[i].lifeSpan;
            }
        }

        System.out.println("Состав букета - " + bouquetName);
        System.out.println("Стоимость букета - " + (bouquetCost));
        System.out.println("Срок жизни букета - " + bouquetLifeSpan);


        System.out.println(" ");

        Car carLada = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "Россия", "механика", "седан", "Т555ОР179", 5);
        System.out.println("Автомобиль марки " + carLada.getBrand() + ", модель " + carLada.getModel() + ". Объем двигателя " + carLada.getEngineVolume() + "л., цвет кузова " + carLada.getColor() + ", страна сборки " + carLada.getCountry() + ", дата сборки " + carLada.getYear() + ", тип коробки передач " + carLada.getGearBox() + ", тип кузова " + carLada.getTypeBox() + ", номер авто " + carLada.getNumberCar() + ", количество мест " + carLada.getNumberOfSeats() + ", резина " + carLada.getRubber() + ".");

        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия", "роботизированная", "седан", "Х999ХХ999", 5);
        System.out.println("Автомобиль марки " + carAudi.getBrand() + ", модель " + carAudi.getModel() + ". Объем двигателя " + carAudi.getEngineVolume() + "л., цвет кузова " + carAudi.getColor() + ", страна сборки " + carAudi.getCountry() + ", дата сборки " + carAudi.getYear() + ", тип коробки передач " + carAudi.getGearBox() + ", тип кузова " + carAudi.getTypeBox() + ", номер авто " + carAudi.getNumberCar() + ", количество мест " + carAudi.getNumberOfSeats() + ", резина " + carAudi.getRubber() + ".");

        Car carBMW = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия", "механика", "купе", "Р999РР99", 2);
        System.out.println("Автомобиль марки " + carBMW.getBrand() + ", модель " + carBMW.getModel() + ". Объем двигателя " + carBMW.getEngineVolume() + "л., цвет кузова " + carBMW.getColor() + ", страна сборки " + carBMW.getCountry() + ", дата сборки " + carBMW.getYear() + ", тип коробки передач " + carBMW.getGearBox() + ", тип кузова " + carBMW.getTypeBox() + ", номер авто " + carBMW.getNumberCar() + ", количество мест " + carBMW.getNumberOfSeats() + ", резина " + carBMW.getRubber() + ".");

        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея", "автомат", "седан", "М142ОВ76", 5);
        System.out.println("Автомобиль марки " + carKia.getBrand() + ", модель " + carKia.getModel() + ". Объем двигателя " + carKia.getEngineVolume() + "л., цвет кузова " + carKia.getColor() + ", страна сборки " + carKia.getCountry() + ", дата сборки " + carKia.getYear() + ", тип коробки передач " + carKia.getGearBox() + ", тип кузова " + carKia.getTypeBox() + ", номер авто " + carKia.getNumberCar() + ", количество мест " + carKia.getNumberOfSeats() + ", резина " + carKia.getRubber() + ".");

        Car carHyun = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея", "механика", "седан", "В105ВА10", 5);
        System.out.println("Автомобиль марки " + carHyun.getBrand() + ", модель " + carHyun.getModel() + ". Объем двигателя " + carHyun.getEngineVolume() + "л., цвет кузова " + carHyun.getColor() + ", страна сборки " + carHyun.getCountry() + ", дата сборки " + carHyun.getYear() + ", тип коробки передач " + carHyun.getGearBox() + ", тип кузова " + carHyun.getTypeBox() + ", номер авто " + carHyun.getNumberCar() + ", количество мест " + carHyun.getNumberOfSeats() + ", резина " + carHyun.getRubber() + ".");


        Car.Key ladaKey = carLada.new Key(false, false);
        Car.Key audiKey = carAudi.new Key(true, true);
        Car.Key bmwKey = carBMW.new Key(true, true);
        Car.Key kiaKey = carKia.new Key(false, true);
        Car.Key hyunKey = carHyun.new Key(true, false);

        System.out.println(" ");

        System.out.println("У Лады удаленный запуск двигаетеля " + ladaKey.isRemoteStart() + ", и бесключевой доступ " + ladaKey.isNotKeyAccess());
        System.out.println("У Audi удаленный запуск двигаетеля " + audiKey.isRemoteStart() + ", и бесключевой доступ " + audiKey.isNotKeyAccess());
        System.out.println("У BMW удаленный запуск двигаетеля " + bmwKey.isRemoteStart() + ", и бесключевой доступ " + bmwKey.isNotKeyAccess());
        System.out.println("У Kia удаленный запуск двигаетеля " + kiaKey.isRemoteStart() + ", и бесключевой доступ " + kiaKey.isNotKeyAccess());
        System.out.println("У Hyunday удаленный запуск двигаетеля " + hyunKey.isRemoteStart() + ", и бесключевой доступ " + hyunKey.isNotKeyAccess());

        System.out.println(" ");

        Scanner dat = new Scanner(System.in);
        System.out.print("Введите дату окончания страховки: Дата окончания (1 - 31) - ");
        int date = dat.nextInt();
        Scanner mon = new Scanner(System.in);
        System.out.print("Введите дату окончания страховки: Месяц окончания (1 - 12) - ");
        int month = mon.nextInt();
        Scanner yea = new Scanner(System.in);
        System.out.print("Введите дату окончания страховки: Год окончания (2000 - 3000) - ");
        int year = yea.nextInt();

        Car.Insurance ladaInsurance = carLada.new Insurance(date, month, year, 150000, "999999999");
        Car.Insurance audiInsurance = carAudi.new Insurance(date, month, year, 9000, "888888888");
        Car.Insurance bmwInsurance = carBMW.new Insurance(date, month, year, 0, "123456789");
        Car.Insurance kiaInsurance = carKia.new Insurance(date, month, year, 90004, "987654321");
        Car.Insurance hyunInsurance = carHyun.new Insurance(date, month, year, 151651, "1593576248");

        System.out.println("У Лады " + ladaInsurance.checkTerm(date, month, year) + "стоимость страховки " + ladaInsurance.getCost() + ", номер страховки " + ladaInsurance.getNumber());
        System.out.println("У Audi " + audiInsurance.checkTerm(date, month, year) + "стоимость страховки " + audiInsurance.getCost() + ", номер страховки " + audiInsurance.getNumber());
        System.out.println("У BMW " + bmwInsurance.checkTerm(date, month, year) + "стоимость страховки " + bmwInsurance.getCost() + ", номер страховки " + bmwInsurance.getNumber());
        System.out.println("У KIA " + kiaInsurance.checkTerm(date, month, year) + "стоимость страховки " + kiaInsurance.getCost() + ", номер страховки " + kiaInsurance.getNumber());
        System.out.println("У Hyunday " + hyunInsurance.checkTerm(date, month, year) + "стоимость страховки " + hyunInsurance.getCost() + ", номер страховки " + hyunInsurance.getNumber());
    }
}