package registration;

public class RegistrationPageWebElements {

    public static final String firstName= "(//input [@name='firstName'])[1]";
    public static final String lastName= "(//input [@name='lastName'])[1]";
    public static final String email= "(//input [@name='email'])[2]";
    public static final String accountBtn= "(//span[contains(text(),'Account')])[2]";
    public static final String password= "(//input [@name='password'])[2]";
    public static final String signInBtn= "//div[text()='Sign In']";
    public static final String createAccountBtn="(//button[text()='Create account'])[1]";
    public static final String showPasswrdBtn="(//*[@aria-label='Show Password'])[1]";
    public static final String createAccountBtn2="(//button[text()='Create account'])[2]";
    public static final String signInPageText="(//span[contains(text(), ' Sign in to you')])[1]";

}
