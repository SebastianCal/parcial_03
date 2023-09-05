class Estudiantes (id:String,nombre:String,apellido:String,estado_civil:String,var curso:String):Persona(id = 0, nombre = "", apellido = "", estado_civil = ""){

    override fun cambiarEstadoCivil(nuevoEstadoCivil: String) {
        estado_civil = nuevoEstadoCivil
    }
    fun matricular(nuevoCurso: String) {
        curso = nuevoCurso.toString()
    }

}