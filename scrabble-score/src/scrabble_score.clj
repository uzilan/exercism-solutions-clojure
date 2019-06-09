(ns scrabble-score
  (:require [clojure.string :as str]))

(def scores {"aeioulnrst" 1
             "dg"         2
             "bcmp"       3
             "fhvwy"      4
             "k"          5
             "jx"         8
             "qz"         10})
(def score-keys (keys scores))

(defn score-letter [letter]
  (let [lower-letter (str/lower-case letter)]
    (get scores
         (first
           (filter #(str/includes? % lower-letter) score-keys)))))


(defn score-word [string]
  (reduce + (map score-letter string)))
