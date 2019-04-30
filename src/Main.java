import service.PasswordService;

public class Main {

    public static void main(String[] args) {

        PasswordService pwService = new PasswordService();

        for (String password : args){
            pwService.setPassword(password);
            if (pwService.isPasswordValid() == true){
                System.out.println("Password : " + password + " is valid");
            }
            else {
                System.out.println("Password : " + password + " is invalid");
            }
        }





    }
}
