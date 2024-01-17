package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String whatToSpeak) {
        if (whatToSpeak == "") {
            System.out.println("Olen " + name + " ja ikäni on " + age + ", mutta antaisitko silti syötteen?");
            return;
        }
        System.out.println(name + ": " + whatToSpeak);

    }

    public void run(int howManyLaps) {
        for(int i = 1; i <= howManyLaps; i++) {
            System.out.println(name + " juoksee kovaa vauhtia!");
        }
    }
}
