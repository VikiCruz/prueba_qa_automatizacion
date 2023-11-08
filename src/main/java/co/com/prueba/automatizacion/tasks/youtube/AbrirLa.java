package co.com.prueba.automatizacion.tasks.youtube;

import co.com.prueba.automatizacion.userinterfaces.youtube.PaginaYoutube;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLa implements Task {

    private PaginaYoutube paginaYoutube;
    public static AbrirLa pagina(){
        return Tasks.instrumented(AbrirLa.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaYoutube)

        );

    }
}
