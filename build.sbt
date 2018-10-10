name := "project-published-to-maven-central"
organization := "com.github.fpopic"
version := "0.1"
scalaVersion := "2.12.7"

homepage := Some(url("https://github.com/fpopic/project-published-to-maven-central"))

scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/fpopic/project-published-to-maven-central"),
    connection = "git@github.com:fpopic/project-published-to-maven-central.git")
)

developers := List(
  Developer(
    id = "fpopic",
    name = "Filip Popic",
    email = "filip.popic@gmail.com",
    url = url("https://github.com/fpopic")
  )
)

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

publishMavenStyle := true

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

pgpReadOnly := false
