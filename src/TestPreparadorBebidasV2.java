import java.util.Arrays;
import java.util.List;

public class TestPreparadorBebidasV2 {

    public static void main(String[] args) {

        List<EquipoCocina> equipos = Arrays.asList(
                new Cafetera(),
                new Licuadora(),
                new MaquinaTe(),
                new Exprimidor()
        );

        PreparadorBebidasV2 preparador =
                new PreparadorBebidasV2(equipos);

        preparador.prepararDesayuno();
        preparador.apagarTodo();
    }
}