# clj-kondo-unresolved-var

```
$ clj-kondo --debug  --lint src/
[clj-kondo] Linting file: src/clj_kondo_unresolved_var/b.clj
<list: (a/symbol1)>
[clj-kondo] Linting file: src/clj_kondo_unresolved_var/a.clj
src/clj_kondo_unresolved_var/b.clj:5:2: warning: Unresolved var: a/symbol1
src/clj_kondo_unresolved_var/b.clj:7:2: warning: Unresolved var: a/symbol2
src/clj_kondo_unresolved_var/b.clj:9:2: warning: Unresolved var: a/symbol3
linting took 38ms, errors: 0, warnings: 3
```
