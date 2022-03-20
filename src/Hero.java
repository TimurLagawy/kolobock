public class Hero {
    String name;
    int age;
    String p_type;
    String fur_color;
    String some_sing;
    Hero(){    }
    Hero(int age, String p_type, String fur_color, String some_sing) {
        this.age = age;
        this.p_type = p_type;
        this.fur_color = fur_color;
        this.some_sing=some_sing;
    }
    Hero(String name, int age, String some_sing) {
        this.name = name;
        this.age = age;
        this.some_sing=some_sing;
    }
    Hero(String name, int age,String p_type, String fur_color, String some_sing) {
        this.name = name;
        this.age = age;
        this.p_type = p_type;
        this.fur_color = fur_color;
        this.some_sing=some_sing;
    }
    Hero(String name, String p_type, String fur_color, String some_sing) {
        this.name = name;
        this.p_type = p_type;
        this.fur_color = fur_color;
        this.some_sing=some_sing;
    }
    void say() {
        System.out.println("Привет, я  " + this.name + " " + this.age + " годков. Я " + this.p_type + " . Цвет " + this.fur_color + some_sing);
    }
}

