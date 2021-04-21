package reviewclass10;

public class FacebookAccount {
    private String email;
    private String password;

    public void resetPassword(){
        System.out.println("Email has been sent to your email Id "+email+" click on link to reset your password");
    }

    public void setEmail(String email){
        if(email.contains("@")&& email.endsWith(".com")){
            this.email=email;
        }else{
            System.out.println("Your email is not correct");
        }
    }

}
