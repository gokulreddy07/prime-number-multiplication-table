# Prime number multiplication table


##Installation

```
The only things you'll need to run the Clojure are:
JDK (I suggest version 8, but anything 6 or above should work fine)
Leiningen, a build tool for Clojure

```

##Running
```
git clone git@github.com:gokulreddy07/prime-number-multiplication-table.git
cd prime-number-multiplication-table
lein trampoline run
Enter total prime numbers: 5
You entered: 5

|    |  2 |  3 |  5 |  7 |  11 |
|----+----+----+----+----+-----|
|  2 |  4 |  6 | 10 | 14 |  22 |
|  3 |  6 |  9 | 15 | 21 |  33 |
|  5 | 10 | 15 | 25 | 35 |  55 |
|  7 | 14 | 21 | 35 | 49 |  77 |
| 11 | 22 | 33 | 55 | 77 | 121 |

You can exit the REPL with CTRL-d, (exit), or (quit)
```
## Test
`lein test`


## License

Copyright © 2019 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
