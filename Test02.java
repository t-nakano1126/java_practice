public class Test02 {
    public static void main(String args[]) {
        Dog dog1 = new Dog("柴犬");
        Dog dog2 = new Dog("ダルメシアン");

        dog1.setName("中野");
        dog1.setAge(25);

        dog2.setName("モンキー・D・ルフィ");
        dog2.setAge(19);

        dog1.ShowProfile();
        dog2.ShowProfile();
    }
}
