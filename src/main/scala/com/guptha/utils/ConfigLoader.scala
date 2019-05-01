package com.guptha.utils

import java.io.File

import com.typesafe.config.{Config, ConfigFactory}
import org.apache.log4j.Logger

trait ConfigLoader {

  private val logger: Logger = Logger.getLogger(this.getClass)
  val config: Config = {
    try {
      logger.info("Resolving application.conf")
      val confFile = new File(System.getProperty("confFile"))

      ConfigFactory.parseFile(confFile).resolve()

    } catch {
      case exception: Exception => {
        logger.error("Application terminated with following error in ConfigLoader", exception)
        throw exception
      }
    }
  }
}
