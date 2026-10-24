public class TestAnalisis {
    public static void main(String[] args) {
        // Creando preparador de bebidas
        PreparadorBebidas preparador = new PreparadorBebidas(new Cafetera(), new Licuadora());
        // Llamando a prepararDesayuno()
        preparador.prepararDesayuno();
        // Llamando a apagarTodo()
        preparador.apagarTodo();

        // Problema detectado:
        System.out.print("No genera errores en consola." +
                "pero la forma de utilizar la clase preparador de bebidas solo" +
                "permite tener dos equipos, para agregar mas, se debe agregar" +
                "las clases explicitamente. ");
    }


}