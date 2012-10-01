(defproject lein-deploy-app "0.1.1"
  :description "A Leiningen plugin to push application uberjars to AWS s3"
  :url "https://clojars.org/lein-deploy-app"
  :dependencies [[org.clojure/clojure "1.4.0"]

                 ;; temporary fix to deal with terrible java developers who
                 ;; don't depend on fixed-versioned libraries
                 [clj-aws-s3 "0.3.2"
                  :exclusions [org.codehaus.jackson/jackson-core-asl
                               org.codehaus.jackson/jackson-mapper-asl]]
                 [org.codehaus.jackson/jackson-core-asl "1.7.3"]
                 [org.codehaus.jackson/jackson-mapper-asl "1.7.3"]

                 [clj-aws-s3 "0.3.2"]
                 [dsabanin-clj-jgit "0.1.3"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true)