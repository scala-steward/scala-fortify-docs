organization := "com.lightbend"
name := "scala-fortify-guide"
version := "1.0.11"
enablePlugins(ParadoxPlugin)

// techhub will override with the Lightbend theme, which is only
// available from a private resolver. Travis-CI *could* be configured
// to access that resolver, but it's easier just to do local and CI
// builds with a generic theme.  (and for the techhub override to even
// work, we need to specify *something* here.)
paradoxTheme := Some(builtinParadoxTheme("generic"))
