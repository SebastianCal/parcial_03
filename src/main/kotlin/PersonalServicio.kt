class PersonalServicio (id:String,nombre:String,apellido:String,estado_civil:String,var seccion_asignado:String):Persona(id = 0, nombre = "", apellido = "", estado_civil = ""){
    override fun cambiarEstadoCivil(nuevoEstadoCivil: String) {
        estado_civil = nuevoEstadoCivil
    }
    fun trasladarASección(nuevaSección: String) {
        seccion_asignado =nuevaSección
    }
}