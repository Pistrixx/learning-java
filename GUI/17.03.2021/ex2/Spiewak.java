public abstract class Spiewak {

    private String nazwisko;
    private int numerStartowy;
    private static int counter = 1;

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        numerStartowy = counter++;
    }

    public abstract String spiewaj();

    public static Spiewak najglosniej(Spiewak[] spiewacy) {
        Spiewak tmp = null;
        int max = -1;

        for (Spiewak s : spiewacy) {
            int licznik = 0;

            for (int i = 0; i < s.spiewaj().length(); i++) {
                if (Character.isUpperCase(s.spiewaj().charAt(i)))
                    licznik++;
            }

            if (licznik > max) {
                max = licznik;
                tmp = s;
            }
        }
        return tmp;
    }

    @Override
    public String toString() {
        return "(" + numerStartowy + ")" + nazwisko + ": " + spiewaj();
    }

}
