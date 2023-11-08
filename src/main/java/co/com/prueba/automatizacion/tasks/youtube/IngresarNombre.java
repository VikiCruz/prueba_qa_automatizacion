package co.com.prueba.automatizacion.tasks.youtube;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IngresarNombre implements Task {

    public static IngresarNombre cancion(){
        return Tasks.instrumented(IngresarNombre.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
