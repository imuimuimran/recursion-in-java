public class placeTilesinFloor {
    // Tiles size is 1 x m and floor size is n x m.
    public static int placeTiles(int n, int m) {
        if(n == m) {
            return 2;
        }

        if(n < m) {
            return 1;
        }


        // Place Tiles in Vertically
        int verticalPlace = placeTiles(n - m, m);

        // Place Tiles in Horizontally
        int horizonetalPlace = placeTiles(n - 1, m);

        int totalPlacements = verticalPlace + horizonetalPlace;

        return totalPlacements;

    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int result = placeTiles(n, m);
        System.out.println(result);
    }
}
