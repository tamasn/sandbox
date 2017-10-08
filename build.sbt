import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import scalariform.formatter.preferences._

val preferences =
  ScalariformKeys.preferences := ScalariformKeys.preferences.value
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(DoubleIndentConstructorArguments, true)
    .setPreference(DanglingCloseParenthesis, Preserve)

lazy val sandbox = (project in file("."))
	.settings(
		name := "sandbox",
		version := "0.1",
		scalaVersion := "2.12.3",
		libraryDependencies ++= Seq(
			"org.typelevel" %% "cats-core" % "1.0.0-MF",
			"org.scalactic" %% "scalactic" % "3.0.1",
			"org.scalatest" %% "scalatest" % "3.0.1" % "test"),
	Seq(preferences))
