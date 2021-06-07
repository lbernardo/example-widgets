(ns simple.core
  (:require [simple.widgets :as widgets]
            [clojure.data.json :as json]
            [simple.lang.pt-br :as l.pt-br]
            [simple.lang.es :as l.es]))


(defn to-json [data]
  (json/write-str data))

(defn example [lang-selected]
  (let [langs {:pt-br l.pt-br/content :es l.es/content}
        lang ((keyword lang-selected) langs )]

    (println (to-json (widgets/CreateScreen {:children [
                                                        (widgets/Title (:document/title lang) ; Title
                                                                       (:document/subtitle lang)) ; Subtitle
                                                        (widgets/Input "document" (:document/placeholder lang))
                                                        ]
                                             :bottom (widgets/BottomButton (:continue lang) widgets/button-style-primary)}
                                            )))))

(example "pt-br")