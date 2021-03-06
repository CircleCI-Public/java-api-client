/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circleci.client.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.circleci.client.v2.model.TestsResponseItems;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * TestsResponse
 */

public class TestsResponse {
  public static final String JSON_PROPERTY_ITEMS = "items";
  @JsonProperty(JSON_PROPERTY_ITEMS)
  private List<TestsResponseItems> items = new ArrayList<>();

  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "next_page_token";
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public TestsResponse items(List<TestsResponseItems> items) {
    this.items = items;
    return this;
  }

  public TestsResponse addItemsItem(TestsResponseItems itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")
  public List<TestsResponseItems> getItems() {
    return items;
  }

  public void setItems(List<TestsResponseItems> items) {
    this.items = items;
  }

  public TestsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * A token to pass as a &#x60;page-token&#x60; query parameter to return the next page of results.
   * @return nextPageToken
  **/
  @ApiModelProperty(required = true, value = "A token to pass as a `page-token` query parameter to return the next page of results.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestsResponse testsResponse = (TestsResponse) o;
    return Objects.equals(this.items, testsResponse.items) &&
        Objects.equals(this.nextPageToken, testsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestsResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

