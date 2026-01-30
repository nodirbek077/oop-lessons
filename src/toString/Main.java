package toString;

public class Main {
    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.setName("Alish");
        profile.setSurname("Aliyev");
//        System.out.println(profile.getName() + " " + profile.getSurname());
//        System.out.println(profile.toString());
//        profile = null;--bu yerda agar profile = null bo'lsa null ni chiqaradi aks holatda toString methodini ishlatib yuboradi alohida if bn tekshirib o'tirishimizni keragi yo'q
        System.out.println(profile);
    }
}
