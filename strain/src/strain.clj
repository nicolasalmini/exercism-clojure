(ns strain)

(defn retain
  "Keeps the items in coll for which (pred item) returns true."
  [pred coll]
  (->>
    coll
    (reduce (fn [acc item]
                (if (pred item)
                  (conj acc item)
                  acc))
      [])))

(defn discard
  "Removes the items in coll for which (pred item) returns true."
  [pred coll]
  (retain (complement pred) coll))
