(ns perfect-numbers)

(defn sum-of-factors [num]
  (->> (filter
         #(= (rem num %) 0)
         (range 1 num))
       (reduce +)))

(defn classify [num]
  (if (< num 0)
    (throw (IllegalArgumentException.))
    (let [sum (sum-of-factors num)]
      (cond (= sum num) :perfect
            (> sum num) :abundant
            :else :deficient))))