(ns hamming)

(defn distance [strand1 strand2]
  (if (not (= (count strand1) (count strand2)))
    nil
    (->> strand1
         (map-indexed
           (fn [index item]
             (if (= item (get strand2 index)) 0 1)))
         (reduce +))))
