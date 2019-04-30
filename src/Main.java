import service.PasswordService;

public class Main {

    public static void main(String[] args) {

        PasswordService pwService = new PasswordService("h2allo9");


        System.out.println(pwService.checkForInt());


    }
}
