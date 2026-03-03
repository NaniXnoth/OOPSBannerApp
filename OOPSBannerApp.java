public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] banner = createBanner();
        printBanner(banner);
    }

    // Function to create banner
    public static String[] createBanner() {
        return new String[] {
            String.join(" ",
                "  *****  ", "  *****  ", " ******  ", "  ****** "),
            String.join(" ",
                " *     * ", " *     * ", " *     * ", " *       "),
            String.join(" ",
                "*       *", "*       *", " *     * ", " *       "),
            String.join(" ",
                "*       *", "*       *", " ******  ", "  *****  "),
            String.join(" ",
                "*       *", "*       *", " *       ", "       * "),
            String.join(" ",
                " *     * ", " *     * ", " *       ", "       * "),
            String.join(" ",
                "  *****  ", "  *****  ", " *       ", "  *****  ")
        };
    }

    // Function to print banner
    public static void printBanner(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }
}