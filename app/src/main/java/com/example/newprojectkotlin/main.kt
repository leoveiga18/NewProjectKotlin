import com.example.newprojectkotlin.Dog
import com.example.newprojectkotlin.Human

fun main() {
    val leo = Human()
    leo.name = "Leonardo"

    val dog = Dog()
    dog.owner = leo
    dog.name = "Linux"
    dog.sayHi()

    val paulo = Human()
    paulo.name = "Paulo"
    dog.owner = paulo
    dog.sayHi()

}