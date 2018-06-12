package com.proitc;

import static org.assertj.core.api.Assertions.assertThat;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import org.junit.jupiter.api.Test;

class JsonPathUnitTest {

  @Test
  public void givenJsonString_whenCountPropertiesWithJsonPath_thenGetTotal() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    JSONObject jsonObject = (JSONObject) JSONValue.parse(jsonString);

    assertThat(jsonObject).size().isEqualTo(3);
  }

  @Test
  public void givenJsonString_whenCountPropertiesWithJsonObject_thenGetTotal() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    JSONArray jsonArray = JsonPath.read(jsonString, "$.*");

    assertThat(jsonArray.size()).isEqualTo(3);
  }

  @Test
  public void givenJsonString_whenCountPropertiesWithJsonPath_thenGetSize() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    JSONArray jsonArray = JsonPath.read(jsonString, "$.*.length()");

    assertThat(jsonArray.size()).isEqualTo(3);
  }

}