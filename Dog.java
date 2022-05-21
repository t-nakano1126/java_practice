public class Dog {
    private String Name;
    private int age;

    // 犬種
    private String dogType;

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ShowProfile() {
        System.out.println("名前は、" + Name + "です。");
        System.out.println("年齢は、" + age + "です。");
        System.out.println("犬種は、" + dogType + "です。");
    }

    public Dog(String dogType) {
        this.dogType = dogType;
    }

}
