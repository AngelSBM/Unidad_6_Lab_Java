public class StringManager {

    private String cadenaTexto;

    public StringManager() {
    }

    public StringManager(String cadenaTexto) {
        this.cadenaTexto = cadenaTexto;
    }

    public void manageString() {
        System.out.println(cadenaTexto);
        if (cadenaTexto == null) {
            System.out.println("ERROR! necesita insertar un string para evaluarlo");
        }

        if (!(cadenaTexto == "NO-ACTION") && (cadenaTexto != null)) {
            System.out.println("Largo de la cadena: " + cadenaTexto.length());
            System.out.println("Mayúscula: " + cadenaTexto.toUpperCase());
            System.out.println("Minúscula: " + cadenaTexto.toLowerCase());
        }

    }

    public String printStackTrace() throws Exception {
        throw new Exception("ERROR! necesita proporcionar una cadena de texto para así poder evaluarla");
    }

}