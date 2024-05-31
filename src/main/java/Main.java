public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 150;
        long actul = service.calcBonus(1000, true);
        System.out.println("1. " + expected + "== ? ==" + actul);

        expected = 30_000;
        actul = service.calcBonus(1_000_000, true);
        System.out.println("2, " + expected + "== ? ==" + actul);
    }

}
