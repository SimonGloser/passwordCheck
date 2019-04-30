package service;

public class PasswordService {

    private String password;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPasswordValid(){
        if (this.checkLength() == false){
            return false;
        }

        if (this.passwordHasInt() == false ){
            return false;
        }
        if (this.passwordHasUpperCase() == false){
            return false;
        }
        return true;
    }

    private boolean checkLength(){
        if (this.password.length() <= 8){
            return false;
        }
        return true;
    }
    private boolean passwordHasInt(){
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

    private boolean passwordHasUpperCase(){
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
