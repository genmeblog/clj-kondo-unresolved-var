(ns hooks.symbols
  (:require [clj-kondo.hooks-api :as api]))

(defn call->do
  [{:keys [node]}]
  (println node)
  {:node (api/list-node (list*
                         (api/token-node 'do)
                         (rest (:children node))))})
