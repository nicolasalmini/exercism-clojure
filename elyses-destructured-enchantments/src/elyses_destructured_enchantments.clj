(ns elyses-destructured-enchantments)

(defn first-card
  "Returns the first card from deck."
  [[first]]
  first)

(defn second-card
  "Returns the second card from deck."
  [[_ second]]
  second)

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [[a b & rest]]
  (vec (concat [b a] rest)))

(defn discard-top-card
  "Returns a sequence containing the first card and
   a sequence of the remaining cards in the deck."
  [[first & rest]]
  [first rest])

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [[first-card & rest]]
  (if (nil? first-card)
    (vec (concat face-cards rest))
    (vec (concat [first-card] face-cards rest))))
