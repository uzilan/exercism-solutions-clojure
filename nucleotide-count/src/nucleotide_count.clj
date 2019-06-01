(ns nucleotide-count)

(defn count [nucleotide strand]
  (assert (re-matches #"[~ATCG]*" (str nucleotide)) "invalid nucleotide")
  (get (frequencies strand) nucleotide 0))

(defn nucleotide-counts [strand]
  (let [vic (list \A, \T, \C, \G)
        freq (frequencies strand)]
    (zipmap
      vic
      (map #(get freq % 0) vic))))
