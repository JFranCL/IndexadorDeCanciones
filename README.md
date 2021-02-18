# Indexador

Servicio que analiza los ficheros de disco (de forma recursiva) en busca de archivos '.mp3'.
Una vez encuentra el arhivo mp3, procede a subirlo a una base de datos.
Registra todos los movimientos que realiza en un archivo Log.
Se le debe pasar un parametro en el constructor, este parametro indicará la ruta de comienzo de escáneo.
Una vez la base de datos contenga los datos de los archivos mp3, te permitirá crear una lista de reproducción (Archivo M3U) completamente funcional, con las canciones elegidas por el usuario.
También da la opcion de filtrar la lista de reproducción por un genero concreto.
