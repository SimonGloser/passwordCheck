import service.PasswordService;

public class Main {

    public static void main(String[] args) {

        PasswordService pwService = new PasswordService("H2allo9");


        System.out.println(pwService.checkForUpperCase());


    }
}
