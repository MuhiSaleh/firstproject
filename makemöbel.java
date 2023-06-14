package TEST2;

public class makemöbel implements Möbel {
    private int number;
    private String name;
    private String color;


    public makemöbel(int number, String name, String color) {
        this.number = number;
        this.name = name;
        this.color = color;
    }
    

    public makemöbel() {
    }

    @Override
    public void setGroße(int n) {
        this.number = n;
    }

    public int getGroße() {
        return this.number;
    }

    public void SetName(String s) {
        this.name = s;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void SetColor(String s) {
        this.color = s;
    }

    @Override
    public String getColor() {
        return this.color;
    }

}
