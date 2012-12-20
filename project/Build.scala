import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "documentextractor"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "edu.washington.cs.knowitall.ollie" % "ollie-core_2.9.2" % "1.0.0",
      "edu.washington.cs.knowitall" % "reverb-core" % "1.4.0",
      "org.apache.tika" % "tika-app" % "1.2",
      "edu.washington.cs.knowitall.nlptools" % "nlptools-parse-malt_2.9.2" % "2.2.4",
      "edu.washington.cs.knowitall.nlptools" % "nlptools-sentence-opennlp_2.9.2" % "2.2.4",
      "net.databinder.dispatch" % "dispatch-core_2.9.2" % "0.9.4",
      "de.l3s.boilerpipe" % "boilerpipe" % "1.2.0",
      "net.sourceforge.nekohtml" % "nekohtml" % "1.9.17",
      "xerces" % "xercesImpl" % "2.9.1",
      "joda-time" % "joda-time" % "2.1",
      "org.apache.derby" % "derby" % "10.9.1.0"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here
      resolvers += {
        "boilerpipe-m2-repo" at "https://boilerpipe.googlecode.com/svn/repo/"
      }
    )
}
