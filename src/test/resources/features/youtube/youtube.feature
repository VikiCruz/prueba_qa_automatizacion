#Autor: VikiCruz
  #language: es

@YOUTUBE
Característica: Validar la funcionalidad de youtube
  yo como usuario
  quiero ingresr a la web de youtube
  para verificar su correcto funcionamiento

  @CASOUNO
  Esquema del escenario: Validar la correcta busqueda de una cancion
    Dado que el usuario ingresa a la web de youtube
    Cuando ingresa el nombre de la cancion en el buscador
      | NombreCancion   |
      | <NombreCancion> |
    Y da clic en el boton buscar
    Y selecciona la cancion correcta
    Entonces se valida la cancion correcta

    Ejemplos:
      | NombreCancion        |
      | locked out of heaven |
