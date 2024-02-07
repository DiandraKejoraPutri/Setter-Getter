package SetterGetter;

public class lari {
    public static void main(String[] args) {
        
        User dian = new User();
        
        dian.setUsername("dian");
        dian.setPassword("kopiJava");
        
        System.out.println("Username: " +dian.getUsername());
        System.out.println("Password: " +dian.getPassword());
    }
}
