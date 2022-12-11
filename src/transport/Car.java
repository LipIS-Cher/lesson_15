package transport;
import java.util.Calendar;


public class Car {

    private int monthNow;

    private int dayNow;

    private int yearNow;
    final String brand;

    final String model;

    public float engineVolume;

    public String color;

    final int year;

    final String country;

    public String gearBox;

    final String typeBox;

    public String numberCar;

    final int numberOfSeats;

    public String rubber;

    private Key key;

    private Insurance insurance;

    Calendar calendar = Calendar.getInstance();



    public Car(String brand, String model, float engineVolume, String color, int year, String country, String gearBox, String typeBox, String numberCar, int numberOfSeats) {
        monthNow = calendar.get(Calendar.MONTH);
        if (brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null){
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null){
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0){
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null){
            this.country = "default";
        } else {
            this.country = country;
        }
        if (gearBox == null){
            this.gearBox = "default";
        } else {
            this.gearBox = gearBox;
        }
        if (typeBox == null){
            this.typeBox = "default";
        } else {
            this.typeBox = typeBox;
        }
        if (numberCar == null){
            this.numberCar = "В004КО799";
        } else {
            this.numberCar = checksNumCorrect(numberCar);
        }
        if (numberOfSeats <= 0){
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if ((monthNow >= 1 && monthNow <= 3) || (monthNow >= 10 && monthNow <= 12)){
            this.rubber = "зимняя";
        } else {
            this.rubber = "летняя";
        }
    }

    static String checksNumCorrect(String numberCar){

        char[] letters = {'А', 'В', 'С', 'Е', 'К', 'Н', 'М', 'О', 'Р', 'Т', 'Х', 'У'};
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


        int checkLet = 0;
        int checkNum = 0;

        for (int i = 0; i < numberCar.length(); i++){
            if (i == 0 || i == 4 || i == 5){
                for (int z = 0; z < letters.length; z++){
                    if (numberCar.charAt(i) == letters[z]) {
                        checkLet = checkLet + 1;
                    }
                }
            } else {
                for (int z = 0; z < number.length; z++){
                    if (numberCar.charAt(i) == number[z]) {
                        checkNum = checkNum + 1;
                    }
                }
            }
        }


        if (checkLet == 3 && (checkNum == 5 || checkNum == 6)){
            return numberCar;
        } else {
            return "Номер введен некорректно";
        }
    }


    public class Key {
        private boolean remoteStart;

        private boolean notKeyAccess;

        public Key(boolean remoteStart, boolean notKeyAccess) {
            this.remoteStart = remoteStart;
            this.notKeyAccess = notKeyAccess;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isNotKeyAccess() {
            return notKeyAccess;
        }

        public void setRemoteStart(boolean remoteStart) {
            this.remoteStart = remoteStart;
        }

        public void setNotKeyAccess(boolean notKeyAccess) {
            this.notKeyAccess = notKeyAccess;
        }
    }

    public class Insurance {
        private int dateActions;
        private int monthActions;
        private int yearActions;

        private int cost;

        private String number;

        public Insurance(int dateActions, int monthActions, int yearActions, int cost, String number) {
            this.dateActions = dateActions;
            this.monthActions = monthActions;
            this.yearActions = yearActions;
            if (cost == 0){
                this.cost = 10000;
            } else {
                this.cost = cost;
            }
            if (number.length() == 9){
                this.number = number;
            } else {
                this.number = "Error";
            }
        }

        public String checkTerm(int dateActions, int monthActions, int yearActions){
            dayNow = calendar.get(Calendar.DATE);
            monthNow = calendar.get(Calendar.MONTH);
            yearNow = calendar.get(Calendar.YEAR);

            int dateRes = dateActions - dayNow;
            int monthRes = monthActions - monthNow;
            int yearRes = yearActions - yearNow;
            String result;
            if ((dateRes + monthRes * 30 + yearRes * 365) < 0){
                result = "бегом оформлять страховку, ";
            } else {
                result = "";
            }
            return result;
        }

        public int getDateActions() {
            return dateActions;
        }

        public void setDateActions(int dateActions) {
            this.dateActions = dateActions;
        }

        public int getMonthActions() {
            return monthActions;
        }

        public void setMonthActions(int monthActions) {
            this.monthActions = monthActions;
        }

        public int getYearActions() {
            return yearActions;
        }

        public void setYearActions(int yearActions) {
            this.yearActions = yearActions;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }

    @Override
    public String toString() {
        return brand + model + engineVolume + color + year + country + gearBox + typeBox + numberCar + numberOfSeats + rubber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeBox() {
        return typeBox;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) { this.gearBox = gearBox; }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) { this.rubber = rubber; }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}
