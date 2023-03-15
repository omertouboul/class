public static boolean isValidEmail(String email) {
    if (email == null || email.isEmpty()) {
        return false;
    }

    int atIndex = email.indexOf('@');
    int dotIndex = email.lastIndexOf('.');

    if (atIndex < 1 || dotIndex < atIndex + 2 || dotIndex + 2 >= email.length()) {
        return false;
    }

    return true;
}
