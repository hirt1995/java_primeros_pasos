public class TestReferencia {
    public static void main(String[] args) {
        Cliente hugo = new Cliente();
        hugo.nombre = "Hugo";
        hugo.documento = "1116800954";
        hugo.telefono = "8856158";

        cuenta cuentadeHugo = new cuenta();
        cuentadeHugo.agencia = 1;
        cuentadeHugo.titular = hugo;

        System.out.println(cuentadeHugo.titular.documento);

    }
}
