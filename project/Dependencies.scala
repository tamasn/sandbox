import sbt._

object Dependencies {

  object Versions {
    val scala = "2.12.3"
    val cats = "1.0.0-MF"
    val scalaTest = "3.0.1"
  }

  val deps = Seq(
    "org.typelevel" %% "cats-core" % Versions.cats,
    "org.typelevel" %% "cats-free" % Versions.cats,
    "org.scalactic" %% "scalactic" % Versions.scalaTest,
    "org.scalatest" %% "scalatest" % Versions.scalaTest % "test")
}