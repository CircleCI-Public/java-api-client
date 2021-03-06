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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * A pipeline creation response.
 */
@ApiModel(description = "A pipeline creation response.")

public class PipelineCreation {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private UUID id;

  /**
   * The current state of the pipeline.
   */
  public enum StateEnum {
    CREATED("created"),
    
    ERRORED("errored"),
    
    SETUP_PENDING("setup-pending"),
    
    SETUP("setup"),
    
    PENDING("pending");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  @JsonProperty(JSON_PROPERTY_STATE)
  private StateEnum state;

  public static final String JSON_PROPERTY_NUMBER = "number";
  @JsonProperty(JSON_PROPERTY_NUMBER)
  private Long number;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  private OffsetDateTime createdAt;

  public PipelineCreation id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the pipeline.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the pipeline.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PipelineCreation state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The current state of the pipeline.
   * @return state
  **/
  @ApiModelProperty(required = true, value = "The current state of the pipeline.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public PipelineCreation number(Long number) {
    this.number = number;
    return this;
  }

   /**
   * The number of the pipeline.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "The number of the pipeline.")
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public PipelineCreation createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time the pipeline was created.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the pipeline was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineCreation pipelineCreation = (PipelineCreation) o;
    return Objects.equals(this.id, pipelineCreation.id) &&
        Objects.equals(this.state, pipelineCreation.state) &&
        Objects.equals(this.number, pipelineCreation.number) &&
        Objects.equals(this.createdAt, pipelineCreation.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, number, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineCreation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

