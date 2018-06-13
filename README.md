# jsonpath-jmh-test

Results in Intel(R) Core(TM) i5-3330 CPU @ 3.00Ghz 3.20 Ghz

JMH version: 1.21

VM version: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11

| Benchmark                                     | Mode  | Cnt | Score       | Error      | Units |
|-----------------------------------------------|-------|-----|-------------|------------|-------|
| JsonPathBenchmark.benchmarkJSONValueParse     | thrpt | 25  | 3082433.374 | ±49243.261 | ops/s |
| JsonPathBenchmark.benchmarkJsonPathRead       | thrpt | 25  | 975162.098  | ±29815.510 | ops/s |
| JsonPathBenchmark.benchmarkJsonPathReadLength | thrpt | 25  | 814167.206  | ±9731.026  | ops/s |