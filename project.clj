(defproject org.clojars.jim/iceclient "0.0.4-SNAPSHOT"
            :description "Icecast source and client to transmit and recieve streaming audio."
            :dependencies [[org.clojure/clojure "1.2.0"]
                           [org.clojure/clojure-contrib "1.2.0"]
                           [org.clojars.technomancy/jlayer "1.0"]
                           ;[net.javazoom/jlayer "1.0.1"]
                           [org.clojars.automata/mp3spi "1.9.4"]
                           ;[net.javazoom/mp3spi "1.9.5"]
                           [clj-native "0.9.2-SNAPSHOT"]
                           ;[org.clojars.jim/clj-native "0.9.2-SNAPSHOT"]]
                           ]
            ;:dev-dependencies [[lein-clojars "0.5.0-SNAPSHOT"]]
            :jvm-opts ["-Djna.library.path=/opt/local/lib"])
