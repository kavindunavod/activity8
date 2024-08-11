object activity8_1 {

  // Function to encrypt a message using Caesar cipher
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val shiftAmount = shift % 26
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shiftAmount) % 26 + base).toChar
      } else {
        char
      }
    }.mkString // Convert Seq[Char] back to String
  }

  // Function to decrypt a message using Caesar cipher
  def decrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val shiftAmount = shift % 26
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base - shiftAmount + 26) % 26 + base).toChar
      } else {
        char
      }
    }.mkString // Convert Seq[Char] back to String
  }

  // Testing the functions
  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World! i am kavindu"
    val shift = 3

    val encrypted = encrypt(plaintext, shift)
    println(s"Encrypted: $encrypted")

    val decrypted = decrypt(encrypted, shift)
    println(s"Decrypted: $decrypted")
  }
}
