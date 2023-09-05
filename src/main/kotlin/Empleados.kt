class Empleados (id:String,nombre:String,apellido:String,estado_civil:String, ano_incorp:Int,var num_despa:Int
):Persona(id = 0, nombre = "", apellido = "", estado_civil = ""){

    override fun cambiarEstadoCivil(nuevoEstadoCivil: String) {
        estado_civil = nuevoEstadoCivil
    }
    fun reasignarDespacho(nuevoDespacho: Int) {
        num_despa = nuevoDespacho
    }
}