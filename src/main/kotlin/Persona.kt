    open class Persona (

    var id:Int,
    var nombre:String,
    var apellido:String,
    var estado_civil:String
    ){
        open fun cambiarEstadoCivil(nuevoEstadoCivil: String) {
            estado_civil = nuevoEstadoCivil
        }

    }