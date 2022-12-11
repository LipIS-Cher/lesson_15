public class Human {
    String name;

    private String town;

    private int yearOfBirth;

    String jobTitle;

    Human(String name, String town, int yearOfBirth) {
        if (yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }


    }

    Human(String jobTitle) {
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()){
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0 ){
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    @Override
    public String toString(){
        return name + town + yearOfBirth + jobTitle;
    }

}
