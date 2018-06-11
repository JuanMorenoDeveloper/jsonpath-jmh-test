package com.proitc;

import static org.assertj.core.api.Assertions.assertThat;

import com.jayway.jsonpath.JsonPath;
import java.util.HashMap;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;

class JsonPathUnitTest {

  @Test
  public void givenJsonString_whenCountPropertiesWithJsonPath_thenGetTotal() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    JSONArray jsonArray = JsonPath.parse(jsonString).read("$.*");

    assertThat(jsonArray).size().isEqualTo(3);
  }

  @Test
  public void givenJsonString_whenCountPropertiesWithJsonObject_thenGetTotal() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    HashMap jsonObject = JsonPath.parse(jsonString).json();

    assertThat(jsonObject.size()).isEqualTo(3);
  }

}