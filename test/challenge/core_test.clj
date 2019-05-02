(ns challenge.core-test
  (:require [clojure.test :refer :all]
            [challenge.core :refer :all]))

(deftest parse-int-test
  (testing "testing string to integer"
    (is (= (parse-int "abc5d") 5))))


(deftest check-prime?-test
  (testing "testing number is prime or not."
    (is (= (check-prime? 7) true))))


(deftest n-primenumbers-test
  (testing "testing prime numbers for n."
    (is (= (n-primenumbers "5") '(2 3 5 7 11)))))

(def table
  '({2 4, 3 6, 5 10, 7 14, 11 22, nil 2}
    {2 6, 3 9, 5 15, 7 21, 11 33, nil 3}
    {2 10, 3 15, 5 25, 7 35, 11 55, nil 5}
    {2 14, 3 21, 5 35, 7 49, 11 77, nil 7}
    {2 22, 3 33, 5 55, 7 77, 11 121, nil 11}))


(deftest multiplication-test
  (testing "testing multiplication"
    (let [p-numbers (n-primenumbers "5")]
      (is (= (multiplication p-numbers) table)))))
