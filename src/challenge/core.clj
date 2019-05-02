(ns challenge.core
  (:use [clojure.pprint])
  (:gen-class))


(defn parse-int [s]
  (try
    (Integer. (re-find  #"\d+" s ))
    (catch Exception e (str "caught exception: " (.getMessage e)))))

(defn check-prime?
  "returns true if the input number is a prime number, false otherwise"
  [n]
  (let [divisors (for [x (range 2 n)
                       :when (zero? (rem n x))]
                   x)
        remainders (map #(mod n %) divisors)]
    (not-any? #(= % 0) remainders)))


(defn n-primenumbers
  "return n prime numbers"
  [n]
  (->> (iterate inc 2)
       (filter check-prime?)
       (take (parse-int n))))


(defn multiplication
  "Returns a multiplication table]"
  [coll]
  (map (fn [prime]
         (assoc
          (into {} (map
                    (fn [p]
                      [p (* p prime)])
                    coll))
          nil
          prime))
       coll))


(defn -main
  "Read from STDIN"
  [& args]
  (try
    (println "Enter total prime numbers:")
    (loop [input (read-line)]
      (when-not (= "" input)
        (println (str "You entered: "  input))
        (print-table (into [nil] (n-primenumbers input))
                     (multiplication (n-primenumbers input)))
        (recur (read-line))))
    (catch Exception e (str "caught exception: " (.getMessage e)))))
