public class TestAnalisis {
    public static void main(String[] args) {
        // Creando preparador de bebidas
        PreparadorBebidas preparador = new PreparadorBebidas(new Cafetera(), new Licuadora());
        // Llamando a prepararDesayuno()
        preparador.prepararDesayuno();
        // Llamando a apagarTodo()
        preparador.apagarTodo();

        // Problema detectado:
        System.out.println("// El preparador esta amarrado a Cafetera y Licuadora");
    }
}