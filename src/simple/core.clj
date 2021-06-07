(ns simple.core
  (:require [simple.widgets :as widgets]
            [clojure.data.json :as json]
            [simple.lang.pt-br :as l.pt-br]
            [simple.lang.es :as l.es]))


(defn to-json [data]
  (json/write-str data))

(defn example [lang-selected]
  (let [langs {:pt-br l.pt-br/content :es l.es/content}
        lang ((keyword lang-selected) langs)]
    (println (to-json (widgets/CreateScreen {:children [
                                                        (widgets/Title {:title    (:document/title lang)
                                                                        :subtitle (:document/subtitle lang)})
                                                        (widgets/Input {:id          "document"
                                                                        :placeholder (:document/placeholder lang)})
                                                        ]
                                             :bottom   (widgets/BottomButton {:text (:continue lang)})}
                                            )))))

(example "pt-br")