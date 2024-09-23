fun main() {
    val phoneBook = mapOf(
        "Mary" to "+7-923-654-14-56",
        "Bob" to "+1-923-654-14-57",
        "Charlie" to "+7-923-654-14-58",
        "Sam" to "+1-923-654-14-59"
    )

    val countryCode = "+7"

    val filteredPhoneBook = phoneBook.filter { it.value.startsWith(countryCode) }

    println("Телефонная книга для кода страны $countryCode:")
    filteredPhoneBook.forEach { (name, number) -> println("$name: $number") }
}