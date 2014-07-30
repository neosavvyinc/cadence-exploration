name := "cadence"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies += "io.spray" % "spray-can" % "1.2.0"

libraryDependencies += "io.spray" % "spray-routing" % "1.2.0"

libraryDependencies += "io.spray" % "spray-testkit" % "1.2.0" % "test"

libraryDependencies += "io.spray" %% "spray-json" % "1.2.5"

libraryDependencies += "com.typesafe.slick" %% "slick" % "2.1.0-RC3"

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.6.4"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.22"

libraryDependencies += "com.jolbox" % "bonecp" % "0.7.1.RELEASE"

libraryDependencies += "com.github.tototoshi" %% "slick-joda-mapper" % "0.4.0"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.2.3"

libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.2.3" % "test"

Revolver.settings

Revolver.enableDebugging(port = 5050, suspend = false)

