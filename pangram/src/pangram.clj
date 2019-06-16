(ns pangram)

(use '[clojure.string :only [index-of lower-case]])

(defn- string-contains? [input ch]
  (not (nil? (index-of input ch))))

(defn pangram? [input]
  (let [better-input (lower-case input)]
    (every? #(string-contains? better-input %) (seq "abcdefghijklmnopqrstuvwxyz"))))
