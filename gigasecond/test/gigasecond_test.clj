(ns gigasecond-test
  (:require [clojure.test :refer [deftest is]]
            gigasecond))

(deftest from-apr-25-2011
  (is (= [2043 1 1] (gigasecond/from 2011 4 25))))

(deftest from-jun-13-1977
  (is (= [2009 2 19] (gigasecond/from 1977 6 13))))

(deftest from-jul-19-1959
  (is (= [1991 3 27] (gigasecond/from 1959 7 19))))

(deftest u-birthday
  (is (= [2004 11 11] (gigasecond/from 1973 3 5))))

(deftest a-birthday
  (is (= [2004 10 11] (gigasecond/from 1973 2 2))))

(deftest m-birthday
  (is (= [2035 10 26] (gigasecond/from 2004 2 17))))

(deftest e-birthday
  (is (= [2038 6 12] (gigasecond/from 2006 10 4))))
