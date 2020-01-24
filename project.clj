(defproject duct.logger.clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.logging "0.5.0"]
                 [duct/core "0.8.0"]
                 [duct/logger "0.3.0"]
                 [integrant "0.8.0"]]
  :profiles
  {:dev {:dependencies [[eftest "0.5.9"]
                        [org.slf4j/slf4j-simple "1.7.30"]]}})
