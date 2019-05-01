package com.guptha.utils

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession


class SparkUtil extends ConfigLoader {

  def create(appName: String): SparkSession = {
    val runMode: String = config.getString("runMode.mode")

    println(runMode)

    try {
      Logger.getLogger("org").setLevel(Level.TRACE)
      SparkSession.builder().master(runMode).appName(appName).getOrCreate()

    } catch {

      case exc: Exception => throw exc

    }

  }

}
