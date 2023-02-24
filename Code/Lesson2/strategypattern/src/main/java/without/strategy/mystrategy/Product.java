package without.strategy.mystrategy;

public class Product {

    private String number;
    private String name;

    public Product(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
