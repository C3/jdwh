(defproject jdwh "0.8.0"
  :description "Command-line interface to the DWH via JDBC"
  :url "https://github.com/floybix/jdwh"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/java.jdbc "0.2.3"]
                 [com.teradata.jdbc/TeraDriver "14.10.00.17"]
                 [com.teradata.jdbc/tdgssconfig "14.10.00.17"]
                 [clojure-csv/clojure-csv "2.0.0-alpha1"]
                 [clojure-ini "0.0.1"]
                 [org.clojure/tools.cli "0.2.1"]
                 [org.clojure/clojure "1.4.0"]]
  :plugins [[lein-localrepo "0.5.0"]]
  :main jdwh.core
  :aot [jdwh.core jdwh.put])
