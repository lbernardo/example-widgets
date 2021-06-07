(ns simple.widgets)
; Talvez substituir por defrecord
(def button-style-primary "primary")
(def button-style-secondary "secondary")

(defn Title ([title subtitle]
             {:type     "Title"
              :title    title
              :subtitle subtitle
              })
  ([title] (Title title "")))

(defn TopBar [title]
  {
   :type  "TopBar"
   :title title
   })

(defn Text [content]
  {:type    "Text"
   :content content})

(defn Input [id placeholder]
  {
   :type        "Input"
   :id          id
   :placeholder placeholder
   })

(defn BottomButton
  ([text style]
   {
    :type  "BottomBar"
    :style style
    :text  text
    })
  ([text] (BottomButton text button-style-primary)))

(defn Button
  ([text style]
   {
    :type  "Button"
    :style style
    :text  text
    })
  ([text] (Button text button-style-secondary)))


(defrecord Screen [children bottom])

(defn CreateScreen [data]
  (map->Screen data))