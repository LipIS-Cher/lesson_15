public class Flower {
    private final String flowerName;

    private final String country;

    private final float cost;

    int lifeSpan;

    Flower(String flowerName, String country, float cost){
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()){
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Тип цветка не указан";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()){
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.0f;
        }
        this.lifeSpan = 3;
    }

    Flower(String flowerName, float cost, int lifeSpan){
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()){
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Тип цветка не указан";
        }
        this.country = "Россия";
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.0f;
        }
        if (lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    Flower(String flowerName, String country, float cost, int lifeSpan){
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()){
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Тип цветка не указан";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()){
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.0f;
        }
        if (lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString(){
        return flowerName + country + cost + lifeSpan;
    }
}
