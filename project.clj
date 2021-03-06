(defproject chart-service "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
	[org.clojure/clojure "1.5.1"]
	[org.clojure/data.json "0.2.5"]
	[liberator "0.10.0"]
	[compojure "1.1.9"]
	[ring/ring-core "1.2.1"]]
  :plugins [[lein-ring "0.8.13"]]
  :main ^:skip-aot chart-service.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :ring {:handler chart-service.core/handler})
