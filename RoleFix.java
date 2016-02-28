public enum RoleFix {
    ADMIN("ADMIN", "/Admin"),

    CLIENT("CLIENT", "/Client"),

    PAYMASTER("PAYMASTER", "/Paymaster"),

    DEFAULT("DEFAULT", "/Err");

    static final Logger logger = LogManager.getRootLogger();
    private String role;
    private String urlPattern;

    Role(String role, , String urlPattern) {
        this.role = role;
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern(){
        return urlPattern;
    }

    public static Role fromString(String role) {
        if (role != null) {
            logger.info("Заходим в метод");
            for (Role ro : Role.values()) {

                if (role.equalsIgnoreCase(ro.toString())) {
                    return ro;
                }
                logger.info("Перебираем значения");
            }
        }
          return DEFAULT;
    }

    @Override
    public String toString() {
        return role;
    }

}
