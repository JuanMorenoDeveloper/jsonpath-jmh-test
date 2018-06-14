# jsonpath-jmh-test

*JMH version*: 1.21

*VM version*: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11

## Result 1

Results obtained in Intel(R) Core(TM) i5-3330 CPU @ 3.00Ghz 3.20 Ghz

| Benchmark                                     | Mode  | Cnt | Score       | Error      | Units |
|-----------------------------------------------|-------|-----|-------------|------------|-------|
| JsonPathBenchmark.benchmarkJSONValueParse     | thrpt | 25  | 3082433.374 | ±49243.261 | ops/s |
| JsonPathBenchmark.benchmarkJsonPathRead       | thrpt | 25  | 975162.098  | ±29815.510 | ops/s |
| JsonPathBenchmark.benchmarkJsonPathReadLength | thrpt | 25  | 814167.206  | ±9731.026  | ops/s |

## Result 2

Results obtained in Intel(R) Core(TM) i5-7200U CPU @ 2.50GHz

| Benchmark                                     | Mode  | Cnt | Score       | Error      | Units |
|-----------------------------------------------|-------|-----|-------------|------------|-------|
| JsonPathBenchmark.benchmarkJSONValueParse     | thrpt | 25  | 4041805.818 | ±239485.500| ops/s |
| JsonPathBenchmark.benchmarkJsonPathRead       | thrpt | 25  | 1174675.849 | ±41838.393 | ops/s |
| JsonPathBenchmark.benchmarkJsonPathReadLength | thrpt | 25  | 880182.916  | ±39652.690 | ops/s |
