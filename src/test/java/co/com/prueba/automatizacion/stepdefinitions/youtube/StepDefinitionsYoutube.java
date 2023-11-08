package co.com.prueba.automatizacion.stepdefinitions.youtube;

import co.com.prueba.automatizacion.models.DatosElementos;
import co.com.prueba.automatizacion.tasks.youtube.AbrirLa;
import co.com.prueba.automatizacion.tasks.youtube.IngresarNombre;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;


public class StepDefinitionsYoutube {
    @DataTableType
    public DatosElementos datosElementos(Map<String, String> entry) {
        return new DatosElementos(entry.get("NombreCancion"));
    }

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingresa a la web de youtube")
    public void queElUsuarioIngresaALaWebDeYoutube(){
        OnStage.theActorCalled("Usuario").wasAbleTo(AbrirLa.pagina());
    }

    @Cuando("ingresa el nombre de la cancion en el buscador")
    public void ingresaElNombreDeLaCancionEnElBuscador(List<DatosElementos> datosElementosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNombre.cancion());

    }

    @Y("da clic en el boton buscar")
    public void daClicEnElBotonBuscar() {
    }

    @Y("selecciona la cancion correcta")
    public void seleccionaLaCancionCorrecta() {
    }

    @Entonces("se valida la cancion correcta")
    public void seValidaLaCancionCorrecta() {
    }
}
