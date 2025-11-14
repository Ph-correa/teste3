
fun main(){
    val matriz = Int
    println("Digite seu email")
    var email = readln()
    var nome_copleto = StringBuilder()
    nome_copleto.append("pedrao")
    nome_copleto.append("henrique")
    println("Digite uma palava")
    var descodificado = StringBuilder().append(readln())
    var codificado= StringBuilder()
    val chave = 4.toInt()
    for (i in descodificado){
        codificado.append(i.toChar()+chave)

    }
    println("$codificado ")
}
