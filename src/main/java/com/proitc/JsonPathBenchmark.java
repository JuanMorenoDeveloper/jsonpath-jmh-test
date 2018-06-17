package com.proitc;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.Throughput)
@Fork(value = 1, warmups = 1)
@Warmup(iterations = 1)
public class JsonPathBenchmark {

  public static void main(String[] args) throws Exception {
    org.openjdk.jmh.Main.main(args);
  }

  @Benchmark
  public void benchmarkJSONObjectParse(Blackhole bh) {
    String jsonString = "{'username':'john.user','email':'jhon@company.com','age':'28'}";

    JSONObject user = (JSONObject) JSONValue.parse(jsonString);

    int length = user.size();

    bh.consume(length);
  }

  @Benchmark
  public void benchmarkJsonPathObjectLength(Blackhole bh) {
    String jsonString = "{'username':'john.user','email':'jhon@company.com','age':'28'}";

    int length = JsonPath.read(jsonString, "$.length()");

    bh.consume(length);
  }

  @Benchmark
  public void benchmarkJSONArrayParse(Blackhole bh) {
    String jsonString = "['john@company.com','mary@company.com','karen@company.com']";

    JSONArray users = (JSONArray) JSONValue.parse(jsonString);
    int length = users.size();

    bh.consume(length);
  }

  @Benchmark
  public void benchmarkJsonPathArrayLength(Blackhole bh) {
    String jsonString = "['john@company.com','mary@company.com','karen@company.com']";

    int length = JsonPath
        .parse(jsonString)
        .read("$.length()");

    bh.consume(length);
  }

}