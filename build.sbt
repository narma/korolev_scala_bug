organization := "com.example"

name := "KorolevScalaBug"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.8"

val korolevVersion = "0.10.0"
val vAkka = "2.5.21"
val vHttpAkka = "10.1.7"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-simple" % "1.7.+",
  "com.github.fomkin" %% "korolev-server-akkahttp" % korolevVersion,
)
