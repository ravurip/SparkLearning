package com.guptha.basic

import com.guptha.utils.{ConfigLoader, SparkUtil}
import org.apache.spark.sql.SparkSession

object Learn {

  def main(args: Array[String]): Unit = {

    val spark: SparkSession = new SparkUtil().create("prad")

//    println(config.isEmpty)
//
    System.in.read()
  }

}
