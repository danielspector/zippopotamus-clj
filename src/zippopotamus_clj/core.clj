(ns zippopotamus-clj.core
  (:require  [clj-http.client :as client])
  (:require  [clojure.string  :as string])
  (:require  [clojure.walk    :as walk])
  (:gen-class))

(defn api-request
  "Makes an HTTP call using the clj-http library"
  [url-addition & query-params]
  (let [url (str url url-addition)]
   (client/get url {:as :json-strict-string-keys})))

(def url "http://api.zippopotam.us/us/")

(defn zip-request
  [postal-code & query-params]
  (keyword-dash (api-request postal-code query-params)))

(defn city-request
  [state city & query-params]
  (let [addition (str city "/" state)]
   (keyword-dash (api-request addition query-params))))

(defn replace-space-with-dash
  [kw]
  (string/replace kw #"\s+" "-"))

(defn keyword-dash
  "Recursively walks through the map and converts all
  string thats are keys to dashed keywords"
  [m]
   (let [f (fn [[k v]] (if (string? k) [(keyword (replace-space-with-dash k)) v] [k v]))]
     (walk/postwalk (fn [x] (if (map? x) (into {} (map f x)) x)) m)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))