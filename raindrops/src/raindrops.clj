(ns raindrops)

(def drops
  {3 "Pling"
   5 "Plang"
   7 "Plong"})

(defn- reduce-drops [num]
  (reduce
    (fn [result x]
      (if (zero? (rem num x))
        (str result (get drops x))
        result))
    ""
    (keys drops)))

(defn convert [num]
  (let [result (reduce-drops num)]
    (if (empty? result) (str num) result)))
