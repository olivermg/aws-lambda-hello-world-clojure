(defproject aws-lambda-clj-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ;;;[org.clojure/data-json "0.2.6"]
                 [com.amazonaws/aws-lambda-java-core "1.1.0"]]

  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]

  :profiles {:uberjar {:aot :all}}

  )
