(defproject {{ns-name}} "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.datomic/datomic-free "0.9.4894"]]
  :main {{ns-name}}.core
  :jvm-opts ["-Dlogback.configurationFile=logback.xml"])
