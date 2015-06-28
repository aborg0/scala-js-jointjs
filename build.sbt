//import SonatypeKeys._

//sonatypeSettings

// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

organization := "com.mind_era"

name := "scala-js-jointjs"

version := "0.0.00903"

scalaVersion := "2.11.6"

persistLauncher in Compile := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

//jsDependencies += "org.webjars.bower" % "jointjs" % "0.9.3" / "joint.js"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.1" % "test"

//TODO this should be at least 0.0.10102
libraryDependencies += "com.mind_era" %%% "backbone-scala-js" % "0.0.10000"

testFrameworks += new TestFramework("utest.runner.Framework")

skip in packageJSDependencies := false

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:higherKinds",
  "-language:reflectiveCalls",
  "-Xlint",
//  "-Xfatal-warnings",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)

//publishMavenStyle := true

pomIncludeRepository := { x => false }

//credentials += Credentials(Path.userHome / ".ivy2" / "sonatype.credentials")