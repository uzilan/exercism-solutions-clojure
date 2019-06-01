(ns series)

(defn slices [string length]
  (cond
    (= 0 length) [""]
    (> length (count string)) []
    (= length (count string)) (vector string)
    :else (flatten
            (vector
              (subs string 0 length)
              (slices (subs string 1) length)))))
