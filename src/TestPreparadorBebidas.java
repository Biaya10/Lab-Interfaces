public class TestPreparadorBebidas {
    public static void main(String[] args) {

        // Configuracion 1: Cafetera + Licuadora (la original)
        System.out.println(" Configuracion 1: Cafetera + Licuadora ");
        PreparadorBebidas preparador1 = new PreparadorBebidas(new Cafetera(), new Licuadora());
        preparador1.prepararDesayuno();
        preparador1.apagarTodo();

        // Configuracion 2: Maquina de te + Exprimidor (equipos nuevos)
        System.out.println();
        System.out.println(" Configuracion 2: Maquina de te + Exprimidor ");
        PreparadorBebidas preparador2 = new PreparadorBebidas(new MaquinaTe(), new Exprimidor());
        preparador2.prepararDesayuno();
        preparador2.apagarTodo();

        // Configuracion 3: Cafetera + Maquina de te
        System.out.println();
        System.out.println(" Configuracion 3: Cafetera + Maquina de te ");
        PreparadorBebidas preparador3 = new PreparadorBebidas(new Cafetera(), new MaquinaTe());
        preparador3.prepararDesayuno();
        preparador3.apagarTodo();
    }
}