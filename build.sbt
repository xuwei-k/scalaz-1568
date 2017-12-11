val sampleLibrary = project.settings(
  scalaVersion := "2.11.12",
  libraryDependencies += "com.example" %% "test" % "0.1"
)

val sampleMain = project.settings(
  scalaVersion := "2.11.12",
  libraryDependencies += "com.example" %% "test" % "0.2"
).dependsOn(
  sampleLibrary
)
