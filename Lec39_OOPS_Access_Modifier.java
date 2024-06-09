public class Lec39_OOPS_Access_Modifier {
    public static void main(String[] args){

        BankAccount myAcc = new BankAccount();
        myAcc.username = "aditya_vit";
        System.out.println(myAcc.username);

        myAcc.setPassword("aditya");

    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }

}
