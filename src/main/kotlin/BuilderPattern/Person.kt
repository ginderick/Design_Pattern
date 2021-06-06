package BuilderPattern

class Person(
    var name: String?,
    var email: String?,
    var address: String?,
    var age: Int?
) {
    data class Builder(
        var name: String? = null,
        var email: String? = null,
        var address: String? = null,
        var age: Int = 0
    ) {

//        fun setAddress(address: String): Builder {
//            this.address = address
//            return this
//        }

        fun address(address: String) = apply {
            this.address = address
        }

        fun age(age: Int) = apply {
            this.age = age
        }

//        fun setAge(age: Int): Builder {
//            this.age = age
//            return this
//        }

//        fun build(): Person {
//            return Person(name, email, address, age)
//        }

        fun build() = Person(name, email, address, age)
    }

    override fun toString(): String {

        return "$name, $address, $age"
    }


}