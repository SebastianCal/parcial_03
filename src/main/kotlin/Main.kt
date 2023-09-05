fun main(args: Array<String>) {

    println("MENU DE INGRESO")
    print("Ingrese el nombre: ")
    val nombre = readLine()!!
    print("Ingrese los apellidos: ")
    val apellidos = readLine()!!
    print("Ingrese el ID: ")
    val id = readLine()!!
    print("Ingrese el estado civil: ")
    val estadoCivil = readLine()!!
    println("Escoja que tipo es usted en la falcultad:")
    println("1. Estudiante")
    println("2. Empleado")

    val menu:Int = readln().toInt()
    if (menu == 1){
        println("Ingrese curso en el que esta matriculado: ")
        val curso = readln().toString()
    }else if (menu == 2){
        print("Ingrese el año de incorporación: ")
        val añoIncorporación = readLine()!!.toInt()

        println("INGRESE QUE TIPO DE EMPLEADO ES: ")
        println("1. Profesor")
        println("2. Personal de servicio")
        println("Ingrese dato: ")
        val menu2:Int = readln().toInt()

        if (menu2 == 1){
            print("Ingrese el departamento al que pertenece: ")
            val deparatamento = readLine()!!.toInt()
        }else if (menu2 == 2){
            print("Ingrese la sección a la que pertenece: ")
            val sección = readLine().toString()
        }else{
            println("Dato no valido")
        }

    }else{
        println("Dato no valido")
    }




}