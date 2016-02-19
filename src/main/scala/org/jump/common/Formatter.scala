package org.jump.common

import com.typesafe.scalalogging._
import org.slf4j.LoggerFactory

import org.ini4j.Ini
import java.io.FileReader
import scala.collection.JavaConversions._

object Formatter {
  def wrap(term: String): String = {
    "'" + term + "'"
  }

  def escape(term: String): String = {
    term.replace("'", "\\'")
  }
}