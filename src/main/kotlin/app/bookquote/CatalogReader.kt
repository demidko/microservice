package app.bookquote

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVFormat.newFormat
import java.io.Closeable
import java.io.Reader

/**
 * Класс для вычитки каталога Флибусты инкапсулирует работу с внутренним форматом
 */
@Suppress("SpellCheckingInspection")
class CatalogReader(r: Reader) : Closeable {

  private val reader = newFormat(';').parse(r)
  private val it = reader.iterator()

  init {
    it.next() // пропускаем названия колонок
  }


  override fun close() {
    reader.close()
  }
}