(ns resistor-color-duo)

(def colors
  ["black" "brown" "red" "orange" "yellow" "green" "blue" "violet" "grey" "white"])

(defn get-color-value [color]
  (str (.indexOf colors color)))

(defn resistor-value
  "Returns the resistor value based on the given colors"
  [[first-color, second-color]]
    (parse-long
      (apply str
        (get-color-value first-color)
        (get-color-value second-color))))
