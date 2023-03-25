public class TestReferencia2 {
    public static void main(String[] args) {

        cuenta cuentadeHugo = new cuenta();

        cuentadeHugo.titular = new Cliente();
        cuentadeHugo.titular.nombre = "Hugo";

        System.out.println(cuentadeHugo.titular.nombre );
    }
}
