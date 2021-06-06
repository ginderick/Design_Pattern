package BuilderPattern

class Student(
    val name: String,
    val university: String,
    val age: Int
) {

    data class Builder(
        var name: String,
        var university: String,
        var age: Int = 0
    ) {

        fun age(age: Int): Builder {
            this.age = age
            return this
        }

        fun build() = Student(name, university, age)

    }

    override fun toString(): String {
        return "$name, $university, $age"
    }
}