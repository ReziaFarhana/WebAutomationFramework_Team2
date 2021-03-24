package homepage;

public class HomePageWebElement {

    public static final String informationXp ="//a[normalize-space()='Information']";
    public static final String claimsAndRoadsideXp ="//body/nav[@class='open']/div[@class='panel-wrapper open']/ul/li[@data-name='Claims and Roadside Help']/a[1]";
    public static final String reportAClaimXp ="//a[@data-link-name='primary-navigation:Report a Claim']//span[@class='geico-nav-menu-item'][normalize-space()='Report a Claim']";
    public static final String reportAClaimPageTextCss="div[class='page-header-left'] h2";
    public static final String viewAClaimXp="//a[@data-link-name='primary-navigation:View a Claim']//span[@class='geico-nav-menu-item'][normalize-space()='View a Claim']";
    public static final String viewAClaimPageTextXp="//h3[contains(text(),'To locate your claim, please provide the " +
            "following')]";
    public static final String getRoadSideHelpXp="//a[@data-link-name='primary-navigation:Get Roadside Help']//span[@class='geico-nav-menu-item'][normalize-space()='Get Roadside Help']";
    public static final String reportGlassDamageXp="//a[@data-link-name='primary-navigation:Report Glass Damage']//span[@class='geico-nav-menu-item'][normalize-space()='Report Glass Damage']";
    public static final String catastropheClaimsXp="//a[@data-link-name='primary-navigation:Catastrophe Claims']//span[@class='geico-nav-menu-item'][normalize-space()='Catastrophe Claims']";

}
