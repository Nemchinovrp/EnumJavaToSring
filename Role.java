public enum Role {
    ADMIN("Admin"),

    CLIENT("CLIENT"),

    PAYMASTER("PAYMASTER");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public static Role fromString(String role) {
        if (role != null) {
            for (Role ro : Role.values()) {
                if (role.equalsIgnoreCase(ro.role)) {
                    return ro;
                }
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return role;
    }
}
