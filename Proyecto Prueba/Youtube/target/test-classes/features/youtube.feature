# language: es

@youtube
Característica: Buscar Cancion

  Antecedentes: Cargar la aplicación de Youtube
    Dado que inicio la aplicacion de youtube
    Entonces verifico que muestre la seccion principal Youtube

  Esquema del escenario: Buscar la cancion en Youtube
    Dado que digito el nombre de la cancion  "<Cancion>" en la caja de busquedas
    Cuando  seleccionar el botón buscar
    Entonces  verificar que la cancion se muestre  de manera exitosa
    Ejemplos:
      | Cancion   |
      | yandel 150 |
