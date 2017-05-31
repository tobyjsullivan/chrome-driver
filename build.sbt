// Dependencies
val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"
val selenium = "org.seleniumhq.selenium" % "selenium-server" % "3.4.0"

lazy val root = (project in file(".")).
  settings(
    name := "sbt-bootstrap",
    version := "1.0",
    scalaVersion := "2.12.1",

    libraryDependencies ++= Seq(
      scalaTest,
			selenium
    )
  )
