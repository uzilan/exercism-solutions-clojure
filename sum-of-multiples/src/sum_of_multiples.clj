(ns sum-of-multiples)

(defn- divisible-by? [num1 num2]
  (= (rem num1 num2) 0))

(defn- get-multiples [num coll]
  (filter #(divisible-by? % num) coll))

(defn sum-of-multiples [particular-numbers num]
  (let [interval (range 1 num)
        multiples (map #(get-multiples % interval) particular-numbers)]
    (reduce + (into #{} (flatten multiples)))))
