(ns rna-transcription)

(defn translate-nucleotide [x]
  (case x
    \G \C
    \C \G
    \T \A
    \A \U
  ))

(defn to-rna
  "Returns the RNA complement of the given DNA string sequence."
  [dna]
  (apply str (map translate-nucleotide (seq dna)))
  )
