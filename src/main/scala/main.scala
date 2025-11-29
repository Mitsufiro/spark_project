object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
   // Весь код заменяется на пару функций, которые сначала отбирают строки с символами болле 3,
   // далее элементы списка преобразовываются в верхний регистр
    strings.filter(_.length > 3).map(_.toUpperCase)
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}