(ns clj-kondo-unresolved-var.b
  {:clj-kondo/config '{:hooks {:analyze-call {clj-kondo-unresolved-var.a/symbol1 hooks.symbols/call->do}}}}
  (:require [clj-kondo-unresolved-var.a :as a]))

(a/symbol1)
;; => "I'm a symbol1"
(a/symbol2 1)
;; => "I'm a symbol2 + 1"
(a/symbol3 22)
;; => "I'm a symbol3 + 22"
