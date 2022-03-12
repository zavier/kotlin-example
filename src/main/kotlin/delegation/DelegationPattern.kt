package delegation

interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(val n:String): SoundBehavior {
    override fun makeSound() {
        println("${n.uppercase()} !!!")
    }
}

class RockAndRollBehavior(val n:String): SoundBehavior {
    override fun makeSound() {
        println("I'm th King of Rock 'N' Roll: $n")
    }
}

// 由ScreamBehavior代理
class TomAraya(n:String): SoundBehavior by ScreamBehavior(n)