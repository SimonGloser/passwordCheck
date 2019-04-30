package service;

public class PasswordService {

    private String password;

    public PasswordService(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean checkLength(){
        if (this.password.length() <= 8){
            return false;
        }
        return true;
    }
    public boolean checkForInt(){
        char[] letters = this.password.toCharArray();

        return true;
    }
}
