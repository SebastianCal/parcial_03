class Profesores (id:String,nombre:String,apellido:String,estado_civil:String,var departamento:String):Persona(id = 0, nombre = "", apellido = "", estado_civil = ""){
    override fun cambiarEstadoCivil(nuevoEstadoCivil: String) {
        estado_civil = nuevoEstadoCivil
    }
    fun cambiarDepartamento(nuevoDepartamento: String) {
        departamento = nuevoDepartamento
    }
}