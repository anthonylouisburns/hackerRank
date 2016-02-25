name := "hackerRank"

version := "1.0"

scalaVersion := "2.11.7"

val jacksonVersion = "2.6.3"

libraryDependencies ++= {
  Seq("com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % jacksonVersion
    ,"com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion
    ,"com.fasterxml.jackson.core" % "jackson-annotations" % jacksonVersion
    ,"com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion
    ,"com.fasterxml.jackson.datatype" % "jackson-datatype-jdk8" % jacksonVersion
    ,"com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % jacksonVersion
    ,"com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % jacksonVersion
    ,"javax.ws.rs" % "javax.ws.rs-api" % "2.0.1"
    , "org.scalatest" % "scalatest_2.11" % "3.0.0-M15"
    , "org.json4s" % "json4s-native_2.11" % "3.3.0"
    , "org.json4s" % "json4s-jackson_2.11" % "3.3.0"
    , "org.fusesource.jansi" % "jansi" % "1.11"
    , "com.google.guava" % "guava" % "19.0")
}