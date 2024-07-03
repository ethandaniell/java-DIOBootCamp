package dio.ethan.CondicionalSwitch;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //M / T

        switch (plano) {
            case "T":
                System.out.println("SGb Youtube");
            case "M":
                System.out.println("Whats e Instagram gratis");
            case "B":
                System.out.println("100 minutos de ligações");
        }
    }
}
