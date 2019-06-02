(ns complex-numbers)

(defn real [[a b]]
  a)

(defn imaginary [[a b]]
  b)

(defn abs [[a b]]
  (Math/sqrt (+ (* a a) (* b b))))

(defn conjugate [[a b]]
  [a (- b)])

(defn add [[a b] [c d]]
  [(+ a c) (+ b d)])

(defn sub [[a b] [c d]]
  [(- a c) (- b d)])

(defn mul [[a b] [c d]]
  (let [ac (* a c)
        bd (* b d)
        bc (* b c)
        ad (* a d)
        real (- ac bd)
        imaginary (+ bc ad)]
    [real imaginary]))

(defn div [[a b] [c d]]
  (let [ac (* a c)
        bd (* b d)
        bc (* b c)
        ad (* a d)
        denom (+ (* c c) (* d d))
        real (double (/ (+ ac bd) denom))
        imaginary (double (/ (- bc ad) denom))]
    [real imaginary]))
