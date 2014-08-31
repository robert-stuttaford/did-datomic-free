(ns leiningen.new.did-datomic-free
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "did-datomic-free"))

(defn did-datomic-free
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["project.clj" (render "project.clj" data)]
["src/{{sanitized}}/core.clj" (render "core.clj" data)]
["src/logback.xml" (render "logback.xml")]
)))