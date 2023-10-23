class InitialM {
    public static void main(String[] args) {
        int height = 7;

        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = height / 2; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (height - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
