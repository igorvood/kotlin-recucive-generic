import ru.vood.mutableUnMutable.IImmutable
import ru.vood.mutableUnMutable.IMutable

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

data class UserImmutable(val name: String) : IImmutable<UserImmutable,UserMutable>{
    override fun toMutable(): UserMutable = UserMutable(name)
}

data class UserMutable(var name: String) : IMutable<UserMutable, UserImmutable>{
    override fun toImmutable(): UserImmutable = UserImmutable(name)
}