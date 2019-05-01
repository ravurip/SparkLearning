package com.guptha.basic

import com.guptha.utils.{ConfigLoader, SparkUtil}
import org.apache.spark.sql.SparkSession

object Learn {

  def main(args: Array[String]): Unit = {

    val spark: SparkSession = new SparkUtil().create("prad")

    spark.read.text("C:\\Program Files\\MPC-HC\\Authors.txt").show(1000,false)

//    println(config.isEmpty)
//
//    System.in.read()
  }

}
