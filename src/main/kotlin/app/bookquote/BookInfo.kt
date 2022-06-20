package app.bookquote

import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.utils.HttpClientUtils
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.impl.client.HttpClients

data class BookInfo(
  val lastName: String,
  val firstName: String,
  val middleName: String,
  val title: String,
  val subtitle: String,
  val language: String,
  val year: String,
  val series: String,
  val id: String
) {
  companion object {
    fun loadCatalog(url: String): List<BookInfo> {

      //val x = HttpClients.createDefault().use {  }.execute(HttpGet(url)).entity.content
      TODO()
    }
  }
}