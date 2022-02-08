lazy val slinky554 = haranaCrossProject("slinky554").in(file("."))
  .jsSettings(
    npmDependencies in Compile ++= Seq(
      "@nivo/core"                          -> "0.79.0",
      "@nivo/waffle"                        -> "0.79.1",
      "react"                               -> "17.0.1",
      "react-dom"                           -> "17.0.1",
    )
)

lazy val root = haranaRootProject(slinky554)