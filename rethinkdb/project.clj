(defproject jepsen.rethinkdb "0.1.0-SNAPSHOT"
  :description "RethinkDB Jepsen Tests"
  :url "http://github.com/rethinkdb/jepsen"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.apa512/rethinkdb "0.11.0"]
                 [clj-time "0.9.0"]
                 [jepsen "0.0.7-SNAPSHOT"]
                 [cheshire "5.4.0"]])
