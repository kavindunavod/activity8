object Activity8_1 {

  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val shiftAmount = (shift % 26 + 26) % 26 // Normalize shift to be between 0 and 25
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shiftAmount) % 26 + base).toChar
      } else {
        char
      }
    }.mkString
  }

  def decrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val shiftAmount = (shift % 26 + 26) % 26 // Normalize shift to be between 0 and 25
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base - shiftAmount + 26) % 26 + base).toChar
      } else {
        char
      }
    }.mkString
  }

  def cipher(text: String, shift: Int, algorithm: (String, Int) => String): String = {
    algorithm(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World! I am Kavindu"
    val shift = 3

    val encrypted = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encrypted")

    val decrypted = cipher(encrypted, shift, decrypt)
    println(s"Decrypted: $decrypted")
  }
}
