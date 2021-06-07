(ns simple.widgets)

(def button-style-primary "primary")
(def button-style-secondary "secondary")

(defrecord Screen [children bottom])
(defrecord Widget [type])

(defn Button [data]
  (map->Widget (merge {:type "Button" :style button-style-primary} data)))

(defn Input [data]
  (map->Widget (merge {:type "Input"} data)))

(defn Title [data]
  (map->Widget (merge {:type "Title"} data)))

(defn BottomButton [data]
  (map->Widget (merge {:type "BottomButton"} data)))

(defn CreateScreen [data]
  (map->Screen data))