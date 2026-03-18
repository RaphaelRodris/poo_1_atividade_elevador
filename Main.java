public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(5);

        elevador.mostrarAndarAtual();
        elevador.abrirPorta();
        elevador.subir();
        elevador.fecharPorta();

        elevador.subir();
        elevador.subir();

        elevador.mostrarAndarAtual();

        elevador.descer();
        elevador.abrirPorta();
        elevador.statusPorta();
    }
}

