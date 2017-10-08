import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import scalariform.formatter.preferences._

import Dependencies._

val preferences =
  ScalariformKeys.preferences := ScalariformKeys.preferences.value
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(DoubleIndentConstructorArguments, true)
    .setPreference(DanglingCloseParenthesis, Preserve)


lazy val sandbox = (project in file("."))
	.settings(
		name := "sandbox",
		version := "0.1",
		scalaVersion := Versions.scala,
		libraryDependencies ++= Dependencies.deps,
	Seq(preferences))
