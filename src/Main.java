public class Main
{
    public static void main(String[] args)
    {
        int alter = 25;
        String vorname = "Axel";
        String nachname = "Basset";
        int jahrgang = 2018;
        String herkunft = "Buenos Aires";
        System.out.println(String.format("Hello %s! Du bist %d Jahre alt. Dein Nachname ist: %s. Jahrgang = %d. Du kommst aus: %s", vorname, alter, nachname, jahrgang, herkunft));
    }
}
