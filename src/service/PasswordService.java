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
    private boolean checkForInt(){
        char[] letters = this.password.toCharArray();

        for( char letter : letters){
            for (int i = 48; i < 58; i++){

                if (letter == (char)i ){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkForUpperCase(){
        char[] letters = this.password.toCharArray();

        for( char letter : letters){
            for (int i = 65; i < 91; i++){
                if (letter == (char)i){
                    return true;
                }
            }
        }
        return false;
    }
}
