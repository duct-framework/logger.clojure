(ns duct.logger.clojure-test
  (:require [clojure.test :refer :all]
            [duct.core :as duct]
            [duct.logger :as logger]
            [duct.logger.clojure]
            [eftest.output-capture :as outcap]
            [integrant.core :as ig]))

(deftest log-level-test
  (let [config {:duct.logger/clojure {}}
        logger (:duct.logger/clojure (ig/init config))
        output (outcap/with-test-buffer
                 (outcap/with-capture
                   (doto logger
                     (logger/debug  :test/a)
                     (logger/info   :test/b)
                     (logger/warn   :test/c)
                     (logger/error  :test/d)
                     (logger/fatal  :test/e)
                     (logger/report :test/f)))
                 (outcap/read-test-buffer))]
    (is (re-find #"DEBUG duct\.logger\.clojure-test - :test/a\n" output))
    (is (re-find #"INFO duct\.logger\.clojure-test - :test/b\n" output))
    (is (re-find #"WARN duct\.logger\.clojure-test - :test/c\n" output))
    (is (re-find #"ERROR duct\.logger\.clojure-test - :test/d\n" output))
    (is (re-find #"ERROR duct\.logger\.clojure-test - :test/e\n" output))
    (is (re-find #"INFO duct\.logger\.clojure-test - :test/f\n" output))))
