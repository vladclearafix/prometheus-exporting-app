name := "prometheus-exporting-app"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies := Seq(
  "com.typesafe.akka" %% "akka-http"   % "10.1.0",
  "com.typesafe.akka" %% "akka-stream" % "2.5.11"
)

libraryDependencies += "io.kamon" %% "kamon-prometheus" % "1.0.0"
libraryDependencies += "io.kamon" %% "kamon-system-metrics" % "1.0.0"